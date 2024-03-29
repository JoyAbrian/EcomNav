package com.example.ecomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.navigationView);

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.navProfile) {
                    Toast.makeText(MainActivity.this, itemId, Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navHome) {
                    Toast.makeText(MainActivity.this, itemId, Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navCart) {
                    Toast.makeText(MainActivity.this, itemId, Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navFavourite) {
                    Toast.makeText(MainActivity.this, itemId, Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navOnGoing) {
                    Toast.makeText(MainActivity.this, itemId, Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navHistory) {
                    Toast.makeText(MainActivity.this, itemId, Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navFeedback) {
                    Toast.makeText(MainActivity.this, itemId, Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navTnc) {
                    Toast.makeText(MainActivity.this, itemId, Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navFeedback) {
                    Toast.makeText(MainActivity.this, itemId, Toast.LENGTH_SHORT).show();
                }
                drawerLayout.close();
                
                return false;
            }
        });
    }
}