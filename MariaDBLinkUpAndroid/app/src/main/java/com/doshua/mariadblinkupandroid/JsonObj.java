package com.doshua.mariadblinkupandroid;

import java.util.ArrayList;

public class JsonObj {

    public ArrayList<PeopleInfo> getResult() {
        return result;
    }

    public void setResult(ArrayList<PeopleInfo> result) {
        this.result = result;
    }

    private ArrayList<PeopleInfo> result;

    JsonObj(ArrayList<PeopleInfo> result) {
        this.result = result;
    }
}
