package Homework13;

class Student extends Person {
    private String sutID;

    public Student(String name, int age, char gender, String hob, String sutID) {
        super(name, age, gender, hob);
        this.sutID = sutID;
    }

    public String getSutID() {
        return sutID;
    }

    public void setSutID(String sutID) {
        this.sutID = sutID;
    }

    public void info(){ // 將不同的資訊封裝到同一個方法內 ,後續在主方法中輸出,實現代碼簡潔
        System.out.println("學生信息:");
        super.info();
        System.out.println("\n學號:"+getSutID());
        study();
        System.out.println(play());
    }

    @Override
    public String play() {
        return getName() + "愛玩" + getHob();
    }

    public void study(){
        System.out.println("好好學習");
    }
}
