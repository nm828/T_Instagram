package com.example.t_instagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post") //should match exactly what you called the entity in the parse dashboard
public class Post extends ParseObject {
    //Defining Keys -> name of columns
    public static final String KEY_DESCRIPTION = "Description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";

    //Use Parse Method getString() to get description
    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }
    //Use Parse Method put() to associate the key to the value
    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

    //Special Parse Method to return file getParseFile()
    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }
    //Assign the value to the key
    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }

    //Special Parse method for user getUser()
    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }
    //Assign the value to the key
    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }

}
