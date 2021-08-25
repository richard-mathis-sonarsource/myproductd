import org.junit.jupiter.api.Test;

public class Rspec5786Test { // Noncompliant - modifier can be removed

    @Test
    protected void test() { // Noncompliant - modifier can be removed
        System.out.println("mytest");
    }
}
