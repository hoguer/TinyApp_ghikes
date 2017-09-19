package com.hoguer.ghikes;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class Hike {
    public String name;
    public int difficulty;
    public double elevationGain;
    public double distance;
    public double hikingTime;
    public String description;
    public String drivingDirections;
    public String hikingDirections;

    public static ArrayList<Hike> getHikesFromFile(String filename, Context context){
        final ArrayList<Hike> hikeList = new ArrayList<>();

        try {
            // Load data
            String jsonString = loadJsonFromAsset("hikes.json", context);
            JSONObject json = new JSONObject(jsonString);
            JSONArray hikes = json.getJSONArray("hikes");

            // Get Hike objects from data
            for(int i = 0; i < hikes.length(); i++){
                Hike hike = new Hike();

                hike.name = hikes.getJSONObject(i).getString("name");
                hike.difficulty = hikes.getJSONObject(i).getInt("difficulty");
                hike.elevationGain = hikes.getJSONObject(i).getDouble("elevationGain");
                hike.distance = hikes.getJSONObject(i).getDouble("distance");
                hike.hikingTime = hikes.getJSONObject(i).getDouble("hikingTime");
                hike.description = hikes.getJSONObject(i).getString("description");
                hike.drivingDirections = hikes.getJSONObject(i).getString("drivingDirections");
                hike.hikingDirections = hikes.getJSONObject(i).getString("hikingDirections");
                hikeList.add(hike);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return hikeList;
    }

    private static String loadJsonFromAsset(String filename, Context context) {
        String json = null;

        try {
            InputStream is = context.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        }
        catch (java.io.IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return json;
    }

}
