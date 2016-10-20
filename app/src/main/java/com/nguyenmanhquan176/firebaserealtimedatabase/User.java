package com.nguyenmanhquan176.firebaserealtimedatabase;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by framgia on 19/10/2016.
 */

@IgnoreExtraProperties
public class User {

  public String name;
  public String email;

  // Default constructor required for calls to
  // DataSnapshot.getValue(User.class)
  public User() {
  }

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }
}