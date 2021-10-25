package com.example.t_instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6Vt5fm98WZERkfgXVkGsNazLPq69DrR7lL8CMaN5")
                .clientKey("0BPm7jAMdhyC4rLdu7Q5MpCfPF7XJyRsWg5RDxr3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
