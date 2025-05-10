public class Student
{
    String name;
    int age;
    String address;
    int phoneNumber;
    String courseName;

    public Student()
    {
        name = "Unknown";
        age = 18;
    }

    public Student(String name){
        this.name = name;
        age = 20;
        address = "Address Unknown";
        phoneNumber = 00001;
        courseName = "Not Enrolled";
    }

    public Student() {
//
//            name = "Unknown";
//            age = 18;
//            address = "Sri Lanka";
//            phoneNumber = "94";
//            courseName = "C Clarke";
//
//        }
//
//        public Student(String name){
//
//            this.name = name;
//            age = 18;
//            address = "Sri Lanka";
//            phoneNumber = "94";
//            courseName = "C Clarke";
//
//        }
//
//        public Student(String name, int age){
//
//            this.name = name;
//            this.age = age;
//            address = "Sri Lanka";
//            phoneNumber = "94";
//            courseName = "C Clarke";
//
//        }
//
//        public Student(String name, int age, String address){
//
//            this.name = name;
//            this.age = age;
//            this.address = address;
//            phoneNumber = "94";
//            courseName = "C Clarke";
//
//        }
//
//        public Student(String name, int age, String address, String phoneNumber){
//
//            this.name = name;
//            this.age = age;
//            this.address = address;
//            this.phoneNumber = phoneNumber;
//            courseName = "C Clarke";
//
//        }
//
//        public Student(String name, int age, String address, String phoneNumber, String courseName){
//
//            this.name = name;
//            this.age = age;
//            this.address = address;
//            this.phoneNumber = phoneNumber;
//            this.courseName = courseName;
//
//        }
//
//        void displayStudent(){
//
//            System.out.println("Student Name : " + name +
//                    "Student Age : " + age +
//                    "Student Address : " + address +
//                    "Student Phone Number : " + phoneNumber +
//                    "Student Course Name : " + courseName );
//        }


//Easy method to follow same as top

    public Student() {

            this("Unknown");

        }

    public Student(String name) {

            this(name, 18);

        }

    public Student(String name, int age){

            this(name, age, "Sri Lanka");

        }

    public Student(String name, int age, String address){

            this(name, age, address, "94");

        }

    public Student(String name, int age, String address, String phoneNumber){

            this(name, age, address, phoneNumber, "C clarke");

        }

    public Student(String name, int age){
            this.name = name;
            this.age = age;
            address = "Address Unknown";
            phoneNumber = 00001;
            courseName = "Not Enrolled";

        }
    }

    public Student(String name, int age, String address, int phoneNumber, String courseName){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.courseName = courseName;
    }

    public void displayStudent(){
        System.out.println("Student Name: "
            + name + "Student Age: "
            + age + "Student Address Unkown"
            + address + "Student Phone No: "
            + phoneNumber + "Student Course Name: "
            + courseName);
    }


}
