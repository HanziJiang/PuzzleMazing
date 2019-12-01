package com.group0536.puzzlemazing.views.animation;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.group0536.puzzlemazing.R;

import java.util.Arrays;
import java.util.List;

public class AnimationActivity extends AppCompatActivity {
    // Components
    private VideoView vvBackground;
    private List<Integer> videos;
    private List<Class> classes;
    private int currentVideoIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        setContentView(R.layout.activity_animation);
        bindViews();
        Intent mIntent = getIntent();
        currentVideoIndex = mIntent.getIntExtra("challenge", 0);
        System.out.println("current index " + currentVideoIndex);
        initializeVideos();
        initializeActivities();
    }

    private void initializeVideos() {
        videos = Arrays.asList(R.raw.challenge1, R.raw.challenge2, R.raw.challenge3,
                R.raw.winning);
    }

    private void initializeActivities() {
        classes = Arrays.asList((Class)
                com.group0536.puzzlemazing.views.busyworker.SelectLevelActivity.class,
                com.group0536.puzzlemazing.views.wordguessing.SelectLevelActivity.class,
                com.group0536.puzzlemazing.views.crazymatch.SelectLevelActivity.class,
                com.group0536.puzzlemazing.views.scoreboard.ScoreBoardActivity.class);
    }

    private void bindViews() {
        vvBackground = findViewById(R.id.vvBackground);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setUpVideo();
        vvBackground.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseVideo();
    }

    private void setUpVideo() {
        String videoPath = "android.resource://" + getPackageName() + "/" +
                videos.get(currentVideoIndex);
        Uri videoUri = Uri.parse(videoPath);
        vvBackground.setVideoURI(videoUri);
        vvBackground.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Intent intent = new Intent(AnimationActivity.this, classes.get(currentVideoIndex));
                startActivity(intent);
            }
        });
    }

    private void releaseVideo() {
        vvBackground.stopPlayback();
    }
}