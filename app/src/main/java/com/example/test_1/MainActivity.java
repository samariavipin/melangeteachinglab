package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){

        Log.d("MYTag","It Works");
        Intent newIntent = new Intent(this, Main2Activity.class);
        startActivity(newIntent);
     //   Intent int=new Intent()
    }
}
