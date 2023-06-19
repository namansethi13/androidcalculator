package com.namansethi13.calculator;


import androidx.appcompat.app.AppCompatActivity;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView btn_one , btn_two,btn_three,btn_four,btn_five,btn_six,btn_seven,btn_eight,btn_nine,btn_zero;
    TextView btn_dot,btn_equals,btn_mod,btn_AC,btn_back,btn_divide,btn_multiply,btn_minus,btn_plus;
    TextView inputText;
    boolean operator = true;
    public Object calculate(String expression) {
        try {


        Context context = Context.enter(); //
        context.setOptimizationLevel(-1); // this is required[2]
        Scriptable scope = context.initStandardObjects();
        return context.evaluateString(scope, expression, "<cmd>", 1, null);

        }
    catch (Exception e){
        return "";
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_four = findViewById(R.id.btn_four);
        btn_five = findViewById(R.id.btn_five);
        btn_six = findViewById(R.id.btn_six);
        btn_seven = findViewById(R.id.btn_seven);
        btn_eight = findViewById(R.id.btn_eight);
        btn_nine = findViewById(R.id.btn_nine);
        btn_zero = findViewById(R.id.btn_zero);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiply = findViewById(R.id.btn_multipy);
        btn_divide = findViewById(R.id.btn_divide);
        btn_mod = findViewById(R.id.btn_mod);
        btn_dot = findViewById(R.id.btn_dot);
        btn_back = findViewById(R.id.btn_back);
        btn_AC = findViewById(R.id.btn_AC);
        btn_equals = findViewById(R.id.btn_equals);
        inputText = findViewById(R.id.inputText);




        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    operator = false;
                    String Data = inputText.getText().toString();
                    inputText.setText(Data + "0");
            }
        });
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    operator = false;
                    String Data = inputText.getText().toString();
                    inputText.setText(Data + "1");
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    operator = false;
                    String Data = inputText.getText().toString();
                inputText.setText(Data + "2");

            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    operator = false;
                    String Data = inputText.getText().toString();
                    inputText.setText(Data + "3");
            }
        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    operator = false;
                    String Data = inputText.getText().toString();
                    inputText.setText(Data + "4");
            }
        });btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    operator = false;
                    String Data = inputText.getText().toString();
                    inputText.setText(Data + "5");
            }
        });btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    operator = false;
                    String Data = inputText.getText().toString();
                    inputText.setText(Data + "6");
            }
        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = false;
                String Data = inputText.getText().toString();
                inputText.setText(Data+"7");}
        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = false;
                String Data = inputText.getText().toString();
                inputText.setText(Data+"8");}
        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = false;
                String Data = inputText.getText().toString();
                inputText.setText(Data+"9");}
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operator) {
                operator = true;
                String Data = inputText.getText().toString();
                inputText.setText(Data+"+");}
            }
        });btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operator) {
                operator = true;
                String Data = inputText.getText().toString();
                inputText.setText(Data+"*");}
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operator) {
                operator = true;
                String Data = inputText.getText().toString();
                inputText.setText(Data+"/");}
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = true;
                String Data = inputText.getText().toString();
                inputText.setText(Data+"-");
            }
        });
        btn_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!operator) {
                operator = true;
                String Data = inputText.getText().toString();
                inputText.setText(Data+"%");}
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = false;
                String Data = inputText.getText().toString();
                inputText.setText(Data+".");}
        });
        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = false;
                String Data = inputText.getText().toString();
                inputText.setText("");
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Data = inputText.getText().toString();
                StringBuffer sb= new StringBuffer(Data);
                try {
                    int len = Data.length()-1;
                    inputText.setText(sb.deleteCharAt(len));

                }
                catch (Exception e){

                }
                finally {
                    try {


                    if(Character.isDigit(inputText.getText().toString().charAt(inputText.length()-1))){
                        operator = false;
                    }
                    else{
                        operator = true;
                    }
                }
                    catch (Exception e){

                    }
                }

            }
        });

        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().toString() != "") {


                    Object ans = calculate(inputText.getText().toString());
                    int len = ans.toString().length();

                        try {
                            if (ans.toString().charAt(len - 1) == '0') {
                                String Data = ans.toString();
                                StringBuffer sb = new StringBuffer(Data);
                                sb.deleteCharAt(len - 1);
                                inputText.setText(sb.deleteCharAt(len - 2));
                            } else {
                                inputText.setText(ans.toString());
                            }
                        }
                        catch (Exception e){
                            inputText.setText("NAN");
                    }

                }
            }
        });




    }
}
