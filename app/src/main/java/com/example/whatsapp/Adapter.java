package com.example.whatsapp;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.PostViewHolder> {

    DataItem dataitem;
    List<DataItem> list;
    Context context;
    public Adapter(List<DataItem> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.list_item, parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.UserNameTextView.setText(list.get(position).getUserName());
        holder.DescriptionTextView.setText(list.get(position).getDescription());


//        Glide.with(context).load(dataitem.getProfile()).into(holder.profile);
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        TextView UserNameTextView;
        TextView DescriptionTextView;
        ImageView profile;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            UserNameTextView = (TextView) itemView.findViewById(R.id.username);
            DescriptionTextView = (TextView) itemView.findViewById(R.id.des);
            profile = (ImageView) itemView.findViewById(R.id.profile1);
        }
    }

}



