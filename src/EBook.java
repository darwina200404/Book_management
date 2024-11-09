public class EBook extends Book {
    double fileSize;
    public EBook(String title, String Author, float price,double fileSize) {
        super(title, Author, price);
        this.fileSize=fileSize;
    }
    public void DisplyDetails(){
        super.DisplyDetails();
        System.out.println("filesize"+fileSize);
    }
    
    
}
