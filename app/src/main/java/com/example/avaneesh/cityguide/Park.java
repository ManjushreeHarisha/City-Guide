package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Park extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
    }
    public void gotoLalbagh(View view)
    {
        Intent i = new Intent(getApplicationContext(),Lalbagh.class);
        startActivity(i);

    }
    public void gotoBanner(View view)
    {
        Intent i = new Intent(getApplicationContext(),Bannerghatta.class);
        startActivity(i);

    }
    public void gotoCubbon(View view)
    {
        Intent i = new Intent(getApplicationContext(),Cubbon.class);
        startActivity(i);

    }

    public void gotoSankey(View view)
    {
        Intent i=new Intent(getApplicationContext(),Sankey.class);
        startActivity(i);

    }

    public void gotoJpPark(View view)
    {
        Intent i=new Intent(getApplicationContext(),JpPark.class);
        startActivity(i);
    }

}
