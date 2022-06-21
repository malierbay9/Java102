package book_sorter;

public class Book implements Comparable<Book>{
    String name;
    int pageNumber;
    String authorName;
    int releaseDate;

    public Book(String name, int pageNumber, String authorName, int releaseDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        if(this.name.compareTo(o.getName())==0){
            return 0;
        }
        else if(this.name.compareTo(o.getName())<0){
            return -1;
        }
        else
            return 1;
    }
}
