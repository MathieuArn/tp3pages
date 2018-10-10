package com.example.mathi.a3pages;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fenetre3 extends AppCompatActivity {

    Activity lecontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenetre3);
        lecontext = this;
        Button btaction  = (Button) findViewById(R.id.button3);
        btaction.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent defineIntent = new Intent(lecontext, Fenetre2.class);
                int coderetourok = 1;
                setResult(coderetourok,defineIntent);
                finish();
            }});
    }
}
