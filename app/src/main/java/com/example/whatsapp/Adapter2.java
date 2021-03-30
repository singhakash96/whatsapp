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

public class Adapter2 extends RecyclerView.Adapter<Adapter2.PostViewHolder> {

    DataItem2 dataItem2;
    List<DataItem2> list;
    Context context;
    public Adapter2(List<DataItem2> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.calls_list, parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.UserNameTextView.setText(list.get(position).getUserName2());
        holder.DescriptionTextView.setText(list.get(position).getDescription2());

//       Glide.with(context).load(dataItem2.getProfile2()).into(holder.profile2);
//        Glide.with(context).load(dataItem2.getTelephone()).into(holder.TelephoneImageView);
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        TextView UserNameTextView;
        TextView DescriptionTextView;
        ImageView profile2;
        ImageView TelephoneImageView;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            UserNameTextView = (TextView) itemView.findViewById(R.id.username2);
            DescriptionTextView = (TextView) itemView.findViewById(R.id.description);
            profile2 = (ImageView) itemView.findViewById(R.id.profile3);
            TelephoneImageView= (ImageView) itemView.findViewById(R.id.dots);
        }
    }}
