package com.example.asiagibson.testrecap;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.asiagibson.testrecap.model.Animal;
import com.example.asiagibson.testrecap.recyclerview.AlAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by asiagibson on 1/3/17.
 */

public class AnimalFragment extends Fragment {
    String TAG = "Animal Frag";
    RecyclerView rv;
    AlAdapter adapter ;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_animal, container, false);

        rv = (RecyclerView) view.findViewById(R.id.recycler_view);
        adapter = new AlAdapter();
        rv.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));
        rv.setAdapter(adapter);



        RequestQueue queue = Volley.newRequestQueue(getActivity());
        String url = "http://jsjrobotics.nyc/cgi-bin/12_21_2016_exam.pl";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d(TAG, response);
                        try {
                            JSONObject json = new JSONObject(response);
                            JSONArray animals = json.optJSONArray("animals");
                            adapter.setData(animals);
                            adapter.notifyDataSetChanged();
                            Log.d(TAG, "adapter size was " + adapter.getItemCount());

                            Log.d(TAG, "Size was " + animals.length());

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG,"you got an Error");
            }
        });

        queue.add(stringRequest);

        return view;
    }

    public void setupRV(RecyclerView rv){
        //do stuff
    }
}
