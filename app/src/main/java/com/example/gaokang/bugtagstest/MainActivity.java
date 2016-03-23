package com.example.gaokang.bugtagstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {


    private TextView txt_main;
    private ImageView img_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_main = (TextView) findViewById(R.id.txt_main);
        txt_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //下面是一个空指针以及一个除0异常
//                img_main.setImageResource(R.mipmap.ic_launcher);
                int a = 7 / 0;
            }
        });
        txt_main.setText("xixihaha");
    }
}
