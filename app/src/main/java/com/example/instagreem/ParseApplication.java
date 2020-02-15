package com.example.instagreem;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        // set applicationId, and server server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("araz-instgram-codepath") // should correspond to APP_ID env variable
                .clientKey("CodepathInstgramMoveFast")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("http://araz-instgram-codepath.herokuapp.com/parse").build());
    }
}
