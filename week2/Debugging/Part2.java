
public class Part2
{
   public void findAbc(String input){
       int index = input.indexOf("abc");
       while (true){
           if (index == -1 || index >= input.length() - 3){
               break;
           }
           System.out.println("index before " + index);
           String found = input.substring(index + 1, index + 4);
           System.out.println(found);
           index = input.indexOf("abc",index + 3);
           System.out.println("index after " + index);
           // System.out.println("index + 4 " + (index + 4));
           }
   }
   
   public void test(){
       //findAbc("abcd");
       // findAbc("abcdabc");
       findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
       // findAbc("kdabcabcjei");
       // findAbc("ttabcesoeiabco");
       // findAbc("abcbabccabcd");
       // findAbc("qwertyabcuioabcp");
       // findAbc("abcabcabcabca");
   }
}
