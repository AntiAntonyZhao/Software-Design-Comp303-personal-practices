package lab3;

import java.util.ArrayList;

public class McGillLibrary {

    private ArrayList<Item> aItems;

    public McGillLibrary(){
        aItems = new ArrayList<Item>();
    }

    public void addItemToLibrary(Item pItem){
        assert pItem !=null;
        aItems.add(pItem);
    }

    public void removeBookFromLibrary(Item pItem){
        assert pItem != null;
        if (aItems.contains(pItem)) {
            aItems.remove(pItem);
        }
    }

}
