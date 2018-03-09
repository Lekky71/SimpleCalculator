package com.designcamp.simplecalculator.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.designcamp.simplecalculator.R;
import com.designcamp.simplecalculator.adapters.AnimalAdapter;
import com.designcamp.simplecalculator.utils.Constants;

public class ListActivity extends AppCompatActivity {

    RecyclerView animalRecyclerView;
    AnimalAdapter mAdapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //RecyclerView //cached

        /*
            A template layout
            An adapter
            A layout manager
            Data -> an array or an arraylist of objects
         */
        context = getApplicationContext();
        animalRecyclerView = findViewById(R.id.animals_recycler_view);
        mAdapter = new AnimalAdapter(context, Constants.getAnimalArrayList());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);

        animalRecyclerView.setAdapter(mAdapter);
        animalRecyclerView.setLayoutManager(layoutManager);
    }
}
