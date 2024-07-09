package Generic;

import java.util.ArrayList;
import java.util.List;
public class LibraryInventory<T extends LibraryItem> {
    List<T>store;
    public LibraryInventory(){
        store = new ArrayList<>();
    }
    void addInStore(T data){
        store.add(data);
    }

    List<T>getStore(){
        return store;
    }
}
