package com.example.android1_lesson4_dz;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView simpleText;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        simpleText = itemView.findViewById(R.id.tv_item1);
    }

    public void onBind(String data){
        simpleText.setText(data);
    }
}
