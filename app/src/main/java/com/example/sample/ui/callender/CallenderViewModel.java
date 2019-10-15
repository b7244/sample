package com.example.sample.ui.callender;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CallenderViewModel extends ViewModel{
    private MutableLiveData<String> mText;

    public CallenderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is callender fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
