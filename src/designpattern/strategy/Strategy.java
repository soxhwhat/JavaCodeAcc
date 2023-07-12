package designpattern.strategy;

/**
 * 策略接口
 * 
 * @author liu yuning
 *
 */
public interface Strategy {
    public void algorithmInterface();
}

/**
 * 将每组行为想象成一个算法族，分别封装起来，让它们之间可以互相替换。
 */
class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
	System.out.println("策略A的具体算法实现");
    }

}

class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithmInterface() {
	System.out.println("策略B的具体算法实现");
    }

}

class ConcreteStrategyC implements Strategy {

    @Override
    public void algorithmInterface() {
	System.out.println("策略C的具体算法实现");
    }

}