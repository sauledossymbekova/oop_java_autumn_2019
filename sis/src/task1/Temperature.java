package task1;

public class Temperature {
	private double value;
    private char scale;
    public Temperature(double val) {
        value = val;
        scale = 'C';
    }
    public Temperature(char c) {
        value = 0;
        scale = c;
    }
    public Temperature(double val, char c) {
        value = val;
        scale = c;
    }
    public Temperature() {
        value = 0;
        scale = 'C';
    }
    public double getTemperatureInF() {
        if (this.scale == 'F') return this.value;
        else {
            double val = 9 * (this.value / 5) + 32;
            return val;
        }
    }
    public double getTemperatureInC() {
        if (this.scale == 'C') return this.value;
        else {
            double val = 5 * (this.value - 32) / 9;
            return val;
        }
    }
    public void setValue(double val) {
        this.value = val;
    }
    public void setScale(char c) {
            if (c == 'C') {
                this.value = getTemperatureInC();
            }
            else {
                this.value = getTemperatureInF();
            }
            this.scale = c;
    }

    public char getScale() {
        return scale;
    }

}
