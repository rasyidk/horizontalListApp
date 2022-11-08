package com.example.horizontallist.ui.dashboardx;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DsbrViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DsbrViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}