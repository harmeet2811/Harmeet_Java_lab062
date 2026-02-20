class CelsiusToFahrenheit {
    double convert(double c) {
        return (c * 9/5) + 32;
    }

    public static void main(String[] args) {
        CelsiusToFahrenheit obj = new CelsiusToFahrenheit();
        System.out.println("Fahrenheit = " + obj.convert(25));
    }
}