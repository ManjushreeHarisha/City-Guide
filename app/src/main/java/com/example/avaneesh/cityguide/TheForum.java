package com.example.avaneesh.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TheForum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_forum);
    }

    public void gotoMaps(View view)
    {
        String uri="https://www.google.co.in/maps/place/The+Forum+Mall+-+Koramangala/@12.9345449,77.6113077,15z/data=!4m2!3m1!1s0x0:0x2000fe57480d2eed?sa=X&sqi=2&ved=0ahUKEwjrkOOhnuzTAhWMEbwKHaq_A34Q_BIIggEwCg";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }

    public void gotoVirtual(View view)
    {

        String uri="https://www.google.co.in/maps/@12.9347164,77.6115763,3a,75y,317.85h,63.83t/data=!3m6!1e1!3m4!1si61FDJ60COHsiizjjCzAbg!2e0!7i13312!8i6656!6m1!1e1";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(Intent.createChooser(intent, "Select an application"));
    }
}
