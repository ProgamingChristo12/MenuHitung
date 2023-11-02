package com.example.menuhitung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Button btnsegitiga = findViewById(R.id.segitiga);
        Button btnpersegi = findViewById(R.id.persegi);
        Button btnpersegipanjang = findViewById(R.id.persegi_panjang);
        Button btnlingkaran = findViewById(R.id.Lingkaran);


        btnsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explicit = new Intent(MainActivity.this, Segitiga.class);
                startActivity(explicit);
            }
        });
        btnpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent persegi = new Intent(MainActivity.this, persegi.class);
                startActivity(persegi);
            }
        });
        btnlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lingkaran = new Intent(MainActivity.this, Lingkaran.class);
                startActivity(lingkaran);
            }
        });
        btnpersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lingkaran = new Intent(MainActivity.this, Persegi_Panjang.class);
                startActivity(lingkaran);
            }
        });
    }
}