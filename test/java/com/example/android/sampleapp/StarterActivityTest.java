package com.example.android.sampleapp;

import android.widget.TextView;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class StarterActivityTest {

    @Test
    public void shouldHaveATitle() {
        final StarterActivity activity = new StarterActivity_();
        activity.onCreate(null);
        TextView title = (TextView) activity.findViewById(R.id.title);
        assertEquals("Hello World", title.getText());
    }
}
