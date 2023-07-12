package designpattern.strategy;

/**
 * 客户端使用策略
 * 
 * @author liu yuning
 *
 */
public class StrategyClient {
    public static void main(String[] args) {
	Context context;

	context = new Context(new ConcreteStrategyA());
	context.contextInterface();

	context = new Context(new ConcreteStrategyB());
	context.contextInterface();

	context = new Context(new ConcreteStrategyC());
	context.contextInterface();
	// 动态改变策略
	// 在运行时想改变鸭子的行为，只需调用鸭子的setter方法就可以。
	context.setStrategy(new ConcreteStrategyA());
	context.contextInterface();

    }
}
