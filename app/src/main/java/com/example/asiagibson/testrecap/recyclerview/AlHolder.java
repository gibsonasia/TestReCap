package com.example.asiagibson.testrecap.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asiagibson.testrecap.R;

/**
 * Created by asiagibson on 1/3/17.
 */

public class AlHolder extends RecyclerView.ViewHolder {

    TextView textColor;
    TextView background;
    TextView name;

    public AlHolder(ViewGroup view) {
        super(view);

        textColor = (TextView) itemView.findViewById(R.id.text_color);
        background = (TextView) itemView.findViewById(R.id.text_background);
        name = (TextView) itemView.findViewById(R.id.text_name);

    }

    public void bind(){

    }
}
