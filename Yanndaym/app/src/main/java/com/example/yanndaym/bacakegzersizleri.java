package com.example.yanndaym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bacakegzersizleri extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacakegzersizleri);

        button1 = findViewById(R.id.TekAyakUzeriId);
        button2 = findViewById(R.id.IkiElBelindeId);
        button3 = findViewById(R.id.DemirAdimId);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bacakegzersizleri.this,tekayakuzerindeziplama.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bacakegzersizleri.this,ikielbelindeziplama.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bacakegzersizleri.this,demiradim.class);
                startActivity(intent);
            }
        });

    }
}