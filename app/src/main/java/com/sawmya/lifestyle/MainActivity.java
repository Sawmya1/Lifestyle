package com.sawmya.lifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Diet(View view) {
        Intent i = new Intent(getApplicationContext(), Diet.class);
        startActivity(i);
    }

    public void Health(View view) {
        Intent i = new Intent(getApplicationContext(), Health.class);
        startActivity(i);
    }

    public void Stress(View view) {
        Intent i = new Intent(getApplicationContext(), Stress.class);
        startActivity(i);
    }
}