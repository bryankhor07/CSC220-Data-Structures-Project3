/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Assignment04PartD.java
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

package assignment04PartD;

public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException() {
        this(null);
    } // end default constructor

    public EmptyQueueException(String message) {
        super(message);
    } // end constructor
} // end EmptyQueueException
