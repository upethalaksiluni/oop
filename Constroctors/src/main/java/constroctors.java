public class constroctors
{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Lakal");
        Student student3 = new Student("Vihanga",18);
        Student student4 = new Student("Rasanjana",18, "Maharagama");
        Student student5 = new Student("Geekiyanage",18, "Maharagama", "0706349884");

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.address);
        System.out.println(student1.phoneNumber);
        System.out.println(student1.courseName);

    }

}
