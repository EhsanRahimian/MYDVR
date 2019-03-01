package com.nicootech.mydvr;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewDataAdapter extends RecyclerView.Adapter<RecyclerViewDataAdapter.ItemRowHolder> {
    ArrayList<SectionDataModel>dataList;
    Context mContext;

    public RecyclerViewDataAdapter(Context mContext, ArrayList<SectionDataModel> dataList) {
        this.dataList = dataList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ItemRowHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, null);
        ItemRowHolder mh = new ItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemRowHolder itemRowHolder,  final int i) {
        final String sectionName = dataList.get(i).getHeaderTitle();
        final ArrayList singleSectionItems = dataList.get(i).getAllItems();
        itemRowHolder.channelsNumber.setText(sectionName);
        SectionDataAdapter itemListDataAdapter= new SectionDataAdapter(mContext, singleSectionItems);
        itemRowHolder.recycler_view_list.setHasFixedSize(true);
        itemRowHolder.recycler_view_list.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        itemRowHolder.recycler_view_list.setAdapter(itemListDataAdapter);


    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }


    public class ItemRowHolder extends RecyclerView.ViewHolder {
        protected RecyclerView recycler_view_list;
        protected TextView channelsNumber;

        public ItemRowHolder(View view) {
            super(view);

            this.channelsNumber = (TextView) view.findViewById(R.id.channel_number);
            this.recycler_view_list = (RecyclerView) view.findViewById(R.id.recycler_view_list);
        }
    }
}
