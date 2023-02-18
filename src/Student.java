public class Student {
    private String name;
    private String surname;
    private int age;
    private String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 3) {
            this.name = name;
        } else
            System.out.println("The name is incorrect.");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length()>3) {
            this.surname = surname;
        }else
            System.out.println("The surname is incorrect");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 8) {
            this.age = age;
        }else
            System.out.println("Maximum age is 8");
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        if (birthday.length() == 10){
            this.birthday = birthday;
    }else System.out.println("You wrote it wrong");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + "\n" +
                ", surname='" + surname + "\n" +
                ", age=" + age +
                ", birthday='" + birthday + "\n" +
                '}';
    }
}
