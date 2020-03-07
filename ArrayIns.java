class ArrayIns{
    private long[] a;                
    private int nElems;               

    public ArrayIns(int max){
        a = new long[max];             
        nElems = 0;                        
    }

    public void insert(long value){
        a[nElems] = value;         
        nElems++;                      
    }

    public void display(){
        for(int j=0; j<nElems; j++)      
            System.out.print(a[j] + " ");  
        System.out.println("");
    }

    public void insertionSort(){
        int in, out;

        for(out=1; out<nElems; out++) {
            long temp = a[out];            
            in = out;                      
            while(in>0 && a[in-1] >= temp){
                a[in] = a[in-1];            
                --in;                      
            }
            a[in] = temp;                  
        }  
    }  

    public double median(){
        int pointer = (nElems)/2;
        double median = a[pointer];
        if(nElems % 2 == 0){
            median = ((double) (a[pointer] + (double) a[pointer - 1])/2);
        }
        return median;
    }

    public void noDup(){
        ArrayIns noDupArray = new ArrayIns(100);
        for(int i = 0; i < nElems; i++){
            if (a[i] != a[i + 1]){
                noDupArray.insert(a[i]);
            }
        }
        noDupArray.display();
    }

    ////////////////////////////////////////////////////////////////

    public static void main(String[] args){
        int maxSize = 100;           
        ArrayIns arr;                
        arr = new ArrayIns(maxSize);  

        arr.insert(77);             
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display(); 
        arr.insertionSort();
        System.out.println();
        arr.display();     
        System.out.println("\nThe Median is: " + arr.median() +"\n");
        ArrayIns duparr = new ArrayIns(maxSize);  
        duparr.insert(1);
        duparr.insert(1);
        duparr.insert(1);
        duparr.insert(1);
        duparr.insert(2);
        duparr.insert(2);
        duparr.insert(2);
        duparr.insert(2);
        duparr.insert(3);
        duparr.insert(3);
        duparr.insert(3);
        duparr.insert(4);
        duparr.insert(4);
        duparr.insert(4);
        duparr.insert(5);
        duparr.insert(5);

        System.out.print("The Array with Duplicates is: " );
        duparr.display();

        System.out.print("The Array with No Duplicates is: " );
        duparr.noDup();
    } 
}  

