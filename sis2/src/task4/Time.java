package task4;

public class Time implements Comparable{
	public int hour;
    public int minute;
    public int second;
    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }
	@Override
	public int compareTo(Object o) {
		Time t = (Time) o;
        if (this.hour == t.hour) {
            if (this.minute == t.minute) {
                if (this.second > t.second) return 1;
                else if (this.second == t.second) return 0;
                return -1;
            }
            else if (this.minute > t.minute) return 1;
            return -1;
        }
        if (this.hour > t.hour) return 1;
        return -1;
	}
	
}
