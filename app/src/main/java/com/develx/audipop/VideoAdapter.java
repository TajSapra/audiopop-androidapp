package com.develx.audipop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyViewHolder> {
   private Context mContext;
   private ArrayList<VideoFiles> videoFiles;
   View view;

    public VideoAdapter(Context mContext, ArrayList<VideoFiles> videoFiles) {
        this.mContext = mContext;
        this.videoFiles = videoFiles;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(mContext).inflate(R.layout.video_item,  parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.fileName.setText(videoFiles.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return videoFiles.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView thumbnail,menuMore;
        TextView fileName, videoDuration;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.thumbnail);
            menuMore = itemView.findViewById(R.id.menu_more);
            fileName = itemView.findViewById(R.id.video_file_name);
            videoDuration = itemView.findViewById(R.id.video_duration);
        }
    }
}
