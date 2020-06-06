package lab2_2;

public class StarTriangle {
	int width;
	public StarTriangle (int width) {
		this.width = width; //идентификация переменных
	}
	public String toString() { //метод
		String s = "";  
		for (int i =1; i <= width; i++) { //двойной цикл
			for (int j=1; j <= i; j++ ) {
				s += "[*]"; //заполняем стринговую переменную пока условия верны 
			}
			s += "\n"; //переход на след лайн как только заполняются звездочки
		}
		return s;
	}
}
