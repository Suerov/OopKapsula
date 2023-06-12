public class Student {


    private String name;
    private String birthday;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge( ) {
        if (age>0){

        }else if (age<0) {
            System.out.println(0);

        }
            return age;

    }

    public void setAge(int age) {
        this.age = age;
    }
}