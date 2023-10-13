import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Ryan");
        artwork = new Artwork("Opera Epiclese",
                artist,
                15_000);
    }

    @Test
    public void hasTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Opera Epiclese");
    }

    @Test
    public void hasPrice(){
        assertThat(artwork.getPrice()).isEqualTo(15_000);
    }


}
