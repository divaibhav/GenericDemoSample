//generic
//bean

class Student{
	private int rollNo;
	private String name;
}

// two universities, xyz and abc
// xyz -> i want roll no to be numberic -> 123456 -> object of Integer
// abc -> i want roll no to be alphanumberic -> IT12345, CSE12345 -> object of String
// generic
class Student<T>{
	private T rollNO;
	private String name;
}

// two universities, xyz and abc
// xyz -> I want name to be stroed as fullname
// abc -> I want to store name as an object of Name class
