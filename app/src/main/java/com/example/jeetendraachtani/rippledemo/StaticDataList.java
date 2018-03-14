package com.example.jeetendraachtani.rippledemo;

import java.util.ArrayList;

/**
 * Created by jeetendra.achtani on 13-03-2018.
 */

class StaticDataList {


    public static ArrayList<FilterModel> getFilterList()
    {
        ArrayList<FilterModel> list = new ArrayList<>();

        list.add(new FilterModel("1","Ripple Example here"));
        list.add(new FilterModel("2","Ripple Second Example here"));
        list.add(new FilterModel("3","Ripple Third Example here"));
        list.add(new FilterModel("4","Ripple Fourth Example here"));
        list.add(new FilterModel("5","Ripple Fifth Example here"));


        return list;
    }


}
