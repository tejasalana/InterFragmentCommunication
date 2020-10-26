package com.example.interfragmentcomm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentSecond f2 = (FragmentSecond) manager.findFragmentById(R.id.fragmentSecond);
        if (f2 != null) {
            f2.changeText(data);
        }

    }
}