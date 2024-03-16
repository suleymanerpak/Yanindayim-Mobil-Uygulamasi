package com.example.yanndaym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class secimekrani extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secimekrani);

        button1 = findViewById(R.id.HatırlaticiEkranId);
        button2 = findViewById(R.id.IdealBoyKiloDurumuId);
        button3 = findViewById(R.id.EgzersizlerId);
        imageView1 = findViewById(R.id.hatirlaticisimgeId);
        imageView2 = findViewById(R.id.idealboykilosimgeId);
        imageView3 = findViewById(R.id.egzersizlersimgeId);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secimekrani.this,hatirlatici.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secimekrani.this,idealboykilodurumu.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secimekrani.this,egzersizler.class);
                startActivity(intent);
            }
        });
    }
}