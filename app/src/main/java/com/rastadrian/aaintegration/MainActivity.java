package com.rastadrian.aaintegration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView descriptionTextView = (TextView) findViewById(R.id.tv_description);
        final Button hideButton = (Button) findViewById(R.id.btn_hide);
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descriptionTextView.setVisibility(View.INVISIBLE);
            }
        });
        final Button unhideButton = (Button) findViewById(R.id.btn_unhide);
        unhideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                descriptionTextView.setVisibility(View.VISIBLE);
            }
        });
    }
}
