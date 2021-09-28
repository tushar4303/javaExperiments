public class Student {
    String name;
    int age;
    String address;

    public Student(){
        name = "unknown";
        age = 0;
        address = "not available";
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student();
        students[0].setInfo("Jasmit", "Mumbai", 22);

        students[1] = new Student();
        students[1].setInfo("Ravi", "Mumbai", 21);

        students[2] = new Student();
        students[2].setInfo("Tejas", "Delhi", 20);

        students[3] = new Student();
        students[3].setInfo("Harpreet", "Mumbai", 22);

        students[4] = new Student();
        students[4].setInfo("Pratik", "Nashik", 19);

        students[5] = new Student();
        students[5].setInfo("Ritik", "Mumbai", 18);

        students[6] = new Student();
        students[6].setInfo("Priyanka", "Mumbai", 22);

        students[7] = new Student();
        students[7].setInfo("Isha", "Nagpur", 21);

        students[8] = new Student();
        students[8].setInfo("Disha", "Mumbai", 19);

        students[9] = new Student();
        students[9].setInfo("Lisha", "Pune", 22);

    }

    void setInfo(String name , int age){

        this.name = name;

        this.age = age;

        System.out.println("Name : "+name+ "\tAge : "+age);

    }

    void setInfo(String name ,String address , int age){

        this.name = name;

        this.address = address;

        this.age = age;

        System.out.println("Name : "+name+"\tAddress : "+address+"\tAge : "+age);

    }
}
