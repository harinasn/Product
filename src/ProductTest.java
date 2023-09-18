import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testGetIDNum() {
        Product product = new Product("00000A", "pipe", "pvc pipe", 15.0);
        assertEquals("00000A", product.getIDNum());
    }

    @Test
    public void testGetProductName() {
        Product product = new Product("00000A", "pipe", "pvc pipe", 15.0);
        assertEquals("pipe", product.getProductName());
    }


    @Test
    public void testGetProductDesc() {
        Product product = new Product("00000A", "pipe", "pvc pipe", 15.0);
        assertEquals("pvc pipe", product.getProductDesc());
    }



    @Test
    public void testGetProductCost() {
        Product product = new Product("00000A", "pipe", "pvc pipe", 15.0);
        assertEquals(15.0, product.getProductCost(), 0.01);
    }



    @Test
    public void testToCSVDataRecord() {
        Product product = new Product("00000A", "pipe", "pvc pipe", 15.0);
        assertEquals("00000A, pipe, 15.0", product.toCSVDataRecord());
    }
}
