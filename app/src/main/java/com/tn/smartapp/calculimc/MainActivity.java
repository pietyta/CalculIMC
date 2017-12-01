package com.tn.smartapp.calculimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText poid;
    EditText taille;
    TextView rs;
    RadioButton rh;
    RadioButton rf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cal = (Button) findViewById(R.id.button);
         poid = (EditText) findViewById(R.id.editText1);
         taille = (EditText) findViewById(R.id.editText2);
         rs = (TextView) findViewById(R.id.result);
        rh = (RadioButton) findViewById(R.id.h);
        rf = (RadioButton) findViewById(R.id.f);



    }



       public void imc(View x)
       {
           double p;
           double t;
           char sexe ='h';
          
           p=Double.parseDouble(poid.getText().toString());
           t=Double.parseDouble(taille.getText().toString());
           if(rh.isChecked()) sexe='h';
           if(rf.isChecked()) sexe='f';
           PoidIdeal poidIdeal=new PoidIdeal(p,t,sexe);
           rs.setText(poidIdeal.imc());

    }
}
