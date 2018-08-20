package com.example.alangregos.westgroveareatourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;


public class MoreInfoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expanded_information);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MoreInfoFragment())
                .commit();
    }

}