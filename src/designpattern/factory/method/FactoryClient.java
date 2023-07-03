package designpattern.factory.method;

import designpattern.factory.simple.Operation;

/**
 * 工厂方法客户端
 *
 *
 * 由于使用了多态性，工厂方法模式保持了简单工厂模式的优点，而且克服了它的缺点。但缺点是由于每加一个产品，就需要加一个产品工厂的类，增加了额外的开发量。
 * @author liu yuning
 *
 */
public class FactoryClient {
    public static void main(String[] args) {
	IFactory operFactory = new DivFactory();
	Operation operation = operFactory.createOperation();

	operation.numberA = 3.4;
	operation.numberB = 4.5;

	System.out.println(operation.result());

    }
}