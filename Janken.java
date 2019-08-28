import java.util.Scanner;
public class Janken{
    public static void main(String args[]) {
        Player p1 = new Player();
        Player p2 = new Player();
        p1.setName();
        p2.setName();
        p1.setHandmark();
        p2.setHandmark();
        judge(p1,p2);
    }
    static void judge(Player a, Player b){
        int num1 = a.getHandmark();
        int num2 = b.getHandmark();
        if(num1 == num2){
            System.out.println("あいこです");
        }else if( ((num1 ==1)&&(num2==2)) || ((num1 ==2)&&(num2==3)) || ((num1 ==3)&&(num2==1)) ){
            System.out.println(a.getName()+ "さんのかちです");
        }else{
            System.out.println(b.getName() + "さんのかちです");
        }
    }
}
