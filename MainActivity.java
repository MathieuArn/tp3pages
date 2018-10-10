package com.example.mathi.a3pages;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Activity lecontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lecontext = this;
        Button btaction  = (Button) findViewById(R.id.button);
        btaction.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent defineIntent = new Intent(lecontext, Fenetre2.class);
                lecontext.startActivity(defineIntent);
            }});
    }
}
