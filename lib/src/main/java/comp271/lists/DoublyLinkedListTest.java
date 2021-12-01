package comp271.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoublyLinkedListTest {

    @Test
    public void testImplementations() {

        // given
        ListADT arrayBackedList = new SinglyLinkedListADT();
        //I don't know how to change this to work with my DoublyLinkedList class because it's not linked to ListADT?

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
