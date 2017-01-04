package com.example.asiagibson.testrecap.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asiagibson.testrecap.R;

/**
 * Created by asiagibson on 1/3/17.
 */

public class AlAdapter extends RecyclerView.Adapter<AlHolder> {

    @Override
    public AlHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_view, parent, false);
        return new AlHolder(parent);
    }

    @Override
    public void onBindViewHolder(AlHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }
}
