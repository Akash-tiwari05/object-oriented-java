package OOPs;

class Student{
    String name; // Instance variable
    static String school = "Vmc School"; // Static variable

    //here we can access both instance and static
    void showName(){
        System.out.println("Hello my name is "+name);
        System.out.println("And I am studying at "+school);
    }

    //in static method we can not access instance variable
    static void showSchool(Student s){
        System.out.println("Hello my name is "+s.name);
        System.out.println("Hello my name is "+school);
    }
}


public class StaticVsInstance {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Akash";
        Student.school = "VMC School"; // here I can access or modify my static key
        st.showName();
        Student.showSchool(st);
    }
}
