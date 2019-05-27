package com.yy.calculator;

import android.net.wifi.aware.SubscribeConfig;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.cert.TrustAnchor;

public class MainActivity extends AppCompatActivity {

    // buttons of the calculator
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonC, buttonEqual;

    // the result screen
    TextView screen;

    double mValueOne, mValueTwo;

    boolean Addition, Subtraction, Multiplication, Division,
            OperationInitiated, OperationComplete;

    // the button which user last clicked, # for numbers, + - * / = for operators
    char LastClicked = 'x';

    String result = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.zero);
        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.seven);
        button8 = (Button) findViewById(R.id.eight);
        button9 = (Button) findViewById(R.id.nine);
        
        buttonAdd = (Button) findViewById(R.id.plus);
        buttonSub = (Button) findViewById(R.id.minus);
        buttonMul = (Button) findViewById(R.id.star);
        buttonDiv = (Button) findViewById(R.id.division);
        buttonC = (Button) findViewById(R.id.ac);
        buttonEqual = (Button) findViewById(R.id.equals);
        screen = (TextView) findViewById(R.id.screen);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(OperationComplete)
                {
                    screen.setText(button1.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button1.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "1" : screen.getText() + "1");

                LastClicked = '#';
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText(button2.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button2.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "2" : screen.getText() + "2");

                LastClicked = '#';
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText(button3.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button3.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "3" : screen.getText() + "3");

                LastClicked = '#';
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText(button4.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button4.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "4" : screen.getText() + "4");

                LastClicked = '#';
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText(button5.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button5.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "5" : screen.getText() + "5");

                LastClicked = '#';
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText(button6.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button6.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "6" : screen.getText() + "6");

                LastClicked = '#';
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText(button7.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button7.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "7" : screen.getText() + "7");

                LastClicked = '#';
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText(button8.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button8.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "8" : screen.getText() + "8");

                LastClicked = '#';
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText(button9.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button9.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "9" : screen.getText() + "9");

                LastClicked = '#';
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText(button0.getText());
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText(button0.getText());
                    OperationInitiated = false;
                }
                else
                    screen.setText(screen.getText().equals("0") ? "0" : screen.getText() + "0");

                LastClicked = '#';
            }
        });

        // addition
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if a operator button is already clicked, change the lastclicked and return
                if(LastClicked == '+' || LastClicked == '-' || LastClicked == '*' || LastClicked == '/')
                {
                    LastClicked = '+';
                    SetOperation('+');
                    return;
                }

                // if an operation is already in queue, run it first
                if(Addition|| Multiplication || Division || Subtraction )
                {
                    mValueTwo = Double.parseDouble(screen.getText() + "");
                    mValueOne = Calculate();
                    screen.setText(mValueOne + "");

                }
                else
                {
                    mValueOne =  Double.parseDouble(screen.getText() + "");
                }
                SetOperation('+');
                OperationInitiated = true;

                LastClicked = '+';
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if a operator button is already clicked, change the lastclicked and return
                if(LastClicked == '+' || LastClicked == '-' || LastClicked == '*' || LastClicked == '/')
                {
                    LastClicked = '-';
                    SetOperation('-');
                    return;
                }

                if(Addition|| Multiplication || Division || Subtraction )
                {
                    mValueTwo = Double.parseDouble(screen.getText() + "");
                    mValueOne = Calculate();
                    screen.setText(mValueOne + "");

                }
                else {
                    mValueOne = Double.parseDouble(screen.getText() + "");
                }

                SetOperation('-');
                OperationInitiated = true;

                LastClicked = '-';

            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if a operator button is already clicked, change the lastclicked and return
                if(LastClicked == '+' || LastClicked == '-' || LastClicked == '*' || LastClicked == '/')
                {
                    LastClicked = '*';
                    SetOperation('*');
                    return;
                }

                if(Addition || Subtraction || Division || Multiplication)
                {
                    mValueTwo = Double.parseDouble(screen.getText() + "");
                    mValueOne = Calculate();
                    screen.setText(mValueOne + "");

                }
                else
                {
                    mValueOne = Double.parseDouble(screen.getText() + "");
                }

                SetOperation('*');
                OperationInitiated = true;

                LastClicked = '*';
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if a operator button is already clicked, change the lastclicked and return
                if(LastClicked == '+' || LastClicked == '-' || LastClicked == '*' || LastClicked == '/')
                {
                    LastClicked = '/';
                    SetOperation('/');
                    return;
                }

                if (Addition || Subtraction || Division || Multiplication)
                {
                    mValueTwo = Double.parseDouble(screen.getText() + "");
                    mValueOne = Calculate();
                    screen.setText(mValueOne + "");

                } else {
                    mValueOne = Double.parseDouble(screen.getText() + "");
                }

                SetOperation('/');
                OperationInitiated = true;

                LastClicked = '/';
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(LastClicked == '=')
                {
                    return;
                }

                mValueOne = Calculate();
                screen.setText(mValueOne + "");
                ResetVariables();
                OperationComplete = true;

                LastClicked = '=';
            }
        });



        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("0");
                mValueOne = 0.0;
                ResetVariables();

            }
        });

    }

    public Double Calculate ()
    {
        double result;

        mValueTwo = Double.parseDouble(screen.getText() + "");

        OperationComplete = true;

        if(Addition)
        {
            //Addition = false;
            return mValueOne + mValueTwo;
        }
        else if (Subtraction)
        {
            return mValueOne - mValueTwo;
        }
        else if(Multiplication)
        {
            return mValueOne * mValueTwo;
        }
        else if(Division)
        {
            return mValueOne / mValueTwo;
        }

        return 0.0;
    }

    public void SetOperation(char Operation)
    {
        Addition = false;
        Subtraction = false;
        Division = false;
        Multiplication = false;

        switch(Operation)
        {
            case '+':
                Addition = true;
                break;
            case '-':
                Subtraction = true;
                break;
            case '/':
                Division = true;
                break;
            case '*':
                Multiplication = true;
                break;
        }
    }

    public void ResetVariables()
    {
        mValueTwo = 0.0;
        Multiplication = false;
        Division = false;
        Subtraction = false;
        Addition = false;
        OperationInitiated = false;
        OperationComplete = false;
        LastClicked = 'x';
    }
}
