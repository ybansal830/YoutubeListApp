package com.myfirst.youtubelistapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class YoutubeViewHolder extends RecyclerView.ViewHolder {

    private ItemClickListener itemClickListener;
    private ImageView mIvThumbnail;
    private TextView mTvTitle;
    private CardView mCvClick;

    public YoutubeViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews();
    }

    private void initViews() {
        mIvThumbnail = itemView.findViewById(R.id.ivThumbnail);
        mTvTitle = itemView.findViewById(R.id.tvTitle);
        mCvClick = itemView.findViewById(R.id.cvClick);
    }

    public void setData(YoutubeModel youtubeModel){
       mIvThumbnail.setImageResource(youtubeModel.getThumbnail());
       mTvTitle.setText(youtubeModel.getTitle());
       mCvClick.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               itemClickListener.onClick(youtubeModel.getLink());
           }
       });
    }
}
