package com.suren.generics.practice;

/**
 * Created by Surendirababu Janarthanan on 6/24/2017.
 */
public class Box<T> {
    private T t;

    public Box() {
    }

    public Box(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box<?> box = (Box<?>) o;

        return t != null ? t.equals(box.t) : box.t == null;
    }

    @Override
    public int hashCode() {
        return t != null ? t.hashCode() : 0;
    }
}
