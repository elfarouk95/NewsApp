package com.zedy.newsapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsItem  extends RecyclerView.ViewHolder {

    TextView Title;
    TextView desc;
    ImageView NImg;
    public NewsItem(@NonNull View itemView) {
        super(itemView);
        Title =itemView.findViewById(R.id.Title);
        desc =itemView.findViewById(R.id.Ndesc);

        NImg =itemView.findViewById(R.id.NImg);

    }
}
