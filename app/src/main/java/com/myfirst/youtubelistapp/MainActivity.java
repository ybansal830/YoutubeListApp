package com.myfirst.youtubelistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private RecyclerView mRecyclerView;
    private ArrayList<YoutubeModel> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        setData();
        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setAdapter(youtubeAdapter);
        mRecyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setData() {
        arrayList = new ArrayList<>();
        for(int i=0;i<10;i++){
            arrayList.add(new YoutubeModel(R.drawable.thumbnailone,R.string.thumbnail_one,
                    "https://youtu.be/7iFTsdUrFuk"));
            arrayList.add(new YoutubeModel(R.drawable.thumbnailtwo,R.string.thumbnail_two,
                    "https://youtu.be/gXjahlY3W10"));
            arrayList.add(new YoutubeModel(R.drawable.thumbnailthree,R.string.thumbnail_three,
                    "https://youtu.be/JUwYLegdE1g"));
            arrayList.add(new YoutubeModel(R.drawable.thumbnailfour,R.string.thumbnail_four,
                    "https://youtu.be/1ztfqsnf5yQ"));
            arrayList.add(new YoutubeModel(R.drawable.thumbnailfive,R.string.thumbnail_five,
                    "https://youtu.be/Axvv6Xgctsw"));
        }
    }

    @Override
    public void onClick(String link) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }
}