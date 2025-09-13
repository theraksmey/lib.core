package dev.raksmey.function;

import java.util.function.Function;

public class Mapper {

    public  static <T, R>  R map(Function<? super T, ? extends R> mapper, T t) {
        return mapper.apply(t);
    }
}
