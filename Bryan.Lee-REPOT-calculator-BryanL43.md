

# Grading Report for P1



## Student Name: 

Bryan.Lee


## Commit Count: 

14



## Git Diff Since Base Commit: 


<details>
    <summary>Git Diff</summary>

~~~bash
diff --git a/.idea/.gitignore b/.idea/.gitignore
new file mode 100644
index 0000000..13566b8
--- /dev/null
+++ b/.idea/.gitignore
@@ -0,0 +1,8 @@
+# Default ignored files
+/shelf/
+/workspace.xml
+# Editor-based HTTP Client requests
+/httpRequests/
+# Datasource local storage ignored files
+/dataSources/
+/dataSources.local.xml
diff --git a/.idea/libraries/junit_platform_console_standalone_1_9_3.xml b/.idea/libraries/junit_platform_console_standalone_1_9_3.xml
new file mode 100644
index 0000000..281cf42
--- /dev/null
+++ b/.idea/libraries/junit_platform_console_standalone_1_9_3.xml
@@ -0,0 +1,9 @@
+<component name="libraryTable">
+  <library name="junit-platform-console-standalone-1.9.3">
+    <CLASSES>
+      <root url="jar://$PROJECT_DIR$/lib/junit-platform-console-standalone-1.9.3.jar!/" />
+    </CLASSES>
+    <JAVADOC />
+    <SOURCES />
+  </library>
+</component>
\ No newline at end of file
diff --git a/.idea/misc.xml b/.idea/misc.xml
new file mode 100644
index 0000000..6f29fee
--- /dev/null
+++ b/.idea/misc.xml
@@ -0,0 +1,6 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="ProjectRootManager" version="2" languageLevel="JDK_21" default="true" project-jdk-name="21" project-jdk-type="JavaSDK">
+    <output url="file://$PROJECT_DIR$/out" />
+  </component>
+</project>
\ No newline at end of file
diff --git a/.idea/modules.xml b/.idea/modules.xml
new file mode 100644
index 0000000..3cdb2fc
--- /dev/null
+++ b/.idea/modules.xml
@@ -0,0 +1,8 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="ProjectModuleManager">
+    <modules>
+      <module fileurl="file://$PROJECT_DIR$/calculator-BryanL43.iml" filepath="$PROJECT_DIR$/calculator-BryanL43.iml" />
+    </modules>
+  </component>
+</project>
\ No newline at end of file
diff --git a/.idea/uiDesigner.xml b/.idea/uiDesigner.xml
new file mode 100644
index 0000000..2b63946
--- /dev/null
+++ b/.idea/uiDesigner.xml
@@ -0,0 +1,124 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="Palette2">
+    <group name="Swing">
+      <item class="com.intellij.uiDesigner.HSpacer" tooltip-text="Horizontal Spacer" icon="/com/intellij/uiDesigner/icons/hspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="1" hsize-policy="6" anchor="0" fill="1" />
+      </item>
+      <item class="com.intellij.uiDesigner.VSpacer" tooltip-text="Vertical Spacer" icon="/com/intellij/uiDesigner/icons/vspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="1" anchor="0" fill="2" />
+      </item>
+      <item class="javax.swing.JPanel" icon="/com/intellij/uiDesigner/icons/panel.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3" />
+      </item>
+      <item class="javax.swing.JScrollPane" icon="/com/intellij/uiDesigner/icons/scrollPane.svg" removable="false" auto-create-binding="false" can-attach-label="true">
+        <default-constraints vsize-policy="7" hsize-policy="7" anchor="0" fill="3" />
+      </item>
+      <item class="javax.swing.JButton" icon="/com/intellij/uiDesigner/icons/button.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="3" anchor="0" fill="1" />
+        <initial-values>
+          <property name="text" value="Button" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JRadioButton" icon="/com/intellij/uiDesigner/icons/radioButton.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
+        <initial-values>
+          <property name="text" value="RadioButton" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JCheckBox" icon="/com/intellij/uiDesigner/icons/checkBox.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
+        <initial-values>
+          <property name="text" value="CheckBox" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JLabel" icon="/com/intellij/uiDesigner/icons/label.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="0" anchor="8" fill="0" />
+        <initial-values>
+          <property name="text" value="Label" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JTextField" icon="/com/intellij/uiDesigner/icons/textField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
+          <preferred-size width="150" height="-1" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JPasswordField" icon="/com/intellij/uiDesigner/icons/passwordField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
+          <preferred-size width="150" height="-1" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JFormattedTextField" icon="/com/intellij/uiDesigner/icons/formattedTextField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
+          <preferred-size width="150" height="-1" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTextArea" icon="/com/intellij/uiDesigner/icons/textArea.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTextPane" icon="/com/intellij/uiDesigner/icons/textPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JEditorPane" icon="/com/intellij/uiDesigner/icons/editorPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JComboBox" icon="/com/intellij/uiDesigner/icons/comboBox.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="2" anchor="8" fill="1" />
+      </item>
+      <item class="javax.swing.JTable" icon="/com/intellij/uiDesigner/icons/table.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JList" icon="/com/intellij/uiDesigner/icons/list.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="2" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTree" icon="/com/intellij/uiDesigner/icons/tree.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTabbedPane" icon="/com/intellij/uiDesigner/icons/tabbedPane.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
+          <preferred-size width="200" height="200" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JSplitPane" icon="/com/intellij/uiDesigner/icons/splitPane.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
+          <preferred-size width="200" height="200" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JSpinner" icon="/com/intellij/uiDesigner/icons/spinner.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
+      </item>
+      <item class="javax.swing.JSlider" icon="/com/intellij/uiDesigner/icons/slider.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
+      </item>
+      <item class="javax.swing.JSeparator" icon="/com/intellij/uiDesigner/icons/separator.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3" />
+      </item>
+      <item class="javax.swing.JProgressBar" icon="/com/intellij/uiDesigner/icons/progressbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1" />
+      </item>
+      <item class="javax.swing.JToolBar" icon="/com/intellij/uiDesigner/icons/toolbar.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1">
+          <preferred-size width="-1" height="20" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JToolBar$Separator" icon="/com/intellij/uiDesigner/icons/toolbarSeparator.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="0" anchor="0" fill="1" />
+      </item>
+      <item class="javax.swing.JScrollBar" icon="/com/intellij/uiDesigner/icons/scrollbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="0" anchor="0" fill="2" />
+      </item>
+    </group>
+  </component>
+</project>
\ No newline at end of file
diff --git a/.idea/vcs.xml b/.idea/vcs.xml
new file mode 100644
index 0000000..35eb1dd
--- /dev/null
+++ b/.idea/vcs.xml
@@ -0,0 +1,6 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="VcsDirectoryMappings">
+    <mapping directory="" vcs="Git" />
+  </component>
+</project>
\ No newline at end of file
diff --git a/README.md b/README.md
index 19422b5..ba901c5 100644
--- a/README.md
+++ b/README.md
@@ -2,11 +2,11 @@
 
 ## Student Information
 
-### Student Name  : Name here
+### Student Name  : Bryan Lee
 
-### Student ID    : ID here
+### Student ID    : 922649673
 
-### Student Email : Email here
+### Student Email : blee37@sfsu.edu
 
 ## Requirements
 
@@ -65,7 +65,7 @@ javac -d target --class-path "./;.\lib\junit-platform-console-standalone-1.9.3.j
 
 ### Linux/MacOS
 ```
-junit-platform-console-standalone-1.9.3.jar" ./tests/operator/*.java
+javac -d target --class-path "./:./lib/junit-platform-console-standalone-1.9.3.jar" ./tests/operator/*.java
 javac -d target --class-path "./:./lib/junit-platform-console-standalone-1.9.3.jar" ./tests/operand/*.java
 javac -d target --class-path "./:./lib/junit-platform-console-standalone-1.9.3.jar" ./tests/*.java
 ```
