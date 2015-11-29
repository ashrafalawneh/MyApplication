package com.example.ashrafalawneh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int zc=1,c=0;
    TextView changetext ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    Button []B=new Button[9];



    public void onclick(View View)
    {
        c++;//
        Button B1=(Button)findViewById(View.getId());
        changetext=(TextView)findViewById(R.id.textView);

        if(zc==1){


            B1.setText("X");
            zc=2;
            changetext.setText("player #2 is playing ");

        }
        else{

            B1.setText("O");
            zc=1;
            changetext.setText("playere # 1 is playing ");

        }
     Winner();

    }
    String xx;
    public void Winner (){
        if(zc==1)
            xx="2'nd playeres ";
            else
            xx="1'st playeres ";
        changetext=(TextView)findViewById(R.id.textView);

     B[0]=(Button)findViewById(R.id.button);B[1]=(Button)findViewById(R.id.button2);B[2]=(Button)findViewById(R.id.button3);B[3]=(Button)findViewById(R.id.button4);B[4]=(Button)findViewById(R.id.button5);

        B[5]=(Button)findViewById(R.id.button6);B[6]=(Button)findViewById(R.id.button7);B[7]=(Button)findViewById(R.id.button8);B[8]=(Button)findViewById(R.id.button9);

        if(B[0].getText()==B[1].getText()&&B[1].getText()==B[2].getText()&&B[0].getText()!=" ");{    changetext.setText(xx+"is winner ");     }
        if(B[3].getText()==B[4].getText()&&B[4].getText()==B[5].getText()&&B[3].getText()!=" ");{    changetext.setText(xx+"is winner ");     }
        if(B[6].getText()==B[7].getText()&&B[7].getText()==B[8].getText()&&B[6].getText()!=" ");{    changetext.setText(xx+"is winner ");     }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(B[0].getText()==B[3].getText()&&B[3].getText()==B[6].getText()&&B[0].getText()!=" ");{    changetext.setText(xx+"is winner ");     }
        if(B[1].getText()==B[4].getText()&&B[4].getText()==B[7].getText()&&B[1].getText()!=" ");{    changetext.setText(xx+"is winner ");    }
        if(B[2].getText()==B[5].getText()&&B[5].getText()==B[8].getText()&&B[2].getText()!=" ");{    changetext.setText(xx+"is winner ");    }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(B[0].getText()==B[4].getText()&&B[4].getText()==B[8].getText()&&B[0].getText()!=" ");{    changetext.setText(xx+"is winner ");     }
        if(B[2].getText()==B[4].getText()&&B[4].getText()==B[6].getText()&&B[2].getText()!=" ");{    changetext.setText(xx+"is winner ");     }



        }


    }

