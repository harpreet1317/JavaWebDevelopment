import java.util.*;
public class ArrayListDemo {

    public static void main(String[] args) {

        Student s1=new Student(1,"Aman",22);
        Student s2=new Student(2,"Pawan",22);
        Student s3=new Student(3,"Reema",22);

        ArrayList<Student> al =new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollNo+" "+st.name+" "+st.age);


    }
    }
}
