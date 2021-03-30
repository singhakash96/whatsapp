package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.PostViewHolder> {

    DataItem1 dataItem1;
    List<DataItem1> list;
    Context context;
    public Adapter1(List<DataItem1> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.status_item, parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.UserNameTextView.setText(list.get(position).getUserName1());
        holder.DescriptionTextView.setText(list.get(position).getDescription1());

//        Glide.with(context).load(dataItem1.getProfile1()).into(holder.profile1);
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        TextView UserNameTextView;
        TextView DescriptionTextView;
        ImageView profile1;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            UserNameTextView = (TextView) itemView.findViewById(R.id.username1);
            DescriptionTextView = (TextView) itemView.findViewById(R.id.desc);
            profile1 = (ImageView) itemView.findViewById(R.id.profile2);

        }
    }

}
