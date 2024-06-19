package com.bhuvana.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etfirst,etsecond;
    TextView tvanswer,valdisplay;
    Button add,sub,mult,div;
    Button move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirst=findViewById(R.id.etfv);
        etsecond=findViewById(R.id.etsv);
        tvanswer=findViewById(R.id.tvans);
        add=findViewById(R.id.addb);
        sub=findViewById(R.id.subb);
        mult=findViewById(R.id.mulb);
        div=findViewById(R.id.divb);
        valdisplay=findViewById(R.id.valdisd);
        move=findViewById(R.id.changemode);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float firstvalue, secondvalue, ans;
                String s1=etfirst.getText().toString();//
                String s2=etsecond.getText().toString();//
                if(TextUtils.isEmpty(s1)) {
                    Toast.makeText(getApplicationContext(),"Make sure to enter both values",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(s2)) {
                    Toast.makeText(getApplicationContext(),"Make sure to enter both values", Toast.LENGTH_SHORT).show();
                }
                else {
                    firstvalue = Float.parseFloat(etfirst.getText().toString());
                    secondvalue = Float.parseFloat(etsecond.getText().toString());
                    ans = firstvalue + secondvalue;
                    valdisplay.setText(firstvalue + " + " + secondvalue);
                    tvanswer.setText(ans.toString());
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float firstvalue, secondvalue, ans;
                String s1=etfirst.getText().toString();//
                String s2=etsecond.getText().toString();//
                if(TextUtils.isEmpty(s1)) {
                    Toast.makeText(getApplicationContext(),"Make sure to enter both values",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(s2)) {
                    Toast.makeText(getApplicationContext(),"Make sure to enter both values", Toast.LENGTH_SHORT).show();
                }
                else {
                    firstvalue = Float.parseFloat(etfirst.getText().toString());
                    secondvalue = Float.parseFloat(etsecond.getText().toString());
                    ans = firstvalue - secondvalue;
                    valdisplay.setText(firstvalue + " - " + secondvalue);
                    tvanswer.setText(ans.toString());
                }
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float firstvalue, secondvalue, ans;
                String s1 = etfirst.getText().toString();//
                String s2 = etsecond.getText().toString();//
                if (TextUtils.isEmpty(s1)) {
                    Toast.makeText(getApplicationContext(), "Make sure to enter both values", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(s2)) {
                    Toast.makeText(getApplicationContext(), "Make sure to enter both values", Toast.LENGTH_SHORT).show();
                } else {
                    firstvalue = Float.parseFloat(etfirst.getText().toString());
                    secondvalue = Float.parseFloat(etsecond.getText().toString());
                    ans = firstvalue * secondvalue;
                    valdisplay.setText(firstvalue + " * " + secondvalue);
                    tvanswer.setText(ans.toString());
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float firstvalue, secondvalue, ans;
                String s1=etfirst.getText().toString();//
                String s2=etsecond.getText().toString();//
                if(TextUtils.isEmpty(s1)) {
                    Toast.makeText(getApplicationContext(),"Make sure to enter both values",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(s2)) {
                    Toast.makeText(getApplicationContext(),"Make sure to enter both values", Toast.LENGTH_SHORT).show();
                }
                else {
                    firstvalue = Float.parseFloat(etfirst.getText().toString());
                    secondvalue = Float.parseFloat(etsecond.getText().toString());
                    ans = firstvalue / secondvalue;
                    valdisplay.setText(firstvalue + " % " + secondvalue);
                    tvanswer.setText(ans.toString());
                }
            }
        });

    }
}