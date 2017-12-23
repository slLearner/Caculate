package com.a.sunli.caculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_point;
    Button button;
    Button btn_div;
    Button btn_mul;
    Button btn_sub;
    Button btn_add;
    Button btn_equ;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_equ = (Button) findViewById(R.id.btn_equ);
        button = (Button) findViewById(R.id.button);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_add.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_mul.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_equ.setOnClickListener(this);
        button.setOnClickListener(this);
        input = (EditText) findViewById(R.id.input);
    }
        @Override
        public void onClick (View v){
            String str = input.getText().toString();
            switch (v.getId()) {
                case R.id.btn_0:
                case R.id.btn_1:
                case R.id.btn_2:
                case R.id.btn_3:
                case R.id.btn_4:
                case R.id.btn_5:
                case R.id.btn_6:
                case R.id.btn_7:
                case R.id.btn_8:
                case R.id.btn_9:
                case R.id.btn_point:
                    input.setText(str + ((Button) v).getText());
                    break;
                case R.id.btn_add:
                case R.id.btn_sub:
                case R.id.btn_mul:
                case R.id.btn_div:
                    input.setText(str + " " + ((Button) v).getText() + " ");
                    break;
                case R.id.btn_equ:
                   input.setText(String.valueOf(getResult()));
                    break;
                default:
            }
        }

    private double getResult() {
        String x = input.getText().toString();
        if (x == null || x.equals(" ")) {
            return 0;
        }
        if (!x.contains(" ")) {
            return 0;
        }
        double result=0;
        String s1 = x.substring(0, x.indexOf(" "));
        String op = x.substring(x.indexOf(" ")+1, x.indexOf(" ") + 2);
        String s2 = x.substring(x.indexOf(" ") + 3);
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            if (op.equals("+")) {
                result = d1 + d2;
            } else if (op.equals("-")) {
                result = d1 - d2;
            } else if (op.equals("*")) {
                result = d1 * d2;
            } else if (op.equals("/")) {
                result = d1 / d2;
            }
            return result;
        }

    }




