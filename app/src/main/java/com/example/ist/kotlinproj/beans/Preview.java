
package com.example.ist.kotlinproj.beans;

import com.squareup.moshi.Json;

import java.io.Serializable;
import java.util.List;

public class Preview implements Serializable {

    private final static long serialVersionUID = 1797563306343871024L;
    @Json(name = "images")
    private List<Image> images = null;
    @Json(name = "enabled")
    private boolean enabled;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
