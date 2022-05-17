package com.example.KvikMaler2.ui.price;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PriceViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PriceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Under Construction :( ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}