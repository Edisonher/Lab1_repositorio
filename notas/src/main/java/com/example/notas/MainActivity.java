package com.example.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eNotapract,eProyecto1,eProyecto2,eProyecto3,eAplicacion;
    Button bCalcular;
    Double N1,N2,N3,N4,N5,NF;
    TextView tNotaf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNotapract = (EditText) findViewById(R.id.eNotapract);
        eProyecto1 = (EditText) findViewById(R.id.eProyecto1);
        eProyecto2 = (EditText) findViewById(R.id.eProyecto2);
        eProyecto3 = (EditText) findViewById(R.id.eProyecto3);
        eAplicacion = (EditText) findViewById(R.id.eAplicacion);
        bCalcular = (Button) findViewById(R.id.bCalcular);
        tNotaf = (TextView) findViewById(R.id.tNotaf);




        //Toast.makeText(getApplicationContext(),"Ingrese los valores correctos",Toast.LENGTH_SHORT).show();
        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( (eNotapract.getText().toString().equals(""))|(eProyecto1.getText().toString().equals(""))| (eProyecto2.getText().toString().equals(""))|(eProyecto3.getText().toString().equals(""))|(eAplicacion.getText().toString().equals("")) ) {

                    Toast.makeText(getApplicationContext(),"Digite todos los campos",Toast.LENGTH_SHORT).show();

                }

                else if ( !(eNotapract.getText().toString().equals("")) && !(eProyecto1.getText().toString().equals(""))&& !(eProyecto2.getText().toString().equals(""))&& !(eProyecto3.getText().toString().equals(""))&& !(eAplicacion.getText().toString().equals("")) ) {
                    N1= Double.parseDouble(eNotapract.getText().toString());
                    N2= Double.parseDouble(eProyecto1.getText().toString());
                    N3= Double.parseDouble(eProyecto2.getText().toString());
                    N4= Double.parseDouble(eProyecto3.getText().toString());
                    N5= Double.parseDouble(eAplicacion.getText().toString());

                    if(N1>5|N2>5|N3>5|N4>5| N5>5){
                        Toast.makeText(getApplicationContext(),"Ninguna nota puede ser superior a 5.0",Toast.LENGTH_SHORT).show();

                    }
                    else{
                        NF=N1*0.6+N2*0.05+N3*0.07+N4*0.08+N5*0.2;
                        tNotaf.setText(String.valueOf(NF));
                        if(NF>=0&&NF<=1){
                            Toast.makeText(getApplicationContext(),"Estas en el lugar equivocado",Toast.LENGTH_SHORT).show();

                        }
                        else if(NF>1&&NF<=2){
                            Toast.makeText(getApplicationContext(),"Remal",Toast.LENGTH_SHORT).show();

                        }
                        else if(NF>2&&NF<=3){
                            Toast.makeText(getApplicationContext(),"Es posible recuperarse",Toast.LENGTH_SHORT).show();

                        }
                        else if(NF>3&&NF<=4){
                            Toast.makeText(getApplicationContext(),"Normalito",Toast.LENGTH_SHORT).show();

                        }
                        else if(NF>4&&NF<=4.5){
                            Toast.makeText(getApplicationContext(),"Muy Bien",Toast.LENGTH_SHORT).show();

                        }
                        else if(NF>4.5&&NF<=5){
                            Toast.makeText(getApplicationContext(),"Excelente estudiante",Toast.LENGTH_SHORT).show();

                        }




                    }
                }


            }
        });


        }


    }


