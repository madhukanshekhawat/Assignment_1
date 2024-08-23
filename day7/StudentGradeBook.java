package day7;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

public class StudentGradeBook {
    private static void displayGradeBook(SortedMap<String, Integer> gradeBook) {
        for (Map.Entry<String, Integer> entry : gradeBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        SortedMap<String, Integer> gradeBook = new TreeMap<>();

        gradeBook.put("Alia", 85);
        gradeBook.put("Bhuwan", 92);
        gradeBook.put("Chetna", 78);
        gradeBook.put("Deepak", 90);

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

        System.out.println("\nSubmap from Bhuwan to Deepak: " + gradeBook.subMap("Bhuwan", "Deepak"));

        System.out.println("HeadMap up to Deepak: " + gradeBook.headMap("Deepak"));// exclusive

        System.out.println("TailMap from Bob: " + gradeBook.tailMap("Bob")); // inclusive

        gradeBook.clear();
        System.out.println("\nGrade Book after clearing:");
        displayGradeBook(gradeBook);
    }


}
