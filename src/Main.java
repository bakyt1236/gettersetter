public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Course course = new Course();
        student.setName("Name:Ji");
        student.setSurname("Surname:C");
        student.setAge(9);
        student.setBirthday("21.03.2000");
        course.setName("It kg");
        course.setNameteacher("Azamat");
        course.setNumber("0777888999");
        course.setStartcourse("05.05.21");
        System.out.println(student.getName() + "\n" + student.getSurname() + "\n" + student.getAge() + "\n" +
                student.getBirthday());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(course.getName() + "\n" + course.getNameteacher() + "\n" + course.getNumber() + "\n"
                + course.getStartcourse());


    }
}