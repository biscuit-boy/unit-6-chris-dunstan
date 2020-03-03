import java.util.Arrays;

public class MusicLibrary {
    private Album[] library;

    public MusicLibrary() {
    }

    public MusicLibrary(Album[] library) {
        this.library = library;

        sort();
    }

    public void addAllbum(Album album){
        Album[] newLibrary = new Album[library.length + 1];

        for (int i = 0; i < library.length; ++i){
            newLibrary[i] = library[i];
        }

        newLibrary[library.length + 1] = album;

        library = newLibrary;

        sort();
    }

    public void removeAlbum(Album album){
        if (library.length == 0){
            return;
        }

        Album[] newLibrary = new Album[library.length - 1];

        int currInd = 0;

        for (int i = 0; i < library.length; ++i){
            if (currInd == library.length-1){
                System.out.println("The album '"+ album.getTitle() + "' is not in your library.");
                return;
            }
            if (!library[i].getTitle().equals(album.getTitle())){
                newLibrary[currInd] = library[i];
                currInd++;
            }
        }

        library = newLibrary;
    }

    public void sort(){
        Arrays.sort(library);
    }

    public void dispLibrary(){
        System.out.println("Your Library");
        System.out.println();

        for (Album album : library){
            System.out.println(album.toString());
        }
    }

    public int findAlbum(String title){
        for (int i = 0; i < library.length; ++i){
            if (library[i].getTitle().equals(title)){
                return i;
            }
        }

        return -1;
    }

    public void sortByTitle(){
        int min;
        Album temp;
        for (int i=0; i<library.length; ++i){
            min = i;
            for (int scan = i + 1; scan<library.length; ++scan){
                if (library[scan].compareTo(library[min]) < 0){
                    min = scan;
                }
            }

            temp = library[i];
            library[i] = library[min];
            library[min] = temp;
        }
    }

    public void sortByAlbum(){}
}


