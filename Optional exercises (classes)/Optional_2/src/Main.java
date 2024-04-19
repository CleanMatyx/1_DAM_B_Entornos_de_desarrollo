public class Main {
    public static void main(String[] args) {

        PhotoAlbum[] albums = new PhotoAlbum[4];
        albums[0] = new PhotoAlbum(24);
        albums[1] = new GrandAlbum();
        albums[2] = new PhotoAlbum();
        albums[3] = new GrandAlbum();

        for (int i = 0; i < albums.length; i++) {
            System.out.println(albums[i]);
        }

    }
}