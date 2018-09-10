package com.prova.marcelo.prova1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.NumberFormat;

public class MainActivity extends Activity {

    EditText visor;
    Button m;
    int operando1, operando2, resultadoeq;
    String operador, memoria;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m = (Button) findViewById(R.id.bm);
        m.setEnabled(false);
    }

    public void operacao(View botao) {
        visor = (EditText) findViewById(R.id.visor);
        switch (botao.getId()) {
            case R.id.b0:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.b1:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.b2:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.b3:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.b4:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.b5:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.b6:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.b7:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.b8:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.b9:
                visor.setText(visor.getText().append(((Button) botao).getText()));
                break;
            case R.id.divisao:
                operando1 = Integer.parseInt((visor.getText().toString()));
                operador = ((Button) botao).getText().toString();
                visor.setText("");
                break;
            case R.id.multiplcação:
                operando1 = Integer.parseInt((visor.getText().toString()));
                operador = ((Button) botao).getText().toString();
                visor.setText("");
                break;
            case R.id.soma:
                operando1 = Integer.parseInt((visor.getText().toString()));
                operador = ((Button) botao).getText().toString();
                visor.setText("");
                break;
            case R.id.subtração:
                operando1 = Integer.parseInt((visor.getText().toString()));
                operador = ((Button) botao).getText().toString();
                visor.setText("");
                break;
            case R.id.igual:
                operando2 = Integer.parseInt((visor.getText().toString()));
                m.setEnabled(true);
                NumberFormat resultado = NumberFormat.getNumberInstance();
                switch (operador) {
                    case "+":
                        visor.setText(resultado.format(operando1 + operando2));
                        resultadoeq = operando1 + operando2;
                        break;
                    case "-":
                        visor.setText(resultado.format(operando1 - operando2));
                        resultadoeq = operando1 - operando2;
                        break;
                    case "*":
                        visor.setText(resultado.format(operando1 * operando2));
                        resultadoeq = operando1 * operando2;
                        break;
                    case "/":
                        visor.setText(resultado.format(operando1 / operando2));
                        resultadoeq = operando1 / operando2;
                        break;
                }
                memoria = operando1 + " " + operador + " " +operando2 + " = " + resultadoeq;
        }

    }
    public  void botaoC (View v){
        visor = (EditText) findViewById(R.id.visor);
        visor.setText("");
    }
    public  void botaoM (View v){
        visor = (EditText) findViewById(R.id.visor);
        visor.setText(memoria);
    }
}
