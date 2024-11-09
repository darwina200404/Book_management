public class Book
{
    private  String title;       // class for book details
        private String Author;
        private float price;
    
        public Book(String title,String Author,float price)// constructor
        {
            this.title=title;
            this.Author=Author;
            this.price=price;
        }
        public   String getTitle(){
            return title;
    }
    public String getAuthor(){
        return Author;
    }
    public void DisplyDetails(){
        System.out.println("Title"+title+"Author"+Author+"price"+price);
    }
}