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

public class ProfileActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;
    MenuItem currentSceneItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.navigationView);
        currentSceneItem = navigationView.getMenu().findItem(R.id.navProfile);

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
                    // Nothing to do
                } else if (itemId == R.id.navHome) {
                    Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navCart) {
                    Toast.makeText(ProfileActivity.this, "cart", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navFavourite) {
                    Toast.makeText(ProfileActivity.this, "favourite", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navOnGoing) {
                    Intent intent = new Intent(ProfileActivity.this, OrderActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navHistory) {
                    Intent intent = new Intent(ProfileActivity.this, HistoryActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navFeedback) {
                    Toast.makeText(ProfileActivity.this, "feedback", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navTnc) {
                    Intent intent = new Intent(ProfileActivity.this, TermsConditionActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navContactUs) {
                    Toast.makeText(ProfileActivity.this, "contact us", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.close();

                return false;
            }
        });

    }
}