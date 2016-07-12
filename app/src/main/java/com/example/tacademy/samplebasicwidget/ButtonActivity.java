package com.example.tacademy.samplebasicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

    }

    public void onClick(View v){
        Toast.makeText(ButtonActivity.this,"TOAST",Toast.LENGTH_LONG).show();
    }
}

