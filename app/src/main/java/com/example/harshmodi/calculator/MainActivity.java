package com.example.harshmodi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bDot, badd, bsub, bmul, bdiv, beq, res;
    private Button backspace, clr;
    private float num1, num2;
    private boolean addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backspace = (Button)findViewById(R.id.buttonBack);
        clr = (Button)findViewById(R.id.buttonC);
        ed1 = (EditText)findViewById(R.id.edt);
        res = (Button)findViewById(R.id.buttonCE);
        b0 = (Button)findViewById(R.id.button0);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        bDot = (Button)findViewById(R.id.buttonDot);
        badd = (Button)findViewById(R.id.addButton);
        bmul = (Button)findViewById(R.id.mulButton);
        bsub = (Button)findViewById(R.id.subButton);
        bdiv = (Button)findViewById(R.id.divButton);
        beq = (Button)findViewById(R.id.buttonEq);
        ed1.setText("0");

        num1 = num2 = 0;
        addition = subtraction = multiplication = division = false;
        ed1.setFocusable(false);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("0");
                num1 = 0;
                num2 = 0;
                addition = subtraction = multiplication = division = false;
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("0");
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.length() > 0)tmp = tmp.substring(0, tmp.length()-1);
                if(tmp.length() == 0)tmp = "0";
                ed1.setText(tmp);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"1");
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.charAt(0) == '0'){
                    if(tmp.length() > 1)tmp = tmp.substring(1);
                    else tmp = "";
                }
                ed1.setText(tmp+"0");
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = ed1.getText().toString();
                if(tmp.indexOf('.') != -1) tmp = "0";
                ed1.setText(tmp+".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText().toString());
                ed1.setText("0");
                addition = true;
            }
        });

        bsub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText().toString());
                ed1.setText("0");
                subtraction = true;
            }
        });

        bmul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText().toString());
                ed1.setText("0");
                multiplication = true;
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText().toString());
                ed1.setText("0");
                division = true;
            }
        });

        beq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(ed1 == null){
                    ed1.setText(null);
                }
                else{
                    float res = 0;
                    boolean flag = false;
                    num2 = Float.parseFloat(ed1.getText().toString());
                    if(addition){
                        flag = true;
                        res = num1 + num2;
                        addition = false;
                    }
                    else if(subtraction){
                        flag = true;
                        res = num1 - num2;
                        subtraction = false;
                    }
                    else if(multiplication){
                        flag = true;
                        res = num1 * num2;
                        multiplication = false;
                    }
                    else if(division){
                        flag = true;
                        if(num2 == 0)res = 0;
                        else{
                            res = num1/num2;
                            division = false;
                        }
                    }
                    if(flag){
                        if((int)res == res) ed1.setText((int)res+"");
                        else ed1.setText(res+"");
                    }
                }
            }
        });

    }

}
