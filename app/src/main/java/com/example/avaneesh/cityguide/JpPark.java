package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class JpPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jp_park);
    }

    public void gotoMaps(View view)
    {
        String uri = "https://www.google.co.in/maps/search/jp+park/@13.0343121,77.5496525,17z/data=!3m1!4b1";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }
    public void gotoVirtualTour(View view)
    {
        String uri="https://www.google.com/maps/place/JP+Park/@13.0349848,77.5535691,3a,75y,259h,88t/data=!3m8!1e1!3m6!1s-RSc7S1qlq4I%2FWGsPIhYVxXI%2FAAAAAAAAEiY%2FKlIppOrLcu409o7x7skPn4Wc4M0ISxVTQCLIB!2e4!3e11!6s%2F%2Flh5.googleusercontent.com%2F-RSc7S1qlq4I%2FWGsPIhYVxXI%2FAAAAAAAAEiY%2FKlIppOrLcu409o7x7skPn4Wc4M0ISxVTQCLIB%2Fw203-h100-k-no-pi-2.9338646-ya31.50001-ro-0-fo100%2F!7i8192!8i4096!4m5!3m4!1s0x3bae3d5da75cc2fb:0x87f0d4c69917447b!8m2!3d13.0348656!4d77.5533837!6m1!1e1";
        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(i);
    }
}