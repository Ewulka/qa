package pl.jsystems.qa.qajunit;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static com.google.common.truth.Truth.assertThat;



@DisplayName("JunitTest")
public class JunitTest {
    private static final String STRING_TESTOWY = "stringTestowy";

    @DisplayName("FirstTest")
    @Test
    public void firstTest() {

        assertEquals(2 + 3, 5);
        assertNotEquals(2 + 2, 5);
        assertTrue(STRING_TESTOWY.contains("st"));
        assertTrue(STRING_TESTOWY.endsWith("wy"));
        assertEquals(STRING_TESTOWY, "stringTestowy");

    }


    @DisplayName("JunitTest")
    @Test
    public void junitTest() {
        System.out.println(0.2 * 0.2);
//        assertEquals(0.2 * 0.2 , 0.04);

        double result = new BigDecimal("0.2").multiply(new BigDecimal("0.2")).doubleValue();
        assertEquals(result, 0.04);
    }

    @DisplayName("StringTest")
    @Test
    public void stringTest() {
        String simpleString = "simpleString";
        String simple = "simpleString";

        String simpleString_2 = new String("simpleString");
        String simpleString_3 = new String("simpleString");

        assertSame("simpleString", simpleString);
        assertSame(simple, simpleString);
        assertSame(simple, simpleString);
        assertNotSame(simple, simpleString_2);
                assertTrue(simpleString == simple);
        assertFalse(simpleString == simpleString_3);
        assertTrue(simpleString.equals(simpleString_3));

        assertEquals(simple, simpleString);

        assertEquals(simpleString, simpleString_2);

        assertEquals(simpleString_3, simpleString_2);

    }

   // @Test
    //public void googleTruthTest() {
    //    assertThat(STRING_TESTOWY).contains("ingT");
   // }

    @DisplayName("Zad1")
@Test

    public void zad1(){
    String resultString = "Wordpress powers 100% of the internet";
    String expectedString = "Wordpress powers 5% of the internet";
   assertThat(resultString).startsWith("Wordpress powers ");



}

@Tags({@Tag("nested"), @Tag("junit")})
@DisplayName("Nested")
@Nested
public class NestedTest{

@Test
        public void ListTest() {


    List<Integer> result = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> expected = Arrays.asList(3, 4, 5);

    assertThat(result).containsAnyIn(expected);
    assertTrue(result.containsAll(expected));

}
}
}
