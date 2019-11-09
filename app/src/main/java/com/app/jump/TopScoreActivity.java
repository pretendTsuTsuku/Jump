package com.app.jump;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TopScoreActivity extends AppCompatActivity {
    private TextView txTopScore;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        txTopScore=findViewById(R.id.ranktx);
        SharedPreferences sharedPreferences=getSharedPreferences("topScore", Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("name","");
        int score=sharedPreferences.getInt("score",0);//获取最高分
        if(name.isEmpty())  //没有姓名就代表目前还没有最高分
        {
            txTopScore.setText("暂无");
        } else {
            txTopScore.setText(name + ":" + score + "分");
        }
    }
}
