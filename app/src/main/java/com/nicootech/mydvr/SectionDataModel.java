package com.nicootech.mydvr;

import java.util.ArrayList;

public class SectionDataModel {
    private String headerTitle;
    private ArrayList<Programs>allItems;

    public SectionDataModel() {}

    public SectionDataModel(ArrayList<Programs> allItems) {
        this.allItems = allItems;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public ArrayList<Programs> getAllItems() {
        return allItems;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public void setAllItems(ArrayList<Programs> allItems) {
        this.allItems = allItems;
    }
}
