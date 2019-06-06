package com.example.glamp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    MediaPlayer mp;
    MenuActivity menuActivity = new MenuActivity();
    @Override
    public void onReceive(Context context, Intent intent) {
        mp=MediaPlayer.create(context, R.raw.bien);
        mp.start();
        Toast.makeText(context, "Lampara encendida!", Toast.LENGTH_LONG).show();

    }
}
