// Write a program to convert a binary number to Decimal number.

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryNum = "1010";
        logicalWay(binaryNum);
        AdvanceWay(binaryNum);
    }

    public static void logicalWay(String num){
        StringBuilder stb = new StringBuilder(num);
        num = stb.reverse().toString();
        String[] numArray = num.split("");
        int DecimalNum = 0;
        for(int i = 0 ; i< numArray.length;i++){
            DecimalNum += Double.parseDouble(numArray[i])*(Math.pow(2,i));
        }
        System.out.println(DecimalNum);
    }
    
    public static void AdvanceWay(String num ){
        int binaryNum = Integer.parseInt(num,2);
        System.out.println(binaryNum);
    }
}
