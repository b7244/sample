package com.example.sample.ui.sample;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SampleViewModel extends ViewModel {
    private  MutableLiveData<String> mText;

    public SampleViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("this is Sample fragment");
    }
    public LiveData<String> getText(){return mText;}
}
