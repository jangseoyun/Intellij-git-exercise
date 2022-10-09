package codelion.week3.day14.file;

import java.util.List;

public interface DoSomething<T> {
    //List<T>를 리턴하는 인터페이스를 설계
    //T는 구현체로 변경될 수 있는 확장성을 열어둠
    List<T> work(String str);
}
