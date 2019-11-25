package com.example.imansamiaji.currencyconverter;

import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button dollar,euro,pound,riyal,rupe,ringgit,won,yen,baht;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollar=findViewById(R.id.dollar);
        euro=findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        riyal=findViewById(R.id.riyal);
        rupe=findViewById(R.id.rupe);
        ringgit=findViewById(R.id.ringgit);
        won=findViewById(R.id.won);
        yen=findViewById(R.id.yen);
        baht=findViewById(R.id.baht);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String z=editText.getText().toString();

              if (TextUtils.isEmpty(z)) {
                  editText.setError("Empty User Input");
              } else {
                  double n,k;

                  n=Double.parseDouble(z);
                  textView.setText(null);
                  Formatter formatter = new Formatter();
                  k=n*0.000071;

                  DecimalFormat numberFormat = new DecimalFormat("#.00");
                  textView.setText("" + numberFormat.format(k));
                  textView.setText(""+k);
              }
            }
        });

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k=n*0.000063;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    textView.setText(""+k);
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k=n*0.000055;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    textView.setText(""+k);
                }
            }
        });

        rupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k=n*0.0051;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    textView.setText(""+k);
                }
            }
        });

        riyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k=n*0.00027;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    textView.setText(""+k);
                }
            }
        });
        ringgit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k=n*0.00029;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    textView.setText(""+k);
                }
            }
        });

        won.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k=n*0.08;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    textView.setText(""+k);
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k=n*0.0079;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    textView.setText(""+k);
                }
            }
        });

        baht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z=editText.getText().toString();

                if (TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n,k;

                    n=Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k=n*0.0022;

                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    textView.setText(""+k);
                }
            }
        });
    }
}
