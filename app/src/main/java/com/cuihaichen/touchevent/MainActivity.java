package com.cuihaichen.touchevent;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.outer).setOnClickListener(this);
//        findViewById(R.id.center).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.outer:
                Toast.makeText(this, "outer", Toast.LENGTH_SHORT).show();
                break;
            case R.id.center:
                Toast.makeText(this, "outer", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
