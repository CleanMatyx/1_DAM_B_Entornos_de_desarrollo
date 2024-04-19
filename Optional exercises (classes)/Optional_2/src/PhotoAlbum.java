public class PhotoAlbum {
    private int pageNumber;

    public PhotoAlbum(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public PhotoAlbum() {
        this.pageNumber = 16;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String toString() {
        return " am an album with " + pageNumber + " pages";
    }
}
