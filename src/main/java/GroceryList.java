public class GroceryList {
    private String[] arr;

    public GroceryList()
    {
        this.arr = new String[10];
    }

    public void add(String item)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == null)
            {
                arr[i] = item;
            }
            break;
        }
    }

    public void remove(String item)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i] == item)
            {
                for(int j = i; j<arr.length-1; j++)
                {
                    arr[j] = arr[j+1];
                }
            }
        }
        arr[arr.length-1] = null;
    }

    public String toString()
    {
        String str = "";
        for(int i = 0; i<arr.length; i++)
        {
            str += arr[i] + ", ";
        }
        return str;
    }
}