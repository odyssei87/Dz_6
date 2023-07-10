import java.util.Scanner;
public class Printer implements Print, Input, SendFax {
    String name;
    String file;
    public Printer(String name){
        this.name=name;
    }

   public void Print(){
        System.out.println(file);

   }
   public void input(){
       Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для печати");
        this.file=in.nextLine();

   }
   public void SendFax(){
        System.out.println("Текст отправлен на факс");
   }
}
