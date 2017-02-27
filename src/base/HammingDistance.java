package base;

/**
 * Created by Dave on 2/13/2017.
 */
public class HammingDistance {

    public HammingDistance() {

    }

    public int getHammingDistance(int x, int y) {
        int distance = 0;

        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);

        //binaryX = binaryX.substring(binaryX.length() - 4);
        //binaryY = binaryY.substring(binaryY.length() - 4);

        System.out.println(binaryX + "\n" + binaryY);



        return distance;
    }

    public static void main(String[] args){
        HammingDistance distance = new HammingDistance();

        distance.getHammingDistance(1, 4);
    }
}
