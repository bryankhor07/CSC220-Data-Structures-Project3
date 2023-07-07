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

public final class Student implements Comparable<Student> {

    private String mickey; // First name
    private String mouse; // Last name
    private int i; // student-id
    private double v; // gpa
    private int i1; // number of small questions
    private int i2; // number of big questions
    private static String cPriority;

    public Student(String mickey, String mouse, int i, double v, int i1, int i2) {
        this.mickey = mickey;
        this.mouse = mouse;
        this.i = i;
        this.v = v;
        this.i1 = i1;
        this.i2 = i2;
    }

    public String getMickey() {
        return mickey;
    }

    public void setMickey(String mickey) {
        this.mickey = mickey;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public String toString() {
        if (mouse.equals("Dog")) {
            return "\t\t" + mickey + "\t\t" + mouse + "\t\t\t" + i + "\t\t" + v + "\t\t" + i1 + "\t\t" + i2;
        } else {
            return "\t\t" + mickey + "\t\t" + mouse + "\t\t" + i + "\t\t" + v + "\t\t" + i1 + "\t\t" + i2;
        }
    }

    public static String[] getPriorities() {
        String[] array = new String[8];
        array[0] = "Priority: realistic (provided by supervisors)";
        array[1] = "Priority: first-name";
        array[2] = "Priority: last-name";
        array[3] = "Priority: student-id";
        array[4] = "Priority: gpa";
        array[5] = "Priority: number-of-small-questions";
        array[6] = "Priority: number-of-big-questions";
        array[7] = "Priority: number-of-small-and-big-questions";
        return array;
    }

    public static void setCompareToPriority(String priority) {
        cPriority = priority;
    }

    @Override
    public int compareTo(Student o) {
        switch (Student.cPriority) {
            case "Priority: first-name" -> {
                String string1 = new String(o.getMickey());
                String string2 = new String(this.getMickey());
                return string2.compareTo(string1);
            }
            case "Priority: last-name" -> {
                String string3 = new String(o.getMouse());
                String string4 = new String(this.getMouse());
                return string4.compareTo(string3);
            }
            case "Priority: student-id" -> {
                int tempId = o.getI();
                if (this.getI() < tempId) {
                    return -1;
                }
                if (this.getI() > tempId) {
                    return 1;
                }
                return 0;
            }
            case "Priority: gpa" -> {
                double tempGpa = o.getV();
                String tempFirstName = o.getMickey();
                if (this.getV() < tempGpa) {
                    return -1;
                }
                if (this.getV() > tempGpa) {
                    return 1;
                }
                if (this.getV() == tempGpa) {
                    return this.getMickey().compareTo(tempFirstName);
                }
                return 0;
            }
            case "Priority: number-of-small-questions" -> {
                int tempi1 = o.getI1();
                String tempFirstName = o.getMickey();
                if (this.getI1() < tempi1) {
                    return -1;
                }
                if (this.getI1() > tempi1) {
                    return 1;
                }
                if (this.getI1() == tempi1) {
                    return this.getMickey().compareTo(tempFirstName);
                }
                return 0;
            }
            case "Priority: number-of-big-questions" -> {
                int tempi2 = o.getI2();
                String tempFirstName = o.getMickey();
                if (this.getI2() < tempi2) {
                    return -1;
                }
                if (this.getI2() > tempi2) {
                    return 1;
                }
                if (this.getI2() == tempi2) {
                    return this.getMickey().compareTo(tempFirstName);
                }
                return 0;
            }
            case "Priority: number-of-small-and-big-questions" -> {
                int sum = o.getI1() + o.getI2();
                String tempFirstName = o.getMickey();
                if(this.getI1() + this.getI2() < sum) {
                    return -1;
                }
                if (this.getI1() + this.getI2() > sum) {
                    return 1;
                }
                if ((this.getI1() + this.getI2()) == sum)
                {
                    return this.getMickey().compareTo(tempFirstName);
                }
                return 0;
            }
        }
        return 0;
    }
}
