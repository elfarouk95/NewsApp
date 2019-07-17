package com.zedy.newsapp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonReader {
    public static ArrayList<News> Read(String j) {

        ArrayList<News> news = new ArrayList<>();
        try {

            JSONObject jsonObject = new JSONObject(j);
            JSONArray array = jsonObject.getJSONArray("articles");
            for (int i = 0; i < array.length(); i++) {
                JSONObject object = array.getJSONObject(i);

                String author = object.getString("author");
                String dec = object.getString("title");
                String imgurl = object.getString("urlToImage");

                News n = new News(author, dec, imgurl);
                news.add(n);
            }
        } catch (Exception e) {

        }

        return news;
    }
}
