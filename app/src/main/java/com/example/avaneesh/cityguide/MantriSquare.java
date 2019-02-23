package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MantriSquare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantri_square);
    }


    public void gotoMaps(View view)
    {

        String uri = "https://www.google.co.in/maps/dir/13.0326491,77.564763/Sankey+Tank/@13.0196624,77.5521361,14z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3bae1632951450cd:0x6bf89f0c5ee10a26!2m2!1d77.5741212!2d13.0092983";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));

    }

    public void gotoVirtualTour(View view)
    {
        String uri="https://www.google.co.in/maps/place/Mantri+Square+Mall/@12.9915302,77.5714974,3a,75y,205.86h,70.33t/data=!3m8!1e1!3m6!1s-LlRa201VsrU%2FWF9_WBjPymI%2FAAAAAAAALpU%2F9ar_Ic1OVVwuXcz1iL3P-KlPRU3V3QeUgCLIB!2e4!3e11!6s%2F%2Flh4.googleusercontent.com%2F-LlRa201VsrU%2FWF9_WBjPymI%2FAAAAAAAALpU%2F9ar_Ic1OVVwuXcz1iL3P-KlPRU3V3QeUgCLIB%2Fw203-h100-k-no-pi-2.9338646-ya155.47757-ro-0-fo100%2F!7i10240!8i5120!4m5!3m4!1s0x3bae1623009f12a1:0x964fc1d33fa26aad!8m2!3d12.9917229!4d77.5705532!6m1!1e1";
        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(i);
    }
}
