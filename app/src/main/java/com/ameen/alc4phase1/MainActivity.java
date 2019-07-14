package com.ameen.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    Button btnAboutALC;
    Button btnMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        //Setting the toolbar
        //getActionBar().setTitle(R.string.app_name);
        setTitle(R.string.app_name);

        btnAboutALC = findViewById(R.id.about_alc);
        btnAboutALC.setOnClickListener(this);

        btnMyProfile = findViewById(R.id.profile);
        btnMyProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId()){
            case R.id.about_alc:
                intent = new Intent(MainActivity.this, AboutALCActivity.class);
                startActivity(intent);
                break;

            case R.id.profile:
                intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
    }
}
