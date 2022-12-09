package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int x = 15;
        int y = 8;
        System.out.println("x ile y eşit mi : " + (x == y));
        System.out.println("x ile y farklı mı : " + (x != y));
        System.out.println("x, y'den büyük mü : " + (x > y));
        System.out.println("x, y'den küçük mü : " + (x < y));
        System.out.println("x, y'den büyük veya eşit mi : " + (x >= y));
        System.out.println("x, y'den küçük veya eşit mi : " + (x <= y));
    }
}
