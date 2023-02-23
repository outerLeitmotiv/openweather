package ch.arc.he.ig;

public class Weather {
    private String description;
    private float tempMin;
    private float tempMax;

    public Weather() {};

    public void setDescription(String description) {
        this.description = description;
    }
    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }
    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }
    public void displayDescription() {
        System.out.println("Weather : "+this.description);
    }
    public void displayTemp() {
        System.out.println("Temp min : "+this.tempMin+"\n"+
                            "Temp max : "+this.tempMax+"\n");
    }
}
