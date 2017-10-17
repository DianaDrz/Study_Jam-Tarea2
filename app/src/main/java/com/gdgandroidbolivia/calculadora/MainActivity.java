package com.gdgandroidbolivia.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView panatalla;
    private String captura1="",capatura2;
    private int operacion;
    private Boolean pm =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panatalla=(TextView)findViewById(R.id.texto);
        captura1=panatalla.getText().toString();
        panatalla.setText("");
    }
    public void numero (View view){
        captura1=panatalla.getText().toString();
        Button b =(Button)view;
        captura1+=b.getText();
        panatalla.setText(captura1);
    }
    public void suma(View view) {
        if (panatalla.getText().toString() != "") {
            captura1 = panatalla.getText().toString();
            operacion = 1;
            capatura2 = captura1;
            panatalla.setText("");
        }
    }
    public void resta(View view) {
        if (panatalla.getText().toString() != "") {
            captura1 = panatalla.getText().toString();
            operacion = 2;
            capatura2 = captura1;
            panatalla.setText("");
        }
    }
    public void multiplicacion(View view) {
        if (panatalla.getText().toString() != "") {
            captura1 = panatalla.getText().toString();
            operacion = 3;
            capatura2 = captura1;
            panatalla.setText("");
        }
    }
    public void division(View view){
        if(panatalla.getText().toString()!=""){
            captura1 = panatalla.getText().toString();
            operacion = 4;
            capatura2=captura1;
            panatalla.setText("");
        }
    }
    public void seno(View view){
        if (panatalla.getText().toString()!=""){
            Double result,a;
            captura1 = panatalla.getText().toString();
            a= Double.parseDouble(captura1);
            result = Math.sin(a);
            panatalla.setText(""+result);
        }
    }
    public void cos(View view){
        if (panatalla.getText().toString()!=""){
            Double result,a;
            captura1 = panatalla.getText().toString();
            a= Double.parseDouble(captura1);
            result = Math.cos(a);
            panatalla.setText(""+result);
        }
    }
    public void tan(View view){
        if (panatalla.getText().toString()!=""){
            Double result,a;
            captura1 = panatalla.getText().toString();
            a= Double.parseDouble(captura1);
            result = Math.tan(a);
            panatalla.setText(""+result);
        }
    }
    public void borrar(View view){
        if (panatalla.getText().toString()!=""){
            panatalla.setText(panatalla.getText().toString().substring(0,panatalla.getText().length()-1));
        }

    }
    public  void todo(View view){
        pm=false;
        panatalla.setText("");
        captura1 = "";
        capatura2 = "";
    }
    public void igual(View view){
        if(capatura2!=""&&panatalla.getText().toString()==""){
            panatalla.setText(""+capatura2);
        }
        if (panatalla.getText().toString()!=""&&capatura2!=""){
            double nume1,nume2,reultado;
            nume1 = Double.parseDouble(capatura2);
            nume2 = Double.parseDouble(panatalla.getText().toString());
            if (operacion==1){
                reultado = nume1+nume2;
                panatalla.setText(""+reultado);
            }
            if (operacion==2){
                reultado = nume1-nume2;
                panatalla.setText(""+reultado);
            }
            if (operacion==3){
                reultado = nume1*nume2;
                panatalla.setText(""+reultado);
            }
            if (operacion==4){
                reultado = nume1/nume2;
                panatalla.setText(""+reultado);
            }
        }

    }


}
