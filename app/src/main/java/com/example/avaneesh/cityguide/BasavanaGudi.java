package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BasavanaGudi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basavana_gudi);
    }

    public void gotoMaps(View view)
    {
        String uri="https://www.google.co.in/maps/place/Big+Bull+Temple/@12.942913,77.5660839,17z/data=!4m12!1m6!3m5!1s0x3bae158cae6bbaa5:0x98b4d1599ebd6716!2sShree+Dodda+Ganapathi+Temple!8m2!3d12.9429078!4d77.568278!3m4!1s0x0:0x9815e4badb8ac23b!8m2!3d12.9418572!4d77.5679874";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }


    public void gotoCall(View view)
    {
        String uri="tel:080 2347 1956";
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse(uri));
        startActivity(intent);
    }

}
