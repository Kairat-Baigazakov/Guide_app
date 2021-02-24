package com.example.tourguideapp;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);

        FragmentAdapter fragmentAdapter = new FragmentAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(fragmentAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);

        tabLayout.setupWithViewPager(viewPager);


    }
}