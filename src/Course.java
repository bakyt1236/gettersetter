public class Course {
    private String name;
    private String number;
    private String nameteacher;
    private String startcourse;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>2) {
            this.name = name;
        }else
            System.out.println("The name is incorrect.");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number.length() > 9){
            this.number = number;
    }else
            System.out.println("Wrong number");
    }

    public String getNameteacher() {
        return nameteacher;
    }

    public void setNameteacher(String nameteacher) {
        if (nameteacher.length() > 2){
            this.nameteacher = nameteacher;
    }else
            System.out.println("The name is incorrect");
    }

    public String getStartcourse() {
        return startcourse;
    }

    public void setStartcourse(String startcourse) {
        if (startcourse.length()==10) {
            this.startcourse = startcourse;
        }else
            System.out.println("You wrote it wrong");
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + "\n" +
                ", number='" + number + "\n" +
                ", nameteacher='" + nameteacher + "\n" +
                ", startcourse='" + startcourse + "\n" +
                '}';
    }
}
