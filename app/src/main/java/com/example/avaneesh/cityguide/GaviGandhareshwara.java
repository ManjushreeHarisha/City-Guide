package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GaviGandhareshwara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gavi_gandhareshwara);
    }

    public void gotoMaps(View view)
    {
        String uri="https://www.google.co.in/maps/place/Gavigangadhara+Temple/@12.9489152,77.5604513,17z/data=!3m1!4b1!4m5!3m4!1s0x3bae15f606293947:0x7c03e96de2457fb!8m2!3d12.94891!4d77.56264";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }
}
