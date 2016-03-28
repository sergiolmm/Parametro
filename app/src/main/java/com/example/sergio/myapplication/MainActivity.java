package com.example.sergio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Aula", "Estou no onCreate");
    }


    public void onClick(View v){

        Intent it =new Intent(this, NovaActivity.class);

        Bundle param = new Bundle();
        param.putString("msg","Novo Valor ....");
        it.putExtras(param);
        startActivity(it);
        Log.i("Aula", "Estou no onClick");

    }
}
