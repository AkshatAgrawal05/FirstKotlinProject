
package com.example.ist.kotlinproj.beans;

import com.squareup.moshi.Json;

import java.io.Serializable;

public class Child implements Serializable {

    private final static long serialVersionUID = -7135531020781224024L;
    @Json(name = "kind")
    private String kind;
    @Json(name = "data")
    private Data_ data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Data_ getData() {
        return data;
    }

    public void setData(Data_ data) {
        this.data = data;
    }

}
