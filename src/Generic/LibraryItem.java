package Generic;

public interface LibraryItem {
    default String getType()
    {
        return "Library Item";
    }
}
