package vn.edu.giadinh.myfirstandroidproject;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TAG ="MyMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Print Log
        Log.i(TAG,"onCreate");
        //Layout
        RelativeLayout layout =new RelativeLayout(this);
        layout.setBackgroundColor(Color.GRAY);
        //Tạo button
        Button button = new Button(this);
        button.setText("My Button");
        //add Button to layout
        layout.addView(button);
        // content View
        setContentView(layout);
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Print Log
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Print Log
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Print Log
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Print Log
        Log.i(TAG,"onResume");      }

    @Override
    protected void onStart() {
        super.onStart();
        // Print Log
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // Print Log
        Log.i(TAG,"onRestart");
    }

}

