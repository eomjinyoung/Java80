package designpattern.chainofresponsibility;

public class MultipleOperator extends AbstractOperator {
  @Override
  public int calculate(String op, int a, int b) throws Exception {
    if (op.equals("*")) {
      return a * b;
    }
    return super.calculate(op, a, b); 
  }
  
}
