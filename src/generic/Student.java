package generic;

public class Student<T> {
    private T rollNo;
    private String name;
    //getter and setter

    public String getName() {
        return name;
    }
    public T getRollNo(){
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(T rollNo){
        this.rollNo = rollNo;
    }
    public Student(T rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

}
