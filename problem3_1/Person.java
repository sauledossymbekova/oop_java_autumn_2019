package problem3_1;

public class Person {
	Gender g;
	  Person(char c) {
	    if (c == 'B') g = Gender.B;
	    else g = Gender.G;
	  }
	  public String toString() {
	    if (g == Gender.B) return "B";
	    else return "G";
	  }
	}

enum Gender{
	  B,
	  G
	};	
