package com.application.hp.labtask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    EditText eto;
    EditText ett;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText);
        eto = findViewById(R.id.editText1);
        ett = findViewById(R.id.editText2);
        bt = findViewById(R.id.button);

//        bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Signed In", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
    public void btClick(View v){
        Toast.makeText(getApplicationContext(), "Signed In", Toast.LENGTH_SHORT).show();
        String s = et.getText().toString();
        String so = eto.getText().toString();
        String st = ett.getText().toString();
        Toast.makeText(getApplicationContext(),"Hello:"+s,Toast.LENGTH_SHORT).show();
        Intent in = new Intent(MainActivity.this,SecondActivity.class);
        String all = s + "\n" + so + "\n" + st;
        in.putExtra("et",all);
        startActivity(in);
    }
}

