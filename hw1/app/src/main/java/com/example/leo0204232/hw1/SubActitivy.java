package com.example.leo0204232.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActitivy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);
        Bundle bundle = this.getIntent().getExtras();
        String co = bundle.getString("Hao");
        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setText("B10509008: "+ co);
    }
}


