/*
Ejercicio 2 — Clase Telefono
Autor: Nathaly Carlosama

Enunciado: 
    Crea una clase llamada Telefono que represente un teléfono.
*/

public class Telefono {
    private String marca;
    private String modelo;
    private double precio;

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca= marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo= modelo;
    }

    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio){
        if(precio>0){
        this.precio= precio;
        }else{
            System.out.println("El precio no puede ser negativo");
        }
    }

    public Telefono(String modelo, String marca, double precio){
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Precio: "+precio);
    }
}
