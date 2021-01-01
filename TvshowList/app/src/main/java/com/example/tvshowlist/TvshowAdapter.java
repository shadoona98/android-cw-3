package com.example.tvshowlist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TvshowAdapter extends RecyclerView.Adapter {

    ArrayList<Tvshows> tv;
    Context context;

    public TvshowAdapter(ArrayList<Tvshows> tv, Context context) {
        this.tv = tv;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tvshow_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
     // ((ViewHolder) holder).img.setImageResource(tv.get(position).getImg());
        ((ViewHolder) holder).rating.setText(tv.get(position).getRating()+"");
        ((ViewHolder) holder).name.setText(tv.get(position).getName());
        ((ViewHolder) holder).seasons.setText(tv.get(position).getSeasons()+"");
        ((ViewHolder) holder).duration.setText(tv.get(position).getDuration()+" ");

        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Details.class);
                i.putExtra("tvshow",tv.get(position));
                context.startActivity(i);
            }
        });

        ((ViewHolder) holder).delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.remove(position);
                notifyDataSetChanged();
            }
        });


    }

    @Override
    public int getItemCount() {
        return tv.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
            public ImageView img;
            public TextView name;
            public TextView rating;
            public TextView seasons;
            public TextView duration;
            public View view;
            public ImageView delete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            view = itemView;
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            rating = itemView.findViewById(R.id.textView6);
            seasons = itemView.findViewById(R.id.ss);
            duration = itemView.findViewById(R.id.textView2);
            delete = itemView.findViewById(R.id.imageView2);
        }
    }

}
