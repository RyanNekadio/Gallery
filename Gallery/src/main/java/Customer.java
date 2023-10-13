public class Customer {

    private String name;
    private double wallet;
    private Artwork artwork;

    public Customer(String name,
                    double wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public boolean canBuy(Artwork artwork) {
        return this.wallet >= artwork.getPrice();
    }


    public void buyArtwork(Artwork artwork) {
        this.wallet -= artwork.getPrice();
    }

    public double getWallet() {
        return this.wallet;
    }

    public String getCustomerName() {
        return this.name;
    }
}
