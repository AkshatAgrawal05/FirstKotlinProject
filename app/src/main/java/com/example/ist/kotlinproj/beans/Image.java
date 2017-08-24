
package com.example.ist.kotlinproj.beans;

import com.squareup.moshi.Json;

import java.io.Serializable;
import java.util.List;

public class Image implements Serializable {

    private final static long serialVersionUID = 3945297193320525834L;
    @Json(name = "source")
    private Source source;
    @Json(name = "resolutions")
    private List<Resolution> resolutions = null;
    @Json(name = "variants")
    private Variants variants;
    @Json(name = "id")
    private String id;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public List<Resolution> getResolutions() {
        return resolutions;
    }

    public void setResolutions(List<Resolution> resolutions) {
        this.resolutions = resolutions;
    }

    public Variants getVariants() {
        return variants;
    }

    public void setVariants(Variants variants) {
        this.variants = variants;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