@@ -95,4 +95,4 @@ java -jar ./lib/junit-platform-console-standalone-1.9.3.jar -cp target --scan-cl
 - Push work to repository
     ```
     git push origin main
-    ```
\ No newline at end of file
+    ```
diff --git a/calculator-BryanL43.iml b/calculator-BryanL43.iml
new file mode 100644
index 0000000..ed337a5
--- /dev/null
+++ b/calculator-BryanL43.iml
@@ -0,0 +1,12 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<module type="JAVA_MODULE" version="4">
+  <component name="NewModuleRootManager" inherit-compiler-output="true">
+    <exclude-output />
+    <content url="file://$MODULE_DIR$">
+      <sourceFolder url="file://$MODULE_DIR$" isTestSource="false" />
+    </content>
+    <orderEntry type="inheritedJdk" />
+    <orderEntry type="sourceFolder" forTests="false" />
+    <orderEntry type="library" name="junit-platform-console-standalone-1.9.3" level="project" />
+  </component>
+</module>
\ No newline at end of file
diff --git a/calculator/evaluator/Evaluator.java b/calculator/evaluator/Evaluator.java
index 3ce44bc..b170db2 100644
--- a/calculator/evaluator/Evaluator.java
+++ b/calculator/evaluator/Evaluator.java
@@ -7,68 +7,124 @@ import java.util.StringTokenizer;
 
 public class Evaluator {
 
-  private final Stack<Operand> operandStack;
-  private final Stack<Operator> operatorStack;
+    private final Stack<Operand> operandStack;
+    private final Stack<Operator> operatorStack;
 
 
-  public Evaluator() {
-    operandStack = new Stack<>();
-    operatorStack = new Stack<>();
-  }
-
-  public int evaluateExpression(String expression ) throws InvalidTokenException {
-    String expressionToken;
-    StringTokenizer expressionTokenizer;
-    String delimiters = " +/*-^";
-
-    // 3 arguments tells the tokenizer to return delimiters as tokens
-    expressionTokenizer = new StringTokenizer( expression, delimiters, true );
-
-    while ( expressionTokenizer.hasMoreTokens() ) {
-      // filter out spaces
-      if ( !( expressionToken = expressionTokenizer.nextToken() ).equals( " " )) {
-        // check if token is an operand
-        if ( Operand.check( expressionToken )) {
-          operandStack.push( new Operand( expressionToken ));
-        } else {
-          if ( ! Operator.check( expressionToken )) {
-            throw new InvalidTokenException(expressionToken);
-          }
-
-
-          // TODO fix this line of code.
-          Operator newOperator = new Operator();
+    public Evaluator() {
+        operandStack = new Stack<>();
+        operatorStack = new Stack<>();
+    }
 
-         
-            while (operatorStack.peek().priority() >= newOperator.priority() ) {
-              Operator operatorFromStack = operatorStack.pop();
-              Operand operandTwo = operandStack.pop();
-              Operand operandOne = operandStack.pop();
-              Operand result = operatorFromStack.execute( operandOne, operandTwo );
-              operandStack.push( result );
+    public int evaluateExpression(String expression) throws InvalidTokenException {
+        String expressionToken;
+        StringTokenizer expressionTokenizer;
+        String delimiters = " +/*-^()";
+
+        // 3 arguments tells the tokenizer to return delimiters as tokens
+        expressionTokenizer = new StringTokenizer(expression, delimiters, true);
+
+//        while (expressionTokenizer.hasMoreTokens()) {
+//            // filter out spaces
+//            if (!(expressionToken = expressionTokenizer.nextToken()).equals(" ")) {
+//                if (!expressionToken.equals("(") && !expressionToken.equals(")")) { // ignore ( as per Evaluating Infix Expression Algorithm)
+//                    // check if token is an operand
+//                    if (Operand.check(expressionToken)) {
+//                        operandStack.push(new Operand(expressionToken));
+//                    } else {
+//                        // Checks for invalid operators
+//                        if (!Operator.check(expressionToken)) {
+//                            throw new InvalidTokenException(expressionToken);
+//                        }
+//
+//                        // TODO fix this line of code.
+//                        Operator newOperator = Operator.getOperator(expressionToken);
+//
+//                        while (!operatorStack.isEmpty() && operatorStack.peek().priority() >= newOperator.priority()) {
+//                            Operator operatorFromStack = operatorStack.pop();
+//                            Operand operandTwo = operandStack.pop();
+//                            Operand operandOne = operandStack.pop();
+//                            Operand result = operatorFromStack.execute(operandOne, operandTwo);
+//                            operandStack.push(result);
+//                        }
+//                        operatorStack.push(newOperator);
+//                    }
+//                } else if (expressionToken.equals(")")) {
+//                    while (!operatorStack.isEmpty()) {
+//                        Operator operatorFromStack = operatorStack.pop();
+//                        Operand operandTwo = operandStack.pop();
+//                        Operand operandOne = operandStack.pop();
+//                        Operand result = operatorFromStack.execute(operandOne, operandTwo);
+//                        operandStack.push(result);
+//                    }
+//                }
+//            }
+//        }
+
+        while (expressionTokenizer.hasMoreTokens()) {
+            // filter out spaces
+            if (!(expressionToken = expressionTokenizer.nextToken()).equals(" ")) {
+                // check if token is an operand
+                if (Operand.check(expressionToken)) {
+                    operandStack.push(new Operand(expressionToken));
+                } else if (expressionToken.equals("(")) { // push open parenthesis as operator for stopping point for looped execution
+                    operatorStack.push(Operator.getOperator(expressionToken));
+                } else if (expressionToken.equals(")")) {
+                    /*
+                    Per evaluating infix expressions algorithm; on encounter with close parenthesis:
+                    1. pop the top operator from operatorStack
+                        1a. (and however many operands it requires from the stack aka stopping at open parenthesis)
+                    2. push the result of applying that operator to those operands to operandStack
+                     */
+                    while (!operatorStack.isEmpty() && !operatorStack.peek().equals(Operator.getOperator("("))) {
+                        Operator operatorFromStack = operatorStack.pop();
+                        Operand operandTwo = operandStack.pop();
+                        Operand operandOne = operandStack.pop();
+                        Operand result = operatorFromStack.execute(operandOne, operandTwo);
+                        operandStack.push(result);
+                    }
+                    operatorStack.pop(); // Remove the open parenthesis from the stack
+                } else {
+                    //Check for invalid operator
+                    if (!Operator.check(expressionToken)) {
+                        throw new InvalidTokenException(expressionToken);
+                    }
+
+                    Operator newOperator = Operator.getOperator(expressionToken);
+
+                    while (!operatorStack.isEmpty() && operatorStack.peek().priority() >= newOperator.priority()) {
+                        Operator operatorFromStack = operatorStack.pop();
+                        Operand operandTwo = operandStack.pop();
+                        Operand operandOne = operandStack.pop();
+                        Operand result = operatorFromStack.execute(operandOne, operandTwo);
+                        operandStack.push(result);
+                    }
+                    operatorStack.push(newOperator);
+                }
             }
-
-            operatorStack.push( newOperator );
-          
         }
-      }
-    }
-
 
-    /*
-     * once no more tokens need to be scanned from StringTokenizer,
-     * we need to evaluate the remaining sub-expressions.
-     */
-    return 0;
-  }
+        /*
+         * once no more tokens need to be scanned from StringTokenizer,
+         * we need to evaluate the remaining sub-expressions.
+         */
+        while (!operatorStack.isEmpty()) {
+            Operator operatorFromStack = operatorStack.pop();
+            Operand operandTwo = operandStack.pop();
+            Operand operandOne = operandStack.pop();
+            Operand result = operatorFromStack.execute(operandOne, operandTwo);
+            operandStack.push(result);
+        }
 
-  public static void main(String[] args) throws InvalidTokenException {
-     if(args.length == 1){
-      Evaluator e = new Evaluator();
-      System.out.println(e.evaluateExpression(args[0]));
-     }else{
-      System.err.println("Invalid arguments or No expression given");
-     }
-  }
+        return operandStack.pop().getValue();
+    }
 
-}
+    public static void main(String[] args) throws InvalidTokenException {
+        if (args.length == 1) {
+            Evaluator e = new Evaluator();
+            System.out.println(e.evaluateExpression(args[0]));
+        } else {
+            System.err.println("Invalid arguments or No expression given");
+        }
+    }
+}
\ No newline at end of file
diff --git a/calculator/evaluator/EvaluatorUI.java b/calculator/evaluator/EvaluatorUI.java
index 0f391f6..3132044 100644
--- a/calculator/evaluator/EvaluatorUI.java
+++ b/calculator/evaluator/EvaluatorUI.java
@@ -5,11 +5,15 @@ import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
+import java.util.EmptyStackException;
+
+import java.util.Stack;
 
 public class EvaluatorUI extends JFrame implements ActionListener {
 
      private JTextField expressionTextField = new JTextField();
      private JPanel buttonPanel = new JPanel();
+     private Stack<String> entryHistory = new Stack<>();
 
      // total of 20 buttons on the calculator,
      // numbered from left to right, top to bottom
@@ -66,7 +70,45 @@ public class EvaluatorUI extends JFrame implements ActionListener {
       *                          button is pressed.
       */
      public void actionPerformed(ActionEvent actionEventObject) {
+         Evaluator evaluator = new Evaluator();
+         String equation;
+         String btnClicked = actionEventObject.getActionCommand();
 
-
+         switch (btnClicked) {
+             case "=":
+                 equation = this.expressionTextField.getText();
+                 try { //Handle valid evaluation expression and updates entry history
+                     this.expressionTextField.setText(String.valueOf(evaluator.evaluateExpression(equation)));
+                     entryHistory.clear();
+                     entryHistory.push(String.valueOf(evaluator.evaluateExpression(equation))); //Push the result into the empty stack for next input
+                 } catch (InvalidTokenException | EmptyStackException e) { //Error cases that resets the entryHistory for new input
+                     this.expressionTextField.setText("Error");
+                     entryHistory.clear();
+                 }
+                 break;
+             case "C": //Default clear history
+                 this.expressionTextField.setText("");
+                 entryHistory.clear();
+                 break;
+             case "CE": //Clears the last inputted entry history
+                 if (!entryHistory.isEmpty()) {
+                     entryHistory.pop(); //Remove the last entry from history
+                     StringBuilder updatedText = new StringBuilder();
+                     for (String entry : entryHistory) {
+                         updatedText.append(entry);
+                     }
+                     this.expressionTextField.setText(updatedText.toString());
+                 }
+                 break;
+             default: //Operand and Operator button handler
+                 if (this.expressionTextField.getText().equals("Error")) {
+                     this.expressionTextField.setText("");
+                     entryHistory.clear();
+                 }
+                 equation = this.expressionTextField.getText() + btnClicked;
+                 this.expressionTextField.setText(equation);
+                 entryHistory.push(btnClicked); //Tracks the entry history
+                 break;
+         }
      }
  }
diff --git a/calculator/evaluator/Operand.java b/calculator/evaluator/Operand.java
index 7813d0c..6d54e74 100644
--- a/calculator/evaluator/Operand.java
+++ b/calculator/evaluator/Operand.java
@@ -8,22 +8,24 @@ public class Operand {
     /**
      * construct operand from string token.
      */
-    public Operand(String token) {
+    private final int value;
 
+    public Operand(String token) {
+        this.value = Integer.parseInt(token);
     }
 
     /**
      * construct operand from integer
      */
     public Operand(int value) {
-
+        this.value = value;
     }
 
     /**
      * return value of operand
      */
     public int getValue() {
-        return 0;
+        return this.value;
     }
 
     /**
@@ -31,6 +33,10 @@ public class Operand {
      * operand.
      */
     public static boolean check(String token) {
-        return false;
+        try {
+            return Integer.parseInt(token) > 0;
+        } catch (NumberFormatException e) {
+            return false;
+        }
     }
 }
diff --git a/calculator/operators/AddOperator.java b/calculator/operators/AddOperator.java
new file mode 100644
index 0000000..3287cab
--- /dev/null
+++ b/calculator/operators/AddOperator.java
@@ -0,0 +1,15 @@
+package calculator.operators;
+
+import calculator.evaluator.Operand;
+
+public class AddOperator extends Operator {
+    @Override
+    public int priority() {
+        return 1;
+    }
+
+    @Override
+    public Operand execute(Operand op1, Operand op2) {
+        return new Operand(op1.getValue() + op2.getValue());
+    }
+}
diff --git a/calculator/operators/CloseParenOperator.java b/calculator/operators/CloseParenOperator.java
new file mode 100644
index 0000000..f9adc38
--- /dev/null
+++ b/calculator/operators/CloseParenOperator.java
@@ -0,0 +1,15 @@
+package calculator.operators;
+
+import calculator.evaluator.Operand;
+
+public class CloseParenOperator extends Operator {
+    @Override
+    public int priority() {
+        return 0;
+    }
+
+    @Override
+    public Operand execute(Operand op1, Operand op2) {
+        throw new UnsupportedOperationException("Cannot execute this operator");
+    }
+}
diff --git a/calculator/operators/DivideOperator.java b/calculator/operators/DivideOperator.java
new file mode 100644
index 0000000..7b9dd99
--- /dev/null
+++ b/calculator/operators/DivideOperator.java
@@ -0,0 +1,15 @@
+package calculator.operators;
+
+import calculator.evaluator.Operand;
+
+public class DivideOperator extends Operator {
+    @Override
+    public int priority() {
+        return 2;
+    }
+
+    @Override
+    public Operand execute(Operand op1, Operand op2) {
+        return new Operand(op1.getValue() / op2.getValue());
+    }
+}
diff --git a/calculator/operators/MultiplyOperator.java b/calculator/operators/MultiplyOperator.java
new file mode 100644
index 0000000..4fa092d
--- /dev/null
+++ b/calculator/operators/MultiplyOperator.java
@@ -0,0 +1,15 @@
+package calculator.operators;
+
+import calculator.evaluator.Operand;
+
+public class MultiplyOperator extends Operator {
+    @Override
+    public int priority() {
+        return 2;
+    }
+
+    @Override
+    public Operand execute(Operand op1, Operand op2) {
+        return new Operand(op1.getValue() * op2.getValue());
+    }
+}
diff --git a/calculator/operators/OpenParenOperator.java b/calculator/operators/OpenParenOperator.java
new file mode 100644
index 0000000..ce56bfe
--- /dev/null
+++ b/calculator/operators/OpenParenOperator.java
@@ -0,0 +1,15 @@
+package calculator.operators;
+
+import calculator.evaluator.Operand;
+
+public class OpenParenOperator extends Operator {
+    @Override
+    public int priority() {
+        return -1;
+    }
+
+    @Override
+    public Operand execute(Operand op1, Operand op2) {
+        throw new UnsupportedOperationException("Cannot execute this operator");
+    }
+}
diff --git a/calculator/operators/Operator.java b/calculator/operators/Operator.java
index a64ffda..4c01ad6 100644
--- a/calculator/operators/Operator.java
+++ b/calculator/operators/Operator.java
@@ -2,6 +2,9 @@ package calculator.operators;
 
 import calculator.evaluator.Operand;
 
+import java.util.Map;
+import java.util.HashMap;
+
 public abstract class Operator {
     // The Operator class should contain an instance of a HashMap
     // This map will use keys as the tokens we're interested in,
@@ -14,6 +17,25 @@ public abstract class Operator {
     // operators.put( "+", new AdditionOperator() );
     // operators.put( "-", new SubtractionOperator() );
 
+    private static final Map<String, Operator> operators = new HashMap<>();
+    private static boolean initialized = false;
+
+    //Static block to add to HashMap but deadlock warning
+//    static {
+//        operators.put("+", new AddOperator());
+//        operators.put("-", new SubtractOperator());
+//        operators.put("*", new MultiplyOperator());
+//        operators.put("/", new DivideOperator());
+//        operators.put("^", new PowerOperator());
+//    }
+
+    //Initializer to remove class deadlock warning
+    public static void initializeOperators() {
+        if (!initialized) {
+            OperatorInitializer.init(operators);
+            initialized = true;
+        }
+    }
 
     /**
      * retrieve the priority of an Operator
@@ -38,7 +60,10 @@ public abstract class Operator {
      * @return reference to a Operator instance.
      */
     public static Operator getOperator(String token) {
-        return null;
+        if (!initialized) {
+            initializeOperators();
+        }
+        return operators.get(token);
     }
 
     
@@ -49,6 +74,9 @@ public abstract class Operator {
      * Think about what happens if we add more operators.
      */
     public static boolean check(String token) {
-        return false;
+        if (!initialized) {
+            initializeOperators();
+        }
+        return operators.containsKey(token);
     }
 }
diff --git a/calculator/operators/OperatorInitializer.java b/calculator/operators/OperatorInitializer.java
new file mode 100644
index 0000000..dd3693a
--- /dev/null
+++ b/calculator/operators/OperatorInitializer.java
@@ -0,0 +1,16 @@
+package calculator.operators;
+
+import java.util.Map;
+
+//Seperated class to initialize and prevent deadlock
+public class OperatorInitializer {
+    public static void init(Map<String, Operator> operators) {
+        operators.put("+", new AddOperator());
+        operators.put("-", new SubtractOperator());
+        operators.put("*", new MultiplyOperator());
+        operators.put("/", new DivideOperator());
+        operators.put("^", new PowerOperator());
+        operators.put("(", new OpenParenOperator());
+        operators.put(")", new CloseParenOperator());
+    }
+}
diff --git a/calculator/operators/PowerOperator.java b/calculator/operators/PowerOperator.java
new file mode 100644
index 0000000..e5ad1d8
--- /dev/null
+++ b/calculator/operators/PowerOperator.java
@@ -0,0 +1,15 @@
+package calculator.operators;
+
+import calculator.evaluator.Operand;
+
+public class PowerOperator extends Operator {
+    @Override
+    public int priority() {
+        return 3;
+    }
+
+    @Override
+    public Operand execute(Operand op1, Operand op2) {
+        return new Operand((int)Math.pow(op1.getValue(), op2.getValue()));
+    }
+}
diff --git a/calculator/operators/SubtractOperator.java b/calculator/operators/SubtractOperator.java
new file mode 100644
index 0000000..54c2c4e
--- /dev/null
+++ b/calculator/operators/SubtractOperator.java
@@ -0,0 +1,15 @@
+package calculator.operators;
+
+import calculator.evaluator.Operand;
+
+public class SubtractOperator extends Operator {
+    @Override
+    public int priority() {
+        return 1;
+    }
+
+    @Override
+    public Operand execute(Operand op1, Operand op2) {
+        return new Operand(op1.getValue() - op2.getValue());
+    }
+}
diff --git a/documentation/Lee_Bryan.pdf b/documentation/Lee_Bryan.pdf
new file mode 100644
index 0000000..33bc92c
Binary files /dev/null and b/documentation/Lee_Bryan.pdf differ
diff --git a/documentation/calculator-UML-Diagram.png b/documentation/calculator-UML-Diagram.png
new file mode 100644
index 0000000..dfb2073
Binary files /dev/null and b/documentation/calculator-UML-Diagram.png differ
diff --git a/out/production/calculator-BryanL43/.idea/.gitignore b/out/production/calculator-BryanL43/.idea/.gitignore
new file mode 100644
index 0000000..13566b8
--- /dev/null
+++ b/out/production/calculator-BryanL43/.idea/.gitignore
@@ -0,0 +1,8 @@
+# Default ignored files
+/shelf/
+/workspace.xml
+# Editor-based HTTP Client requests
+/httpRequests/
+# Datasource local storage ignored files
+/dataSources/
+/dataSources.local.xml
diff --git a/out/production/calculator-BryanL43/.idea/libraries/junit_platform_console_standalone_1_9_3.xml b/out/production/calculator-BryanL43/.idea/libraries/junit_platform_console_standalone_1_9_3.xml
new file mode 100644
index 0000000..281cf42
--- /dev/null
+++ b/out/production/calculator-BryanL43/.idea/libraries/junit_platform_console_standalone_1_9_3.xml
@@ -0,0 +1,9 @@
+<component name="libraryTable">
+  <library name="junit-platform-console-standalone-1.9.3">
+    <CLASSES>
+      <root url="jar://$PROJECT_DIR$/lib/junit-platform-console-standalone-1.9.3.jar!/" />
+    </CLASSES>
+    <JAVADOC />
+    <SOURCES />
+  </library>
+</component>
\ No newline at end of file
diff --git a/out/production/calculator-BryanL43/.idea/misc.xml b/out/production/calculator-BryanL43/.idea/misc.xml
new file mode 100644
index 0000000..6f29fee
--- /dev/null
+++ b/out/production/calculator-BryanL43/.idea/misc.xml
@@ -0,0 +1,6 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="ProjectRootManager" version="2" languageLevel="JDK_21" default="true" project-jdk-name="21" project-jdk-type="JavaSDK">
+    <output url="file://$PROJECT_DIR$/out" />
+  </component>
+</project>
\ No newline at end of file
diff --git a/out/production/calculator-BryanL43/.idea/modules.xml b/out/production/calculator-BryanL43/.idea/modules.xml
new file mode 100644
index 0000000..3cdb2fc
--- /dev/null
+++ b/out/production/calculator-BryanL43/.idea/modules.xml
@@ -0,0 +1,8 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="ProjectModuleManager">
+    <modules>
+      <module fileurl="file://$PROJECT_DIR$/calculator-BryanL43.iml" filepath="$PROJECT_DIR$/calculator-BryanL43.iml" />
+    </modules>
+  </component>
+</project>
\ No newline at end of file
diff --git a/out/production/calculator-BryanL43/.idea/uiDesigner.xml b/out/production/calculator-BryanL43/.idea/uiDesigner.xml
new file mode 100644
index 0000000..2b63946
--- /dev/null
+++ b/out/production/calculator-BryanL43/.idea/uiDesigner.xml
@@ -0,0 +1,124 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="Palette2">
+    <group name="Swing">
+      <item class="com.intellij.uiDesigner.HSpacer" tooltip-text="Horizontal Spacer" icon="/com/intellij/uiDesigner/icons/hspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="1" hsize-policy="6" anchor="0" fill="1" />
+      </item>
+      <item class="com.intellij.uiDesigner.VSpacer" tooltip-text="Vertical Spacer" icon="/com/intellij/uiDesigner/icons/vspacer.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="1" anchor="0" fill="2" />
+      </item>
+      <item class="javax.swing.JPanel" icon="/com/intellij/uiDesigner/icons/panel.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3" />
+      </item>
+      <item class="javax.swing.JScrollPane" icon="/com/intellij/uiDesigner/icons/scrollPane.svg" removable="false" auto-create-binding="false" can-attach-label="true">
+        <default-constraints vsize-policy="7" hsize-policy="7" anchor="0" fill="3" />
+      </item>
+      <item class="javax.swing.JButton" icon="/com/intellij/uiDesigner/icons/button.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="3" anchor="0" fill="1" />
+        <initial-values>
+          <property name="text" value="Button" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JRadioButton" icon="/com/intellij/uiDesigner/icons/radioButton.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
+        <initial-values>
+          <property name="text" value="RadioButton" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JCheckBox" icon="/com/intellij/uiDesigner/icons/checkBox.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />
+        <initial-values>
+          <property name="text" value="CheckBox" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JLabel" icon="/com/intellij/uiDesigner/icons/label.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="0" anchor="8" fill="0" />
+        <initial-values>
+          <property name="text" value="Label" />
+        </initial-values>
+      </item>
+      <item class="javax.swing.JTextField" icon="/com/intellij/uiDesigner/icons/textField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
+          <preferred-size width="150" height="-1" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JPasswordField" icon="/com/intellij/uiDesigner/icons/passwordField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
+          <preferred-size width="150" height="-1" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JFormattedTextField" icon="/com/intellij/uiDesigner/icons/formattedTextField.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">
+          <preferred-size width="150" height="-1" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTextArea" icon="/com/intellij/uiDesigner/icons/textArea.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTextPane" icon="/com/intellij/uiDesigner/icons/textPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JEditorPane" icon="/com/intellij/uiDesigner/icons/editorPane.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JComboBox" icon="/com/intellij/uiDesigner/icons/comboBox.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="2" anchor="8" fill="1" />
+      </item>
+      <item class="javax.swing.JTable" icon="/com/intellij/uiDesigner/icons/table.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JList" icon="/com/intellij/uiDesigner/icons/list.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="2" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTree" icon="/com/intellij/uiDesigner/icons/tree.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">
+          <preferred-size width="150" height="50" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JTabbedPane" icon="/com/intellij/uiDesigner/icons/tabbedPane.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
+          <preferred-size width="200" height="200" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JSplitPane" icon="/com/intellij/uiDesigner/icons/splitPane.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">
+          <preferred-size width="200" height="200" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JSpinner" icon="/com/intellij/uiDesigner/icons/spinner.svg" removable="false" auto-create-binding="true" can-attach-label="true">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
+      </item>
+      <item class="javax.swing.JSlider" icon="/com/intellij/uiDesigner/icons/slider.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />
+      </item>
+      <item class="javax.swing.JSeparator" icon="/com/intellij/uiDesigner/icons/separator.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3" />
+      </item>
+      <item class="javax.swing.JProgressBar" icon="/com/intellij/uiDesigner/icons/progressbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1" />
+      </item>
+      <item class="javax.swing.JToolBar" icon="/com/intellij/uiDesigner/icons/toolbar.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1">
+          <preferred-size width="-1" height="20" />
+        </default-constraints>
+      </item>
+      <item class="javax.swing.JToolBar$Separator" icon="/com/intellij/uiDesigner/icons/toolbarSeparator.svg" removable="false" auto-create-binding="false" can-attach-label="false">
+        <default-constraints vsize-policy="0" hsize-policy="0" anchor="0" fill="1" />
+      </item>
+      <item class="javax.swing.JScrollBar" icon="/com/intellij/uiDesigner/icons/scrollbar.svg" removable="false" auto-create-binding="true" can-attach-label="false">
+        <default-constraints vsize-policy="6" hsize-policy="0" anchor="0" fill="2" />
+      </item>
+    </group>
+  </component>
+</project>
\ No newline at end of file
diff --git a/out/production/calculator-BryanL43/.idea/vcs.xml b/out/production/calculator-BryanL43/.idea/vcs.xml
new file mode 100644
index 0000000..35eb1dd
--- /dev/null
+++ b/out/production/calculator-BryanL43/.idea/vcs.xml
@@ -0,0 +1,6 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<project version="4">
+  <component name="VcsDirectoryMappings">
+    <mapping directory="" vcs="Git" />
+  </component>
+</project>
\ No newline at end of file
diff --git a/out/production/calculator-BryanL43/README.md b/out/production/calculator-BryanL43/README.md
new file mode 100644
index 0000000..ddc145b
--- /dev/null
+++ b/out/production/calculator-BryanL43/README.md
@@ -0,0 +1,98 @@
+# CSC 413 Project One - Calculator
+
+## Student Information
+
+### Student Name  : Name here
+
+### Student ID    : ID here
+
+### Student Email : Email here
+
+## Requirements
+
+- Implement Operand Class
+- Implement Operator Abtsraction
+- Implement Operator Sub classes
+    - Implement AddOperator class
+    - Implement Subractperator class
+    - Implement DivideOperator class
+    - Implement MultiplyOperator class
+    - Implement PowerOperator class
+- Implement the Evaluator Class
+- Implement the EvluatorUI Class
+- Write Project One documentation
+    - Follow the guidelines in the Documentation Guidelines.docx file
+    - Write your documentation in the A1DocBase.docx file.
+    - Convert the docx to a PDF and rename it to the following:
+        `lastname_firstname.pdf`
+- Commit all code to repository by the given due date posted on Canvas. Sample commads below
+
+
+## Compiling Project from command line
+
+### Windows
+```
+javac -d target .\calculator\evaluator\Operand.java
+javac -d target .\calculator\operators\*.java
+javac -d target .\calculator\evaluator\*.java
+```
+
+### Linux/MacOS
+```
+javac -d target ./calculator/evaluator/Operand.java
+javac -d target ./calculator/operators/*.java
+javac -d target ./calculator/evaluator/*.java
+```
+
+## Run Project One
+
+### Windows/Linux/MacOS
+```
+java -cp target calculator.evaluator.Evaluator
+```
+
+## Running Unit Tests for Project One
+
+### Compile Test
+
+### Windows
+```
+javac -d target --class-path "./;.\lib\junit-platform-console-standalone-1.9.3.jar" .\tests\operator\*.java
+javac -d target --class-path "./;.\lib\junit-platform-console-standalone-1.9.3.jar" .\tests\operand\*.java
+javac -d target --class-path "./;.\lib\junit-platform-console-standalone-1.9.3.jar" .\tests\*.java
+
+```
+
+### Linux/MacOS
+```
+junit-platform-console-standalone-1.9.3.jar" ./tests/operator/*.java
+javac -d target --class-path "./:./lib/junit-platform-console-standalone-1.9.3.jar" ./tests/operand/*.java
+javac -d target --class-path "./:./lib/junit-platform-console-standalone-1.9.3.jar" ./tests/*.java
+```
+
+## Run Unit Test
+
+### Windows
+```
+java -jar .\lib\junit-platform-console-standalone-1.9.3.jar -cp target --scan-classpath
+```
+
+### Linux
+```
+java -jar ./lib/junit-platform-console-standalone-1.9.3.jar -cp target --scan-classpath
+```
+
+## Submit Assignment
+- Save all work
+- Add all files to staging
+    ```
+    git add .
+    ```
+- Commit work to main branch
+    ```
+    git commit -m "message goes here"
+    ```
+- Push work to repository
+    ```
+    git push origin main
+    ```
\ No newline at end of file
diff --git a/out/production/calculator-BryanL43/bashrun.sh b/out/production/calculator-BryanL43/bashrun.sh
new file mode 100644
index 0000000..5d9a5e3
--- /dev/null
+++ b/out/production/calculator-BryanL43/bashrun.sh
@@ -0,0 +1,8 @@
+javac -d target ./calculator/evaluator/Operand.java
+javac -d target ./calculator/operators/*.java
+javac -d target ./calculator/evaluator/*.java
+javac -d target --class-path "./:./lib/junit-platform-console-standalone-1.9.3.jar" ./tests/operator/*.java
+javac -d target --class-path "./:./lib/junit-platform-console-standalone-1.9.3.jar" ./tests/operand/*.java
+javac -d target --class-path "./:./lib/junit-platform-console-standalone-1.9.3.jar" ./tests/*.java
+
+java -jar ./lib/junit-platform-console-standalone-1.9.3.jar -cp target --scan-classpath
\ No newline at end of file
diff --git a/out/production/calculator-BryanL43/calculator-BryanL43.iml b/out/production/calculator-BryanL43/calculator-BryanL43.iml
new file mode 100644
index 0000000..ed337a5
--- /dev/null
+++ b/out/production/calculator-BryanL43/calculator-BryanL43.iml
@@ -0,0 +1,12 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<module type="JAVA_MODULE" version="4">
+  <component name="NewModuleRootManager" inherit-compiler-output="true">
+    <exclude-output />
+    <content url="file://$MODULE_DIR$">
+      <sourceFolder url="file://$MODULE_DIR$" isTestSource="false" />
+    </content>
+    <orderEntry type="inheritedJdk" />
+    <orderEntry type="sourceFolder" forTests="false" />
+    <orderEntry type="library" name="junit-platform-console-standalone-1.9.3" level="project" />
+  </component>
+</module>
\ No newline at end of file
diff --git a/out/production/calculator-BryanL43/calculator/evaluator/Evaluator.class b/out/production/calculator-BryanL43/calculator/evaluator/Evaluator.class
new file mode 100644
index 0000000..fe9ce52
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/evaluator/Evaluator.class differ
diff --git a/out/production/calculator-BryanL43/calculator/evaluator/EvaluatorUI.class b/out/production/calculator-BryanL43/calculator/evaluator/EvaluatorUI.class
new file mode 100644
index 0000000..b4e3fc9
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/evaluator/EvaluatorUI.class differ
diff --git a/out/production/calculator-BryanL43/calculator/evaluator/InvalidTokenException.class b/out/production/calculator-BryanL43/calculator/evaluator/InvalidTokenException.class
new file mode 100644
index 0000000..075abcb
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/evaluator/InvalidTokenException.class differ
diff --git a/out/production/calculator-BryanL43/calculator/evaluator/Operand.class b/out/production/calculator-BryanL43/calculator/evaluator/Operand.class
new file mode 100644
index 0000000..64e322c
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/evaluator/Operand.class differ
diff --git a/out/production/calculator-BryanL43/calculator/operators/AddOperator.class b/out/production/calculator-BryanL43/calculator/operators/AddOperator.class
new file mode 100644
index 0000000..b63b8dd
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/operators/AddOperator.class differ
diff --git a/out/production/calculator-BryanL43/calculator/operators/CloseParenOperator.class b/out/production/calculator-BryanL43/calculator/operators/CloseParenOperator.class
new file mode 100644
index 0000000..ed86a15
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/operators/CloseParenOperator.class differ
diff --git a/out/production/calculator-BryanL43/calculator/operators/DivideOperator.class b/out/production/calculator-BryanL43/calculator/operators/DivideOperator.class
new file mode 100644
index 0000000..0201bfd
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/operators/DivideOperator.class differ
diff --git a/out/production/calculator-BryanL43/calculator/operators/MultiplyOperator.class b/out/production/calculator-BryanL43/calculator/operators/MultiplyOperator.class
new file mode 100644
index 0000000..5d9ecbe
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/operators/MultiplyOperator.class differ
diff --git a/out/production/calculator-BryanL43/calculator/operators/OpenParenOperator.class b/out/production/calculator-BryanL43/calculator/operators/OpenParenOperator.class
new file mode 100644
index 0000000..e177612
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/operators/OpenParenOperator.class differ
diff --git a/out/production/calculator-BryanL43/calculator/operators/Operator.class b/out/production/calculator-BryanL43/calculator/operators/Operator.class
new file mode 100644
index 0000000..093aff8
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/operators/Operator.class differ
diff --git a/out/production/calculator-BryanL43/calculator/operators/OperatorInitializer.class b/out/production/calculator-BryanL43/calculator/operators/OperatorInitializer.class
new file mode 100644
index 0000000..814002d
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/operators/OperatorInitializer.class differ
diff --git a/out/production/calculator-BryanL43/calculator/operators/PowerOperator.class b/out/production/calculator-BryanL43/calculator/operators/PowerOperator.class
new file mode 100644
index 0000000..762fb80
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/operators/PowerOperator.class differ
diff --git a/out/production/calculator-BryanL43/calculator/operators/SubtractOperator.class b/out/production/calculator-BryanL43/calculator/operators/SubtractOperator.class
new file mode 100644
index 0000000..06d847b
Binary files /dev/null and b/out/production/calculator-BryanL43/calculator/operators/SubtractOperator.class differ
diff --git a/out/production/calculator-BryanL43/documentation/Documentation Guidelines.pdf b/out/production/calculator-BryanL43/documentation/Documentation Guidelines.pdf
new file mode 100644
index 0000000..0790547
Binary files /dev/null and b/out/production/calculator-BryanL43/documentation/Documentation Guidelines.pdf differ
diff --git a/documentation/lastname_firstname.docx b/out/production/calculator-BryanL43/documentation/lastname_firstname.docx
similarity index 100%
rename from documentation/lastname_firstname.docx
rename to out/production/calculator-BryanL43/documentation/lastname_firstname.docx
diff --git a/out/production/calculator-BryanL43/lib/junit-platform-console-standalone-1.9.3.jar b/out/production/calculator-BryanL43/lib/junit-platform-console-standalone-1.9.3.jar
new file mode 100644
index 0000000..f072f7a
Binary files /dev/null and b/out/production/calculator-BryanL43/lib/junit-platform-console-standalone-1.9.3.jar differ
diff --git a/out/production/calculator-BryanL43/tests/EvaluatorTest.class b/out/production/calculator-BryanL43/tests/EvaluatorTest.class
new file mode 100644
index 0000000..aa244bc
Binary files /dev/null and b/out/production/calculator-BryanL43/tests/EvaluatorTest.class differ
diff --git a/out/production/calculator-BryanL43/tests/operand/OperandTest.class b/out/production/calculator-BryanL43/tests/operand/OperandTest.class
new file mode 100644
index 0000000..d113b91
Binary files /dev/null and b/out/production/calculator-BryanL43/tests/operand/OperandTest.class differ
diff --git a/out/production/calculator-BryanL43/tests/operator/AddOperatorTest.class b/out/production/calculator-BryanL43/tests/operator/AddOperatorTest.class
new file mode 100644
index 0000000..079a166
Binary files /dev/null and b/out/production/calculator-BryanL43/tests/operator/AddOperatorTest.class differ
diff --git a/out/production/calculator-BryanL43/tests/operator/DivideOperatorTest.class b/out/production/calculator-BryanL43/tests/operator/DivideOperatorTest.class
new file mode 100644
index 0000000..6b69c81
Binary files /dev/null and b/out/production/calculator-BryanL43/tests/operator/DivideOperatorTest.class differ
diff --git a/out/production/calculator-BryanL43/tests/operator/MultiplyOperatorTest.class b/out/production/calculator-BryanL43/tests/operator/MultiplyOperatorTest.class
new file mode 100644
index 0000000..3f41cf5
Binary files /dev/null and b/out/production/calculator-BryanL43/tests/operator/MultiplyOperatorTest.class differ
diff --git a/out/production/calculator-BryanL43/tests/operator/OperatorTest.class b/out/production/calculator-BryanL43/tests/operator/OperatorTest.class
new file mode 100644
index 0000000..3081a9c
Binary files /dev/null and b/out/production/calculator-BryanL43/tests/operator/OperatorTest.class differ
diff --git a/out/production/calculator-BryanL43/tests/operator/PowerOperatorTest.class b/out/production/calculator-BryanL43/tests/operator/PowerOperatorTest.class
new file mode 100644
index 0000000..76f35c4
Binary files /dev/null and b/out/production/calculator-BryanL43/tests/operator/PowerOperatorTest.class differ
diff --git a/out/production/calculator-BryanL43/tests/operator/SubtractOperatorTest.class b/out/production/calculator-BryanL43/tests/operator/SubtractOperatorTest.class
new file mode 100644
index 0000000..37ee6ce
Binary files /dev/null and b/out/production/calculator-BryanL43/tests/operator/SubtractOperatorTest.class differ
diff --git a/out/production/calculator-BryanL43/winrun.ps1 b/out/production/calculator-BryanL43/winrun.ps1
new file mode 100644
index 0000000..b259ee5
--- /dev/null
+++ b/out/production/calculator-BryanL43/winrun.ps1
@@ -0,0 +1,8 @@
+javac -d target .\calculator\evaluator\Operand.java
+javac -d target .\calculator\operators\*.java
+javac -d target .\calculator\evaluator\*.java
+javac -d target --class-path "./;.\lib\junit-platform-console-standalone-1.9.3.jar" .\tests\operator\*.java
+javac -d target --class-path "./;.\lib\junit-platform-console-standalone-1.9.3.jar" .\tests\operand\*.java
+javac -d target --class-path "./;.\lib\junit-platform-console-standalone-1.9.3.jar" .\tests\*.java
+
+java -jar .\lib\junit-platform-console-standalone-1.9.3.jar -cp target --scan-classpath
\ No newline at end of file
diff --git a/target/calculator/evaluator/Evaluator.class b/target/calculator/evaluator/Evaluator.class
new file mode 100644
index 0000000..346b6f7
Binary files /dev/null and b/target/calculator/evaluator/Evaluator.class differ
diff --git a/target/calculator/evaluator/EvaluatorUI.class b/target/calculator/evaluator/EvaluatorUI.class
new file mode 100644
index 0000000..3ddfadd
Binary files /dev/null and b/target/calculator/evaluator/EvaluatorUI.class differ
diff --git a/target/calculator/evaluator/InvalidTokenException.class b/target/calculator/evaluator/InvalidTokenException.class
new file mode 100644
index 0000000..c551e44
Binary files /dev/null and b/target/calculator/evaluator/InvalidTokenException.class differ
diff --git a/target/calculator/evaluator/Operand.class b/target/calculator/evaluator/Operand.class
new file mode 100644
index 0000000..bb64e16
Binary files /dev/null and b/target/calculator/evaluator/Operand.class differ
diff --git a/target/calculator/operators/AddOperator.class b/target/calculator/operators/AddOperator.class
new file mode 100644
index 0000000..f59e2e3
Binary files /dev/null and b/target/calculator/operators/AddOperator.class differ
diff --git a/target/calculator/operators/CloseParenOperator.class b/target/calculator/operators/CloseParenOperator.class
new file mode 100644
index 0000000..ac008c8
Binary files /dev/null and b/target/calculator/operators/CloseParenOperator.class differ
diff --git a/target/calculator/operators/DivideOperator.class b/target/calculator/operators/DivideOperator.class
new file mode 100644
index 0000000..02a1495
Binary files /dev/null and b/target/calculator/operators/DivideOperator.class differ
diff --git a/target/calculator/operators/MultiplyOperator.class b/target/calculator/operators/MultiplyOperator.class
new file mode 100644
index 0000000..ca7fee7
Binary files /dev/null and b/target/calculator/operators/MultiplyOperator.class differ
diff --git a/target/calculator/operators/OpenParenOperator.class b/target/calculator/operators/OpenParenOperator.class
new file mode 100644
index 0000000..827a704
Binary files /dev/null and b/target/calculator/operators/OpenParenOperator.class differ
diff --git a/target/calculator/operators/Operator.class b/target/calculator/operators/Operator.class
new file mode 100644
index 0000000..d961377
Binary files /dev/null and b/target/calculator/operators/Operator.class differ
diff --git a/target/calculator/operators/OperatorInitializer.class b/target/calculator/operators/OperatorInitializer.class
new file mode 100644
index 0000000..16c7f48
Binary files /dev/null and b/target/calculator/operators/OperatorInitializer.class differ
diff --git a/target/calculator/operators/PowerOperator.class b/target/calculator/operators/PowerOperator.class
new file mode 100644
index 0000000..16fcb06
Binary files /dev/null and b/target/calculator/operators/PowerOperator.class differ
diff --git a/target/calculator/operators/SubtractOperator.class b/target/calculator/operators/SubtractOperator.class
new file mode 100644
index 0000000..769f029
Binary files /dev/null and b/target/calculator/operators/SubtractOperator.class differ
diff --git a/target/tests/EvaluatorTest.class b/target/tests/EvaluatorTest.class
new file mode 100644
index 0000000..3e2fd45
Binary files /dev/null and b/target/tests/EvaluatorTest.class differ
diff --git a/target/tests/operand/OperandTest.class b/target/tests/operand/OperandTest.class
new file mode 100644
index 0000000..71a6e76
Binary files /dev/null and b/target/tests/operand/OperandTest.class differ
diff --git a/target/tests/operator/AddOperatorTest.class b/target/tests/operator/AddOperatorTest.class
new file mode 100644
index 0000000..f92532e
Binary files /dev/null and b/target/tests/operator/AddOperatorTest.class differ
diff --git a/target/tests/operator/DivideOperatorTest.class b/target/tests/operator/DivideOperatorTest.class
new file mode 100644
index 0000000..0892c41
Binary files /dev/null and b/target/tests/operator/DivideOperatorTest.class differ
diff --git a/target/tests/operator/MultiplyOperatorTest.class b/target/tests/operator/MultiplyOperatorTest.class
new file mode 100644
index 0000000..e9900d1
Binary files /dev/null and b/target/tests/operator/MultiplyOperatorTest.class differ
diff --git a/target/tests/operator/OperatorTest.class b/target/tests/operator/OperatorTest.class
new file mode 100644
index 0000000..3ba02d8
Binary files /dev/null and b/target/tests/operator/OperatorTest.class differ
diff --git a/target/tests/operator/PowerOperatorTest.class b/target/tests/operator/PowerOperatorTest.class
new file mode 100644
index 0000000..5b85567
Binary files /dev/null and b/target/tests/operator/PowerOperatorTest.class differ
diff --git a/target/tests/operator/SubtractOperatorTest.class b/target/tests/operator/SubtractOperatorTest.class
new file mode 100644
index 0000000..3ee81ff
Binary files /dev/null and b/target/tests/operator/SubtractOperatorTest.class differ
diff --git a/tests/operator/AddOperatorTest.java b/tests/operator/AddOperatorTest.java
index 127c11e..5e106d9 100644
--- a/tests/operator/AddOperatorTest.java
+++ b/tests/operator/AddOperatorTest.java
@@ -2,6 +2,7 @@ package tests.operator;
 
 import calculator.evaluator.Operand;
 
+import calculator.operators.AddOperator;
 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
diff --git a/tests/operator/DivideOperatorTest.java b/tests/operator/DivideOperatorTest.java
index ce169a8..c2147f6 100644
--- a/tests/operator/DivideOperatorTest.java
+++ b/tests/operator/DivideOperatorTest.java
@@ -1,6 +1,7 @@
 package tests.operator;
 
 import calculator.evaluator.Operand;
+import calculator.operators.DivideOperator;
 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
diff --git a/tests/operator/MultiplyOperatorTest.java b/tests/operator/MultiplyOperatorTest.java
index 1187039..9e05b22 100644
--- a/tests/operator/MultiplyOperatorTest.java
+++ b/tests/operator/MultiplyOperatorTest.java
@@ -1,6 +1,7 @@
 package tests.operator;
 
 import calculator.evaluator.Operand;
+import calculator.operators.MultiplyOperator;
 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
diff --git a/tests/operator/PowerOperatorTest.java b/tests/operator/PowerOperatorTest.java
index 5711132..d4fbeeb 100644
--- a/tests/operator/PowerOperatorTest.java
+++ b/tests/operator/PowerOperatorTest.java
@@ -2,6 +2,7 @@ package tests.operator;
 
 
 import calculator.evaluator.Operand;
+import calculator.operators.PowerOperator;
 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
diff --git a/tests/operator/SubtractOperatorTest.java b/tests/operator/SubtractOperatorTest.java
index 7b35647..2d09ad3 100644
--- a/tests/operator/SubtractOperatorTest.java
+++ b/tests/operator/SubtractOperatorTest.java
@@ -1,6 +1,7 @@
 package tests.operator;
 
 import calculator.evaluator.Operand;
+import calculator.operators.SubtractOperator;
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.api.Assertions;

~~~

</details>




## Code Review


<details>
    <summary>./calculator/evaluator/Operand.java</summary>

~~~java
package calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    /**
     * construct operand from string token.
     */
    private final int value;

    public Operand(String token) {
        this.value = Integer.parseInt(token);
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.value = value;
    }

    /**
     * return value of operand
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try {
            return Integer.parseInt(token) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

~~~

</details>



<details>
    <summary>./calculator/operators/OperatorInitializer.java</summary>

~~~java
package calculator.operators;

import java.util.Map;

//Seperated class to initialize and prevent deadlock
public class OperatorInitializer {
    public static void init(Map<String, Operator> operators) {
        operators.put("+", new AddOperator());
        operators.put("-", new SubtractOperator());
        operators.put("*", new MultiplyOperator());
        operators.put("/", new DivideOperator());
        operators.put("^", new PowerOperator());
        operators.put("(", new OpenParenOperator());
        operators.put(")", new CloseParenOperator());
    }
}

~~~

</details>



<details>
    <summary>./calculator/operators/Operator.java</summary>

~~~java
package calculator.operators;

import calculator.evaluator.Operand;

import java.util.Map;
import java.util.HashMap;

public abstract class Operator {
    // The Operator class should contain an instance of a HashMap
    // This map will use keys as the tokens we're interested in,
    // and values will be instances of the Operators.
    // ALL subclasses of operator MUST be in their own file.
    // Example:
    // Where does this declaration go? What should its access level be?
    // Class or instance variable? Is this the right declaration?
    // HashMap operators = new HashMap();
    // operators.put( "+", new AdditionOperator() );
    // operators.put( "-", new SubtractionOperator() );

    private static final Map<String, Operator> operators = new HashMap<>();
    private static boolean initialized = false;

    //Static block to add to HashMap but deadlock warning
//    static {
//        operators.put("+", new AddOperator());
//        operators.put("-", new SubtractOperator());
//        operators.put("*", new MultiplyOperator());
//        operators.put("/", new DivideOperator());
//        operators.put("^", new PowerOperator());
//    }

    //Initializer to remove class deadlock warning
    public static void initializeOperators() {
        if (!initialized) {
            OperatorInitializer.init(operators);
            initialized = true;
        }
    }

    /**
     * retrieve the priority of an Operator
     * @return priority of an Operator as an int
     */
    public abstract int priority();

    /**
     * Abstract method to execute an operator given two operands.
     * @param operandOne first operand of operator
     * @param operandTwo second operand of operator
     * @return an operand of the result of the operation.
     */
    public abstract Operand execute(Operand operandOne, Operand operandTwo);

    /**
     * used to retrieve an operator from our HashMap.
     * This will act as out publicly facing function,
     * granting access to the Operator HashMap.
     *
     * @param token key of the operator we want to retrieve
     * @return reference to a Operator instance.
     */
    public static Operator getOperator(String token) {
        if (!initialized) {
            initializeOperators();
        }
        return operators.get(token);
    }

    
     /**
     * determines if a given token is a valid operator.
     * please do your best to avoid static checks
     * for example token.equals("+") and so on.
     * Think about what happens if we add more operators.
     */
    public static boolean check(String token) {
        if (!initialized) {
            initializeOperators();
        }
        return operators.containsKey(token);
    }
}

