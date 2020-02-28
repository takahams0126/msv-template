package jp.co.example.msvservice1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * サンプルテストクラスです.
 */
@SpringBootTest
class MsvApplicationTests {

    /**
     * テスト１.
     */
    @Test
    void contextLoads() {
        final Foo foo = new Foo();
        foo.getAge();
        foo.getName();
    }

}
