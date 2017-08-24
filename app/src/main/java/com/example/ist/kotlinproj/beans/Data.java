
package com.example.ist.kotlinproj.beans;

import com.squareup.moshi.Json;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {

    private final static long serialVersionUID = 840261447139485864L;
    @Json(name = "modhash")
    private String modhash;
    @Json(name = "children")
    private List<Child> children = null;
    @Json(name = "after")
    private String after;
    @Json(name = "before")
    private Object before;

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public Object getBefore() {
        return before;
    }

    public void setBefore(Object before) {
        this.before = before;
    }

}
