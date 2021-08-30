import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.io.File;
import java.nio.file.Path;

class Rspec5838Test {

    private String myString = "myTest";
    private File myFile = new File("root.v");
    private Path path;

    @Test
    void test() {

        assertThat(getObject()).isEqualTo(null); // Noncompliant
        assertThat(getObject()).isNotEqualTo(null); // Noncompliant - not listed above but also supported

        assertThat(getString().trim()).isEmpty();
        assertThat(getFile().canRead()).isTrue();
        assertThat(getPath().getParent()).isNull();

        System.out.println("mytest");
    }

    public String getString() { return myString; }
    public String getObject() { return myString; }
    public File getFile() { return myFile; }
    public Path getPath() { return path; }

}
