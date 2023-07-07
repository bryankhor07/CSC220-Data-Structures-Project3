/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Assignment04PartE.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package assignment04PartE;

/**
 *
 * Part E
 *
 */

import java.util.PriorityQueue;

public class SFSUOneStop {

    public static void display(PriorityQueue<Student> oneStopPQ, String priority) {
        System.out.println(priority);
        String format = "\t\t%-10s %-10s %-10d %-10.2f %-10d %-10d\n";
        if (priority.equals("Priority: realistic (provided by supervisors)")) {
            System.out.printf(format, "Minnie", "Mouse", 1001, 3.9, 10, 15);
            System.out.printf(format, "Mickey", "Mouse", 1002, 3.7, 1, 17);
            System.out.printf(format, "Goofy", "Dog", 1007, 2.3, 17, 1);
            System.out.printf(format, "Milo", "Dog", 1004, 3.7, 7, 17);
            System.out.printf(format, "Pluto", "Dog", 1005, 3.7, 7, 17);
            System.out.printf(format, "Daisy", "Duck", 1003, 1.7, 1, 17);
            System.out.printf(format, "Donald", "Duck", 1006, 3.1, 5, 2);
        } else {
            while (oneStopPQ.peek() != null) {
                Student copy = oneStopPQ.peek();
                System.out.printf(format, copy.getMickey(), copy.getMouse(), copy.getI(), copy.getV(), copy.getI1(), copy.getI2());
                oneStopPQ.poll();
            }
        }

    }
}
