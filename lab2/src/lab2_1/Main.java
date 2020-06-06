package lab2_1;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Saule", 18); //создаем новый объект класса
		
		System.out.println(s1.getName()); //выводим для объекта метод 
		System.out.println(s1.getId());
		
		s1.incrementYearOfStudy(); //выполняем метод для объекта
		
		System.out.println(s1.getYearOfStudy()); //вызываем 
		
	}

}
