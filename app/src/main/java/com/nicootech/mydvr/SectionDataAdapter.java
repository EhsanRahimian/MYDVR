package com.nicootech.mydvr;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class SectionDataAdapter extends RecyclerView.Adapter<SectionDataAdapter.ProgramsRowHolder> {
    private ArrayList<Programs>itemsList;
    private Context mContext;
    public SectionDataAdapter(Context mContext, ArrayList<Programs>itemsList) {
        this.itemsList = itemsList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ProgramsRowHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_card, null);
        ProgramsRowHolder mh = new ProgramsRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramsRowHolder holder, int i) {
        Programs singleItem = itemsList.get(i);
        holder.showName.setText(singleItem.getName());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, RecordActivity.class);
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return (null !=itemsList? itemsList.size():0);
    }


    public class ProgramsRowHolder extends RecyclerView.ViewHolder {
        protected TextView showName;
        protected ImageView image;
        protected CardView cardView;

        public ProgramsRowHolder(View view) {
            super(view);
            this.showName = (TextView) view.findViewById(R.id.showName);
            this.image = (ImageView) view.findViewById(R.id.image);
            this.cardView = (CardView)view.findViewById(R.id.cardView);
        }
    }
}
