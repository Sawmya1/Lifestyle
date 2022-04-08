package com.sawmya.lifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Diet extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        b1 = (Button) findViewById(R.id.b1);
    }

    public void diet(View view) {
        int score = 0;
        score = score+10;
        Toast.makeText(Diet.this,"WOW! You did a great job.\n You get 10 more points",Toast.LENGTH_LONG).show();
    }
}