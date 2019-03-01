package com.nicootech.mydvr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SectionDataModel>allSampleData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allSampleData = new ArrayList<SectionDataModel>();
        channelLists();
        RecyclerView my_recycler_view = (RecyclerView)findViewById(R.id.my_recycler_view);
        my_recycler_view.setHasFixedSize(true);

        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(this, allSampleData);

        my_recycler_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        my_recycler_view.setAdapter(adapter);
    }

    public void channelLists() {
        for (int i = 1; i <= 3; i++) {

            SectionDataModel dm = new SectionDataModel();

            dm.setHeaderTitle("CHANNEL " + i);

            ArrayList<Programs> singleItem = new ArrayList<Programs>();
            for (int j = 1; j <= 10; j++) {
                singleItem.add(new Programs("Item " + j, "URL " + j, " Start" + j, "Duration"+ j));
            }

            dm.setAllItems(singleItem);

            allSampleData.add(dm);

        }
    }
}
