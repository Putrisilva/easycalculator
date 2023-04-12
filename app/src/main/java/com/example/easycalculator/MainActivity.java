package com.example.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angkakesatu, angkakedua;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angkakesatu = (EditText) findViewById(R.id.angkakesatu);
        angkakedua = (EditText) findViewById(R.id.angkakedua);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angkakesatu.getText().length() > 0) && (angkakedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angkakesatu.getText().toString());
                    double angka2 = Double.parseDouble(angkakedua.getText().toString());
                    double result = angka1 + angka2;
                    tvHasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Input Terlebih Dahulu Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angkakesatu.getText().length() > 0) && (angkakedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angkakesatu.getText().toString());
                    double angka2 = Double.parseDouble(angkakedua.getText().toString());
                    double result = angka1 - angka2;
                    tvHasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Input Terlebih Dahulu Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angkakesatu.getText().length() > 0) && (angkakedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angkakesatu.getText().toString());
                    double angka2 = Double.parseDouble(angkakedua.getText().toString());
                    double result = angka1 * angka2;
                    tvHasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Input Terlebih Dahulu Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angkakesatu.getText().length() > 0) && (angkakedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angkakesatu.getText().toString());
                    double angka2 = Double.parseDouble(angkakedua.getText().toString());
                    double result = angka1 / angka2;
                    tvHasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Input Terlebih Dahulu Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

    }
}

