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

public class NumbersActivity extends AppCompatActivity {

    protected ArrayList<Word> numbers;
    private static final String TAG = NumbersActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // numbers array
        numbers = new ArrayList<>();
        numbers.add(new Word("One", "Lutti", R.drawable.number_one));
        numbers.add(new Word("Two", "Otiiko", R.drawable.number_two));
        numbers.add(new Word("Three", "Tolookosu", R.drawable.number_three));
        numbers.add(new Word("Four", "Oyyisa", R.drawable.number_four));
        numbers.add(new Word("Five", "Massokka", R.drawable.number_five));
        numbers.add(new Word("Six", "Temmokka", R.drawable.number_six));
        numbers.add(new Word("Seven", "Kenekaku", R.drawable.number_seven));
        numbers.add(new Word("Eight", "Kawinta", R.drawable.number_eight));
        numbers.add(new Word("Nine", "Wo'e", R.drawable.number_nine));
        numbers.add(new Word("Ten", "Na'aacha", R.drawable.number_ten));

        // Array adapter for numbers array
        WordAdapter itemsAdapter = new WordAdapter(this, numbers, R.color.category_numbers);

        // listView to display list of numbers
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
