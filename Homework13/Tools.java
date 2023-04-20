package Homework13;

import java.util.ArrayList;

class Tools {
    public static void BubbleSort(ArrayList<Person> person){
        //按年齡排序,大到小
        Person temp = new Person();
        for (int j = 0; j < person.size() - 1; j++) {
            for (int i = 0; i < person.size() - 1 - j; i++) {
                if (person.get(i).getAge() < person.get(i + 1).getAge()) {
                    temp = person.get(i + 1);
                    person.set(i + 1, person.get(i));
                    person.set(i, temp);
                }
            }
        }
    }

    public static void transfer(Person person){
        if(person instanceof Student){
            Student s = (Student) person;
            s.study();
        }else if(person instanceof Teacher){
            Teacher t = (Teacher) person;
            t.teach();
        }

    }
}
