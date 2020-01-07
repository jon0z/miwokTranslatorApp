package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>
{
    public WordAdapter(Context context, ArrayList<Word> wordArray)
    {
        super(context, 0, wordArray);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if(convertView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTxtView = (TextView) listItemView.findViewById(R.id.miwok_txt_view);
        miwokTxtView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.english_txt_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;

    }
}
