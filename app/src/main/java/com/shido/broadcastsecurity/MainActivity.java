package com.shido.broadcastsecurity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendBroadcast(View view){
        Intent i = new Intent("my.custom.action.name");
        sendBroadcast(i, "my.custom.permission"); //passando a permissão como segundo parametro, definido no manifesto


    }
}
