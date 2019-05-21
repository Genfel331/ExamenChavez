package com.example.convertir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class kilometro extends AppCompatActivity {
    String titulo= "kilometro";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilometro);
        this.setTitle(R.string.kilometro);
    }
}
