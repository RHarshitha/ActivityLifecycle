package com.example.harshitha.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    Button exit,Diag;
    TextView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFECYCLE", "onCreate was called");
        exit = (Button) findViewById(R.id.button);
        Diag = (Button) findViewById(R.id.button2);
        scroll = (TextView)findViewById(R.id.textView);

        Diag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(getApplicationContext(),Dialog_box.class);
                startActivity(i);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
              // System.exit(0);
           }
       });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE","onStart was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE","onResume was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE","onPause was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE","onStop was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE","onDestroy was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE","onRestart was called");
    }
}
