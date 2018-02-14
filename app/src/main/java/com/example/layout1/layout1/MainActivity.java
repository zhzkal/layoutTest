package com.example.layout1.layout1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button btn_add;
    Button btn_ma;
    Button btn_gop;
    Button btn_nanugi;
    Button btn_result;
    Button btn_factorial;
    Button btn_square;
    Button btn_dot;
    Button btn_del;
    Button btn_allclear;
    Button btn_leftbracket;
    Button btn_leftbracket2;
    Button btn_rightbracket;
    Button btn_rightbracket2;
    TextView tv_memo;
    TextView tv_result;
    TextView tv_temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator2);
        ButtonHandler bh = new ButtonHandler();
        b1 = (Button) findViewById(R.id.btn_1);
        b2 = (Button) findViewById(R.id.btn_2);
        b3 = (Button) findViewById(R.id.btn_3);
        b4 = (Button) findViewById(R.id.btn_4);
        b5 = (Button) findViewById(R.id.btn_5);
        b6 = (Button) findViewById(R.id.btn_6);
        b7 = (Button) findViewById(R.id.btn_7);
        b8 = (Button) findViewById(R.id.btn_8);
        b9 = (Button) findViewById(R.id.btn_9);
        b0 = (Button) findViewById(R.id.btn_0);
        btn_leftbracket = (Button) findViewById(R.id.btn_leftbracket);
        btn_leftbracket2 = (Button) findViewById(R.id.btn_leftbracket2);
        btn_rightbracket = (Button) findViewById(R.id.btn_rightbracket);
        btn_rightbracket2 = (Button) findViewById(R.id.btn_rightbracket2);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_ma = (Button) findViewById(R.id.btn_ma);
        btn_gop = (Button) findViewById(R.id.btn_gop);
        btn_nanugi = (Button) findViewById(R.id.btn_nanugi);
        btn_result = (Button) findViewById(R.id.btn_result);
        btn_result = (Button) findViewById(R.id.btn_result);
        btn_dot = (Button) findViewById(R.id.btn_dot);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_allclear = (Button) findViewById(R.id.btn_allclear);
        btn_square = (Button) findViewById(R.id.btn_square);
        btn_factorial = (Button) findViewById(R.id.btn_factorial);
        tv_memo = (TextView) findViewById(R.id.tv_memo);
        tv_result = (TextView) findViewById(R.id.tv_result);

