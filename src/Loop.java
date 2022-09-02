public class Loop {
    public static void main(String[] args) {
        int a = 1;

        while (a<=1000){
            System.out.println(a);
            a++;
            if (a==5)break;
        }

        a=1000;
        while (a>=0){
            if(a % 2==0){
                System.out.println(a);
            }
            a--;
        }

        int i=0;
        float midle=0F;
        while(i<=100){
            midle+=i;
            i++;
        }
        midle/=(float) i;
        System.out.println(midle);

    }
}
