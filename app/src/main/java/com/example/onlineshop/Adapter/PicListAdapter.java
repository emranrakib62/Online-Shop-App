package com.example.onlineshop.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PicListAdapter extends RecyclerView.Adapter<PicListAdapter.Viewholder> {

    private List<String> items;
    private ImageView picMain;
    private Context context;

    public PicListAdapter(List<String> items,ImageView picMain) {
        this.items = items;
        this.picMain=picMain;
    }

    @NonNull
    @Override
    public PicListAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PicListAdapter.Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
