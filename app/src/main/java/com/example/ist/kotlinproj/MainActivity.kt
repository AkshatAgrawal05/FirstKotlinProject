package com.example.ist.kotlinproj

import android.content.Context
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.ist.kotlinproj.beans.Child
import com.example.ist.kotlinproj.beans.Reddit
import com.squareup.moshi.Moshi
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    var rvReddit: RecyclerView? = null
    var mList = mutableListOf<Child>()
    var mContext: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mList = ArrayList();
        rvReddit = findViewById(R.id.rvReddit)
        rvReddit?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        JsonExecuter().execute()
    }

    fun getJsonFromAssets(): String? {
        var json: String? = null
        var inputStream: InputStream
        inputStream = this.assets.open("reddit.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        json = String(buffer)
        return json
    }

    private inner class JsonExecuter : AsyncTask<Void, Void, String>() {
        override fun doInBackground(vararg p0: Void?): String {
            return getJsonFromAssets()!!
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            val moshi = Moshi.Builder().build()
            val jsonAdapter = moshi.adapter(Reddit::class.java)

            var red: Reddit? = jsonAdapter.fromJson(result)

            mList = red?.data?.children!!

            rvReddit?.adapter = RedditAdapter(mContext, mList)
        }
    }
}
