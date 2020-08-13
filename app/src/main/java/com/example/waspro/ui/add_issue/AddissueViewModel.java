package com.example.waspro.ui.add_issue;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddissueViewModel extends  ViewModel {

    private MutableLiveData<String> mText;

    public AddissueViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {

        return mText;
    }
}