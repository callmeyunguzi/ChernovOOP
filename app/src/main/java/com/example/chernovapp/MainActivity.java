package com.example.chernovapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat1 = new Cat();
        cat1.catchMouse(1);
        cat1.catchMouse(3);
    }

}