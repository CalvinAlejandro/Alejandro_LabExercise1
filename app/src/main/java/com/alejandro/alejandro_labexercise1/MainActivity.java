package com.alejandro.alejandro_labexercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayPlace(View view)
    {
        Intent intent = new Intent(this, DisplayPlace.class);
        startActivity(intent);
    }
    public void displayCatalog(View view)
    {
        super.onResume();
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }
}
