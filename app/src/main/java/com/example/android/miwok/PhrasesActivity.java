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

public class PhrasesActivity extends AppCompatActivity
{

    protected ArrayList<Word> phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Colors array
        phrases = new ArrayList<>();
        phrases.add(new Word("Where are you going?", "Minto wuksus"));
        phrases.add(new Word("What is your name?", "Tinne oyaase'ne"));
        phrases.add(new Word("My name is ...", "oyaaset ..."));
        phrases.add(new Word("How are you feeling?", "michekses?"));
        phrases.add(new Word("I am feeling good.", "kuchi achit"));
        phrases.add(new Word("Are you coming?", "eenes'aa?"));
        phrases.add(new Word("Yes, I am coming.", "hee'eenem"));
        phrases.add(new Word("I'm coming.", "eenem"));
        phrases.add(new Word("Let's go.", "yoowutis"));
        phrases.add(new Word("Come here.", "enni'nem"));

        // Array adapter for numbers array
        WordAdapter itemsAdapter = new WordAdapter(this, phrases, R.color.category_phrases);

        // listView to display list of numbers
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
