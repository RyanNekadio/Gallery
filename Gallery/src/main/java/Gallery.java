import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;
    private Artist artist;
    private Artwork artwork;
    private Customer customer;

    public Gallery(String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public void setTill(Customer customer,
                           Artwork artwork) {
        customer.canBuy(artwork);
        customer.buyArtwork(artwork);
        this.till += artwork.getPrice();
    }

    public double getTill() {
        return this.till;
    }
}
