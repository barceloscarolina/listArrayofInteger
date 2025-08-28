public class Main {
    
    public static void main(String[] args){

        ListArrayOfInteger vetor = new ListArrayOfInteger();

        for (Integer i = 10;i<20 ; i = i + 2){

            vetor.add(i);

        }

        System.out.println(vetor.toString());


        vetor.removeByIndex(2);

        System.out.println(vetor.toString());


    }


}
