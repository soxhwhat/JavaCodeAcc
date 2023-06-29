package designpattern.factory.simple;

/**
 * 操作类工厂类
 * 到底要实例化谁，将来会不会增加实例化的对象，比如增加开根运算，这是很容易变化的地方，应该考虑用一个单独的类来做这个创造实例的过程，这就是工厂，来，
 * @author liu yuning
 *
 */
public class OperationFactory {
    public static Operation createOperation(char operator) {
	Operation operation = null;

	switch (operator) {
	case '+':
	    operation = new OperationAdd();
	    break;
	case '-':
	    operation = new OperationSub();
	    break;
	case '*':
	    operation = new OperationMul();
	    break;
	case '/':
	    operation = new OperationDiv();
	    break;
	default:
	    throw new RuntimeException("unsupported operation");
	}

	return operation;
    }
}