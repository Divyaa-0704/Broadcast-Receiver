package com.example.broadcastreceiver_application;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            if (action.equals(Intent.ACTION_BATTERY_LOW)) {
                Toast.makeText(context, "Battery Low! Please charge your device.", Toast.LENGTH_LONG).show();
            } else if (action.equals(Intent.ACTION_BATTERY_OKAY)) {
                Toast.makeText(context, "Battery is okay now!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
