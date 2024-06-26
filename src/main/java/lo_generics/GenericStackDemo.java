package lo_generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class GenericStackDemo {

    public static void main(String[] args) {

        GenericStack<Integer> iStack = new GenericStack<>();
        GenericStack<String> sStack = new GenericStack<>();

        System.out.println("Size: " + iStack.getSize());
        System.out.println("Size: " + sStack.getSize());

        iStack.push(19);
//         iStack.push("20"); // not allowed

        sStack.push("Welcome");

        //        sStack.push(20);  // not allowed
        sStack.push(String.valueOf(20));

        // sStack.push(new Date());    // not allowed
        sStack.push(new Date().toString());

        System.out.println("Size: " + iStack.getSize());
        System.out.println("Size: " + sStack.getSize());

        ArrayList<String> al;
        LinkedList<String> ll;


    }

}
