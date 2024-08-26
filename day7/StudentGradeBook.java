package day7;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class StudentGradeBook {
    private static void displayGradeBook(SortedMap<String, Integer> gradeBook) {
        if (gradeBook.isEmpty()) {
            System.out.println("Grade book is empty.");
            return;
        }
        for (Map.Entry<String, Integer> entry : gradeBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        SortedMap<String, Integer> gradeBook = new TreeMap<>();

        gradeBook.put("Alia", 78);
        gradeBook.put("Bhuwan", 85);
        gradeBook.put("Chetna", 90);
        gradeBook.put("Deepak", 92);

        System.out.println("Grade Book:");
        displayGradeBook(gradeBook);

        gradeBook.put("Alia", 88);

        System.out.println("\nUpdated Grade Book:");
        displayGradeBook(gradeBook);

        gradeBook.remove("Chetna");
        System.out.println("\nGrade Book after removing Chetna:");
        displayGradeBook(gradeBook);

        System.out.println("\nContains Alia? " + gradeBook.containsKey("Alia"));
        System.out.println("Contains grade 90? " + gradeBook.containsValue(90));

        System.out.println("\nSize of grade book: " + gradeBook.size());

        System.out.println("Is grade book empty? " + gradeBook.isEmpty());

        System.out.println("\nStudents: " + gradeBook.keySet());
        System.out.println("Grades: " + gradeBook.values());

        System.out.println("\nFirst student: " + gradeBook.firstKey());
        System.out.println("Last student: " + gradeBook.lastKey());

        SortedMap<String, Integer> subMap = gradeBook.subMap("Bhuwan", "Deepak");
        if (subMap.isEmpty()) {
            System.out.println("\nNo elements found in submap from Bhuwan to Deepak.");
        } else {
            System.out.println("\nSubmap from Bhuwan to Deepak: " + subMap);
        }

        SortedMap<String, Integer> headMap = gradeBook.headMap("Deepak");
        if (headMap.isEmpty()) {
            System.out.println("No elements found in headMap up to Deepak.");
        } else {
            System.out.println("HeadMap up to Deepak: " + headMap);
        } // exclusive

        SortedMap<String, Integer> tailMap = gradeBook.tailMap("Bhuwan");
        if (tailMap.isEmpty()) {
            System.out.println("No elements found in tailMap from Bhuwan.");
        } else {
            System.out.println("TailMap from Bhuwan: " + tailMap);
        } // inclusive

        gradeBook.clear();
        System.out.println("\nGrade Book after clearing:");
        displayGradeBook(gradeBook);
    }


}
