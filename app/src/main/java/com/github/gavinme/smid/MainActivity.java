package com.github.gavinme.smid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import cn.shuzilm.core.Main;

public class MainActivity extends Activity {
    TextView tv_smid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_smid = findViewById(R.id.tv_smid);
    }

    public void generate(View v) {
        tv_smid.setText(Main.getQueryID(this));
        Toast.makeText(this, "generated", Toast.LENGTH_SHORT).show();
    }

}
