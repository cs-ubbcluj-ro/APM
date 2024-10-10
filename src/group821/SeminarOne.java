import repository.Repository;
import service.Service;
import ui.UI;

public class SeminarOne {
    public static boolean sequentialSearch(int n, int[] arr)
    /*
        Input: n - number to search
               arr - array of integers
        Output: true - if n is found in the array
                false - othewise
         Complexity: Total: O(n), BC: Tetha(1), WC(n)
     */
    {
        for(int i=0;i<arr.length;i++)
            if(arr[i]==n)
                return true;
        return false;
    }

    public static boolean binarySearch(int n, int[] arr)
    /*
        Input: n - number to search
               arr - array of integers, sorted
        Output: true - if n is found in the array
                false - othewise
     */
    {
        int low = 0;
        int high = arr.length-1;
        while (low <= high)
        {
            int mid = (low + high)/2;
            if (arr[mid] == n)
                return true;
            else if (arr[mid] < n)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
//        int numberToSearch = Integer.parseInt(args[0]);
//        int[] arr = new int[args.length-1];
//
//        for(int i=1;i<args.length;i++)
//            arr[i-1]=Integer.parseInt(args[i]);
//
//        System.out.println("Sequential result: "+sequentialSearch(numberToSearch, arr));
//        System.out.println("Binary search result: "+binarySearch(numberToSearch, arr));
//
        Repository repo = new Repository();
        Service service = new Service(repo);
        UI ui = new UI(service);
        ui.run();
    }
}
