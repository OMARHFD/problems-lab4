package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int noElements=0; //current number of integers in the list
    int listSize=0; //size of the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        listSize=size; //update the size of the  list
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        noElements = listSize ; //update the number of integers in the list
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //Q1.
    public void increaseSize()
    {
        int[] newList = new int[listSize*2];
        for (int i=0;i<listSize;i++){
            newList[i]=list[i];
        }
        listSize=listSize*2;
        list=newList;
    }
    //Q2.
    public void addElement(int newVal)
    {
        if(listSize == noElements) //check if the list is full to add space
        {
            increaseSize();
        }
        list[noElements]=newVal;
        noElements+=1;//then we have noElements places full so index up to noElements-1 full we insert at the next index
    }

    public void removeFirst(int newVal)
    {
        for (int i=0;i<noElements;i++)
        {
            if (list[i] == newVal)
            {
                for (int j=i;j<noElements;j++) //depuis cete position on decale a gauce et cette methode garde toujours l information dont on a besoin
                {
                    list[j]=list[j+1];
                }
                noElements=noElements-1; // logique
                break; // c'est fini un seule fois removal
            }
        }


    }
    public void removeAll(int newVal) {
        int noOccurences = 0; // we count occurences of the item
        for (int i = 0; i < noElements; i++) {
            if (list[i] == newVal) {
                noOccurences += 1;
            }
        }
        for (int i = 0; i < noOccurences; i++) { //we repeat the process the number of times it ooccurs
            removeFirst(newVal); //we guarantee the removal of all items and the decrease of the noElement
        }
    }
}