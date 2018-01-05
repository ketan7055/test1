package com.test.activity;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.test.R;

public class DetailsActivity extends AppCompatActivity {
    private TextView tvGradient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initIDs();
    }

    private void initIDs() {

        tvGradient = (TextView)findViewById(R.id.tvGradient);
        Shader myShader = new LinearGradient(
                0, 0, 100, 100,
                Color.GREEN, Color.YELLOW,
                Shader.TileMode.CLAMP);
        tvGradient.getPaint().setShader( myShader );

    }
}
