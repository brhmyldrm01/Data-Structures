public class Main {

        public  static int counter=0;
        public static int Factorial(int value){
            counter++;
            if(value==0)return 1;
            if (value==1) return 1;
            return value*Factorial(value-1);
        }


    public static double  AckermannFunction(double value0,double value1){
        counter++;
        if(value0==0)return value1+1;
        if(value1==0&&value0>0) return AckermannFunction(value0-1,1);
        return AckermannFunction(value0-1,AckermannFunction(value0,value1-1));
    }
    public static double Pow(double base,int power ){
        counter++;
        if(base==0)return 0;
        if(power==1) return base;
        if (power==0) return 1;
        return base*Pow(base,power-1);
    }

    public static double AdvPow(double base,int power){
        counter++;
        if(base==0)return 0;
        if(power==1) return base;
        if (power==0) return 1;
        if(power%2==0){
            double temp;
            temp=AdvPow(base,power/2);
            return temp*temp;
        }
        double temp;
        temp=AdvPow(base,(power-1)/2);
        return temp*temp*base ;
    }
    public static void main(String[] args) {

        System.out.println("Factorial");
        int value=5;
        System.out.println(value+"!="+Factorial(value));
        System.out.println("Counter=="+counter);

        double base=2;
        int exponent=11;
        System.out.println("\nExponential Numbers");
        counter=0;
        System.out.println(base+"^"+exponent+"=="+Pow(base,exponent));
        System.out.println("Counter=="+counter);

        System.out.println("\nExponential numbers (Advanced)");
        counter=0;
        System.out.println("AdvancedPow==>"+base+"^"+exponent+"=="+AdvPow(base,exponent));
        System.out.println("AdvCounter=="+counter);

        System.out.println("\nAckermann Function");
        counter=0;
        double value0=3,value1=5;
        System.out.println("Ackermann Function("+value0+","+value1+")=="+AckermannFunction(value0,value1));
        System.out.println("Counter=="+counter);

    }

}
