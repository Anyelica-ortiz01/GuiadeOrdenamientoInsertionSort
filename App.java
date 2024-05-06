public class App {

    // Metodo de insertionSort
    public static void insertionSort(int[]arr) {

        int n= arr.length;

        for (int i= 1; i<n; i++) {
            int key= arr[i];
            int j= i - 1;

            while (j>=0 && arr[j]>key){
                arr[j+1]=arr [j];
                j--;
            }

        }   arr[j+1]=key;     
        
        

    }


          // Metodo de Main
     public static void main(String[] args) throws Exception{

        System.out.println(x:"Hello,World , metodo de ordenamiento por insercion");

        int []arr = {12,11,13,5,6} ;

        System.out.println(x:"Arreglo Original:");
        for(int num: arr) {
            System.out.println(num+"");

        }
        
        System.out.println();

        System.out.println(x:"========================================");
        insertionSort(arr); // Llamada al metodo de ordenamiento por insercionP

        System.out.println(x:"Arreglo ordenado :");
        for (int num : arr )  {
            System.out.println(num + "");
        }







    }   























}
