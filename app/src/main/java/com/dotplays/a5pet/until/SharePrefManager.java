package com.dotplays.a5pet.until;

import android.content.Context;
import android.content.SharedPreferences;

import com.dotplays.a5pet.model.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by MAC2015 on 11/22/16.
 */
public class SharePrefManager {

    private static final String PREFERENCES_NAME = "_HUY_PREFERENCES_NAME";
    private static final String IS_LOG = "ISLFODOD";

    private static SharePrefManager instance = null;
    private Context context;

    /**
     * Constructor
     */
    private SharePrefManager() {

    }

    /**
     * Get class instance
     *
     * @param context
     * @return
     */
    public static SharePrefManager getInstance(Context context) {
        if (instance == null) {
            instance = new SharePrefManager();
            instance.context = context;
        }
        return instance;
    }


    /**
     * Save an string to SharedPreferences
     *
     * @param key
     * @param s
     */
    public void putStringValue(String key, String s) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(key, s);
        editor.commit();
    }

    /**
     * Read an string to SharedPreferences
     *
     * @param key
     * @return
     */
    public String getStringValue(String key) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        return pref.getString(key, "");
    }

    /**
     * Read an string to SharedPreferences
     *
     * @param key
     * @param defaultValue
     * @return
     */
    public String getStringValue(String key, String defaultValue) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        return pref.getString(key, defaultValue);
    }

    /**
     * Save an boolean to SharedPreferences
     *
     * @param key
     */
    public void putBooleanValue(String key, Boolean b) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(key, b);
        editor.commit();
    }

    /**
     * Read an boolean to SharedPreferences
     *
     * @param key
     * @return
     */
    public boolean getBooleanValue(String key) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        return pref.getBoolean(key, false);
    }

    /**
     * Read an boolean to SharedPreferences
     *
     * @param key
     * @return
     */
    public boolean getBooleanValue(String key, boolean defaulValue) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        return pref.getBoolean(key, defaulValue);
    }

    /**
     * Save an float to SharedPreferences
     *
     * @param key
     */
    public void putFloatValue(String key, float f) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putFloat(key, f);
        editor.commit();
    }

    /**
     * Read an float to SharedPreferences
     *
     * @param key
     * @return
     */
    public float getFloatValue(String key) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        return pref.getFloat(key, 0.0f);
    }

    /**
     * Save an int to SharedPreferences
     *
     * @param key
     * @param value
     */
    public void putIntValue(String key, int value) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    /**
     * Read an int to SharedPreferences
     *
     * @param key
     * @return
     */
    public int getIntValue(String key) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        return pref.getInt(key, 0);
    }

    /**
     * Read an int to SharedPreferences
     *
     * @param key
     * @return
     */
    public int getIntValue(String key, int defaultValue) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                defaultValue);
        return pref.getInt(key, defaultValue);
    }

    /**
     * Save an long to SharedPreferences
     *
     * @param key
     * @param value
     */
    public void putLongValue(String key, long value) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putLong(key, value);
        editor.commit();
    }

    /**
     * Read an long to SharedPreferences
     *
     * @param key
     * @return
     */
    public long getLongValue(String key) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        return pref.getLong(key, 0);
    }

    public void putStringSet(String key, Set<String> listString) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putStringSet(key, listString);
        editor.commit();
    }

    public Set<String> getStringSet(String key) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        return pref.getStringSet(key, null);
    }

    public void removeAValue(String key) {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        SharedPreferences.Editor editor = pref.edit();
        editor.remove(key);
        editor.commit();
    }

    public void removeAll() {
        SharedPreferences pref = context.getSharedPreferences(PREFERENCES_NAME,
                0);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }

    public final String USER = "user..";

    public void saveUser(User user) {
        String data = new Gson().toJson(user);
        putStringValue(USER, data);
    }

    public User getUser() {
        User user = new Gson().fromJson(getStringValue(USER), User.class);
        return user;
    }

    public void saveIsLogin() {
        putBooleanValue(IS_LOG, true);
    }

    public boolean getIsLogin() {
        return getBooleanValue(IS_LOG, false);
    }
}
