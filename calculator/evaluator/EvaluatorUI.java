package calculator.evaluator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;

import java.util.Stack;

public class EvaluatorUI extends JFrame implements ActionListener {

     private JTextField expressionTextField = new JTextField();
     private JPanel buttonPanel = new JPanel();
     private Stack<String> entryHistory = new Stack<>();

     // total of 20 buttons on the calculator,
     // numbered from left to right, top to bottom
     // bText[] array contains the text for corresponding buttons
     private static final String[] buttonText = {
         "7", "8", "9", "+",
         "4", "5", "6", "-",
         "1", "2", "3", "*",
         "(", "0", ")", "/",
         "C", "CE", "=", "^"
     };

     /**
      * C  is for clear, clears entire expression
      * CE is for clear expression, clears last entry up until the last operator.
      */

     public static void main(String argv[]) {
         new EvaluatorUI();
     }

     public EvaluatorUI() {
         setLayout(new BorderLayout());
         this.expressionTextField.setPreferredSize(new Dimension(600, 50));
         this.expressionTextField.setFont(new Font("Courier", Font.BOLD, 24));
         this.expressionTextField.setHorizontalAlignment(JTextField.CENTER);

         add(expressionTextField, BorderLayout.NORTH);
         expressionTextField.setEditable(false);

         add(buttonPanel, BorderLayout.CENTER);
         buttonPanel.setLayout(new GridLayout(5, 4));

         //create 20 buttons with corresponding text in bText[] array
         JButton jb;
         for (String s : EvaluatorUI.buttonText) {
             jb = new JButton(s);
             jb.setFont(new Font("Courier", Font.BOLD, 24));
             jb.addActionListener(this);
             this.buttonPanel.add(jb);
         }

         setTitle("Calculator");
         setSize(400, 400);
         setLocationByPlatform(true);
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         setVisible(true);
     }

     /**
      * This function is called anytime a button is pressed
      * on our Calculator GUI.
      * @param actionEventObject Event object generated when a
      *                          button is pressed.
      */
     public void actionPerformed(ActionEvent actionEventObject) {
         Evaluator evaluator = new Evaluator();
         String equation;
         String btnClicked = actionEventObject.getActionCommand();

         switch (btnClicked) {
             case "=":
                 equation = this.expressionTextField.getText();
                 try { //Handle valid evaluation expression and updates entry history
                     this.expressionTextField.setText(String.valueOf(evaluator.evaluateExpression(equation)));
                     entryHistory.clear();
                     entryHistory.push(String.valueOf(evaluator.evaluateExpression(equation))); //Push the result into the empty stack for next input
                 } catch (InvalidTokenException | EmptyStackException e) { //Error cases that resets the entryHistory for new input
                     this.expressionTextField.setText("Error");
                     entryHistory.clear();
                 }
                 break;
             case "C": //Default clear history
                 this.expressionTextField.setText("");
                 entryHistory.clear();
                 break;
             case "CE": //Clears the last inputted entry history
                 if (!entryHistory.isEmpty()) {
                     entryHistory.pop(); //Remove the last entry from history
                     StringBuilder updatedText = new StringBuilder();
                     for (String entry : entryHistory) {
                         updatedText.append(entry);
                     }
                     this.expressionTextField.setText(updatedText.toString());
                 }
                 break;
             default: //Operand and Operator button handler
                 if (this.expressionTextField.getText().equals("Error")) {
                     this.expressionTextField.setText("");
                     entryHistory.clear();
                 }
                 equation = this.expressionTextField.getText() + btnClicked;
                 this.expressionTextField.setText(equation);
                 entryHistory.push(btnClicked); //Tracks the entry history
                 break;
         }
     }
 }
