package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import static android.R.attr.button;

public class ShivaGange extends AppCompatActivity {
    RatingBar ratingbar1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiva_gange);
    }

    public void gotoMaps(View view)
    {
        String uri="https://www.google.co.in/maps/place/Shivagange/@13.168056,77.222222,15z/data=!4m5!3m4!1s0x0:0x2b9e043377b0d1dc!8m2!3d13.1713001!4d77.2211409";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }

    public void gotoVirtual(View view)
    {

        String uri="https://www.google.co.in/maps/place/Shivagange/@13.168056,77.222222,3a,75y,66.75h,90t/data=!3m8!1e1!3m6!1s-bqcU5VfOa7A%2FWJeDEikbKBI%2FAAAAAAAAVvE%2FjHO7L-EuVzkeqqWdYJ76bLu9wO7Gv5fIQCLIB!2e4!3e11!6s%2F%2Flh5.googleusercontent.com%2F-bqcU5VfOa7A%2FWJeDEikbKBI%2FAAAAAAAAVvE%2FjHO7L-EuVzkeqqWdYJ76bLu9wO7Gv5fIQCLIB%2Fw234-h106-k-no-pi-0-ya98.5-ro-0-fo100%2F!7i7168!8i3584!4m5!3m4!1s0x3bae2b19422c3f7b:0xe5f685f3c253a490!8m2!3d13.168056!4d77.222222!6m1!1e1";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }

            public void gotoRating(View arg0) {
                Toast.makeText(getApplicationContext(), "rating recorded", Toast.LENGTH_LONG).show();
            }
}
