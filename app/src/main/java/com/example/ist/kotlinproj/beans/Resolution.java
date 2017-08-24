
package com.example.ist.kotlinproj.beans;

import com.squareup.moshi.Json;

import java.io.Serializable;

public class Resolution implements Serializable {

    private final static long serialVersionUID = 8157967404279250508L;
    @Json(name = "url")
    private String url;
    @Json(name = "width")
    private int width;
    @Json(name = "height")
    private int height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
