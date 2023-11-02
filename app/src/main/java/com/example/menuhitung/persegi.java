package com.example.menuhitung;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {
    EditText panjang, lebar;
    Button hitungLuas, hitungKeliling, btnbackk;
    TextView hasilLuas, hasilKeliling;
    private View imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        imageView = findViewById(R.id.imgpersegi);
        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        hitungLuas = findViewById(R.id.hitungLuas);
        hitungKeliling = findViewById(R.id.hitungKeliling);
        hasilLuas = findViewById(R.id.hasilLuas);
        hasilKeliling = findViewById(R.id.hasilKeliling);
        btnbackk = findViewById(R.id.back1);

        // menambahkan listener untuk tombol hitung luas
        hitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p = Double.parseDouble(panjang.getText().toString());
                double l = Double.parseDouble(lebar.getText().toString());

                double luas = p * l;
                hasilLuas.setText(String.format("Luas = %.2f cm\u00B2", luas));
            }
        });


        hitungKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p = Double.parseDouble(panjang.getText().toString());
                double l = Double.parseDouble(lebar.getText().toString());

                double keliling = 2 * (p + l);
                hasilKeliling.setText(String.format("Keliling = %.2f cm", keliling));
            }
        });

        btnbackk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(persegi.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}
