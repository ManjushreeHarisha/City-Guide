package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RagiGudda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ragi_gudda);
    }

    public void gotoMaps(View view)
    {
        String uri = "https://www.google.co.in/maps/place/Ragigudda+Sri+Prasanna+Anjaneyaswamy+Temple/@12.9142717,77.5931711,15z/data=!4m5!3m4!1s0x0:0x473dd574e09fb17a!8m2!3d12.9142717!4d77.5931711";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }

    public void gotoSite(View view)
    {
        String uri = "http://www.ragigudda.org/";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }
}
