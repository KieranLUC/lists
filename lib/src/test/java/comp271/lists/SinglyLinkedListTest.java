package comp271.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinglyLinkedListTest {

    @Test
    public void appendsToEndOfList() {

        // given
        ListADT arrayBackedList = new SinglyLinkedListADT();

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
    public void prependsToStartOfList() {

        // given
        ListADT arrayBackedList = new SinglyLinkedListADT();

        // when
        arrayBackedList.prepend(5);
        arrayBackedList.prepend(6);
        arrayBackedList.prepend(7);

        // then
        String expected = "[7, 6, 5]";
        String actual = arrayBackedList.toString();

        assertEquals(expected, actual);
    }

}
