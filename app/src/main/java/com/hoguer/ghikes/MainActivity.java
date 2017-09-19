package com.hoguer.ghikes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.hike_list_view);
        final ArrayList<Hike> hikeList = Hike.getHikesFromFile("hikes.json", this);
        HikeAdapter adapter = new HikeAdapter(this, hikeList);
        mListView.setAdapter(adapter);

        final Context context = this;
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Hike selectedHike = hikeList.get(position);
                Intent detailIntent = new Intent(context, HikeDetailActivity.class);

                detailIntent.putExtra("name", selectedHike.name);
                detailIntent.putExtra("description", selectedHike.description);
                detailIntent.putExtra("distance", selectedHike.distance);
                detailIntent.putExtra("elevation", selectedHike.elevationGain);
                detailIntent.putExtra("drivingDirections", selectedHike.drivingDirections);
                detailIntent.putExtra("difficulty", selectedHike.difficulty);

                startActivity(detailIntent);
            }

        });
    }

}
