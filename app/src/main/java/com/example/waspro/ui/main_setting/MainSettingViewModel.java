package com.example.waspro.ui.main_setting;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainSettingViewModel extends  ViewModel {
    private MutableLiveData<String> mText;

    public MainSettingViewModel()

    {
        mText = new MutableLiveData<>();
        mText.setValue("Hey This is Setting Fragment ");
    }

    public LiveData<String> getText() {
       return mText;
    }
}
