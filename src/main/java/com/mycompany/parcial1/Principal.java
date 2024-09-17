package com.mycompany.parcial1;

public class Principal {

    public static void main(String[] args) {
      
        Accesorios acessorio1 = new Accesorios ("Juan","Rojos",20,30); 
        Telefono telefono1 =  new Telefono ("Telefono 50","Rojo",20,10,"Iphone",256);  
        Laptop laptop1 = new Laptop ("Referencia 20","Azul",50,8,"Lenovo","i core 7"); 
        Cliente cliente1 = new Cliente ("Camilo","Comprador frecuente","Calle 63"); 
        System.out.println(acessorio1.toString()); 
        System.out.println(telefono1.toString());
        System.out.println(laptop1.toString());
        System.out.println(cliente1.toString());
        
         Pedidos pedido1 = new Pedidos(cliente1);
          pedido1.agregarProducto(laptop1, 2);
          pedido1.getProductos(); 
          pedido1.getCliente(); 
            
        
        System.out.println(pedido1.toString());
               
        telefono1.setCantidadInventario(telefono1.getCantidadInventario()-1);
        acessorio1.setCantidadInventario(acessorio1.getCantidadInventario()-2);
        
        System.out.println("nuevo Inventario");
        System.out.println(telefono1.toString());
        System.out.println(acessorio1.toString());
    }
    
    
    
}
