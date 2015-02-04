package me.williamhester.livedemo2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by william on 2/3/15.
 */
public class MessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Bundle b = getIntent().getExtras();
        TextView message = (TextView) findViewById(R.id.message);
        message.setText(b.getString("message"));
    }
}
