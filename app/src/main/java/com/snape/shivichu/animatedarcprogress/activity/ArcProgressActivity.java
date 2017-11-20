package com.snape.shivichu.animatedarcprogress.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import com.snape.shivichu.animatedarcprogress.R;
import com.snape.shivichu.mylibrary.arcprogress.arcprogress.ArcProgress;

/**
 * Created by Shivichu on 14-11-2017.
 */

public class ArcProgressActivity extends AppCompatActivity {

    SeekBar seekBar;
    ArcProgress arcProgress;
    Button bAnimateProgressBar;
    int VALUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        seekBar = (SeekBar) findViewById(R.id.seekBar);
        arcProgress = (ArcProgress) findViewById(R.id.arc_progress);
        bAnimateProgressBar = (Button) findViewById(R.id.btn_animate);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, final int value, boolean b) {

                arcProgress.setProgress(0);
                VALUE = value;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        bAnimateProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                animateProgress(VALUE);

            }
        });

    }

    private void animateProgress(int value) {

        arcProgress.setBottomText("Progress Bar");
        arcProgress.setTextSize(30);

        arcProgress.animateProgressTo(0, value, 500, new ArcProgress.ProgressAnimationListener() {

            @Override
            public void onAnimationStart() {
            }

            @Override
            public void onAnimationProgress(int progress) {

            }

            @Override
            public void onAnimationFinish() {
            }

        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
