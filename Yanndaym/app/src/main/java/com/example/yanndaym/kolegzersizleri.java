package com.example.yanndaym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kolegzersizleri extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolegzersizleri);

        button1 = findViewById(R.id.BasustundeId);
        button2 = findViewById(R.id.AgirlikKaldirmaId);
        button3 = findViewById(R.id.KolKaldırmaId);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kolegzersizleri.this,basustundealkislama.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kolegzersizleri.this,agirlikkaldirma.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kolegzersizleri.this,kolkaldirma.class);
                startActivity(intent);
            }
        });


    }
}