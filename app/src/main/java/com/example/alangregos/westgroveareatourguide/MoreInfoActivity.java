package com.example.alangregos.westgroveareatourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MoreInfoActivity extends AppCompatActivity {

    ListEntry entry;
    MoreInfoActivity(ListEntry current){
        entry=current;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expanded_information);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MoreInfoFragment())
                .commit();
    }
}