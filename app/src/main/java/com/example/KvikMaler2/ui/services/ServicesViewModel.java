package com.example.KvikMaler2.ui.services;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

public class ServicesViewModel extends ViewModel {

    //private final MutableLiveData<String> mText;
    private final MutableLiveData<RecyclerView> mRecycle;

    public ServicesViewModel() {
        //mText = new MutableLiveData<>();
        //mText.setValue("This is gallery fragment");
        mRecycle= new MutableLiveData<>();
    }

    //public LiveData<String> getText() {
    //    return mText;
    //}
    public LiveData<RecyclerView> getRecycle() {
        return mRecycle;
    }
}