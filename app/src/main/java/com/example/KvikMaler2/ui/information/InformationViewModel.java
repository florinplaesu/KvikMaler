package com.example.KvikMaler2.ui.information;

import android.widget.ImageView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformationViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<ImageView> mImageView;

    public InformationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is information fragment");
        mImageView= new MutableLiveData<>();
        //mImageView.setValue(ImageView );
    }

    public LiveData<String> getText() {
        return mText;
    }
}