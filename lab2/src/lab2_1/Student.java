package lab2_1;

public class Student {
	
	String name;
	int id;
	int yearOfStudy;
	
	public Student(String name, int id) { //конструктор для класса
		this.name = name; //инициализация
		this.id = id;
		this.yearOfStudy = 1;
	}
	public String getName() {  //создаем публичный метод который возвращает один из значений конструктора
		return name;
	}
	public int getId() {
		return id;
	}
	public void incrementYearOfStudy() { // метод для инкремента 
		yearOfStudy++;
	}
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	public void Set(String name) {
		this.name = name;
	}
}
