package com.example.convertir;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cel=findViewById(R.id.ce);
        Button far=findViewById(R.id.fa);
        Button met=findViewById(R.id.metro);
        Button kil=findViewById(R.id.kilometro);
        Button metr=findViewById(R.id.metros);
        Button cen=findViewById(R.id.centimetros);
        cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,temperaturas.class);
                intent.putExtra("cel","string");
                startActivity(intent);
            }
        });
        far.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,fahrenheit.class);
                intent.putExtra("parametro","string");
                startActivity(intent);
            }
        });
        met.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,metro.class);
                intent.putExtra("parametro","string");
                startActivity(intent);
            }
        });
        kil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,kilometro.class);
                intent.putExtra("parametro","string");
                startActivity(intent);
            }
        });
        metr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,metros.class);
                intent.putExtra("parametro","string");
                startActivity(intent);
            }
        });
        cen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Centimetros.class);
                intent.putExtra("parametro","string");
                startActivity(intent);
            }
        });


    }
}