~~~

</details>



<details>
    <summary>./calculator/operators/AddOperator.java</summary>

~~~java
package calculator.operators;

import calculator.evaluator.Operand;

public class AddOperator extends Operator {
    @Override
    public int priority() {
        return 1;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        return new Operand(op1.getValue() + op2.getValue());
    }
}

~~~

</details>



<details>
    <summary>./calculator/operators/OpenParenOperator.java</summary>

~~~java
package calculator.operators;

import calculator.evaluator.Operand;

public class OpenParenOperator extends Operator {
    @Override
    public int priority() {
        return -1;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        throw new UnsupportedOperationException("Cannot execute this operator");
    }
}

~~~

</details>



<details>
    <summary>./calculator/operators/PowerOperator.java</summary>

~~~java
package calculator.operators;

import calculator.evaluator.Operand;

public class PowerOperator extends Operator {
    @Override
    public int priority() {
        return 3;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        return new Operand((int)Math.pow(op1.getValue(), op2.getValue()));
    }
}

~~~

</details>



<details>
    <summary>./calculator/operators/DivideOperator.java</summary>

~~~java
package calculator.operators;

import calculator.evaluator.Operand;

public class DivideOperator extends Operator {
    @Override
    public int priority() {
        return 2;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        return new Operand(op1.getValue() / op2.getValue());
    }
}

