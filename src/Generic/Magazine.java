package Generic;

public class Magazine implements LibraryItem{
    private String version;
    private String title;

    public Magazine(String version, String title) {
        this.version = version;
        this.title = title;
    }

    public String getVersion(){
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
