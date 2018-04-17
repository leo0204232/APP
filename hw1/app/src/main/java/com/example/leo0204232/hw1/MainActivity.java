package com.example.leo0204232.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                changeAc();
            }
        });
    }




    public void changeAc(){
        EditText et = (EditText) findViewById(R.id.et);
        Intent intent = new Intent();
        intent.setClass(this,SubActitivy.class);
        Bundle bundle = new Bundle();
        bundle.putString("Hao",et.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
