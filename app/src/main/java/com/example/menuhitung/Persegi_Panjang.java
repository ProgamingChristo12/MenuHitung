package com.example.menuhitung;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Persegi_Panjang extends AppCompatActivity {

    EditText panjang, lebar;
    Button keliling, luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        keliling = findViewById(R.id.keliling);
        luas = findViewById(R.id.luas);
        Button btnbalikk = findViewById(R.id.utama);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validasiInput()) {
                    double p = Double.parseDouble(panjang.getText().toString());
                    double l = Double.parseDouble(lebar.getText().toString());
                    double hasil = 2 * (p + l);
                    Toast.makeText(getApplicationContext(), "Keliling Persegi Panjang adalah " + hasil, Toast.LENGTH_LONG).show();
                }
            }
        });

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validasiInput()) {
                    double p = Double.parseDouble(panjang.getText().toString());
                    double l = Double.parseDouble(lebar.getText().toString());
                    double hasil = p * l;
                    Toast.makeText(getApplicationContext(), "Luas Persegi Panjang adalah " + hasil, Toast.LENGTH_LONG).show();
                }
            }
        });
        btnbalikk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balikgih = new Intent(Persegi_Panjang.this, MainActivity.class);
                startActivity(balikgih);
            }
        });
    }

    private boolean validasiInput() {
        if (panjang.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Harap masukkan panjang", Toast.LENGTH_SHORT).show();
            return false;
        } else if (lebar.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Harap masukkan lebar", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;

    }
}
