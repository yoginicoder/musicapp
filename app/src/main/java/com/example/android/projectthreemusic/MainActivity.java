package com.example.android.projectthreemusic;

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        ImageButton numbers = (ImageButton) findViewById(R.id.metal);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MetalActivity}
                Intent numbersIntent = new Intent(MainActivity.this, MetalActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        ImageButton family = (ImageButton) findViewById(R.id.rock);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockActivity}
                Intent familyIntent = new Intent(MainActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the colors category
        ImageButton colors = (ImageButton) findViewById(R.id.punk);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PunkActivity}
                Intent colorsIntent = new Intent(MainActivity.this, PunkActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });


    }
}
