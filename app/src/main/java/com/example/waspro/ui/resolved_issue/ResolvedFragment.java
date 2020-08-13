package com.example.waspro.ui.resolved_issue;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.waspro.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResolvedFragment extends Fragment {

    public ResolvedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resolved, container, false);
    }
}
