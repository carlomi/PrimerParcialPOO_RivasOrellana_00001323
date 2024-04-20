import java.sql.SQLOutput;
import java.util.Scanner;

public class Phone extends Product{
    private String OS;
    private int numberOfCameras;

    //Constructores
    public Phone(){};

    public Phone(int numero, String name, String model, String description, double price, String OS, int numberOfCameras){
        super(numero, name, model,description,price);
        this.OS = OS;
        this.numberOfCameras = numberOfCameras;
    }

    //Getters and Setters
    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(int numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    public void printContent(){
        System.out.println("Numero de producto: " + getNumber());
        System.out.println("Nombre: " + getName());
        System.out.println("Modelo: " + getModel());
        System.out.println("Descripcion: " + getDescription());
        System.out.println("Precio: " + getPrice());
        System.out.println("Systema Operativo: " + getOS());
        System.out.println("Numero de Camaras: " + getNumberOfCameras());
    }
}