~~~

</details>



<details>
    <summary>./calculator/operators/SubtractOperator.java</summary>

~~~java
package calculator.operators;

import calculator.evaluator.Operand;

public class SubtractOperator extends Operator {
    @Override
    public int priority() {
        return 1;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        return new Operand(op1.getValue() - op2.getValue());
    }
}

~~~

</details>



<details>
    <summary>./calculator/operators/CloseParenOperator.java</summary>

~~~java
package calculator.operators;

import calculator.evaluator.Operand;

public class CloseParenOperator extends Operator {
    @Override
    public int priority() {
        return 0;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        throw new UnsupportedOperationException("Cannot execute this operator");
    }
}

~~~

</details>



<details>
    <summary>./calculator/operators/MultiplyOperator.java</summary>

~~~java
package calculator.operators;

import calculator.evaluator.Operand;

public class MultiplyOperator extends Operator {
    @Override
    public int priority() {
        return 2;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        return new Operand(op1.getValue() * op2.getValue());
    }
}

~~~

</details>



<details>
    <summary>./calculator/evaluator/Evaluator.java</summary>

~~~java
package calculator.evaluator;

import calculator.operators.*;

import java.util.Stack;
import java.util.StringTokenizer;

public class Evaluator {

    private final Stack<Operand> operandStack;
    private final Stack<Operator> operatorStack;


