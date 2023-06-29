package designpattern.bridge;

/**
 * 客户端
 * 我的理解就是实现系统可能有多角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合。
 * @author liu yuning
 *
 */
public class BridgeClient {
    public static void main(String[] args) {

	Abstraction a = new AbstractionA("A");
	a.setImplementor(new ConcreteImplemtorA());
	a.operation();
	a.setImplementor(new ConcreteImplemtorB());
	a.operation();

	Abstraction b = new AbstractionB("B");
	b.setImplementor(new ConcreteImplemtorA());
	b.operation();
	b.setImplementor(new ConcreteImplemtorB());
	b.operation();

	// 这样通过使用“组合/聚合复用原则”
	// 如果继续有AbstractionC ... 或者ConcreteImplemtorC ...
	// 只需要扩展类即可，不需要修改现有类，符合“开放-封闭”原则
    }

}
