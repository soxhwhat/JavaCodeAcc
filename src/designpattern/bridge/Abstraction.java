package designpattern.bridge;

/**
 * 
 * @author liu yuning
 *
 * 有一个聚合线，哈，像一座桥。
 * 由于实现的方式有多种，桥接模式的核心意图就是把这些实现独立出来，让它们各自地变化。这就使得每种实现的变化不会影响其他实现，从而达到应对变化的目的。
 */
public abstract class Abstraction {
    protected Implementor implementor;// 桥接模式的关键，使得Abstraction聚合Implementor
    private String name;

    public Abstraction(String name) {
	this.setName(name);
    }

    /**
     * 品牌需要关注软件，所以可在机器中安装软件，以备运行。
     * @param implementor
     */
    public void setImplementor(Implementor implementor) {
	this.implementor = implementor;
    }

    public void operation() {
	System.out.print("Abstraction-" + this.getName() + ": ");
	implementor.operation();
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
}

/**
 * 可以看作是不同的品牌
 */
class AbstractionA extends Abstraction {

    public AbstractionA(String name) {
	super(name);
    }

    @Override
    public void operation() {
	super.operation();
    }

}

class AbstractionB extends Abstraction {

    public AbstractionB(String name) {
	super(name);
    }

    @Override
    public void operation() {
	super.operation();
    }

}
