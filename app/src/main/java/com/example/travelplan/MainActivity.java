package com.example.travelplan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startActivity2(View view){
        startActivity(new Intent(this,HomePage.class));
    }
    public void startPersonal(View view){
        startActivity(new Intent(this,PersonalPage.class));
    }
}
