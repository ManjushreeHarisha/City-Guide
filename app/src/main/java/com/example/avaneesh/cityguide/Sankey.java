package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Sankey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sankey);
    }

    public void gotoMaps(View view)
    {

        String uri = "https://www.google.co.in/maps/dir/13.0326491,77.564763/Sankey+Tank/@13.0196624,77.5521361,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3bae1632951450cd:0x6bf89f0c5ee10a26!2m2!1d77.5741212!2d13.0092983";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));

    }

    public void gotoVirtualTour(View view)
    {

        String uri="https://www.google.co.in/maps/place/Malleshwaram+West,+Bengaluru,+Karnataka/@13.008901,77.575657,3a,52.1y,236.57h,89.57t/data=!3m8!1e1!3m6!1s-b0rXubM2bzY%2FWGR1P7h1WQI%2FAAAAAAAA5RM%2Fitn0Eogzgh4jEpGjpZETbyZ7F6a_IGVVwCLIB!2e4!3e11!6s%2F%2Flh4.googleusercontent.com%2F-b0rXubM2bzY%2FWGR1P7h1WQI%2FAAAAAAAA5RM%2Fitn0Eogzgh4jEpGjpZETbyZ7F6a_IGVVwCLIB%2Fw234-h106-k-no-pi-2.9338646-ya200.5-ro0-fo100%2F!7i10240!8i5120!4m5!3m4!1s0x3bae3d7fff79cfc3:0xdfbaac7a46a4a5be!8m2!3d13.0030624!4d77.5642928?hl=en";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }
}
