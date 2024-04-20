public class Computer extends Product{
    private String processor;
    private int memory;

    //Constructores
    public Computer(){};

    public Computer(int numero, String name, String model, String description, double price, String processor, int memory){
        super(numero, name, model, description, price);
        this.processor = processor;
        this.memory = memory;
    }

    //Getters and Setters
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void printContent(){
        System.out.println("Numero de producto: " + getNumber());
        System.out.println("Nombre: " + getName());
        System.out.println("Modelo: " + getModel());
        System.out.println("Descripcion: " + getDescription());
        System.out.println("Precio: " + getPrice());
        System.out.println("Procesador: " + getProcessor());
        System.out.println("Memoria RAM: " + getMemory());
    }

}
