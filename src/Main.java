import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    private static List<Product> products;

    public static void main(String[] args) {
        products = new ArrayList<>();
        Product productoNuevo;
        Product modificarProducto;
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int i = 0;
        String name, model, description, OS, processor;
        double price;
        int memory, numberOfCameras, numeroModificar;

        do {
            System.out.println("----------Bienvenido----------");
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Agregar telefono");
            System.out.println("2. Agregar computadora");
            System.out.println("3. Modificar producto");
            System.out.println("4. Listado de productos");
            System.out.println("5. Salir");

            try {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        //Agregar telefono
                        System.out.println("Nombre: ");
                        name = sc.nextLine();
                        System.out.println("Modelo: ");
                        model = sc.nextLine();
                        System.out.println("Descripcion: ");
                        description = sc.nextLine();
                        System.out.println("Precio: ");
                        price = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Sistema Operativo: ");
                        OS = sc.nextLine();
                        System.out.println("Numero de Camaras: ");
                        numberOfCameras = sc.nextInt();
                        i++;

                        productoNuevo = new Phone(i, name, model, description, price, OS, numberOfCameras);
                        products.add(productoNuevo);

                        break;
                    case 2:
                        //Agregar Computadora
                        System.out.println("Nombre: ");
                        name = sc.nextLine();
                        System.out.println("Modelo: ");
                        model = sc.nextLine();
                        System.out.println("Descripcion: ");
                        description = sc.nextLine();
                        System.out.println("Precio: ");
                        price = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Procesador: ");
                        processor = sc.nextLine();
                        System.out.println("Cantidad de Memoria RAM: ");
                        memory = sc.nextInt();
                        i++;

                        productoNuevo = new Computer(i, name, model, description, price, processor, memory);
                        products.add(productoNuevo);
                        break;

                    case 3:
                        //Funcion para modificar producto
                        System.out.println("Ingrese el numero de producto que quiere modificar: ");
                            numeroModificar = sc.nextInt();
                            modificarProducto = buscarProducto(numeroModificar, products);

                            System.out.println("Que desear modificar: ");
                            System.out.println("1. Nombre");
                            System.out.println("2. Descripcion");
                            System.out.println("3. Modelo");
                            System.out.println("4. Precio");
                            opcion = sc.nextInt();
                            sc.nextLine();

                            switch (opcion) {
                                case 1:
                                    System.out.println("Ingrese el nuevo nombre.");
                                    name = sc.nextLine();
                                    modificarProducto.setName(name);
                                    break;
                                case 2:
                                    System.out.println("Ingrese la nueva descripcion.");
                                    description = sc.nextLine();
                                    modificarProducto.setDescription(description);
                                    break;
                                case 3:
                                    System.out.println("Ingrese el nuevo modelo.");
                                    model = sc.nextLine();
                                    modificarProducto.setModel(model);
                                    break;
                                case 4:
                                    System.out.println("Ingrese el nuevo precio.");
                                    price = sc.nextDouble();
                                    sc.nextLine();
                                    modificarProducto.setPrice(price);
                                    break;
                                default:
                                    System.out.println("Opcion invalida. Intente denuevo.");
                                    break;
                            }
                        break;
                    case 4:
                        //Mostrar listado de productos
                        showList(products);
                        break;
                    case 5:
                        System.out.println("Gracias por utilizar nuestra herramienta de inventario.");
                        System.out.println("Hasta luego.");
                        break;
                    default:
                        System.out.println("Seleccion invalida. Intente denuevo.");
                        break;
                }
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println();
                System.out.println("Opcion Invalida. Por favor ingrese una de las opciones indicadas.");
                System.out.println();
            }


        } while (opcion != 5);
    }

    public static void showList(List<Product> products){
        System.out.println("----------------Lista de Productos-----------------");
        for (Product product : products){
            product.printContent();
        }
    }
    public static Product buscarProducto(int numeroModificar, List<Product> products){
        for (Product product : products){
            if(numeroModificar == product.getNumber()){
                return product;
            }
        }
        return null;
    }
}