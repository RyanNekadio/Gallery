import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Customer customer;
    Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Ryan");
        artwork = new Artwork("Opera Epiclese",
                artist,
                15_000);
        customer = new Customer("Jack",
                20_000);
        gallery = new Gallery("Louvre",
                20_000);
    }

    @Test
    public void hasMoney(){
        assertThat(gallery.getTill()).isEqualTo(20_000);
    }

    @Test
    public void canSellArtwork(){
        customer.canBuy(artwork);
        customer.buyArtwork(artwork);
        gallery.setTill(customer, artwork);
        assertThat(gallery.getTill()).isEqualTo(35_000);

    }





}
