package codelion.week3.day14.context.context;

public interface Parser<T> {
    T parse(String str);
}
