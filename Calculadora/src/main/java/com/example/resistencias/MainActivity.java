package com.example.resistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eNumero;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bSuma,bResta,bMultiplicacion,bDivision,bIgual,bClear,bPunto;
    Double op1,op2;
    int oper,flgigu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNumero = (EditText) findViewById(R.id.eNumero);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3= (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bSuma = (Button) findViewById(R.id.bSuma);
        bResta = (Button) findViewById(R.id.bResta);
        bMultiplicacion = (Button) findViewById(R.id.bMultiplicacion);
        bDivision = (Button) findViewById(R.id.bDivision);
        bClear = (Button) findViewById(R.id.bClear);
        bIgual = (Button) findViewById(R.id.bIgual);
        bPunto = (Button) findViewById(R.id.bPunto);




    }

    public void click(View view){
        int id = view.getId();
        switch (id){
            case R.id.b0 :
                if(flgigu==1){
                    eNumero.setText("");
                }
                eNumero.setText(eNumero.getText().toString()+""+"0");
                break;
            case R.id.b1 :
                if(flgigu==1){
                    flgigu=0;
                    eNumero.setText("");}
                eNumero.setText(eNumero.getText().toString()+""+"1");
                break;
            case R.id.b2 :
                if(flgigu==1){
                    flgigu=0;
                    eNumero.setText("");}
                eNumero.setText(eNumero.getText().toString()+""+"2");
                break;
            case R.id.b3 :
                if(flgigu==1){
                    flgigu=0;
                    eNumero.setText("");}
                eNumero.setText(eNumero.getText().toString()+""+"3");
                break;
            case R.id.b4 :
                if(flgigu==1){
                    flgigu=0;
                    eNumero.setText("");}
                eNumero.setText(eNumero.getText().toString()+""+"4");
                break;
            case R.id.b5 :
                if(flgigu==1){
                    flgigu=0;
                    eNumero.setText("");}
                eNumero.setText(eNumero.getText().toString()+""+"5");
                break;
            case R.id.b6 :
                if(flgigu==1){
                    flgigu=0;
                    eNumero.setText("");}
                eNumero.setText(eNumero.getText().toString()+""+"6");
                break;
            case R.id.b7 :
                if(flgigu==1){
                    flgigu=0;
                    eNumero.setText("");}
                eNumero.setText(eNumero.getText().toString()+""+"7");
                break;
            case R.id.b8 :
                if(flgigu==1){
                    flgigu=0;
                    eNumero.setText("");}
                eNumero.setText(eNumero.getText().toString()+""+"8");
                break;
            case R.id.b9 :
                if(flgigu==1){
                    flgigu=0;
                    eNumero.setText("");}
                eNumero.setText(eNumero.getText().toString()+""+"9");
                break;
            case R.id.bPunto :
                eNumero.setText(eNumero.getText().toString()+""+".");
                break;
            case R.id.bClear : eNumero.setText("");
                break;
            case R.id.bSuma :
                oper = 0;
                op1 = Double.parseDouble(eNumero.getText().toString());
                eNumero.setText("");
                oper = 1;
                break;
            case R.id.bResta :
                oper = 0;
                op1 = Double.parseDouble(eNumero.getText().toString());
                eNumero.setText("");
                oper = 2;
                break;
            case R.id.bMultiplicacion :
                op1 = Double.parseDouble(eNumero.getText().toString());
                eNumero.setText("");
                oper = 3;
                break;
            case R.id.bDivision :
                op1 = Double.parseDouble(eNumero.getText().toString());
                eNumero.setText("");
                oper = 4;
                break;


            case R.id.bIgual :
                op2 = Double.parseDouble(eNumero.getText().toString());
                flgigu=1;
                switch (oper) {
                    case 1:
                        op1 = op1 + op2;
                        eNumero.setText(op1.toString());
                        eNumero.setEnabled(false);
                        break;
                    case 2:
                        op1 = op1 - op2;
                        eNumero.setText(op1.toString());
                        eNumero.setEnabled(false);
                        break;
                    case 3:
                        op1 = op1 * op2;
                        eNumero.setText(op1.toString());
                        eNumero.setEnabled(false);
                        break;
                    case 4:
                        if(op2==0){
                            Toast.makeText(getApplicationContext(),"Division por cero no permitida",Toast.LENGTH_SHORT).show();
                            break;
                        }
                        op1 = op1 / op2;
                        eNumero.setText(op1.toString());
                        eNumero.setEnabled(false);
                        break;

                }




                break;

        }




    }
}
