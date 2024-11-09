


public class AudioBook extends Book {
    private double Duration;
    public AudioBook(String title, String Author, double price,double Duration) {
        super(title, Author, (float) price);
        this.Duration=Duration;
    }
    public void DisplyDetails(){
        super.DisplyDetails();
        System.out.println("Duration"+Duration);
    }
    
}
