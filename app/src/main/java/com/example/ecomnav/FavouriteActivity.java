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

public class FavouriteActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;
    MenuItem currentSceneItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.navigationView);
        currentSceneItem = navigationView.getMenu().findItem(R.id.navFavourite);

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
                    Intent intent = new Intent(FavouriteActivity.this, ProfileActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navHome) {
                    Intent intent = new Intent(FavouriteActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navCart) {
                    Intent intent = new Intent(FavouriteActivity.this, CartActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navFavourite) {
                    // Nothing to do
                } else if (itemId == R.id.navOnGoing) {
                    Intent intent = new Intent(FavouriteActivity.this, OrderActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navHistory) {
                    Intent intent = new Intent(FavouriteActivity.this, HistoryActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navFeedback) {
                    Intent intent = new Intent(FavouriteActivity.this, FeedbackActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navTnc) {
                    Intent intent = new Intent(FavouriteActivity.this, TermsConditionActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navContactUs) {
                    Intent intent = new Intent(FavouriteActivity.this, ContactActivity.class);
                    startActivity(intent);
                }
                drawerLayout.close();

                return false;
            }
        });

    }
}