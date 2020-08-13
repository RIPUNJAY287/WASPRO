package com.example.waspro.ui.main_setting;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.waspro.R;
public class MainSetting extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
   private  MainSettingViewModel mainSettingViewModel;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainSettingViewModel =
                ViewModelProviders.of(this).get(MainSettingViewModel.class);
        View view  = inflater.inflate(R.layout.fragment_main_setting, container, false);

        final TextView textView = (TextView)view.findViewById(R.id.setting_des);
       // LiveData<String> str = mainSettingViewModel.getText();

        mainSettingViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });



        return  view;
    }
}
