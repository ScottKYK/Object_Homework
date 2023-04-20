package Homework13;

public class Teacher extends Person {
    private int workAge;

    public Teacher(String name, int age, char gender, String hob, int workAge) {
        super(name, age, gender, hob);
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public void info() {
        System.out.println("老師信息:");
        super.info();
        System.out.println("\n工齡:" + getWorkAge());
        teach();
        System.out.println(play());
    }
    public void teach(){
        System.out.println("好好上課");
    }
}
