package com.example.avaneesh.cityguide;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Malleshwara extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malleshwara);

    }

    public void gotoMaps(View view)
    {
        String uri="https://www.google.co.in/maps/place/Sri+Kaadu+Mallikarjunaswamy+Temple/@13.0049546,77.5693132,17z/data=!3m1!4b1!4m5!3m4!1s0x3bae162e71d3f5e9:0x977d87aee5ba9d22!8m2!3d13.0049546!4d77.5715019";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }

    public void gotoCall(View view)
    {
        String uri="tel:098450 75961";
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse(uri));
        startActivity(intent);
    }
}
