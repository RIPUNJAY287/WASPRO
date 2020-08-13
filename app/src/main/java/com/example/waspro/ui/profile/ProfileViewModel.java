package com.example.waspro.ui.profile;

import com.example.waspro.person;

import java.util.ArrayList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {

    private MutableLiveData<ArrayList<person>> users;
    private ArrayList<person> people;

    public ProfileViewModel() {

        people = new ArrayList<person>();
        people.add(new person("john", "ryan", "bus"));
        people.add(new person("tony", "stark", "bus"));
        people.add(new person("caption", "america", "plane"));
        people.add(new person("ryan", "reylond", "plane"));
        people.add(new person("peter", "parker", "bus"));
        people.add(new person("andrew", "grefield", "bus"));
        people.add(new person("daniel", "radcliffe", "plane"));

        people.add(new person("tony", "stark", "bus"));
        people.add(new person("caption", "america", "plane"));
        people.add(new person("ryan", "reylond", "plane"));
        people.add(new person("peter", "parker", "bus"));

        users = new MutableLiveData<ArrayList<person>>();
        users.setValue(people);

    }

    public LiveData<ArrayList<person>> getList() {

        return users;
    }
}