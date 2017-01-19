package com.example.android.miwok;

import android.content.Context;
import android.os.StrictMode;

/**
 * Created by GoDFA7h3R on 15-01-2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId () {
        return mAudioResourceId;
    }
}
