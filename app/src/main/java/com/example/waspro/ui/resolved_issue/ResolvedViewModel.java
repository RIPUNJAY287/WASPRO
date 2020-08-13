package com.example.waspro.ui.resolved_issue;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResolvedViewModel extends  ViewModel{

    private MutableLiveData<String> mText;

    public ResolvedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {

        return mText;
    }
}