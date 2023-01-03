package com.example.jewelrypricing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView Ring, Bracelet, Necklace, Earrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bracelet = findViewById(R.id.Bracelet);
        Earrings = findViewById(R.id.Earrings);
        Necklace = findViewById(R.id.Necklace);
        Ring = findViewById(R.id.Ring);


        Bracelet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BBB.class);
                startActivity(intent);

            }

        });

        Earrings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EEE.class);
                startActivity(intent);

            }

        });

        Necklace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NNN.class);
                startActivity(intent);

            }

        });

        Ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RRR.class);
                startActivity(intent);

            }

        });

    }
}