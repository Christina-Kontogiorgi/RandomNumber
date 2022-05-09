package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.randomnumber.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  private ActivityMainBinding binder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binder.getRoot());

    }
}