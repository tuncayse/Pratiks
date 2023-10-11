public class Book {
    private String name;
    private int pageCount;
    private String authorName;
    private int publish;

    public Book(String name, int pageCount, String authorName, int publish) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publish = publish;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getPublish() {
        return publish;
    }
    public void setPublish(int publish) {
        this.publish = publish;
    }
}