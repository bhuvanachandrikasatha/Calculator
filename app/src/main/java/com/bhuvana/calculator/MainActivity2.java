package com.bhuvana.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText etfirst2,etsecond2;
    TextView tvanswer2,valdisplay2;
    Button add2,sub2,mult2,div2,ac2;
    private Button move1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
                etfirst2=findViewById(R.id.etfv2);
                etsecond2=findViewById(R.id.etsv2);
                tvanswer2=findViewById(R.id.tvans2);
                add2=findViewById(R.id.addb2);
                sub2=findViewById(R.id.subb2);
                mult2=findViewById(R.id.mulb2);
                div2=findViewById(R.id.divb2);
                ac2=findViewById(R.id.changemode2);
                valdisplay2=findViewById(R.id.valdis2);
                move1=findViewById(R.id.changemode2);
                move1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(intent);
            }
        });
                add2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Float firstvalue2, secondvalue2, ans2;
                        String s1=etfirst2.getText().toString();//
                        String s2=etsecond2.getText().toString();//
                        if(TextUtils.isEmpty(s1)) {
                            Toast.makeText(getApplicationContext(),"Make sure to enter both values",Toast.LENGTH_SHORT).show();
                        }
                        else if(TextUtils.isEmpty(s2)) {
                            Toast.makeText(getApplicationContext(),"Make sure to enter both values", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            firstvalue2 = Float.parseFloat(etfirst2.getText().toString());
                            secondvalue2 = Float.parseFloat(etsecond2.getText().toString());
                            ans2 = firstvalue2 + secondvalue2;
                            valdisplay2.setText(firstvalue2 + " + " + secondvalue2);
                            tvanswer2.setText(ans2.toString());
                        }
                    }
                });
                sub2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Float firstvalue2, secondvalue2, ans2;
                        String s1=etfirst2.getText().toString();//
                        String s2=etsecond2.getText().toString();//
                        if(TextUtils.isEmpty(s1)) {
                            Toast.makeText(getApplicationContext(),"Make sure to enter both values",Toast.LENGTH_SHORT).show();
                        }
                        else if(TextUtils.isEmpty(s2)) {
                            Toast.makeText(getApplicationContext(),"Make sure to enter both values", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            firstvalue2 = Float.parseFloat(etfirst2.getText().toString());
                            secondvalue2 = Float.parseFloat(etsecond2.getText().toString());
                            ans2 = firstvalue2 - secondvalue2;
                            valdisplay2.setText(firstvalue2 + " - " + secondvalue2);
                            tvanswer2.setText(ans2.toString());
                        }
                    }
                });
                mult2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Float firstvalue2, secondvalue2, ans2;
                        String s1=etfirst2.getText().toString();//
                        String s2=etsecond2.getText().toString();//
                        if(TextUtils.isEmpty(s1)) {
                            Toast.makeText(getApplicationContext(),"Make sure to enter both values",Toast.LENGTH_SHORT).show();
                        }
                        else if(TextUtils.isEmpty(s2)) {
                            Toast.makeText(getApplicationContext(),"Make sure to enter both values", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            firstvalue2 = Float.parseFloat(etfirst2.getText().toString());
                            secondvalue2 = Float.parseFloat(etsecond2.getText().toString());
                            ans2 = firstvalue2 * secondvalue2;
                            valdisplay2.setText(firstvalue2 + " * " + secondvalue2);
                            tvanswer2.setText(ans2.toString());
                        }
                    }
                });
                div2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Float firstvalue2, secondvalue2, ans2;
                        String s1=etfirst2.getText().toString();//
                        String s2=etsecond2.getText().toString();//
                        if(TextUtils.isEmpty(s1)) {
                            Toast.makeText(getApplicationContext(),"Make sure to enter both values",Toast.LENGTH_SHORT).show();
                        }
                        else if(TextUtils.isEmpty(s2)) {
                            Toast.makeText(getApplicationContext(),"Make sure to enter both values", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            firstvalue2 = Float.parseFloat(etfirst2.getText().toString());
                            secondvalue2 = Float.parseFloat(etsecond2.getText().toString());
                            ans2 = firstvalue2 / secondvalue2;
                            valdisplay2.setText(firstvalue2 + " / " + secondvalue2);
                            tvanswer2.setText(ans2.toString());
                        }
                    }
                });

            }
}