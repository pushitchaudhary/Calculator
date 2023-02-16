import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JTextField textDisplay;
    private JButton minus;
    private JButton AC;
    private JButton Clear;
    private JButton btn1;
    private JButton btn2;
    private JButton multiple;
    private JButton add;
    private JButton percentage;
    private JButton division;
    private JButton equal;
    private JButton dot;
    private JButton btnZero;
    private JButton btnDualZero;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn3;
    private JPanel main;

    private static String action = "";
    private static float num1 = 0;
    private static float num2 = 0;
    private static float  result ;
    private static double resultf ;

    private static double num ;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Calculator() {
    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String num1 = textDisplay.getText() + btn1.getText();
            textDisplay.setText(num1);
        }
    });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num2 = textDisplay.getText() + btn2.getText();
                textDisplay.setText(num2);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num3 = textDisplay.getText() + btn3.getText();
                textDisplay.setText(num3);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num3 = textDisplay.getText() + btn4.getText();
                textDisplay.setText(num3);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num5 = textDisplay.getText() + btn5.getText();
                textDisplay.setText(num5);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num6 = textDisplay.getText() + btn6.getText();
                textDisplay.setText(num6);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num7 = textDisplay.getText() + btn7.getText();
                textDisplay.setText(num7);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num8 = textDisplay.getText() + btn8.getText();
                textDisplay.setText(num8);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num9 = textDisplay.getText() + btn9.getText();
                textDisplay.setText(num9);
            }
        });
        btnDualZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num00 = textDisplay.getText() + btnDualZero.getText();
                textDisplay.setText(num00);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num0 = textDisplay.getText() + btnZero.getText();
                 textDisplay.setText(num0);
            }
        });
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numdot = textDisplay.getText() + dot.getText();
                textDisplay.setText(numdot);
            }
        });
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num1 = Integer.valueOf(textDisplay.getText());
                action = "+";
                textDisplay.setText("");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = "-";
                num1 = Integer.valueOf(textDisplay.getText());
                textDisplay.setText("");
            }
        });
        percentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.valueOf(textDisplay.getText());
                resultf = num/100;
                textDisplay.setText(String.valueOf(resultf));
            }
        });
        multiple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Integer.valueOf(textDisplay.getText());
                action = "*";
                textDisplay.setText("");
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 =Integer.valueOf(textDisplay.getText());
                action = "/";
                textDisplay.setText("");
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Integer.valueOf(textDisplay.getText());

                if(action== "+"){
                    result = num1 + num2;
                    textDisplay.setText(String.valueOf(result));
                } else if (action == "-") {
                    result = num1 - num2;
                    textDisplay.setText(String.valueOf(result));
                }else if(action =="*"){
                    result = num1 * num2;
                    textDisplay.setText(String.valueOf(result));
                } else if (action =="/") {
//                    num = Double.valueOf(num2);
                    resultf = Double.valueOf(num1/num2);
                    textDisplay.setText(String.valueOf(resultf));
                }

            }

        });


    }
}
