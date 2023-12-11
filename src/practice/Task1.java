package practice;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> studentsName = new ArrayList<>();

        studentsName.add("Aizhan");
        studentsName.add("Shirin");
        studentsName.add("Amir");
        studentsName.add("Azim");
        studentsName.add("Meerim");

        for (String i:studentsName) {
            System.out.println(i);
        }
    }
}
