package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Bannerghatta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bannerghatta);
    }
    public void gotoMaps(View view)
    {

        String uri = "https://www.google.co.in/maps/dir/''/bannerghatta+national+park/@12.80035,77.5075693,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x3bae69e00b196db1:0x4f6f2e78ffa13a5f!2m2!1d77.5776098!2d12.8003592";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));

    }
    public void gotoVirtualTour(View view)
    {
        String uri="https://www.google.co.in/maps/place/Bannerghatta+National+Park/@12.8009343,77.5776681,3a,75y,133.97h,58.67t/data=!3m8!1e1!3m6!1s-J75tXV4AHg4%2FV25PhsxgsMI%2FAAAAAAAAEmc%2FVbTdFqYW_m8AnQGeuN0hDxhRbCBebQiNQCJkC!2e4!3e11!6s%2F%2Flh5.googleusercontent.com%2F-J75tXV4AHg4%2FV25PhsxgsMI%2FAAAAAAAAEmc%2FVbTdFqYW_m8AnQGeuN0hDxhRbCBebQiNQCJkC%2Fw203-h100-k-no-pi0-ya349.5-ro-0-fo100%2F!7i4608!8i2304!4m5!3m4!1s0x3bae69e00b196db1:0x4f6f2e78ffa13a5f!8m2!3d12.8003592!4d77.5776098!6m1!1e1?hl=en";
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(Intent.createChooser(intent,"Select an application"));
    }
}
