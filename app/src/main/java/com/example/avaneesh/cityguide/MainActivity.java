package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gotoPark(View view)
    {
        Intent i = new Intent(getApplicationContext(),Park.class);
        startActivity(i);
    }

    public void gotoTemple(View view)
    {
        Intent i=new Intent(getApplicationContext(),Temples.class);
        startActivity(i);
    }

    public void gotoMalls(View view)
    {
        Intent i=new Intent(getApplicationContext(),Malls.class);
        startActivity(i);
    }
}
