
public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Khabib");
        course.setNumber("0779291310");
        course.setAge("35");
        course.setDay("01");
        System.out.println(course.getName() + "\n" + course.getDay() + "\n" + course.getNumber() + "\n" + course.getAge());

        Student student= new Student();
        student.setName("Magregor");
        student.setAge(35);
        student.setBirthday("01");
        System.out.println(student.getName()+"\n"+course.getAge()+"\n"+student.getBirthday());


    }
}