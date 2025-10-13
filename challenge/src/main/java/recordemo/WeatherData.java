package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius*(9.0/5) +32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return "the Weather : Temperature in Celsius : "+temperatureCelsius+", temperature in fahrenheit : "+temperatureFahrenheit()+", conditions : "+conditions;
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       double temp = (tempFahrenheit-32)*(5.0/9);
       return new WeatherData(temp,conditions);
    }

    public static void main(String[] args) {
        WeatherData weater1 =new WeatherData(26.1,"good");
        System.out.println(weater1.getSummary());
        WeatherData weater2 =WeatherData.fromFahrenheit(87.2,"don't know");
        System.out.println(weater2.getSummary());


    }
}
