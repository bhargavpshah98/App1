package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button but;
    public static int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but = findViewById(R.id.dialogButton);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        TextView textView3 =  (TextView) findViewById(R.id.textView3);
        textView3.setText(""+counter);

    }

    private void openDialog() {

        Dialogue simpleDialog = new Dialogue();
        simpleDialog.show(getSupportFragmentManager(), "example Dialog");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("onStart ------ ","MainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ","MainActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ","MainActivity: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ","MainActivity: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ","MainActivity: onDestroy()");
    }


    @Override
    protected void onRestart() {
        counter++;

        TextView textView3 =  (TextView) findViewById(R.id.textView3);
        textView3.setText(""+counter);
        super.onRestart();
        Log.e("onRestart ------ ","MainActivity: onRestart()");

    }

    public void switchActivity(View view){
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }
}