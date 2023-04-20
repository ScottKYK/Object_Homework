package Homework13;

class Person {
    private String name;
    private int age;
    private char gender;
    private String hob;

    public Person() {
    }

    public Person(String name, int age, char gender, String hob) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hob = hob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHob() {
        return hob;
    }

    public void setHob(String hob) {
        this.hob = hob;
    }

    public void info() {
        System.out.print("姓名:" + this.getName() + "\n年齡:" + getAge() + "\n性別:" + getGender());
    }

    public String play() {
        return getName() + "愛玩" + getHob();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hob='" + hob + '\'' +
                '}';
    }
}
