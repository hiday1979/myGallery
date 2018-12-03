package com.hiday.mygallery;

import java.util.ArrayList;

class Model_images {
    private String str_folder;
    private ArrayList<String> al_imagepath;

    String getStr_folder() {
        return str_folder;
    }

    void setStr_folder(String str_folder) {
        this.str_folder = str_folder;
    }

    ArrayList<String> getAl_imagepath() {
        return al_imagepath;
    }

    void setAl_imagepath(ArrayList<String> al_imagepath) {
        this.al_imagepath = al_imagepath;
    }
}
