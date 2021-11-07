package comp271.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayBackedListTest {

    @Test
    public void pass() {
        assertTrue(true);
    }

    @Test
    public void appendsToEndOfList() {

        // given
        ListADT arrayBackedList = new ArrayBackedListADT(5);

        // when
        arrayBackedList.append(5);
        arrayBackedList.append(6);
        arrayBackedList.append(7);

        // then
        String expected = "[5, 6, 7]";
        String actual = arrayBackedList.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void prependsToBeginningOfList() {

        // given
        ListADT arrayBackedList = new ArrayBackedListADT(5);

        // when
        arrayBackedList.prepend(5);
        arrayBackedList.prepend(6);
        arrayBackedList.prepend(7);

        // then
        String expected = "[7, 6, 5]";
        String actual = arrayBackedList.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void removesFromTheMiddleOfList() {
        // given
        ListADT arrayBackedList = new ArrayBackedListADT(5);

        arrayBackedList.append(5);
        arrayBackedList.append(6);
        arrayBackedList.append(7);

        // when
        arrayBackedList.remove(6);

        // then
        String expected = "[5, 7]";
        String actual = arrayBackedList.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void handlesOverflowWhenAppending() {
        // given
        ListADT arrayBackedList = new ArrayBackedListADT(2);

        // when
        arrayBackedList.append(5);
        arrayBackedList.append(6);
        arrayBackedList.append(7);

        // then
        String expected = "[5, 6, 7]";
        String actual = arrayBackedList.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void handlesOverflowWhenPrepending() {
        // given
        ListADT arrayBackedList = new ArrayBackedListADT(2);

        // when
        arrayBackedList.append(5);
        arrayBackedList.append(6);
        arrayBackedList.append(7);

        // then
        String expected = "[5, 6, 7]";
        String actual = arrayBackedList.toString();

        assertEquals(expected, actual);
    }

}
