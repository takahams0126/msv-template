package jp.co.example.msvservice1;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Foo.
 */
@Data
@NoArgsConstructor
public class Foo {

    /** aaa. */
    private String name;

    /** aaa. */
    private int age;

    /** hoge. */
    private List<String> hoge;

    /**
     * bar.
     */
    public void bar() {
    }
}