    public Evaluator() {
        operandStack = new Stack<>();
        operatorStack = new Stack<>();
    }

    public int evaluateExpression(String expression) throws InvalidTokenException {
        String expressionToken;
        StringTokenizer expressionTokenizer;
        String delimiters = " +/*-^()";

        // 3 arguments tells the tokenizer to return delimiters as tokens
        expressionTokenizer = new StringTokenizer(expression, delimiters, true);

//        while (expressionTokenizer.hasMoreTokens()) {
//            // filter out spaces
//            if (!(expressionToken = expressionTokenizer.nextToken()).equals(" ")) {
//                if (!expressionToken.equals("(") && !expressionToken.equals(")")) { // ignore ( as per Evaluating Infix Expression Algorithm)
//                    // check if token is an operand
//                    if (Operand.check(expressionToken)) {
//                        operandStack.push(new Operand(expressionToken));
//                    } else {
//                        // Checks for invalid operators
//                        if (!Operator.check(expressionToken)) {
//                            throw new InvalidTokenException(expressionToken);
//                        }
//
//                        // TODO fix this line of code.
//                        Operator newOperator = Operator.getOperator(expressionToken);
//
//                        while (!operatorStack.isEmpty() && operatorStack.peek().priority() >= newOperator.priority()) {
//                            Operator operatorFromStack = operatorStack.pop();
//                            Operand operandTwo = operandStack.pop();
//                            Operand operandOne = operandStack.pop();
//                            Operand result = operatorFromStack.execute(operandOne, operandTwo);
//                            operandStack.push(result);
//                        }
//                        operatorStack.push(newOperator);
//                    }
//                } else if (expressionToken.equals(")")) {
//                    while (!operatorStack.isEmpty()) {
//                        Operator operatorFromStack = operatorStack.pop();
//                        Operand operandTwo = operandStack.pop();
//                        Operand operandOne = operandStack.pop();
//                        Operand result = operatorFromStack.execute(operandOne, operandTwo);
//                        operandStack.push(result);
//                    }
//                }
//            }
//        }

        while (expressionTokenizer.hasMoreTokens()) {
            // filter out spaces
            if (!(expressionToken = expressionTokenizer.nextToken()).equals(" ")) {
                // check if token is an operand
                if (Operand.check(expressionToken)) {
                    operandStack.push(new Operand(expressionToken));
                } else if (expressionToken.equals("(")) { // push open parenthesis as operator for stopping point for looped execution
                    operatorStack.push(Operator.getOperator(expressionToken));
                } else if (expressionToken.equals(")")) {
                    /*
                    Per evaluating infix expressions algorithm; on encounter with close parenthesis:
                    1. pop the top operator from operatorStack
                        1a. (and however many operands it requires from the stack aka stopping at open parenthesis)
                    2. push the result of applying that operator to those operands to operandStack
                     */
                    while (!operatorStack.isEmpty() && !operatorStack.peek().equals(Operator.getOperator("("))) {
                        Operator operatorFromStack = operatorStack.pop();
                        Operand operandTwo = operandStack.pop();
                        Operand operandOne = operandStack.pop();
                        Operand result = operatorFromStack.execute(operandOne, operandTwo);
                        operandStack.push(result);
                    }
                    operatorStack.pop(); // Remove the open parenthesis from the stack
                } else {
                    //Check for invalid operator
                    if (!Operator.check(expressionToken)) {
                        throw new InvalidTokenException(expressionToken);
                    }

                    Operator newOperator = Operator.getOperator(expressionToken);

                    while (!operatorStack.isEmpty() && operatorStack.peek().priority() >= newOperator.priority()) {
                        Operator operatorFromStack = operatorStack.pop();
                        Operand operandTwo = operandStack.pop();
                        Operand operandOne = operandStack.pop();
                        Operand result = operatorFromStack.execute(operandOne, operandTwo);
                        operandStack.push(result);
                    }
                    operatorStack.push(newOperator);
                }
            }
        }

        /*
         * once no more tokens need to be scanned from StringTokenizer,
         * we need to evaluate the remaining sub-expressions.
         */
        while (!operatorStack.isEmpty()) {
            Operator operatorFromStack = operatorStack.pop();
            Operand operandTwo = operandStack.pop();
            Operand operandOne = operandStack.pop();
            Operand result = operatorFromStack.execute(operandOne, operandTwo);
            operandStack.push(result);
        }

        return operandStack.pop().getValue();
    }

