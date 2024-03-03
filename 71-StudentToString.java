 class StudentToString {
    String name;
    int age;
    String RollNumber;
    String house;

    public StudentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        RollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Detail:{name:"+ name+ ", age:"+ age + ", roll number:"+ RollNumber +", House:"+ house + ",}";

    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Rehan",
                24, "26", "Salha");
        System.out.println(stu);
    }
}
