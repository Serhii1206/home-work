package functionalInterface;

@FunctionalInterface
public interface FunctionInterface<T, U> {
    U getNumber(T t);
}
