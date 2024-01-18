package com.example.a2_recycleview;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> number= new ArrayList<>();
    private RecyclerView recyclerViewNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNumber=findViewById(R.id.number_recycler);
        for (int i = 1; i <= 20; i++) {
            number.add("Number "+i);
        }
        NumberAdapter numberAdapter= new NumberAdapter(number);
        recyclerViewNumber.setAdapter(numberAdapter);
    }
}