package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int x = 10;
        int y = 3;
        int toplam = x+y;
        int fark = + - y;
        int carpim = x*y;
        int bolme = x / y;
        int mod = x%y;
        x++;
        y--;
        System.out.println("toplam"+toplam);
        System.out.println("fark"+fark);
        System.out.println("carpim"+carpim);
        System.out.println("bolme"+bolme);
        System.out.println("mod Alma:"+mod);
        System.out.println("Artırma"+ x);
        System.out.println("azaltma"+ y);
    }
}
