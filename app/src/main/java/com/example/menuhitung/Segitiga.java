package com.example.menuhitung;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    private EditText editTextAlas, editTextTinggi;
    private Button buttonHitungLuas, buttonHitungKeliling, btnback;
    private TextView textViewHasilLuas, textViewHasilKeliling;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        imageView = findViewById(R.id.myImageView);
        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitungLuas = findViewById(R.id.buttonHitungLuas);
        buttonHitungKeliling = findViewById(R.id.buttonHitungKeliling);
        textViewHasilLuas = findViewById(R.id.textViewHasilLuas);
        textViewHasilKeliling = findViewById(R.id.textViewHasilKeliling);
        btnback = findViewById(R.id.balik);

        imageView.setImageResource(R.drawable.segitiga);

        buttonHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alas = Double.parseDouble(editTextAlas.getText().toString());
                double tinggi = Double.parseDouble(editTextTinggi.getText().toString());

                double luas = 0.5 * alas * tinggi;

                textViewHasilLuas.setText("Luas segitiga: " + luas);
            }
        });

        buttonHitungKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alas = Double.parseDouble(editTextAlas.getText().toString());
                double tinggi = Double.parseDouble(editTextTinggi.getText().toString());

                double keliling = alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));

                textViewHasilKeliling.setText("Keliling segijtiga: " + keliling);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Segitiga.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}
