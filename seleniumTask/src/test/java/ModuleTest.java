import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ModuleTest extends BaseTest {

    private Stream<Arguments> getParametersToCheck(){
        return Stream.of(Arguments.of("642202778244122116025897"), Arguments.of("612240810044122045151358"));
    }


    @ParameterizedTest
    @MethodSource("getParametersToCheck")
    public void packageDeliveredTest(String packageNumber) {
        Assertions.assertEquals("Dostarczona.", inpostMainPage.acceptCookies().searchForPackage(packageNumber).getStatusName());
    }
}

