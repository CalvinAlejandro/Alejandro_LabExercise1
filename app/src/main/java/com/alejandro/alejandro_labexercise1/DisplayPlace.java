package com.alejandro.alejandro_labexercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class DisplayPlace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_place);
    }

    public void displayPlace1(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://foursquare.com/v/roque-rua%C3%B1o-building/4d4ede8a9d662d43d6a94b00"));
        startActivity(intent);
    }
    public void displayPlace2(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://varsitarian.net/20180102/circle/ust-main-building-at-90"));
        startActivity(intent);
    }
    public void displayPlace3(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://library.ust.edu.ph/"));
        startActivity(intent);
    }
    public void displayPlace4(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.usthospital.com.ph/"));
        startActivity(intent);
    }
}
