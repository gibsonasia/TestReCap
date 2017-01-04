package com.example.asiagibson.testrecap.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asiagibson.testrecap.R;
import com.example.asiagibson.testrecap.model.Animal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by asiagibson on 1/3/17.
 */

public class AlAdapter extends RecyclerView.Adapter<AlHolder> {


    JSONArray data;
    
    public AlAdapter(){
        this.data = new JSONArray();
    }

    public AlAdapter(JSONArray data){
        this.data = data;
    }

    @Override
    public AlHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_view, parent, false);
        return new AlHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AlHolder holder, int position) {
        try {
            JSONObject jsonObject = data.getJSONObject(position);
            Animal animal = new Animal();
            animal.setName(jsonObject.getString("name"));
            holder.bind(animal);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    @Override
    public int getItemCount() {
        return data.length();
    }

    public void setData(JSONArray data) {
        this.data = data;
    }
}
