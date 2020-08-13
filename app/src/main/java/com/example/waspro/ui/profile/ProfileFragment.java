package com.example.waspro.ui.profile;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.waspro.MainActivity;
import com.example.waspro.MainAdapter;
import com.example.waspro.R;
import com.example.waspro.person;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {


    private RecyclerView profile_recylcer;
     private RecyclerView.Adapter myAdaptor;



    private ProfileViewModel profileViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profileViewModel =
                ViewModelProviders.of(this).get(ProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        //final TextView textView = (TextView) root.findViewById(R.id.tvprofile);

        profile_recylcer =  root.findViewById(R.id.profile_recycler);
         profile_recylcer.setLayoutManager(new LinearLayoutManager(getContext()));
        profile_recylcer.setHasFixedSize(true);




        profileViewModel.getList().observe(getViewLifecycleOwner(), new Observer<ArrayList<person>>() {
          @Override
          public void onChanged(ArrayList<person> people) {

              myAdaptor = new MainAdapter(people);
              profile_recylcer.setAdapter(myAdaptor);
              Log.i("ProfileFragment  - ","MY adapter is running");

          }
      });



        return root;
    }


}
