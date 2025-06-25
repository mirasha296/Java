
/**
 * BSTSortedList.java - Shell for Assignment #5
 */
import java.util.Iterator;
import java.util.NoSuchElementException;
import TreePackage.*;

public class BSTSortedList<T extends Comparable<? super T>>
implements SortedListInterface<T>
{
    private BinarySearchTree<T> list;   //the sorted list, represented as a BST
    private int numberOfEntries;        //number of entries currently in list

    //default constructor -- list is initially empty
    public BSTSortedList()
    {
        list = new BinarySearchTree<>();
        numberOfEntries = 0;
    }

    //FILL IN IMPLEMENTATION OF METHODS BELOW
    public void add(T newEntry){
        list.add(newEntry);//adding entry
        numberOfEntries ++; 
    }

    /** Removes the first or only occurrence of a specified entry
    from this sorted list.
    @param anEntry  The object to be removed.
    @return  True if anEntry was located and removed; 
    otherwise returns false. */
    public boolean remove(T anEntry){
        T removeVal = list.remove(anEntry);
        if(removeVal == null) {
            return false;
        }
        else 
        {
            numberOfEntries --;//removes an entry from numberOfEntries
            return true;
        }    
    }

    /** Removes the entry at a given position from this list.
     * Entries originally at positions higher than the given
     * position are at the next lower position within the list,
     * and the list's size is decreased by 1.
    @param givenPosition  An integer that indicates the position of
    the entry to be removed.
    @return  A reference to the removed entry.
    @throws  IndexOutOfBoundsException if either 
    givenPosition < 1 or givenPosition > getLength(). */
    public T remove(int givenPosition){
        T anEntry;
        if (givenPosition < 1 || givenPosition > getLength())
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            anEntry = getEntry(givenPosition);
            remove(anEntry);
        }
        return anEntry;
    }
    

    /** Retrieves the entry at a given position in this list.
    @param givenPosition  An integer that indicates the position of
    the desired entry.
    @return  A reference to the indicated entry.
    @throws  IndexOutOfBoundsException if either givenPosition < 1 or givenPosition > getLength(). */
    public T getEntry(int givenPosition){
        Iterator <T> iterates = list.getInorderIterator();
        
        int position = 1;
        T anEntry = iterates.next();
        
        if (givenPosition < 1 || givenPosition > getLength()){
            throw new IndexOutOfBoundsException();
        }
        else {
            while(position < givenPosition){
                anEntry = iterates.next();
                position ++;
            }
            return anEntry;
        }
    }

    /** Gets the position of an entry in this sorted list.
    @param anEntry  The object to be found.
    @return  The position of the first or only occurrence of anEntry
    if it occurs in the list; otherwise returns the position
    where anEntry would occur in the list, but as a negative
    integer. */
    public int getPosition(T anEntry){
        int position = 1;
        Iterator <T> iterates = list.getInorderIterator();
        T Entry = iterates.next();
        if(list.contains(anEntry)){
            while(iterates.hasNext() && !Entry.equals(anEntry)){
                Entry = iterates.next();
                position++;
            }
            return position;
        }
        else {
            int value = anEntry.compareTo(Entry);
            //by using the compare method to check if the value of the number iterated through 
            //is 0, -1 or 1
            while(iterates.hasNext() && value > 0)
            {
                Entry = iterates.next();
                value = anEntry.compareTo(Entry);
                
                position ++;
            }        
            if(value > 0){
                position ++;
            }
            return -position; // position*-1; would work as well to return a negative position
        }
    }

    /** Sees whether this list contains a given entry.
    @param anEntry  The object that is the desired entry.
    @return  True if the list contains anEntry, or false if not. */
    public boolean contains(T anEntry){
        return list.contains(anEntry);
    }

    /** Removes all entries from this list. */
    public void clear(){
        list.clear();
    }
    

    /** Gets the length of this list.
    @return  The integer number of entries currently in the list. */
    public int getLength(){
        return numberOfEntries;
    }

    /** Sees whether this list is empty.
    @return  True if the list is empty, or false if not. */
    public boolean isEmpty(){
        return list.isEmpty();
    }

    /** Retrieves all entries that are in this list in the order in which
    they occur in the list.
    @return  A newly allocated array of all the entries in the list.
    If the list is empty, the returned array is empty. */
    public T[] toArray(){
        T [] array = (T[])new Object[numberOfEntries];
        Iterator <T> iterates = list.getInorderIterator();
        for(int i = 0; i < numberOfEntries; i++)
        {
            Object num = iterates.next();
            array[i] = (T) num;
        }
        return array;
    }
}
