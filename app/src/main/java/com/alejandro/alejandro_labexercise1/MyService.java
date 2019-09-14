package com.alejandro.alejandro_labexercise1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class MyService extends IntentService {

    public MyService()
    {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Place1", "Roque Ruano Building");
        Log.d("Place2", "UST Main Building");
        Log.d("Place3", "UST Library");
        Log.d("Place4", "UST Hospital");
    }
}
