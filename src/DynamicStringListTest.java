import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;



public class DynamicStringListTest {
    // Temp test template
    // @Test
    // void testName_result() {
    // DynamicStringList list = new DynamicStringList();
    // 
    //}

    //TODO: Get tests
    @Test
    void testGet_EqualsPeach() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Peach");
    
        String result = list.get(2);
        
        assertEquals("Peach", result);
    }

    // Learned about testing exceptions to make sure this was working correctly
    // https://codefinity.com/courses/v2/455bd504-41cd-4fd0-98b7-9f3ee575d21a/7425cfcb-65fa-4ed7-b6b5-510ed254606b/a76141f4-e307-4716-b78b-43d70eeda46d
    @Test
    void testGet_OutOfBounds() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Peach");
        
        // testing if list.get(3) returns an exception with assertThrows
        // We're expecing an IndexOutOfBounds exception to be returned by assertThrows
        IndexOutOfBoundsException exception = assertThrows(
            // need to use the lambda because otherwise the test program would stop due to the exception
            IndexOutOfBoundsException.class, () -> { list.get(3); }
        );

        // testing if hte custom exception message matched the expected value of the returned index
        System.out.println(exception.getMessage());
        assertEquals("Index out of bounds: 3", exception.getMessage());
    }

    //TODO: Get tests
    @Test
    void testGet_middleIndex() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Peach");
        
        list.set(1, "Pear");
        String result = list.get(1);
        
        assertEquals("Pear", result);
    }

    //TODO: Add Tests
    @Test
    void testAdd_underCapacity() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.add("Pear");

        String result = list.get(3);

        assertEquals("Pear", result);
    }

    @Test
    void testAdd_oneUnderCapacity() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Ichigo");

        list.add("Pear");
        String result = list.get(9);

        assertEquals("Pear", result);
    }

    @Test
    void testAdd_atCapacity() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Ichigo");
        list.add("Jackfruit");

        list.add("Pear");
        String result = list.get(10);
        assertEquals("Pear", result);
    }

    @Test
    void testAdd_doubleCapacityAtCapacity() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Ichigo");
        list.add("Jackfruit");

        list.add("Pear");
        int result = list.capacity();
        assertEquals(20, result);
    }




    //TODO: Remove Tests
    @Test
    void testRemove_EmptyListOutOfBounds() {
        DynamicStringList list = new DynamicStringList();

        // same test as before for remove
        IndexOutOfBoundsException exception = assertThrows(
            // need to use the lambda because otherwise the test program would stop due to the exception
            IndexOutOfBoundsException.class, () -> { list.remove(0); }
        );

        // testing if hte custom exception message matched the expected value of the returned index
        System.out.println(exception.getMessage());
        assertEquals("Index out of bounds: 0", exception.getMessage());
    }
    

    //TODO: Size Test
    @Test
    void testSize_equalsThree() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Peach");

        int result = list.size();
        System.out.println(list);
        assertEquals(3, result);
    }

    @Test
    void testSize_equalsTwelve() {
        DynamicStringList list = new DynamicStringList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Ichigo");
        list.add("Jackfruit");
        list.add("Kiwi");
        list.add("Lemon");

        int result = list.size();
        //System.out.println(list);
        assertEquals(12, result);
    }

    //TODO: Capacity Test


}
