


public class MyArrayList<E> {


    // Data fields
    private E[] theData;
    private int size = 0;
    private int capacity = 0;
    

    // Constants
    private static final int INIT_CAPACITY = 10;

    // Constructors
   /*
    public MyArrayList() {
        this(INIT_CAPACITY);
        //theData = (E[]) new Object[INIT_CAPACITY];
        capacity=INIT_CAPACITY;


    }
*/
    @SuppressWarnings("unchecked")
	public MyArrayList(int initCapacity) {
        
        theData = (E[]) new Object[initCapacity];
        capacity=initCapacity;
    }

    
    
   
    // Methods
    public boolean add(E e) {
        if(e == null) {
            throw new NullPointerException();
        }
        
        if(size == capacity) {
        	
        	reallocate();
        }
        
        //*** Put Code here if size reaches capacity
        
        theData[size] = e;
        size++;

        return true;
    } // End add(E e) method

    public void add(int index, E e) {
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if(e == null) {
            throw new NullPointerException();
        }

        if(size == capacity) {
            reallocate();
        }

        for(int i = size; i > index; i--) {
            theData[i] = theData[i - 1];
        }

        theData[index] = e;
        size++;
    } // End add(int index, E e) method

    @SuppressWarnings("unchecked")
	public void clear() {
        theData = (E[]) new Object[capacity];
        size = 0;
    } // End clear() method

   public void print()
   {
	   for(int i=0;i<this.size();i++)
	   {
		   System.out.println("Index: " + i + " Element: " + this.get(i));
	   }
   }
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }

        if(getClass() != o.getClass()) {
            return false;
        }

        MyArrayList<E> otherO = (MyArrayList<E>) o;

        if(size != otherO.size) {
            return false;
        }

        for(int i = 0; i < size; i++) {
            if(!theData[i].equals(otherO.theData[i])) {
                return false;
            }
        }

        return true;
    } // End equals(Object o) method

    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return theData[index];
    } // End get(int index) method

    public int indexOf(Object o) {
        if(o == null) {
            throw new NullPointerException();
        }

        for(int i = 0; i < size; i++) {
            if(theData[i].equals((E)o)) {
                return i;
            }
        }

        return -1;
    } // End indexOf(Object o) method

    public boolean isEmpty() {
        return size == 0;
    } // End isEmpty() method

    public E remove(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        E temp = theData[index];

        for(int i = index + 1; i < size; i++) {
            theData[i - 1] = theData[i];
        }

        size--;
        return temp;
    } // End remove(int index) method

    public boolean remove(Object o) {
	//*** using indexOf remove Object must code remove(index) first        

    	int indexOfO = indexOf(o);
    	
    	if(indexOfO == -1) {
    		
    		return false;
    	}
    	remove(indexOfO);
    	


        return true;
    } // End remove(Object o) method

    public E set(int index, E e) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        if(e == null) {
            throw new NullPointerException();
        }
        E temp = theData[index];
        theData[index] = e;
        return temp;
    } // End set(int index, E e) method

    public int size() {
        return size;
    } // End size() method

    private void reallocate() {
        System.out.println("CALLING reallocate");
    	
        capacity = capacity * 2; 
        @SuppressWarnings("unchecked")
		E[] newArrayList = (E []) new Object[capacity];
        
        for(int i = 0; i<size; i++) {
        	newArrayList[i] = theData[i];
        }
        
        theData = newArrayList;
        	
        	
        




    } // End reallocate() method


}//End Class
