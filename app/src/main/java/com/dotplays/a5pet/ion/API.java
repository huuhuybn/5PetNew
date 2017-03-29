package com.dotplays.a5pet.ion;

import android.util.Log;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MAC2015 on 3/11/17.
 */

public class API {

    public static final String API_MAIN = "http://api.5pet.vn/";
    public static final String LOGIN = API_MAIN + "api/Login/Login";
    public static final String REGISTER = API_MAIN + "/api/Login/Register";
    public static final String GET_CITY = API_MAIN + "/api/Login/GetCity";
    public static final String GET_DISTRICT = API_MAIN + "/api/Login/GetDistrict";
    public static final String GET_PET_LIST = API_MAIN + "/api/ActionPet/ListPet";
    public static final String LOGIN_FACEBOOK = API_MAIN + "/api/Login/LoginFB";
    public static final String LAT = "lattt";
    public static final String LONG = "longgg";
    public static final String NAME = "nameeee";
    public static final String DATA = "dataaa";
    public static final String SEARCH_PET = API_MAIN + "/api/ActionPet/SearchPet";

    public static boolean isDEBUG = true;


    public static final String CODE = "Code";
    public static final String EMAIL = "Email";
    public static final String FB_ID = "fbID";
    public static final String SS_ID = "ssID";


    public static Map<String, List<String>> ParamLoginFB(String email, String fbid, String token) {

        Map<String, List<String>> params = new HashMap<String, List<String>>();
        params.put(EMAIL, Arrays.asList(email));
        params.put(FB_ID, Arrays.asList(fbid));
        params.put(SS_ID, Arrays.asList(token));

        if (isDEBUG) Log.e("ParamLoginFB", params.toString());
        return params;

    }

    public static Map<String, List<String>> ParamPetList(String id) {

        Map<String, List<String>> params = new HashMap<String, List<String>>();
        params.put(CODE, Arrays.asList(id));
        if (isDEBUG) Log.e("getPetList", params.toString());
        return params;

    }
}
