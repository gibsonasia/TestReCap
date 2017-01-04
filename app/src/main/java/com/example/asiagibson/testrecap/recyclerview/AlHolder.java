package com.example.asiagibson.testrecap.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asiagibson.testrecap.R;
import com.example.asiagibson.testrecap.model.Animal;

import org.json.JSONObject;

/**
 * Created by asiagibson on 1/3/17.
 */

public class AlHolder extends RecyclerView.ViewHolder {

    TextView textColor;
    TextView background;
    TextView nameTv;

    public AlHolder(View view) {
        super(view);
        textColor = (TextView) itemView.findViewById(R.id.text_color);
        background = (TextView) itemView.findViewById(R.id.text_background);
        nameTv = (TextView) itemView.findViewById(R.id.text_name);

    }


    public void bind(JSONObject obj){
        String name = obj.optString("name");
        nameTv.setText(name);
        Toast.makeText(nameTv.getContext(), name, Toast.LENGTH_LONG).show();
    }


    public void bind(Animal animal){
        String name = animal.getName();
        nameTv.setText(name);
        Toast.makeText(nameTv.getContext(), name, Toast.LENGTH_LONG).show();
    }
}
