package com.example.sergio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class NovaActivity extends AppCompatActivity {

    private TextView txtNova;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);

        txtNova = (TextView) findViewById(R.id.textView2);

        Intent it = getIntent();
        if (it != null) {
            Bundle params = it.getExtras();
            if (params != null) {
                String msg = params.getString("msg");
                txtNova.setText(msg);
            }
        }


    }


    public void onClick2(View v){
        Intent it =new Intent(this, MainActivity.class);
        startActivity(it);
        Log.i("Tela2", "onCLick");
    }
}
