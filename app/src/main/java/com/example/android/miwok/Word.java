package com.example.android.miwok;

/**
 * Represents a vocabulary word that the user wants to learn
 * It contains a default translation and the Miwok translation for the word
 */
public class Word
{
    // State variable
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public Word(String defaultWord, String miwokTransalation)
    {
        mDefaultTranslation = defaultWord;
        mMiwokTranslation = miwokTransalation;

    }

    public Word(String defaultWord, String miwokTranslation, int imageResourceId)
    {
        mDefaultTranslation = defaultWord;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;

    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;

    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;

    }

    public int getmImageResourceId()
    {
        return mImageResourceId;
    }
}
