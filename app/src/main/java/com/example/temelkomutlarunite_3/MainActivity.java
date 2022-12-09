package com.example.temelkomutlarunite_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUyg1;
    Button btnUyg2;
    Button btnUyg3;
    Button btnUyg4;
    Button btnUyg5;
    Button btnuyg6;
    Button btnuyg7;
    Button btnuyg8;
    Button btnuyg9;
    Button btnuyg10;
    Button btnuyg11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUyg1 = findViewById(R.id.btnUyg1);
        btnUyg2 = findViewById(R.id.btnUyg2);
        btnUyg3 = findViewById(R.id.btnUyg3);
        btnUyg4 = findViewById(R.id.btnUyg4);
        btnUyg5 = findViewById(R.id.btnUyg5);
        btnuyg6 = findViewById(R.id.btnuyg6);
        btnuyg7 = findViewById(R.id.btnuyg7);
        btnuyg8 = findViewById(R.id.Btnuyg8);
        btnuyg9 = findViewById(R.id.btnuyg9);
        btnuyg10 = findViewById(R.id.btnuyg10);
        btnuyg11 = findViewById(R.id.btnuyg11);

        btnUyg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg1Activity.class);
                startActivity(i);
            }
        });

        btnUyg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
                startActivity(i);
            }
        });

        btnUyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(i);
            }
        });

        btnUyg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg4Activity.class);
                startActivity(i);
            }
        });

        btnUyg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Uyg5Activity.class);
                startActivity(i);
            }
        });
        btnuyg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Uyg6Activity.class);
                startActivity(i);
            }
        });
        btnuyg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Uyg7Activity.class);
                startActivity(i);
            }
        });
        btnuyg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Uyg8Activity.class);
                startActivity(i);
            }
        });
        btnuyg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Uyg9Activity.class);
                startActivity(i);
            }
        });
        btnuyg10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Uyg10Activity.class);
                startActivity(i);
            }
        });
        btnuyg11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Uyg11Activity.class);
                startActivity(i);
            }
        });
    }
}
