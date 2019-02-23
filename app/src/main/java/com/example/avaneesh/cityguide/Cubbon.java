package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Cubbon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubbon);
    }
    public void gotoMaps(View view)
    {
        String uri = "https://www.google.co.in/maps/dir/''/cubbon+park/@12.9763378,77.5228879,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3bae1673e7d0672f:0xc62ca5a6e943dfb8!2m2!1d77.5929284!2d12.9763472";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));

    }

    public void gotoVirtualTour(View view)
    {
        String uri="https://www.google.com/maps/place/Cubbon+Park/@12.9755971,77.591182,3a,75y,350h,90t/data=!3m8!1e1!3m6!1sANJV-ao77_IAAAQvOrYDgg!2e0!3e2!6s%2F%2Fgeo1.ggpht.com%2Fcbk%3Fpanoid%3DANJV-ao77_IAAAQvOrYDgg%26output%3Dthumbnail%26cb_client%3Dmaps_sv.tactile.gps%26thumb%3D2%26w%3D203%26h%3D100%26yaw%3D350.20346%26pitch%3D0%26thumbfov%3D100!7i6600!8i3300!4m5!3m4!1s0x3bae1673e7d0672f:0xc62ca5a6e943dfb8!8m2!3d12.9763472!4d77.5929284!6m1!1e1";
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(Intent.createChooser(intent,"Select an application"));
    }
}
