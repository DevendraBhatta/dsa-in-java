package classes;

public class Cookie {
    // It is good practice to private class variables
    private String color;

    // Constructor is the special function with same name as class
    // It is good practice to set public access modifier
    // Name of the class and name of the constructor is same

    public Cookie(String color){
        this.color = color;
    }

    // Getter and Setter

    // getColor is the Getter Method which return the information about color whenever it is called
    public String getColor(){
        return color;
    }

    // setColor is th Setter Method which take input (value of color) and set the value
    public void setColor(String color){
        this.color = color;
    }

}