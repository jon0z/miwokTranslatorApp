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

public class FamilyActivity extends AppCompatActivity {

    protected ArrayList<Word> familyMembers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        familyMembers = new ArrayList<>();
        familyMembers.add(new Word("Father", "epe", R.drawable.family_father));
        familyMembers.add(new Word("Mother", "eta", R.drawable.family_mother));
        familyMembers.add(new Word("Son", "Angsi", R.drawable.family_son));
        familyMembers.add(new Word("Daughter", "Tune", R.drawable.family_daughter));
        familyMembers.add(new Word("Older Brother", "Taachi", R.drawable.family_older_brother));
        familyMembers.add(new Word("Younger Brother", "Chalitti", R.drawable.family_younger_brother));
        familyMembers.add(new Word("Older Sister", "Tete", R.drawable.family_older_sister));
        familyMembers.add(new Word("Younger Sister", "Kolliti", R.drawable.family_younger_sister));
        familyMembers.add(new Word("Grandmother", "Ama", R.drawable.family_grandmother));
        familyMembers.add(new Word("Granfather", "Paapa", R.drawable.family_grandfather));

        // Array adapter for numbers array
        WordAdapter itemsAdapter = new WordAdapter(this, familyMembers, R.color.category_family);

        // listView to display list of numbers
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
