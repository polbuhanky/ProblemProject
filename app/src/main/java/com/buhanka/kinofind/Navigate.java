package com.buhanka.kinofind;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Navigate extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);



        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigate);
    }

    public void RunToMenu(View view) {
        startActivity(new Intent(Navigate.this, Menu.class));
    }
}