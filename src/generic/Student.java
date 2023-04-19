package generic;

public class Student<T,E> {
    private T rollNo;

    //name either of type String or of type Name class
    private E name;
    //getter and setter

    public E getName() {
        return name;
    }
    public T getRollNo(){
        return rollNo;
    }

    public void setName(E name) {
        this.name = name;
    }
    public void setRollNo(T rollNo){
        this.rollNo = rollNo;
    }
    public Student(T rollNo, E name){
        this.rollNo = rollNo;
        this.name = name;
    }

}
