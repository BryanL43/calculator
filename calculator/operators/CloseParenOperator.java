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
