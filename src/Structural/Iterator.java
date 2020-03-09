/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structural;

/**
 *
 * @author DIVYA SRI
 */
interface IteratorDemo{
    public boolean hasNext();
    public Object next();
}

interface Container{
    public IteratorDemo getIterator();
}

class NamesCollection implements Container {
    public String name[] = {"Sita", "Gita", "Rita", "Meena", "Neena"};

    @Override
    public IteratorDemo getIterator() {
        return new IterateNamesCollection();
    }


    private class IterateNamesCollection implements IteratorDemo {
        int i;

        @Override
        public boolean hasNext() {
            if (i < name.length)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return name[i++];
            else
                return null;
        }
    }
}
public class Iterator {
    public static void main(String[] args) {
        NamesCollection cmpnyRepository = new NamesCollection();

        for(IteratorDemo iter = cmpnyRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("NAME : "+name);
        }
    }
}
