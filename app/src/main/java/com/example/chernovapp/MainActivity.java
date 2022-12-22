package com.example.chernovapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(3, "Barsik", "Padre", "red");
        myCat.talk();

        Cat murzik = new Cat(4, "Murzik", "Fratello", "yellow");
        murzik.talk();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.breed = "Don";
        glasha.color = "brown";
        glasha.talk();
    }
}