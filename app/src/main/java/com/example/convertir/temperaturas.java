package com.example.convertir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class temperaturas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperaturas);

        getIntent().getExtras().getString("cel");
        try{
            Button ingres=findViewById(R.id.cal);
        }
        catch (Exception ex){
            Toast.makeText(temperaturas.this,"Ingrese un numero",Toast.LENGTH_SHORT).show();
        }


        this.setTitle(R.string.celsius);


    }
}
