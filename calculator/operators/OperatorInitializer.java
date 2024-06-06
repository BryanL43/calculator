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
