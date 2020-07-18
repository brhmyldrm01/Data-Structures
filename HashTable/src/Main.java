import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arraySize=100;
        int[] hashTableL=new int[arraySize];
        int index=0,key=0;
        for (int i=0;i<arraySize;i++){
            hashTableL[i]=-1;
        }
        int counter=0;
        //Linear Probing
        while (counter<arraySize) {
            Random random = new Random();
            key = 10000 + random.nextInt(90000);
            index = key % arraySize;
            if (hashTableL[index] < 0) {
                hashTableL[index] = key;
            } else {
                int temp = 1;
                while (hashTableL[(index + temp) % arraySize] >= 0) {
                    temp++;
                }
                int nindex = (index + temp) % arraySize;
                hashTableL[nindex] = key;
            }
            counter++;
        }
            System.out.println("Linear Probing");
            for (int i=0;i<arraySize;i++){
                System.out.println(i+".::"+hashTableL[i]);
            }



    }
}
