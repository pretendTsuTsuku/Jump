package com.app.jump;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnStart;
    private Button btnRank;
    private Button btnQuit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnStart=findViewById(R.id.startgame);
        btnRank=findViewById(R.id.topscore);
        btnQuit=findViewById(R.id.quitgame);
        btnStart.setOnClickListener(this);
        btnRank.setOnClickListener(this);
        btnQuit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.startgame:
                Intent intent=new Intent(this,GameActivity.class);
                startActivity(intent);
                break;
            case R.id.topscore:
                Intent intent1=new Intent(this,TopScoreActivity.class);
                startActivity(intent1);
                break;
            case R.id.quitgame:
                finish();
                break;
        }
    }
}
