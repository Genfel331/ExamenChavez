package com.example.convertir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class metro extends AppCompatActivity {
  String titulo="metro";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro);

        this.setTitle(R.string.metro);
    }
}
