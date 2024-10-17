public class DoublyEndedQueue {
    int Front;
    int Rear;
    int MaxSize;
    int[] Data;
    int ElementCount;


    DoublyEndedQueue(int s) {
        MaxSize = s;
        Front = 0;
        Rear = 0;
        Data = new int[MaxSize];
        ElementCount = 0;
    }

    public void Addfront(int s){
        if (ElementCount== 0){
            System.out.println("empty stack");
            return;

        }
        Data[Rear] = s; 
        if (Rear == MaxSize - 1) {
            Rear = 0; 
        } else {
            Rear++;
        }
        ElementCount++; 

    }

    public void Addrear(int s) {
        if (ElementCount== 0){
            System.out.println("empty stack");
            return;
            
        }
    }

    public int Remfront(){
        if (ElementCount== 0){
            System.out.println("empty stack");
            return -1;
            
        }

    }

    public int Remrear(){
        if (ElementCount== 0){
            System.out.println("empty stack");
            return -1;
            
        }
        int val = Data[Front];
        if (Front == MaxSize - 1) {
            Front = 0; 
        } else {
            Front++;
        }
        ElementCount--; 
        return val; 

    }

    public static void main(String[] args) {
        DoublyEndedQueue s = new DoublyEndedQueue(5);
        s.Addfront(10);
        s

    }
}
