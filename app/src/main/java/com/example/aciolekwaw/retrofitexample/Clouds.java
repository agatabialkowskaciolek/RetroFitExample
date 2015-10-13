package com.example.aciolekwaw.retrofitexample;

import com.google.gson.annotations.Expose;

/**
 * Created by aciolekwaw on 2015-10-13.
 */
public class Clouds {

    @Expose
    private Integer all;

    /**
     *
     * @return
     * The all
     */
    public Integer getAll() {
        return all;
    }

    /**
     *
     * @param all
     * The all
     */
    public void setAll(Integer all) {
        this.all = all;
    }
}
