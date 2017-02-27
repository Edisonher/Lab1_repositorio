package com.example.calculadora_resistencias;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bCalcular;
    TextView tValor,tB1,tB2,tB3,tB4,tB5,tB6,tTol;
    int position;
    String selection;
    Spinner Spin1,Spin2,Spin3,Spin4,Spin5,Spin6;
    //Double V1,V2,V3,V4,V5,V6;
    String VT,V1,V2,V3,V4,V5,V6,V7;
    Double aux1,auxMult;
    RadioButton RB1, RB2, RB3;
    int Bandas=6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spin1 = (Spinner) findViewById(R.id.Spin1);
        Spin2 = (Spinner) findViewById(R.id.Spin2);
        Spin3 = (Spinner) findViewById(R.id.Spin3);
        Spin4 = (Spinner) findViewById(R.id.Spin4);
        Spin5 = (Spinner) findViewById(R.id.Spin5);
        Spin6 = (Spinner) findViewById(R.id.Spin6);
        bCalcular = (Button) findViewById(R.id.bCalcular);
        tValor = (TextView) findViewById(R.id.tValor);
        tB1 = (TextView) findViewById(R.id.tB1);
        tB2 = (TextView) findViewById(R.id.tB2);
        tB3 = (TextView) findViewById(R.id.tB3);
        tB4 = (TextView) findViewById(R.id.tB4);
        tB5 = (TextView) findViewById(R.id.tB5);
        tB6 = (TextView) findViewById(R.id.tB6);
        RB1 = (RadioButton) findViewById(R.id.RB1);
        RB2 = (RadioButton) findViewById(R.id.RB2);
        RB3 = (RadioButton) findViewById(R.id.RB3);
        tTol = (TextView) findViewById(R.id.tTol);





        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //V1= Double.parseDouble(Spin1.getSelectedItem().toString());
                //V2= Double.parseDouble(Spin2.getSelectedItem().toString());
                //V3= Double.parseDouble(Spin3.getSelectedItem().toString());
                //V4= Double.parseDouble(Spin4.getSelectedItem().toString());
                //V5= Double.parseDouble(Spin5.getSelectedItem().toString());
                //V6= Double.parseDouble(Spin6.getSelectedItem().toString());

                V1=Spin1.getSelectedItem().toString();
                V2=Spin2.getSelectedItem().toString();
                V3=Spin3.getSelectedItem().toString();
                V4=Spin4.getSelectedItem().toString();
                V5=Spin5.getSelectedItem().toString();
                V6=Spin6.getSelectedItem().toString();




                auxMult=Double.parseDouble(Spin3.getSelectedItem().toString());
                if(V1.equals("0")){tB1.setBackgroundColor(Color.BLACK);}
                else if(V1.equals("1")){tB1.setBackgroundColor(Color.argb(255,139,69,19));}
                else if(V1.equals("2")){tB1.setBackgroundColor(Color.RED);}
                else if(V1.equals("3")){tB1.setBackgroundColor(Color.argb(255,255,69,0));}
                else if(V1.equals("4")){tB1.setBackgroundColor(Color.YELLOW);}
                else if(V1.equals("5")){tB1.setBackgroundColor(Color.argb(255,0,255,0));}
                else if(V1.equals("6")){tB1.setBackgroundColor(Color.BLUE);}
                else if(V1.equals("7")){tB1.setBackgroundColor(Color.argb(255,148,0,211));}
                else if(V1.equals("8")){tB1.setBackgroundColor(Color.GRAY);}
                else if(V1.equals("9")){tB1.setBackgroundColor(Color.WHITE);}



                if(V2.equals("0")){tB2.setBackgroundColor(Color.BLACK);}
                else if(V2.equals("1")){tB2.setBackgroundColor(Color.argb(255,139,69,19));}
                else if(V2.equals("2")){tB2.setBackgroundColor(Color.RED);}
                else if(V2.equals("3")){tB2.setBackgroundColor(Color.argb(255,255,69,0));}
                else if(V2.equals("4")){tB2.setBackgroundColor(Color.YELLOW);}
                else if(V2.equals("5")){tB2.setBackgroundColor(Color.argb(255,0,255,0));}
                else if(V2.equals("6")){tB2.setBackgroundColor(Color.BLUE);}
                else if(V2.equals("7")){tB2.setBackgroundColor(Color.argb(255,148,0,211));}
                else if(V2.equals("8")){tB2.setBackgroundColor(Color.GRAY);}
                else if(V2.equals("9")){tB2.setBackgroundColor(Color.WHITE);}

                if(V3.equals("0")){tB3.setBackgroundColor(Color.BLACK);}
                else if(V3.equals("1")){tB3.setBackgroundColor(Color.argb(255,139,69,19));}
                else if(V3.equals("2")){tB3.setBackgroundColor(Color.RED);}
                else if(V3.equals("3")){tB3.setBackgroundColor(Color.argb(255,255,69,0));}
                else if(V3.equals("4")){tB3.setBackgroundColor(Color.YELLOW);}
                else if(V3.equals("5")){tB3.setBackgroundColor(Color.argb(255,0,255,0));}
                else if(V3.equals("6")){tB3.setBackgroundColor(Color.BLUE);}
                else if(V3.equals("7")){tB3.setBackgroundColor(Color.argb(255,148,0,211));}
                else if(V3.equals("8")){tB3.setBackgroundColor(Color.GRAY);}
                else if(V3.equals("9")){tB3.setBackgroundColor(Color.WHITE);}

                if(V4.equals("0")){tB4.setBackgroundColor(Color.BLACK);}
                else if(V4.equals("1")){tB4.setBackgroundColor(Color.argb(255,139,69,19));}
                else if(V4.equals("2")){tB4.setBackgroundColor(Color.RED);}
                else if(V4.equals("3")){tB4.setBackgroundColor(Color.argb(255,255,69,0));}
                else if(V4.equals("4")){tB4.setBackgroundColor(Color.YELLOW);}
                else if(V4.equals("5")){tB4.setBackgroundColor(Color.argb(255,0,255,0));}
                else if(V4.equals("6")){tB4.setBackgroundColor(Color.BLUE);}
                else if(V4.equals("7")){tB4.setBackgroundColor(Color.argb(255,148,0,211));}
                else if(V4.equals("8")){tB4.setBackgroundColor(Color.GRAY);}
                else if(V4.equals("9")){tB4.setBackgroundColor(Color.WHITE);}
                else if(V4.equals("10")){tB4.setBackgroundColor(Color.argb(255,212,175,55));}
                else if(V4.equals("11")){tB4.setBackgroundColor(Color.argb(255,138,149,151));}

                if(V5.equals("0")){tB5.setBackgroundColor(Color.BLACK);}
                else if(V5.equals("1")){tB5.setBackgroundColor(Color.argb(255,139,69,19));}
                else if(V5.equals("2")){tB5.setBackgroundColor(Color.RED);}
                else if(V5.equals("3")){tB5.setBackgroundColor(Color.argb(255,255,69,0));}
                else if(V5.equals("4")){tB5.setBackgroundColor(Color.YELLOW);}
                else if(V5.equals("5")){tB5.setBackgroundColor(Color.argb(255,0,255,0));}
                else if(V5.equals("6")){tB5.setBackgroundColor(Color.BLUE);}
                else if(V5.equals("7")){tB5.setBackgroundColor(Color.argb(255,148,0,211));}
                else if(V5.equals("8")){tB5.setBackgroundColor(Color.GRAY);}
                else if(V5.equals("9")){tB5.setBackgroundColor(Color.WHITE);}
                else if(V5.equals("10")){tB5.setBackgroundColor(Color.argb(255,212,175,55));}
                else if(V5.equals("11")){tB5.setBackgroundColor(Color.argb(255,138,149,151));}

                if(V6.equals("0")){tB6.setBackgroundColor(Color.BLACK);}
                else if(V6.equals("1")){tB6.setBackgroundColor(Color.argb(255,139,69,19));}
                else if(V6.equals("2")){tB6.setBackgroundColor(Color.RED);}
                else if(V6.equals("3")){tB6.setBackgroundColor(Color.argb(255,255,69,0));}
                else if(V6.equals("4")){tB6.setBackgroundColor(Color.YELLOW);}
                else if(V6.equals("5")){tB6.setBackgroundColor(Color.argb(255,0,255,0));}
                else if(V6.equals("6")){tB6.setBackgroundColor(Color.BLUE);}
                else if(V6.equals("7")){tB6.setBackgroundColor(Color.argb(255,148,0,211));}
                else if(V6.equals("8")){tB6.setBackgroundColor(Color.GRAY);}
                else if(V6.equals("9")){tB6.setBackgroundColor(Color.WHITE);}
                else if(V6.equals("10")){tB6.setBackgroundColor(Color.argb(255,212,175,55));}
                else if(V6.equals("11")){tB6.setBackgroundColor(Color.argb(255,138,149,151));}





                //VT =V1+""+V2;
         if(Bandas==4){
             auxMult=Double.parseDouble(Spin3.getSelectedItem().toString());
             VT= V1+""+V2;
             aux1=Double.parseDouble(VT);
             if(auxMult<7) {
                 for (int i = 0; i < auxMult; i++) {
                     aux1 = aux1 * 10;
                 }
             }
             else if(auxMult>6){
                 Toast.makeText(getApplicationContext(),"Multiplicador no puede exceder valor a 6",Toast.LENGTH_SHORT).show();
                 Toast.makeText(getApplicationContext(),"Multiplicador truncado en 6 por defecto",Toast.LENGTH_SHORT).show();
                 for (int i = 0; i < 6; i++) {
                     aux1 = aux1 * 10;
                 }

             }
             else if(auxMult==10){
                 aux1 = aux1 / 10;

             }
             else if(auxMult==11){
                 aux1 = aux1 / 100;

             }


             tValor.setText(String.valueOf(aux1));

             if(V4.equals("10")){
                 tTol.setText("Tol: +-5%");
             }
             else if(V4.equals("11")){
                 tTol.setText("Tol: +-10%");
             }

         }
        else if(Bandas==5|Bandas==6){
             auxMult=Double.parseDouble(Spin4.getSelectedItem().toString());
             VT= V1+""+V2+""+V3;
             aux1=Double.parseDouble(VT);
             if(auxMult<5) {
                 for (int i = 0; i < auxMult; i++) {
                     aux1 = aux1 * 10;
                 }
             }
             else if(auxMult>4&&auxMult<10){
                 Toast.makeText(getApplicationContext(),"Multiplicador no puede exceder valor a 4",Toast.LENGTH_SHORT).show();
                 Toast.makeText(getApplicationContext(),"Multiplicador truncado en 4 por defecto",Toast.LENGTH_SHORT).show();
                 for (int i = 0; i < 4; i++) {
                     aux1 = aux1 * 10;
                 }

             }
             else if(auxMult==10){
                 aux1 = aux1 / 10;

             }
             else if(auxMult==11){
                 aux1 = aux1 / 100;

             }


             tValor.setText(String.valueOf(aux1));
             if(V5.equals("10")){
                 tTol.setText("Tol: +-5%");
             }
             else if(V5.equals("11")){
                 tTol.setText("Tol: +-10%");
             }

         }




            }
        });



    }

    public void OnRadioButtonClicked(View view){
        switch (view.getId()){
            case R.id.RB1:
                if (((RadioButton) view).isChecked()){
                    Bandas=4;
                    tB5.setVisibility(View.GONE);
                    tB6.setVisibility(View.GONE);
                    tTol.setText("");

                }
                break;
            case R.id.RB2:
                if (((RadioButton) view).isChecked()){
                    Bandas=5;
                    tB5.setVisibility(View.VISIBLE);
                    tB6.setVisibility(View.GONE);
                    tTol.setText("");
                }
                break;
            case R.id.RB3:
                if (((RadioButton) view).isChecked()){
                    Bandas=6;
                    tB5.setVisibility(View.VISIBLE);
                    tB6.setVisibility(View.VISIBLE);
                    tTol.setText("");
                }
                break;



        }
    }



}
