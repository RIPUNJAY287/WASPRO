package com.example.waspro.ui.issues;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IssueViewModel extends  ViewModel{

    private MutableLiveData<String> mText;

    public IssueViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {

        return mText;
    }
}