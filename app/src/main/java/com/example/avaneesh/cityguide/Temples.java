package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Temples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temples);
    }

    public void gotoMalleshwara(View view)
    {
        Intent i = new Intent(getApplicationContext(),Malleshwara.class);
        startActivity(i);
    }

    public void gotoGavi(View view)
    {
        Intent i = new Intent(getApplicationContext(),GaviGandhareshwara.class);
        startActivity(i);
    }

    public void gotoIskon(View view)
    {
        Intent i = new Intent(getApplicationContext(),Iskon.class);
        startActivity(i);
    }

    public void gotoBasava(View view)
    {
        Intent i = new Intent(getApplicationContext(),BasavanaGudi.class);
        startActivity(i);
    }

    public void gotoShiva(View view)
    {

        Intent i = new Intent(getApplicationContext(),ShivaGange.class);
        startActivity(i);
    }

    public void gotoRagi(View view)
    {

        Intent i = new Intent(getApplicationContext(),RagiGudda.class);
        startActivity(i);
    }
}
