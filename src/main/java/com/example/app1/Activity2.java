package com.example.app1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.app1.Activity2;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ", "AnotherActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResuming", "AnotherActivity Cycle: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPausing", "AnotherActivity Cycle: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStopping", "AnotherActivity Cycle: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroying", "AnotherActivity: onDestroy()");
    }
}
