package com.example.android.sampleapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.android.sampleapp.util.CurrentTime;
import com.google.inject.Inject;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.RoboGuice;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.home)
@RoboGuice
public class StarterActivity extends Activity {
    @ViewById // Resource ID and variable match
    TextView title;

    @ViewById(R.id.current_time) // Resource ID and variable do not match
    TextView currentTimeText;

    @Inject // Regular RoboGuice injection
    private CurrentTime currentTimeManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // DO NOT setContentView(layout.home) as we normally would! androidannotations does this.
        super.onCreate(savedInstanceState);
        title.setText("Hello World");
        currentTimeText.setText(String.valueOf(currentTimeManager.currentTimeMillis()));
    }
}
