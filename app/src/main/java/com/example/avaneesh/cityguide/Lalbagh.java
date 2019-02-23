package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Lalbagh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lalbagh);
    }
    public void gotoMaps(View view)
    {

        String uri = "https://www.google.co.in/maps/place/Lalbagh+Botanical+Garden/@12.9507432,77.5847773,15z/data=!4m5!3m4!1s0x0:0x8e110b99df2fbe22!8m2!3d12.9507432!4d77.5847773";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));

    }

    public void gotoVirtualTour(View view)
    {
        String uri="https://www.google.co.in/maps/place/Lalbagh+Botanical+Garden/@12.9503415,77.5845038,3a,75y,161.35h,98.14t/data=!3m8!1e1!3m6!1s-PWPOAM5L4UU%2FVU3qDLYQqDI%2FAAAAAAAABps%2FlCGdAdl8KJ4cELtQ-lRp5SkobmPK2nmwwCJkC!2e4!3e11!6s%2F%2Flh4.googleusercontent.com%2F-PWPOAM5L4UU%2FVU3qDLYQqDI%2FAAAAAAAABps%2FlCGdAdl8KJ4cELtQ-lRp5SkobmPK2nmwwCJkC%2Fw203-h100-k-no-pi-2.9999962-ya76.5-ro-0-fo100%2F!7i2508!8i1254!4m5!3m4!1s0x3bae15c191f2d31d:0x8e110b99df2fbe22!8m2!3d12.9507432!4d77.5847773!6m1!1e1";
        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        startActivity(Intent.createChooser(i,"Select an application"));
    }
}
