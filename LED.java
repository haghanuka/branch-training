public class LED {
    private String color; 

    public LED() {
        this.color = ""; 
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void turnOff() {
        this.color = "";
    }

    public String getColor() {
        return this.color;
    }
}