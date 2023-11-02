package com.example.menuhitung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    private EditText editTextRadius;
    private Button buttonHitungLuas, buttonHitungKeliling, buttonLik;
    private TextView textViewHasilLuas, textViewHasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        editTextRadius = findViewById(R.id.editTextRadius);
        buttonHitungLuas = findViewById(R.id.buttonHitungLuas);
        buttonHitungKeliling = findViewById(R.id.buttonHitungKeliling);
        textViewHasilLuas = findViewById(R.id.textViewHasilLuas);
        textViewHasilKeliling = findViewById(R.id.textViewHasilKeliling);
        buttonLik = findViewById(R.id.klb);

        buttonHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double radius = Double.parseDouble(editTextRadius.getText().toString());

                double luas = Math.PI * Math.pow(radius, 2);

                textViewHasilLuas.setText("Luas lingkaran: " + luas + " cm^2");
            }
        });

        buttonHitungKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double radius = Double.parseDouble(editTextRadius.getText().toString());

                double keliling = 2 * Math.PI * radius;

                textViewHasilKeliling.setText("Keliling lingkaran: " + keliling + " cm");
            }
        });
        buttonLik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LikSono = new Intent(Lingkaran.this, MainActivity.class);
                startActivity(LikSono);
            }
        });

    }
}
