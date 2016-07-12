package com.example.tacademy.samplebasicwidget;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {
    EditText emailView, pwView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        emailView = (EditText)findViewById(R.id.edit_email);
        pwView = (EditText)findViewById(R.id.edit_pw);

        pwView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String pass = charSequence.toString();
                if(pass.length() < 5){
                    pwView.setTextColor(Color.RED);
                }else{
                    pwView.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        pwView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i == EditorInfo.IME_ACTION_SEND){
                    String email = emailView.getText().toString();
                    String password = pwView.getText().toString();
                    if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                        Toast.makeText(EditActivity.this,"SEND SUCCESS",Toast.LENGTH_LONG).show();
                        return false;
                    }else{
                        Toast.makeText(EditActivity.this,"SEND FAIL",Toast.LENGTH_LONG).show();
                        return true;
                    }
                }
                return false;
            }
        });

    }
}
