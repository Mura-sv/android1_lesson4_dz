package com.example.android1_lesson4_dz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList<String> list;

    public MainAdapter(){
        list = new ArrayList<>();
        list.add("Рамазан");
        list.add("Нурбек");
        list.add("Нуракбар");
        list.add("Мурас");
        list.add("Илим");
        list.add("Бекмурат");
        list.add("Эрмек");
        list.add("Нуркыз");
        list.add("Анарбек");
        list.add("Айдана");
        list.add("Кайрат");
        list.add("Нурболот");
        list.add("Али");
        list.add("Эламан");
        list.add("Нурэл");
    }



    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
