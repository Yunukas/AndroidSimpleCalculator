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
    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonDot, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonC, buttonEqual;

    // the result screen
    private TextView screen;

    private double mValueOne, mValueTwo;

    private boolean Addition, Subtraction, Multiplication, Division,
            OperationInitiated, OperationComplete;

    // the button which user last clicked, # for numbers, + - * / = for operators
    private char LastClicked = 'x';

    String result = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.zero);
        button1 = findViewById(R.id.one);
        button2 = findViewById(R.id.two);
        button3 = findViewById(R.id.three);
        button4 = findViewById(R.id.four);
        button5 = findViewById(R.id.five);
        button6 = findViewById(R.id.six);
        button7 = findViewById(R.id.seven);
        button8 = findViewById(R.id.eight);
        button9 = findViewById(R.id.nine);
        buttonDot = findViewById(R.id.dot);
        
        buttonAdd = findViewById(R.id.plus);
        buttonSub = findViewById(R.id.minus);
        buttonMul = findViewById(R.id.star);
        buttonDiv = findViewById(R.id.division);
        buttonC = findViewById(R.id.ac);
        buttonEqual = findViewById(R.id.equals);
        screen = findViewById(R.id.screen);


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

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(OperationComplete)
                {
                    screen.setText("0.");
                    OperationComplete = false;
                    OperationInitiated = false;

                }
                else if(OperationInitiated)
                {
                    screen.setText("0.");
                    OperationInitiated = false;
                }
                else
                {
                    if(screen.getText().toString().contains("."))
                        return;
                    else
                        screen.setText(screen.getText() + ".");
                }


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

    private Double Calculate ()
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

    private void SetOperation(char Operation)
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

    private void ResetVariables()
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
