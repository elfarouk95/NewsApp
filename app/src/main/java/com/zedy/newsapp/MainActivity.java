package com.zedy.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView ls;
    ArrayList<News> n = new ArrayList<>();
    NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls = findViewById(R.id.List);

        //   prepareData();
        adapter = new NewsAdapter(n);
        ls.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
        ls.setLayoutManager(gridLayoutManager);

        getData();
    }

    Response.Listener<String> listener = new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {
            n = JsonReader.Read(response);
            adapter = new NewsAdapter(n);
            ls.setAdapter(adapter);
        }
    };
    Response.ErrorListener errorListener = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {

        }
    };

    void getData() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://newsapi.org/v2/top-headlines?sources=google-news&apiKey=d88d2b3368a44b0e969b1c37e4fd9196";
        String url2 ="https://newsapi.org/v2/top-headlines?country=eg&apiKey=d88d2b3368a44b0e969b1c37e4fd9196";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url2, listener, errorListener);
        queue.add(stringRequest);
    }

    void prepareData() {
        n.add(new News("aaa", "Aa13a", "aa"));
        n.add(new News("aa1a", "A12aa", "aa"));
        n.add(new News("aa2a", "Aa11a", "aa"));
        n.add(new News("aa3a", "A10aa", "aa"));
        n.add(new News("aa4a", "Aa9a", "aa"));
        n.add(new News("a5aa", "A8aa", "aa"));
        n.add(new News("aa6a", "Aa7a", "aa"));
        n.add(new News("aa7a", "Aa6a", "aa"));
        n.add(new News("a8aa", "Aa5a", "aa"));
        n.add(new News("aa9a", "Aa4a", "aa"));
        n.add(new News("aa10a", "A3aa", "aa"));
        n.add(new News("a11aa", "A2aa", "aa"));
        n.add(new News("a113aa", "A1aa", "aa"));


    }
}
