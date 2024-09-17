import com.mycompany.parcial1.Laptop;
import com.mycompany.parcial1.Pedidos;
import com.mycompany.parcial1.Producto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//public class ProductoTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
    @Test
       public void agregarProducto(Producto producto, int cantidad){
        Pedidos pedido1 = new Pedidos(cliente1);
        valorEsperado = "Iphone",4;
        

       assertEquals(valorEsperado, valorActual);
    }
}
