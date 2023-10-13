import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Ryan");
        artwork = new Artwork("Opera Epiclese",
                artist,
                1_500);
        customer = new Customer("Jack",
                10_000);
    }

    @Test
    public void canAffordArtwork_true(){
        assertThat(customer.canBuy(artwork)).isEqualTo(true);
    }

    @Test
    public void canAffordArtwork_false(){
        artwork.setPrice(15_000);
        assertThat(customer.canBuy(artwork)).isEqualTo(false);
    }

    @Test
    public void canPurchaseArtwork(){
        customer.buyArtwork(artwork);
        assertThat(customer.getWallet()).isEqualTo(8_500);
    }

    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(10_000);
    }

    @Test
    public void hasName(){
        assertThat(customer.getCustomerName()).isEqualTo("Jack");
    }







}
