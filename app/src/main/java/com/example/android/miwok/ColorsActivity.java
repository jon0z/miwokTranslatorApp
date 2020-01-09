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
package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity
{

    protected ArrayList<Word> colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Colors array
        colors = new ArrayList<>();
        colors.add(new Word("Red", "Wetetti", R.drawable.color_red));
        colors.add(new Word("Green", "Chokokki", R.drawable.color_green));
        colors.add(new Word("Brown", "Takaakki", R.drawable.color_brown));
        colors.add(new Word("Gray", "Topoppi", R.drawable.color_gray));
        colors.add(new Word("Black", "Kululli", R.drawable.color_black));
        colors.add(new Word("White", "Kelelli", R.drawable.color_white));
        colors.add(new Word("Dusty Yellow", "Topiise", R.drawable.color_dusty_yellow));
        colors.add(new Word("Mustard Yellow", "Chiwiite", R.drawable.color_mustard_yellow));

        // Array adapter for numbers array
        WordAdapter itemsAdapter = new WordAdapter(this, colors, R.color.category_colors);

        // listView to display list of numbers
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
