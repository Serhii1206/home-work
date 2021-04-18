package implInterface;

import interfaces.SecondInterface;

import java.lang.annotation.Annotation;

public class ClassImpl2 implements FunctionalInterface, SecondInterface {
    @Override
    public void print() {
        System.out.println("Print");
    }
    @Override
    public void printOff() {
        System.out.println("Print off");
    }
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
