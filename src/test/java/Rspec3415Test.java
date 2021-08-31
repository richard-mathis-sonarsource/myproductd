import com.mathiric.common.Color;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;

public class Rspec3415Test {

    private String myString = "myTest";
    private Color blue = new Color();
    private Color green = new Color();
    private File myFile = new File("root.v");

    @Test
    public void doSomething() {
        org.junit.jupiter.api.Assertions.assertEquals(blue, 0, "Unexpected exit code");  // Noncompliant; Yields error message like: Expected:<-1>. Actual:<0>.
        org.assertj.core.api.Assertions.assertThat("tot").isEqualTo(myString); // Noncompliant
    }
}
