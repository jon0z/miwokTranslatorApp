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
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    protected ArrayList<Word> numbersArr;
    private static final String TAG = NumbersActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // numbers array
        numbersArr = new ArrayList<>();
        numbersArr.add(new Word("One", "Lutti"));
        numbersArr.add(new Word("Two", "Otiiko"));
        numbersArr.add(new Word("Three", "Tolookosu"));
        numbersArr.add(new Word("Four", "Oyyisa"));
        numbersArr.add(new Word("Five", "Massokka"));
        numbersArr.add(new Word("Six", "Temmokka"));
        numbersArr.add(new Word("Seven", "Kenekaku"));
        numbersArr.add(new Word("Eight", "Kawinta"));
        numbersArr.add(new Word("Nine", "Wo'e"));
        numbersArr.add(new Word("Ten", "Na'aacha"));

        // Array adapter for numbers array
        WordAdapter itemsAdapter = new WordAdapter(this, numbersArr);

        // listView to display list of numbers
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
