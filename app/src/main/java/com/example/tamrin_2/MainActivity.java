package com.example.tamrin_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.DrawableUtils;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        Button btn_sum= new Button(this);
        Button btn_div= new Button(this);
        Button btn_mul= new Button(this);
        TextView txt_1=new TextView(this);
        final TextView txt_result=new TextView(this);
        final EditText txt_first=new EditText(this);
        final EditText txt_second=new EditText(this);

        txt_1.setText("بسم الله الرحمن الرحیم");
        txt_1.setTextSize(27);
        txt_1.setTextColor(Color.WHITE);
        txt_1.setBackgroundColor(Color.BLACK);


        btn_sum.setBackgroundColor(Color.GREEN);
        btn_sum.setText("جمع");
        btn_div.setBackgroundColor(Color.GREEN);
        btn_div.setText("تقسیم");
        btn_mul.setBackgroundColor(Color.GREEN);
        btn_mul.setText("ضرب");

        txt_result.setBackgroundColor(Color.GRAY);
        txt_result.setText("نتیجه");
        txt_result.setTextSize(35);

        txt_first.setHint("عدد اول");
        txt_first.setId(1);
        txt_second.setHint("عدد دوم");
        txt_first.setId(2);





        RelativeLayout.LayoutParams txt_detail=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        txt_detail.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txt_detail.setMargins(0,100,0,0);
        relativeLayout.addView(txt_1,txt_detail);

        RelativeLayout.LayoutParams edit_txt_detail=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        edit_txt_detail.addRule(RelativeLayout.CENTER_HORIZONTAL);
        edit_txt_detail.addRule(RelativeLayout.CENTER_VERTICAL);
        relativeLayout.addView(txt_second,edit_txt_detail);

        RelativeLayout.LayoutParams edit_txt_detail2=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        edit_txt_detail2.addRule(RelativeLayout.ABOVE,txt_second.getId());
        edit_txt_detail2.addRule(RelativeLayout.CENTER_HORIZONTAL);
        edit_txt_detail2.setMargins(0,340,0,0);
        relativeLayout.addView(txt_first,edit_txt_detail2);

        RelativeLayout.LayoutParams btn_div_detail=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        btn_div_detail.addRule(RelativeLayout.BELOW,txt_second.getId());
        btn_div_detail.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btn_div_detail.setMargins(0,750,0,0);
        relativeLayout.addView(btn_div,btn_div_detail);

        RelativeLayout.LayoutParams btn_sum_detail=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        btn_sum_detail.setMargins(50,750,0,0);
        relativeLayout.addView(btn_sum,btn_sum_detail);

        RelativeLayout.LayoutParams btn_mul_detail=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        btn_mul_detail.setMargins(356,750,0,0);
        relativeLayout.addView(btn_mul,btn_mul_detail);

        RelativeLayout.LayoutParams txt_result_detail=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        txt_result_detail.addRule(RelativeLayout.CENTER_HORIZONTAL);
        txt_result_detail.setMargins(0,570,0,0);
        relativeLayout.addView(txt_result,txt_result_detail);



        setContentView(relativeLayout);


        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String First = txt_first.getText().toString();
                String Second = txt_second.getText().toString();
                if(TextUtils.isEmpty(First) ||  TextUtils.isEmpty(Second) )
                    Toast.makeText(MainActivity.this, "مقادیر نباید خالی باشند", Toast.LENGTH_LONG).show();
                else {
                    String f = txt_first.getText().toString();
                    float first = Float.parseFloat(f);
                    String s = txt_second.getText().toString();
                    float second = Float.parseFloat(s);
                    txt_result.setText(String.valueOf(first + second));
                }

            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String First = txt_first.getText().toString();
                String Second = txt_second.getText().toString();
                if(TextUtils.isEmpty(First) ||  TextUtils.isEmpty(Second) )
                    Toast.makeText(MainActivity.this, "مقادیر نباید خالی باشند", Toast.LENGTH_LONG).show();
                else {
                    String f = txt_first.getText().toString();
                    float first = Float.parseFloat(f);
                    String s = txt_second.getText().toString();
                    float second = Float.parseFloat(s);
                    txt_result.setText(String.valueOf(first * second));
                }

            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String First = txt_first.getText().toString();
                String Second = txt_second.getText().toString();
                if(TextUtils.isEmpty(First) ||  TextUtils.isEmpty(Second) )
                    Toast.makeText(MainActivity.this, "مقادیر نباید خالی باشند", Toast.LENGTH_LONG).show();
                else {
                    String f = txt_first.getText().toString();
                    float first = Float.parseFloat(f);
                    String s = txt_second.getText().toString();
                    float second = Float.parseFloat(s);
                    txt_result.setText(String.valueOf(first / second));
                }

            }
        });



    }
}
