package designpattern.strategy;

/**
 * 上下文
 * 
 * @author liu yuning
 *
 */
public class Context {

    /**
     * 去除掉原本的方法，采用实例变量的方式声明一个Strategy接口
     * 每个Context对象会动态地设置这些变量以在运行时引用正确的行为类型。
     */
    Strategy strategy;

    public Context(Strategy strategy) {
	this.strategy = strategy;
    }

    /**
     * 动态设置策略
     *
     * @param strategy
     */
    public void setStrategy(Strategy strategy) {
            this.strategy = strategy;
    }

    /**
     * 上下文接口
     *
     * Context对象本身不处理算法，而是把这些工作委托给了Strategy接口。
     */
    public void contextInterface() {
	strategy.algorithmInterface();
    }

}