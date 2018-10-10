package com.example.mathi.a3pages;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fenetre2 extends AppCompatActivity {

    Activity lecontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenetre2);
        lecontext = this;
        Button btaction  = (Button) findViewById(R.id.button2);
        btaction.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent defineIntent = new Intent(lecontext, Fenetre3.class);
                lecontext.startActivityForResult(defineIntent,1);
            }});
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == 1) {
                finish();
            }
        }
    }
}