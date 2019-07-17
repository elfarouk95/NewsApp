package com.zedy.newsapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsItem> {
    ArrayList<News> news = new ArrayList<>();

    public NewsAdapter(ArrayList<News> news) {
        this.news = news;
    }

    @NonNull
    @Override
    public NewsItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.newsitem, viewGroup, false);
        return new NewsItem(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsItem newsItem, int i) {
        newsItem.desc.setText(news.get(i).getDescription());
        newsItem.Title.setText(news.get(i).getAuthor());
        Picasso.get().load(news.get(i).getImgurl()).into(newsItem.NImg);

    }

    @Override
    public int getItemCount() {
        return news.size();
    }
}
