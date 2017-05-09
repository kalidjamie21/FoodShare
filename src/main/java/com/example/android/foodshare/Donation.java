package com.example.android.foodshare;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.util.Set;

/**
 * Created by User on 2017-05-07.
 */

public class Donation extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donation);

        Button submit = (Button) findViewById(R.id.bSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Donation.this, SetPickup.class);
                startActivity(i);
            }
        });


    }


}
