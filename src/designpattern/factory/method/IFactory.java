package designpattern.factory.method;

import designpattern.factory.simple.Operation;
import designpattern.factory.simple.OperationAdd;
import designpattern.factory.simple.OperationDiv;
import designpattern.factory.simple.OperationMul;
import designpattern.factory.simple.OperationSub;

/**
 * 工厂接口
 *
 * 简单工厂模式：简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，对于客户端来说，去除了与具体产品的依赖
 * 但是违反了开闭原则，如果需要增加新的功能，必须修改工厂类，这样就会造成工厂逻辑过于复杂。
 * @author liu yuning
 *
 */
public interface IFactory {
    public Operation createOperation();
}

class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationAdd();
    }

}

class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationSub();
    }

}

class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationMul();
    }

}

class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationDiv();
    }

}