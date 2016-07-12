package com.example.tacademy.samplebasicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                displayRadio(i);
            }
        });

        Button btn = (Button)findViewById(R.id.btn_change);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = radioGroup.getCheckedRadioButtonId();
                displayRadio(id);
                radioGroup.check(R.id.radio_b2);
            }
        });
    }

    private void displayRadio(int id){
        String message = null;
        switch (id){
            case R.id.radio_b1:
                message = "B1";
                break;
            case R.id.radio_b2:
                message = "B2";
                break;
            case R.id.radio_b3:
                message = "B3";
                break;
        }
        Toast.makeText(RadioActivity.this,"Select : " + message,Toast.LENGTH_LONG).show();
    }
}