//노가다 안해도 되는 방법
       /* Button bts[] = new Button[3];
        int btid;
        for (int i=1;i<4;i++)
        {
            btid-=getResources().getIdentifier("bt"+1,"id","com.example.event2");

            bts[i-1]=(Button) findViewById(btid);
        }*/
        // 라고한다.
        b1.setOnClickListener(bh);
        b2.setOnClickListener(bh);
        b3.setOnClickListener(bh);
        b4.setOnClickListener(bh);
        b5.setOnClickListener(bh);
        b6.setOnClickListener(bh);
        b7.setOnClickListener(bh);
        b8.setOnClickListener(bh);
        b9.setOnClickListener(bh);
        b0.setOnClickListener(bh);
        btn_dot.setOnClickListener(bh);
        btn_add.setOnClickListener(bh);
        btn_ma.setOnClickListener(bh);
        btn_gop.setOnClickListener(bh);
        btn_nanugi.setOnClickListener(bh);
        btn_result.setOnClickListener(bh);
        btn_allclear.setOnClickListener(bh);
        btn_del.setOnClickListener(bh);
        btn_leftbracket.setOnClickListener(bh);
        btn_leftbracket2.setOnClickListener(bh);
        btn_rightbracket.setOnClickListener(bh);
        btn_rightbracket2.setOnClickListener(bh);
        btn_square.setOnClickListener(bh);
        btn_factorial.setOnClickListener(bh);
    }

    class ButtonHandler implements View.OnClickListener {
        Calc C = new Calc();
        String s = "";
        int result = 0;
        int temp = 0;
        String stemp = "";

        @Override
        public void onClick(View view) {
            TextView tv_memo = (TextView) findViewById(R.id.tv_memo);
            TextView tv_result = (TextView) findViewById(R.id.tv_result);
            TextView tv_temp = (TextView) findViewById(R.id.tv_temp);
            if (b0 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "0";
                tv_memo.setText(s);
            } else if (b1 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "1";
                tv_memo.setText(s);
            } else if (b2 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "2";
                tv_memo.setText(s);
            } else if (b3 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "3";
                tv_memo.setText(s);
            } else if (b4 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "4";
                tv_memo.setText(s);
            } else if (b5 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "5";
                tv_memo.setText(s);
            } else if (b6 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "6";
                tv_memo.setText(s);
            } else if (b7 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "7";
                tv_memo.setText(s);
            } else if (b8 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "8";
                tv_memo.setText(s);
            } else if (b9 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "9";
                tv_memo.setText(s);
            } else if (btn_dot == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + ".";
                tv_memo.setText(s);
            } else if (btn_leftbracket == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "(";
                tv_memo.setText(s);
            } else if (btn_leftbracket2 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "[";
                tv_memo.setText(s);
            } else if (btn_rightbracket == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + ")";
                tv_memo.setText(s);
            } else if (btn_rightbracket2 == view) {
                s = String.valueOf(tv_memo.getText());
                s = s + "]";
                tv_memo.setText(s);
            } else if (btn_add == view) {

                s = String.valueOf(tv_memo.getText());
                if (s == "") {
                    stemp = String.valueOf(tv_temp.getText());
                    for (int i = 0; i < stemp.length(); i++) {
                        if (stemp.substring(i, i + 1).equals("=")) {
                            s = stemp.substring(i + 1, stemp.length());
                        }
                    }
                }

                s = s + "+";
                tv_memo.setText(s);
            } else if (btn_ma == view) {
                s = String.valueOf(tv_memo.getText());
                if (s == "") {
                    stemp = String.valueOf(tv_temp.getText());
                    for (int i = 0; i < stemp.length(); i++) {
                        if (stemp.substring(i, i + 1).equals("=")) {
                            s = stemp.substring(i + 1, stemp.length());
                        }
                    }
                }
                s = s + "-";
                tv_memo.setText(s);
            } else if (btn_nanugi == view) {
                s = String.valueOf(tv_memo.getText());
                if (s == "") {
                    stemp = String.valueOf(tv_temp.getText());
                    for (int i = 0; i < stemp.length(); i++) {
                        if (stemp.substring(i, i + 1).equals("=")) {
                            s = stemp.substring(i + 1, stemp.length());
                        }
                    }
                }
                s = s + "÷";
                tv_memo.setText(s);
            } else if (btn_gop == view) {
                s = String.valueOf(tv_memo.getText());
                if (s == "") {
                    stemp = String.valueOf(tv_temp.getText());
                    for (int i = 0; i < stemp.length(); i++) {
                        if (stemp.substring(i, i + 1).equals("=")) {
                            s = stemp.substring(i + 1, stemp.length());
                        }
                    }
                }
                s = s + "×";
                tv_memo.setText(s);

            } else if (btn_result == view) {
                s = String.valueOf(tv_memo.getText());
                stemp = s;

                Log.d("잘됨?", String.valueOf(C.bracketsBalance(s)));
                if (C.bracketsBalance(s) == false) {
                    Toast.makeText(MainActivity.this, "괄호가 이상합니다.", Toast.LENGTH_SHORT).show();
                } else {
                    s = C.postfix(s);
                    s = Double.toString(C.result(s));
                    tv_memo.setText("");
                    tv_result.setText(s);// 결과값
                    stemp = stemp + "=" + s;
                    tv_temp.setText(stemp);
                }//괄호 맞는지 알려줌


            } else if (btn_allclear == view) {
                s = String.valueOf(tv_memo.getText());
                s = "";
                tv_memo.setText(s);
            } else if (btn_del == view) {
                s = String.valueOf(tv_memo.getText());

                s = s.substring(0, s.length() - 1);
                tv_memo.setText(s);
            } else if (btn_factorial == view) {
                s = String.valueOf(tv_memo.getText());
                if (s == "") {
                    stemp = String.valueOf(tv_temp.getText());
                    for (int i = 0; i < stemp.length(); i++) {
                        if (stemp.substring(i, i + 1).equals("=")) {
                            s = stemp.substring(i + 1, stemp.length());
                        }
                    }
                }
                s = s + "!";
                tv_memo.setText(s);
            } else if (btn_square == view) {
                s = String.valueOf(tv_memo.getText());
                if (s == "") {
                    stemp = String.valueOf(tv_temp.getText());
                    for (int i = 0; i < stemp.length(); i++) {
                        if (stemp.substring(i, i + 1).equals("=")) {
                            s = stemp.substring(i + 1, stemp.length());
                        }
                    }
                }
                s = s + "^";
                tv_memo.setText(s);
            }

        }

    }

    class Calc {
        // -------------------------------------------------------------------
        // 스택을 이용하여 중위표현을 후위표현으로 바꾸는 메소드
        // -------------------------------------------------------------------
        String postfix(String infixExp) {
            Double value;
            // 숫자의 끝임을 알려주는 flag
            // 소수점 수식도 처리하기 위해서...
            boolean endOfNumber = false;
            String postfixExp = new String();
            Stack stk = new Stack();

            for (int i = 0; i < infixExp.length(); i++) {
                switch (infixExp.charAt(i)) {
                    // 피연산자는 그대로 출력한다.
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '.':
                        postfixExp = postfixExp.concat(infixExp.charAt(i) + "");
                        endOfNumber = true;
                        break;
                    // 왼쪽괄호인 경우에는 스택에 push 한다.
                    case '(':
                        if (endOfNumber == true) {
                            postfixExp = postfixExp.concat(" ");
                            endOfNumber = false;
                        }

                        stk.push(new Character('('));
                        break;
                    // 우측괄호인 경우 좌괄호가 나올때까지 pop하여 출력하고
                    // 좌괄호는 pop하여 버린다.
                    case ')':
                        try {
                            if (endOfNumber == true) {
                                postfixExp = postfixExp.concat(" ");
                                endOfNumber = false;
                            }
                            while (((Character) stk.peek()).charValue() != '(')
                                postfixExp = postfixExp.concat(((Character) stk.pop()).toString());
                            Object openParen = stk.pop();
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // 왼쪽괄호인 경우에는 스택에 push 한다.
                    case '[':
                        if (endOfNumber == true) {
                            postfixExp = postfixExp.concat(" ");
                            endOfNumber = false;
                        }

                        stk.push(new Character('['));
                        break;
                    // 우측괄호인 경우 좌괄호가 나올때까지 pop하여 출력하고
                    // 좌괄호는 pop하여 버린다.
                    case ']':
                        try {
                            if (endOfNumber == true) {
                                postfixExp = postfixExp.concat(" ");
                                endOfNumber = false;
                            }
                            while (((Character) stk.peek()).charValue() != '[')
                                postfixExp = postfixExp.concat(((Character) stk.pop()).toString());
                            Object openParen = stk.pop();
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    case '+':
                    case '-':
                    case '×':
                    case '÷':
                    case '!':
                    case '^':
                        if (endOfNumber == true) {
                            postfixExp = postfixExp.concat(" ");
                            endOfNumber = false;
                        }
                        // 연산자를 만나면 스택에서 그 연산자보다 낮은 우선순위의 연산자를 만날 때까지
                        // 팝하여 출력한 뒤에 자신을 푸시한다.(우선순위가 같거나 높은것은 팝한다.)
                        while (!stk.isEmpty() && ((Character) stk.peek()).charValue() != '('
                                && getPrec(infixExp.charAt(i)) <= getPrec(((Character) stk.peek()).charValue())) {
                            postfixExp = postfixExp.concat(((Character) stk.pop()).toString());
                        }
                        stk.push(new Character(infixExp.charAt(i)));
                        break;
                }
            }

            if (endOfNumber == true) {
                postfixExp = postfixExp.concat(" ");
                endOfNumber = false;
            }

            // 모든 작업이 끝나면 스택에 있는 연산자들을 모두 팝하여 출력한다.
            while (!stk.isEmpty()) {
                postfixExp = postfixExp.concat(((Character) stk.pop()).toString());
            }

            System.out.println(postfixExp);

            return postfixExp;
        }

        // ----------------------------------------------------------------------
        // 후위표기 수식을 스택을 이용한 연산을 수행하는 메소드
        // ----------------------------------------------------------------------
        Double result(String postfixExp) {
            //System.out.println(postfixExp);
            Double value, buffer;
            String temp = new String();
            Stack stk = new Stack();

            for (int i = 0; i < postfixExp.length(); i++) {
                switch (postfixExp.charAt(i)) {

                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '.':
                        // 여기까지는 아직 공백을 만나지 않았으므로 수식의 끝이 아니다.
                        temp = temp.concat(postfixExp.charAt(i) + "");
                        break;
                    case ' ':
                        // 공백을 만나서야 비로서 수식을 스택에 넣는다.
                        // 공백을 만나기전에 수식이 여러개 있었다면 temp에 붙어서 저장되어 있다.
                        stk.push(new Double(temp));
                        temp = new String();
                        break;
                    case '+':
                        value = new Double(((Double) stk.pop()).doubleValue() + ((Double) stk.pop()).doubleValue());
                        stk.push(value);
                        break;
                    case '-':
                        buffer = new Double(((Double) stk.pop()).doubleValue());
                        value = new Double(((Double) stk.pop()).doubleValue() - buffer.doubleValue());
                        stk.push(value);
                        break;
                    case '×':
                        value = new Double(((Double) stk.pop()).doubleValue() * ((Double) stk.pop()).doubleValue());
                        stk.push(value);
                        break;
                    case '÷':
                        buffer = new Double(((Double) stk.pop()).doubleValue());
                        value = new Double(((Double) stk.pop()).doubleValue() / buffer.doubleValue());
                        stk.push(value);
                        break;
                    case '!':
                        value = new Double(factorial(((Double) stk.pop()).doubleValue()));
                        stk.push(value);
                        break;
                    case '^':
                        buffer = new Double(((Double) stk.pop()).doubleValue());
                        value = new Double(square(((Double) stk.pop()).doubleValue(), buffer.doubleValue()));
                        stk.push(value);
                        break;
                }
            }
            return (Double) stk.peek();
        }

        // ------------------------------------------
        // 연산자의 우선순위를 Return
        // ------------------------------------------
        int getPrec(char op) {
            int prec = 0;
            switch (op) {
                case '+':
                case '-':
                    prec = 1;
                    break;
                case '×':
                case '÷':
                    prec = 2;
                    break;
                case '^':
                case '!':
                    prec = 3;
                    break;
            }
            return prec;
        }

        // -----------------------------------------
        // 괄호의 정확성 검사
        // -----------------------------------------
        boolean bracketsBalance(String exp) {
            Stack stk = new Stack();
            for (int i = 0; i < exp.length(); i++) {
                // Scan across the expression
                char ch = exp.charAt(i);
                if (ch == '[' || ch == '(') {
                    stk.push(new Character(ch));
                } else if (ch == ']' || ch == ')') {
                    // empty means brackets unmatched
                    if (stk.isEmpty())
                        return false;
                    char charFromStack = ((Character) stk.pop()).charValue();
                    if (ch == ']' && charFromStack != '[' || (ch == ')' && charFromStack != '('))
                        return false;
                } // end if
            } // end for loop
            return stk.isEmpty(); // empty means matched, else unmatched
        }


        // -----------------------------------------
        // 팩토리얼 계산
        // -----------------------------------------
        double factorial(double val) {
            double a = 0;
            for (int i = 1; i <= val; i++) {

                if(i==1){
                    a=i;
                }else{
                    a=a*i;
                }
            }

            return a;
        }


        // -----------------------------------------
        // 제곱 계산
        // -----------------------------------------

        double square(double rval, double val) {
            double a = 0;

            for (int i = 0; i < val; i++) {
                if (i == 0) {
                    a = rval;
                } else {
                    a = a * rval;
                }

            }

            return a;
        }


    }

    class EmptyStackException extends RuntimeException {
        public EmptyStackException() {
            super("The stack is empty.");
        }

        public EmptyStackException(String message) {
            super(message);
        }
    }


}
