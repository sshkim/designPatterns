package Behavioral.Iterator;

import java.util.Iterator;

/**
 * Created by sshkim on 2017. 1. 17..
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.list = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null)
            return false;
        else
            return true;

    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position++];
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) throw new IllegalStateException("next()가 한번도 호출되지 않음.");
        if (list[position - 1] != null) {
            for (int i = position - 1; i < list.length - 1; i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }
}
