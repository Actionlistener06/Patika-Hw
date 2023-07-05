import java.util.ArrayList;
import java.util.HashMap;

public class hw01 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> classes = new ArrayList<>();
        HashMap<String,Integer> studentsWithClass = new HashMap<>();

        students.add("KAAN AYHAN");
        students.add("AYSHA AYHAN");
        students.add("POPESCU AYHAN");
        students.add("FURKAN ALI AYHAN");
        students.add("FARUK AYHAN");
        students.add("SEMIH AYHAN");
        students.add("AYHAN AYHAN");
        classes.add(1);
        classes.add(2);
        classes.add(3);
        classes.add(4);
        classes.add(5);
        classes.add(6);
        classes.add(7);

        for(int i=0;i<students.size();i++){
            studentsWithClass.put(students.get(i),classes.get(i));
        }
        for(String s: studentsWithClass.keySet()){
            if(s.contains("AN ")){
                System.out.println(s+" ogrencisinin sinifi= "+studentsWithClass.get(s));
            }
        }
    }
}