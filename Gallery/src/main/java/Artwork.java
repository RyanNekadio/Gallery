public class Artwork {

    private String title;
    private Artist artist;
    private double price;

    public Artwork(String title,
                   Artist artist,
                   double price){
        this.title = title;
        this.artist = artist;
        this.price = price;
    }


    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
