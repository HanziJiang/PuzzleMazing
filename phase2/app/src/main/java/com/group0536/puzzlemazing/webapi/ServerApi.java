package com.group0536.puzzlemazing.webapi;


import com.group0536.puzzlemazing.utils.HttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.Callback;

/**
 * This class sends API requests to our game server.
 *
 * @author Jimmy Lan
 */
public class ServerApi {
    static final String ROOT_DOMAIN = "https://apis.puzzlemazing.online";
    private static ServerApi instance;

    ServerApi() {
    }

    String getURL(String uri) {
        return ROOT_DOMAIN + uri;
    }

    public static ServerApi getServerApi() {
        if (instance == null) {
            instance = new AuthApi();
        }
        return instance;
    }

    public void performScoreUpdateWordGuessing(String token, int currentLevel,
                                               int score, Callback done){
        String url = getURL("/word-guessing");
        JSONObject body = new JSONObject();
        try {
            body.put("level", currentLevel);
            body.put("score", score);
        } catch(JSONException e) {
            e.printStackTrace();
        }
        HttpUtil.post(url, body, token, done);
    }

    public void performScoreUpdateCrazyMatch(String token, int currentLevel,
                                             int score, Callback done){
        String url = getURL("/crazy-match");
        JSONObject body = new JSONObject();
        try{
            body.put("level", currentLevel);
            body.put("score", score);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        HttpUtil.post(url, body, token, done);
    }

    public JSONArray getTop3PlayersWithScores(String scoreType, Callback callback) {
        String url = getURL("/top-3-players" + scoreType);
        JSONArray returnData = new JSONArray();
//         TODO : Change this when server is changed
//        JSONObject returnData = HttpUtil.get(url, callback);
        return returnData;
    }
}
