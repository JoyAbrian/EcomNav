package com.example.ecomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class HistoryActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;
    MenuItem currentSceneItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.navigationView);
        currentSceneItem = navigationView.getMenu().findItem(R.id.navHistory);

        currentSceneItem.setChecked(true);
        currentSceneItem.getIcon().setColorFilter(ContextCompat.getColor(this, android.R.color.darker_gray), PorterDuff.Mode.SRC_IN);
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
                    Intent intent = new Intent(HistoryActivity.this, ProfileActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navHome) {
                    Intent intent = new Intent(HistoryActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navCart) {
                    Toast.makeText(HistoryActivity.this, "cart", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navFavourite) {
                    Toast.makeText(HistoryActivity.this, "favourite", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navOnGoing) {
                    Toast.makeText(HistoryActivity.this, "onGoing", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navHistory) {
                    // Nothing to do
                } else if (itemId == R.id.navFeedback) {
                    Toast.makeText(HistoryActivity.this, "feedback", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navTnc) {
                    Toast.makeText(HistoryActivity.this, "terms and conditions", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navContactUs) {
                    Toast.makeText(HistoryActivity.this, "contact us", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.close();

                return false;
            }
        });

    }
}