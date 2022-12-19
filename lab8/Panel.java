import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel {
    JTextField txt1 = null;
    Double res = Double.valueOf(0);
    Double res1 = Double.valueOf(0);
    String op = "";

    public Panel() {
        try {
            setLayout(null);

            final TextField txt1 = new TextField();
            txt1.setBounds(10, 10, 240, 25);

            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 60, 70);

            JButton b8 = new JButton("8");
            b8.setBounds(70, 40, 60, 70);

            JButton b9 = new JButton("9");
            b9.setBounds(130, 40, 60, 70);

            JButton b4 = new JButton("4");
            b4.setBounds(10, 110, 60, 70);

            JButton b5 = new JButton("5");
            b5.setBounds(70, 110, 60, 70);

            JButton b6 = new JButton("6");
            b6.setBounds(130, 110, 60, 70);

            JButton b1 = new JButton("1");
            b1.setBounds(10, 180, 60, 70);

            JButton b2 = new JButton("2");
            b2.setBounds(70, 180, 60, 70);

            JButton b3 = new JButton("3");
            b3.setBounds(130, 180, 60, 70);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 250, 60, 70);

            JButton bPoint = new JButton(".");
            bPoint.setBounds(70, 250 , 60, 70);

            JButton bRes = new JButton("=");
            bRes.setBounds(130, 250, 60, 70);
            Font bigFont = new Font("serif", Font.ITALIC, 20);
            bRes.setFont(bigFont);

            JButton bPlus = new JButton("+");
            bPlus.setBounds(190, 40, 60, 70);
            Font bigFontPlus = new Font("serif", Font.BOLD, 20);
            bPlus.setFont(bigFontPlus);

            JButton bMinus = new JButton("-");
            bMinus.setBounds(190, 110, 60, 70);
            Font bigFontMinus = new Font("serif", Font.BOLD, 20);
            bMinus.setFont(bigFontMinus);

            JButton bMulti = new JButton("*");
            bMulti.setBounds(190, 180, 60, 70);
            Font bigFontMulti = new Font("serif", Font.BOLD, 20);
            bMulti.setFont(bigFontMulti);

            JButton bDivision = new JButton("/");
            bDivision.setBounds(190, 250, 60, 70);
            Font bigFontDivision = new Font("serif", Font.BOLD, 20);
            bDivision.setFont(bigFontDivision);

            JButton bClear = new JButton("CLEAR");
            bClear.setBounds(10, 320, 120,70);

            JButton bDelete = new JButton("DELETE");
            bDelete.setBounds(130, 320, 120,70);

            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bPoint);
            add(bRes);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);
            add(bClear);
            add(bDelete);

            b0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 0);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 2);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 3);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 4);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 5);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 6);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 7);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 8);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 9);
                    if (res == 0) {
                        res = Double.valueOf(txt1.getText());
                    }
                    else {
                        res1 = Double.valueOf(txt1.getText());
                    }
                }
            });

            bPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "+";
                }
            });

            bMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "-";
                }
            });

            bMulti.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "*";
                }
            });

            bDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Double.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "/";
                }
            });

            bRes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    double num = Double.valueOf(res);
                    double num1 = Double.valueOf(res1);
                    String strOp = op;

                    MethodCalc mc = new MethodCalc();
                    String strRes = String.valueOf(mc.methods(num, strOp, num1));

                    txt1.setText(strRes);
                }
            });

            bPoint.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(txt1.getText().contains(".")){}

                    else {
                        txt1.setText(txt1.getText() + ".");
                    }
                }
            });
            bClear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt1.setText("");
                }
            });

            bDelete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String str = txt1.getText();
                    str = str.substring(0, str.length() - 1);
                    txt1.setText(str);
                }
            });
        }

        catch (ArithmeticException exception)  {}
    }
}