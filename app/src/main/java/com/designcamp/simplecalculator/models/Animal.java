package com.designcamp.simplecalculator.models;

/**
 * Created by HashCode on 1:57 PM 09/03/2018.
 */

public class Animal {
    private String name;
    private int picUrl;

    public Animal(String name, int picUrl){
        this.name = name;
        this.picUrl = picUrl;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPicUrl(int picUrl1){
        picUrl = picUrl1;
    }
    public int getPicUrl(){
        return picUrl;
    }
}
