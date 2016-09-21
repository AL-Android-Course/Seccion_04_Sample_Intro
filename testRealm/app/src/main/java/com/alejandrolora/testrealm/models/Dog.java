package com.alejandrolora.testrealm.models;

import com.alejandrolora.testrealm.application.MyApplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Alejandro on 17/9/16.
 */
public class Dog extends RealmObject {

    @PrimaryKey
    private int Id;
    private String Name;

    public Dog() {} // Only for Realm

    public Dog(String name) {
        Id = MyApplication.DogID.incrementAndGet();
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
