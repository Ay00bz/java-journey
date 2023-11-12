public class CustomArrayList {
    private Object[] arr;
    private int index;
    private int len;

    public CustomArrayList() {
        arr = new Object[10];
        index = 0;
        len = 10;

    }

    public CustomArrayList(int n) {
        arr = new Object[n];
        index = 0;
        len = n;
    }

    public void copy(CustomArrayList list) {
        arr = new Object[2 * list.len];
        this.index = list.index;
        len = 2 * list.len;
        for (int i = 0; i < list.len; i++) {
            arr[i] = list.arr[i];

        }
    }
    public int size(){
        return index;
    }

    public Object get(int idx){
        if (idx>=len){
            System.out.println("out of range index");
            return null;
        }
        return arr[idx];
    }

    public boolean isEmpty(){
        return (index==0);
    }

    public boolean isIn(Object x){
        for(Object element:arr){
            if (element.equals(x))
                return true;

        }
        return false;
    }

    int find(Object x){
        for(int i=0;i<len;i++){
            if(x.equals(arr[i]))
                return i;
        }
        return (-1);
    }


    public void add(Object x) {
        if (index < len) {
            arr[index] = x;
            index += 1;
        } else {
            copy(this);
            arr[index] = x;
            index += 1;
        }
    }


    public void add(int idx, Object x){
        if (idx<=len){
            if(idx==index){
                this.add(x);
                return;}

            else{
                if(index+1>len)
                    copy(this);
                for(int i=index+1;i>idx;i--){
                    arr[i]=arr[i-1];

                }
                arr[idx]=x;
                index++;
                return;
            }


        }
        System.out.println("Index out of bounds!");
        return;


    }


    public void remove(Object x){
        if(isIn(x)){
            for(int i=find(x);i<len-1;i++){
                arr[i]=arr[i+1];

            }
            index--;
        }
    }

}
