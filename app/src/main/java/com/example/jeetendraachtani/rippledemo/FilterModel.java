package com.example.jeetendraachtani.rippledemo;

/**
 * Created by jeetendra.achtani on 13-03-2018.
 */

class FilterModel {

    public String id;
    public String title;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public FilterModel(String id, String title) {
        this.id = id;
        this.title = title;

    }
}
