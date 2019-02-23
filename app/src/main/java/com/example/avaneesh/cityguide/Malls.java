package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Malls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);
    }

    public void gotoForum(View view)
    {
        Intent i = new Intent(getApplicationContext(),TheForum.class);
        startActivity(i);
    }

    public void gotoMantri(View view)
    {
        Intent i = new Intent(getApplicationContext(),MantriSquare.class);
        startActivity(i);
    }

    public void gotoOrion(View view)
    {
        Intent i = new Intent(getApplicationContext(),Orion.class);
        startActivity(i);
    }

    public void commingSoon(View view)
    {
        Toast.makeText(Malls.this, "Comming Soon!",Toast.LENGTH_LONG).show();
    }
}
