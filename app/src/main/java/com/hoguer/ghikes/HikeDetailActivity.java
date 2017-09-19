package com.hoguer.ghikes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HikeDetailActivity extends AppCompatActivity {

    private TextView mTextName;
    private TextView mTextDescription;
    private TextView mTextDistance;
    private TextView mTextDistanceLabel;
    private TextView mTextElevation;
    private TextView mTextElevationLabel;
    private TextView mTextDifficultyLabel;
    private TextView mTextDifficulty;
    private TextView mTextDrivingDirections;
    private RatingBar mRatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hike_detail);

        Bundle hike = this.getIntent().getExtras();

        String name = hike.getString("name");
        mTextName = (TextView) findViewById(R.id.hike_name);
        mTextName.setText(name);

        String description = hike.getString("description");
        mTextDescription = (TextView) findViewById(R.id.hike_description);
        mTextDescription.setText(description);

        mTextDistanceLabel = (TextView) findViewById(R.id.hike_distance_label);
        mTextDistanceLabel.setText("Distance: ");

        Double distance = hike.getDouble("distance");
        mTextDistance = (TextView) findViewById(R.id.hike_distance);
        mTextDistance.setText(Double.toString(distance).concat(" mi"));

        mTextElevationLabel = (TextView) findViewById(R.id.hike_elevation_label);
        mTextElevationLabel.setText("Elevation: ");

        Double elevation = hike.getDouble("elevation");
        mTextElevation = (TextView) findViewById(R.id.hike_elevation);
        mTextElevation.setText(Double.toString(elevation).concat(" ft"));

        mTextDifficultyLabel = (TextView) findViewById(R.id.hike_difficulty_label);
        mTextDifficultyLabel.setText("Difficulty: ");

        int difficulty = hike.getInt("difficulty");
        mTextDifficulty = (TextView) findViewById(R.id.hike_difficulty);
        mTextDifficulty.setText(Integer.toString(difficulty));

        String drivingDirections = "Driving Directions: ";
        drivingDirections = drivingDirections.concat(hike.getString("drivingDirections"));
        mTextDrivingDirections = (TextView) findViewById(R.id.hike_driving_directions);
        mTextDrivingDirections.setText(drivingDirections);

        mRatingBar = (RatingBar) findViewById(R.id.hike_rating);
        mRatingBar.setRating(4);

    }
}
