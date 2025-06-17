package ex1;
public class Main {
    public static void main (String[]args){
        System.out.println(pariDispari("ciao"));
        System.out.println(pariDispari("bella"));
                System.out.println(1600 + ": " + annoBisestile(1600) + " Expected: true");
                System.out.println(2004 + ": " + annoBisestile(2004) + " Expected: true");
                System.out.println(2010 + ": " + annoBisestile(2010) + " Expected: false");
                System.out.println(2012 + ": " + annoBisestile(2012) + " Expected: true");
                System.out.println(2016 + ": " + annoBisestile(2016) + " Expected: true");
                System.out.println(2019 + ": " + annoBisestile(2019) + " Expected: false");
                System.out.println(2020 + ": " + annoBisestile(2020) + " Expected: true");
                System.out.println(2021 + ": " + annoBisestile(2021) + " Expected: false");
                System.out.println(2024 + ": " + annoBisestile(2024) + " Expected: true");
                System.out.println(2100 + ": " + annoBisestile(2100) + " Expected: false");
                System.out.println(2400 + ": " + annoBisestile(2400) + " Expected: true");
            }

        





    public static boolean pariDispari(String a){
        char[] b = a.toCharArray();
//        if (b.length %2==0){
//            return true;
//        }else{
//            return false;
//        }
        return b.length % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
       if(anno >100){
           if(anno %100 ==0 && anno %400 ==0 ){
               return true;
           }
       }
        if(anno%4==0){
           return true;
       }else return false;

    }


}