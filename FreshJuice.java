class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
   FreshJuiceSize size;
}

public class FreshJuiceTest {

   public static void main(String args[]) {
      FreshJuice juice = new FreshJuice(); //make a FreshJuice type named juice from FreshJuice class
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM ; //set the size property to the predetermined property
      System.out.println("Size: " + juice.size);
   }
}