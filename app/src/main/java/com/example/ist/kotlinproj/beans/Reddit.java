
package com.example.ist.kotlinproj.beans;

import com.squareup.moshi.Json;

import java.io.Serializable;

public class Reddit implements Serializable {

    private final static long serialVersionUID = 5924288071783859878L;
    @Json(name = "kind")
    private String kind;
    @Json(name = "data")
    private Data data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
