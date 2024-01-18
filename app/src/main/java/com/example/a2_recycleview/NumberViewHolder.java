package com.example.a2_recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class NumberViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textview_number);
    }

    public void bind(String number) {
        textView.setText(number);
    }
}