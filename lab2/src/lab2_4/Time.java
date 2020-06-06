package lab2_4;

public class Time {
	public int hour;
	public int minute;
	public int second;
	public Time (int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second; //initialization block
	}
	
	public String toUniversal() {
		String s = hour / 10 + "" + hour % 10 + ":" + minute / 10 + "" + minute % 10 + ":" + second / 10 + "" + second % 10  ; 
		return s; 
		// if hour==5 =>     5/10=0 ; 5%10=5 ==>> "05"
	}
	public String toStandard() {
		String s = (hour%24) / 10 + "" + (hour%24) % 10 + ":" + minute / 10 + "" + minute % 10 + ":" + second / 10 + "" + second % 10  ; 
		return s;
	}
	public void add(Time t) {
		hour += t.hour; 
		minute += t.minute;
		second += t.second; 
		if (second > 60) {
			minute++;
			second = second % 60;
		}
		if (minute > 60) {
			hour++;
			minute = minute % 60;
		};
		if (hour > 24) {
			hour = (hour % 24);
			}
	}
	}
