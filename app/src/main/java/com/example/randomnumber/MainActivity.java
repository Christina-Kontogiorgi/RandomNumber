package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.randomnumber.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binder;
    private List<Integer> Numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binder.getRoot());

        binder.randomFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = new Random().nextInt();
                Numbers.add(random);
            }
        });
        binder.pushFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < Numbers.size(); i++) {

                    String z = binder.numbers.getText().toString()
                            + Numbers.get(i).toString()
                            + ", ";

                    binder.numbers.setText(z);
                }
            }
        });

        binder.clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Numbers = new ArrayList<>();
                binder.numbers.setText("");
            }
        });


    }
}