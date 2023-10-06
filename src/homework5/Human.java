package homework5;

public class Human {
    private String name;


    private int age;
    private int Schoolnumber;
    public Human() {
    }


    public void setAge(int age ) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSchoolnumber(int Schoolnumber) {
        this.Schoolnumber = Schoolnumber;
    }

    public int getSchoolnumber() {
        return Schoolnumber;

}
    public static void main(String[] args) {
        Human tymothy = new Human();
        tymothy.setAge(14);
        tymothy.setName("Tymothy");
        tymothy.setSchoolnumber(256);

        System.out.println(tymothy.getAge());
        System.out.println(tymothy.getName());
        System.out.println(tymothy.getSchoolnumber());
    }


}

