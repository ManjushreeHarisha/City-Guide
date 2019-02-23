package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Orion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orion);
    }


    public void gotoMaps(View view)
    {
        String uri = "https://www.google.co.in/maps/place/Orion+Mall/@13.0107881,77.5549009,15z/data=!4m5!3m4!1s0x0:0x3c984ebd22cd5d54!8m2!3d13.0107881!4d77.5549009";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }

    public void gotoVirtual(View view)
    {

        String uri="https://www.google.co.in/maps/place/Orion+Mall/@13.0120089,77.55632,3a,75y,349h,88t/data=!3m8!1e1!3m6!1s-PCF7Dkoqn30%2FUsGwMUIfjWI%2FAAAAAAAAwmQ%2F2279Vj_hqoIuYRPwDftNvyT1GleDwNQlQCLIB!2e4!3e11!6s%2F%2Flh6.googleusercontent.com%2F-PCF7Dkoqn30%2FUsGwMUIfjWI%2FAAAAAAAAwmQ%2F2279Vj_hqoIuYRPwDftNvyT1GleDwNQlQCLIB%2Fw203-h100-k-no-pi-2.9338646-ya8.499979-ro-0-fo100%2F!7i3840!8i1919!4m5!3m4!1s0x3bae1629af0c075f:0x3c984ebd22cd5d54!8m2!3d13.0107881!4d77.5549009!6m1!1e1";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }
}
