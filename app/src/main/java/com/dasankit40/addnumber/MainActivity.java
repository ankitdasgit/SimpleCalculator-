package com.dasankit40.addnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= findViewById(R.id.button);
        Button button1=findViewById(R.id.button2);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
    }
//    public void onButtonClick(View v){
//        EditText e1= (EditText)findViewById(R.id.editTextNumber);
//        EditText e2= (EditText)findViewById(R.id.editTextNumber2);
//        TextView t1= (TextView)findViewById(R.id.editTextTextPersonName);
//        int num1 = Integer.parseInt(e1.getText().toString());
//        int num2= Integer.parseInt(e2.getText().toString());
//        int sum= num1+num2;
//        t1.setText(Integer.toString(sum));


//        EditText e3= (EditText)findViewById(R.id.editTextNumber);
//        EditText e4= (EditText)findViewById(R.id.editTextNumber2);
//        TextView t2= (TextView)findViewById(R.id.editTextTextPersonName);
//        int num3 = Integer.parseInt(e1.getText().toString());
//        int num4= Integer.parseInt(e2.getText().toString());
//        int sub= num1-num2;
//        t1.setText(Integer.toString(sub));
//    }


    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.button:
        EditText e1= (EditText)findViewById(R.id.editTextNumber);
        EditText e2= (EditText)findViewById(R.id.editTextNumber2);
        TextView t1= (TextView)findViewById(R.id.editTextTextPersonName);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int sum= num1+num2;
        t1.setText(Integer.toString(sum));
        break;

         case R.id.button2:

             EditText e3= (EditText)findViewById(R.id.editTextNumber);
        EditText e4= (EditText)findViewById(R.id.editTextNumber2);
        TextView t2= (TextView)findViewById(R.id.editTextTextPersonName);
        int num3 = Integer.parseInt(e3.getText().toString());
        int num4= Integer.parseInt(e4.getText().toString());
        int sub= num3-num4;
        t2.setText(Integer.toString(sub));
        break;


         case R.id.button3:

             EditText e5= (EditText)findViewById(R.id.editTextNumber);
             EditText e6= (EditText)findViewById(R.id.editTextNumber2);
             TextView t3= (TextView)findViewById(R.id.editTextTextPersonName);
             int num5 = Integer.parseInt(e5.getText().toString());
             int num6= Integer.parseInt(e6.getText().toString());
             int mul= num5*num6;
             t3.setText(Integer.toString(mul));
               break;

         case R.id.button4:

             EditText e7= (EditText)findViewById(R.id.editTextNumber);
             EditText e8= (EditText)findViewById(R.id.editTextNumber2);
             TextView t4= (TextView)findViewById(R.id.editTextTextPersonName);
            Double num7 = Double.parseDouble(e7.getText().toString());
             Double num8= Double.parseDouble(e8.getText().toString());
             Double div= num7/num8;
             //t4.setText(div.toString());
             t4.setText(Double.toString(div));

             break;



     }
    }
}