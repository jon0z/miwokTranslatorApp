package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>
{
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> wordArray, int colorResourceId)
    {
        super(context, 0, wordArray);
        mColorResourceId = colorResourceId;
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

        View textContainer = listItemView.findViewById(R.id.txt_views_background);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        TextView miwokTxtView = listItemView.findViewById(R.id.miwok_txt_view);
        miwokTxtView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = listItemView.findViewById(R.id.english_txt_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        if(!currentWord.hasImage())
        {
            ImageView imageView = listItemView.findViewById(R.id.image_view);
            imageView.setVisibility(View.GONE);
        }
        else
        {
            ImageView imageView = listItemView.findViewById(R.id.image_view);
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
            imageView.setBackgroundColor(Color.parseColor("#FFF7DA"));
        }

        return listItemView;

    }
}
