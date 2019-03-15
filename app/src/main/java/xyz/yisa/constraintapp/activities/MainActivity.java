package xyz.yisa.constraintapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import xyz.yisa.constraintapp.R;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    private ConstraintSet constraintSet;

    @Override
    public void onCreate(Bundle savedState){
        super.onCreate(savedState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.activity_main_constraintLayout);
        constraintSet = new ConstraintSet();
        constraintSet.load(this,R.layout.activity_main_keyframe_two);
        findViewById(R.id.yoda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(constraintLayout);
                constraintSet.applyTo(constraintLayout);
            }
        });
        findViewById(R.id.hanimate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ConstraintActivity.class));
            }
        });
    }
}
