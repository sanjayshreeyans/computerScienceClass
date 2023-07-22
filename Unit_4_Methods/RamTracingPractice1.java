public class RamTracingPractice1 {

   
        public static int build (int num)
        {
        int temp = num * num;
        for (int x = 1 ; x < num ; x++)
            {
            temp = temp + num;
            }
        return temp;
        }
    
        public static String build (String word, char letter)
        {
            String temp = word + word;
            for (int x = 1 ; x <= 5 ; x++)
                {
                temp = temp + letter;
                }
            return temp;
        }
    
        public static void main (String[] args)
        {
            System.out.println (build (4) + " " + build (build (2)));
           
            System.out.println (build ("moo", 'o'));
            System.out.println (build (build ("wow", 'e'), '!'));
        } // main method
    

}
