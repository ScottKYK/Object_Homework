package Homework13;

import java.util.ArrayList;

public class Homework13 {
    public static void main(String[] args) {
        //用多態array裝載2學生 & 2教師
        //Person [] person0 = new Person[4];
        ArrayList<Person> person = new ArrayList<>(); // 沒有裝載上限
        Person student = new Student("小明", 15, '男', "足球", "00023102");
        Person student2 = new Student("小美", 16, '女', "畫畫", "00023103");
        student.info();

        System.out.println("-------------------");

        Person teacher = new Teacher("張飛", 30, '男', "下象棋", 5);
        Person teacher2 = new Teacher("趙雲", 26, '男', "騎馬", 2);
        teacher.info();

        person.add(teacher);
        person.add(student);
        person.add(student2);
        person.add(teacher2);

        System.out.println("============排序前結果==============");
        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }

        System.out.println("===============");
        for (int i = 0; i < person.size(); i++) {
            Tools.transfer(person.get(i));
        }

        Tools.BubbleSort(person);
        System.out.println("============排序後結果==============");
        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }



    }
}