    public static void main(String[] args) throws InvalidTokenException {
        if (args.length == 1) {
            Evaluator e = new Evaluator();
            System.out.println(e.evaluateExpression(args[0]));
        } else {
            System.err.println("Invalid arguments or No expression given");
        }
    }
}
~~~

</details>



<details>
    <summary>./calculator/evaluator/EvaluatorUI.java</summary>

~~~java
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

~~~

</details>




## Unit Tests Results



~~~bash

Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Jupiter ✔
│  ├─ Multiplication Test ✔
│  │  ├─ simpleMultiplicationTest() ✔
│  │  ├─ simpleMultiplicationTestNegativeOperand() ✔
│  │  ├─ multiplicationPriorityTest() ✔
│  │  ├─ simpleMultiplicationTestReversedOperands() ✔
│  │  └─ simpleMultiplicationTestNegativeOperandReversed() ✔
│  ├─ OperatorTest ✔
│  │  ├─ getOperatorReturnTypeTest(String, Class) ✔
│  │  │  ├─ [1] +, class calculator.operators.AddOperator ✔
│  │  │  ├─ [2] -, class calculator.operators.SubtractOperator ✔
│  │  │  ├─ [3] /, class calculator.operators.DivideOperator ✔
│  │  │  ├─ [4] *, class calculator.operators.MultiplyOperator ✔
│  │  │  └─ [5] ^, class calculator.operators.PowerOperator ✔
│  │  └─ operatorCheckTest(String, Boolean) ✔
│  │     ├─ [1] +, true ✔
│  │     ├─ [2] -, true ✔
│  │     ├─ [3] *, true ✔
│  │     ├─ [4] ^, true ✔
│  │     ├─ [5] /, true ✔
│  │     ├─ [6] 156, false ✔
│  │     ├─ [7] 156., false ✔
│  │     ├─ [8] X, false ✔
│  │     └─ [9] **, false ✔
│  ├─ Division Test ✔
│  │  ├─ simpleDivisionTestNegativeResult() ✔
│  │  ├─ simpleDivisionTest() ✔
│  │  ├─ divisionPriorityTest() ✔
│  │  ├─ simpleDivisionTestReversedOperands() ✔
│  │  └─ simpleDivisionTestEvenlyDivisible() ✔
│  ├─ Addition Test ✔
│  │  ├─ simpleAdditionTestWithNegativeOperand() ✔
│  │  ├─ simpleAdditionTestReverseOperands() ✔
│  │  ├─ simpleAdditionTest() ✔
│  │  ├─ additionPriorityTest() ✔
│  │  └─ simpleAdditionTestWithNegativeOperandsReversed() ✔
│  ├─ Power Test ✔
│  │  ├─ simplePowerTest() ✔
│  │  ├─ simplePowerTestNegativeBase() ✔
│  │  └─ powerPriorityTest() ✔
│  ├─ Evaluator Test ✔
│  │  ├─ mediumExpressionPowerWithParensTest() ✔
│  │  ├─ basicExpressionParensOnRightTest() ✔
│  │  ├─ invalidOperatorExpressionProducesInvalidTokenExceptionTest() ✔
│  │  ├─ basicExpressionDivisionNumeratorLessThanDenominatorTest() ✔
│  │  ├─ mediumExpressionParensAsSubExpressionTest() ✔
│  │  ├─ veryDifficultExpressionMixtureOfOperatorsNestedParensTest() ✔
│  │  ├─ mediumExpressionParensAndOperatorsTest() ✔
│  │  ├─ difficultExpressionMixtureOfOperatorsTest() ✔
│  │  ├─ mediumExpressionPowerTest() ✔
│  │  ├─ mediumExpressionPowerWithMultipleOperators() ✔
│  │  ├─ mediumExpressionWithMultipleParensTest() ✔
│  │  ├─ basicExpressionMultipleOperatorTest() ✔
│  │  ├─ basicExpressionSingleOperatorTest() ✔
│  │  └─ basicExpressionParensOnLeftTest() ✔
│  ├─ Subtraction Test ✔
│  │  ├─ simpleSubtractionTestNegativeOperands() ✔
│  │  ├─ simpleSubtractionTestNegativeOperandsReversed() ✔
│  │  ├─ simpleSubtractionTestReversedOperands() ✔
│  │  ├─ simpleSubtractionTest() ✔
│  │  └─ subtractionPriorityTest() ✔
│  └─ Operand Test ✔
│     ├─ getValueTest() ✔
│     ├─ operandCheckTest(String, boolean) ✔
│     │  ├─ [1] 13, true ✔
│     │  ├─ [2] c, false ✔
│     │  ├─ [3] *, false ✔
│     │  ├─ [4] 430., false ✔
│     │  ├─ [5] 430.456, false ✔
│     │  └─ [6] 343324fd, false ✔
│     └─ getValueTypeTest() ✔
├─ JUnit Vintage ✔
└─ JUnit Platform Suite ✔

Test run finished after 111 ms
[        14 containers found      ]
[         0 containers skipped    ]
[        14 containers started    ]
[         0 containers aborted    ]
[        14 containers successful ]
[         0 containers failed     ]
[        59 tests found           ]
[         0 tests skipped         ]
[        59 tests started         ]
[         0 tests aborted         ]
[        59 tests successful      ]
[         0 tests failed          ]


~~~
    
