package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Iskon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iskon);
    }

    public void gotoMaps(View view)
    {
        String uri="https://www.google.co.in/maps/place/ISKCON+Bangalore/@13.0096323,77.551071,15z/data=!4m2!3m1!1s0x0:0x7a7fb24a41a6b2b3?sa=X&sqi=2&ved=0ahUKEwj2xsfOm-zTAhXCv7wKHZAAB_sQ_BIIrgEwEw";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }


    public void gotoCall(View view)
    {
        String uri="tel:080 2347 1956";
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse(uri));
        startActivity(intent);
    }
    public void gotoVirtual(View view)
    {

        String uri="https://www.google.co.in/maps/place/ISKCON+Bangalore/@13.0102088,77.5513951,3a,75y,224.44h,88.76t/data=!3m8!1e1!3m6!1s-o61vJyQgK94%2FWEOOKUP6nEI%2FAAAAAAAAX9Q%2FwyGmLSWVr5AqXt8ulYGn25_uFUH9r0UtgCLIB!2e4!3e11!6s%2F%2Flh6.googleusercontent.com%2F-o61vJyQgK94%2FWEOOKUP6nEI%2FAAAAAAAAX9Q%2FwyGmLSWVr5AqXt8ulYGn25_uFUH9r0UtgCLIB%2Fw203-h100-k-no-pi-2.9338646-ya285.5-ro-0-fo100%2F!7i10240!8i5120!4m8!1m2!2m1!1siskon!3m4!1s0x3bae3ded0b360e07:0x7a7fb24a41a6b2b3!8m2!3d13.0096323!4d77.551071!6m1!1e1";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }
}
