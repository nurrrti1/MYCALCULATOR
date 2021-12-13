import javax.swing.*;

import static java.lang.Math.sqrt;


public class JavaCalculator<event> {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnPoint;
    private JButton btnClear;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnFour;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFive;
    private JButton btnThree;
    private JButton btnEight;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnEquals;
    private JButton btnX2;
    private JButton btnKoren;
    private JButton btnSin;


    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }


    public JavaCalculator() {
        btnOne.addActionListener((event) ->
        {
            String btnOneText = textDisplay.getText() + btnOne.getText();
            textDisplay.setText(btnOneText);

        });
        btnTwo.addActionListener((event) -> {

            String btnTwoText = textDisplay.getText() + btnTwo.getText();
            textDisplay.setText(btnTwoText);

        });
        btnThree.addActionListener((event) -> {
            String btnThreeText = textDisplay.getText() + btnThree.getText();
            textDisplay.setText(btnThreeText);

        });
        btnFour.addActionListener((event) -> {
            String btnFourText = textDisplay.getText() + btnFour.getText();
            textDisplay.setText(btnFourText);


        });
        btnFive.addActionListener((event) -> {
            String btnFiveText = textDisplay.getText() + btnFive.getText();
            textDisplay.setText(btnFiveText);


        });
        btnSix.addActionListener((event) -> {
            String btnSixText = textDisplay.getText() + btnSix.getText();
            textDisplay.setText(btnSixText);


        });
        btnSeven.addActionListener((event) -> {
            String btnSevenText = textDisplay.getText() + btnSeven.getText();
            textDisplay.setText(btnSevenText);


        });
        btnEight.addActionListener((event) -> {
            String btnEightText = textDisplay.getText() + btnEight.getText();
            textDisplay.setText(btnEightText);


        });
        btnNine.addActionListener((event) -> {
            String btnNineText = textDisplay.getText() + btnNine.getText();
            textDisplay.setText(btnNineText);


        });
        btnZero.addActionListener((event) -> {
            String btnZeroText = textDisplay.getText() + btnZero.getText();
            textDisplay.setText(btnZeroText);


        });
        btnPlus.addActionListener((event) -> {
            String button_text = btnPlus.getText();
            getOperator(button_text);

        });

        btnClear.addActionListener((event) -> {
            total2 = 0;
            textDisplay.setText("");


        });
        btnPoint.addActionListener((event) -> {
            if (textDisplay.getText().equals("")) {
                textDisplay.setText("0.");
            } else if (textDisplay.getText().contains(".")) {
                btnPoint.setEnabled((false));
            } else {
                String btnPointText = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(btnPointText);
            }
            btnPoint.setEnabled(true);
        });
        btnMinus.addActionListener((event) -> {
            String button_text = btnMinus.getText();
            getOperator(button_text);

        });
        btnDivide.addActionListener((event) -> {
            String button_text = btnDivide.getText();
            getOperator(button_text);

        });
        btnMultiply.addActionListener((event) -> {
            String button_text = btnMultiply.getText();
            getOperator(button_text);

        });

        btnX2.addActionListener((event) -> {
            String button_text = btnX2.getText();
            getOperator(button_text);

        });
        btnKoren.addActionListener((event) -> {
            String button_text = btnKoren.getText();
            getOperator(button_text);
        });
        btnEquals.addActionListener((event) -> {
            switch (math_operator) {
                case '+' -> total2 = total1 + Double.parseDouble(textDisplay.getText());
                case '-' -> total2 = total1 - Double.parseDouble(textDisplay.getText());
                case '/' -> total2 = total1 / Double.parseDouble(textDisplay.getText());
                case '*' -> total2 = total1 * Double.parseDouble(textDisplay.getText());
                case '^' -> total2 = total1 * total1;
                case '√' -> total2 = sqrt(total1);
                case 's' -> total2 = Math.sin( total1);
            }
            textDisplay.setText(Double.toString(total2));
            total1 = 0;
        });
    }

    public static void main(String[]args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }}


