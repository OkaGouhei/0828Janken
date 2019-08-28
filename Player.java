import java.util.Scanner;
class Player{
    Scanner scan ;
    public Player(){
        scan = new Scanner(System.in);
    }

    private String name;
    private int handmark;
    public void setName(){
        System.out.println("名前を入力して下さい");
        String name = scan.next();
        this.name = name;
        System.out.println(this.name + "さんですね");
    }
    public String getName(){
    return this.name;
    }
    public void setHandmark(){
        System.out.println(this.name + "さんの数字を入力してください。グーが1、チョキが2、パーが3です。");
        int number = scan.nextInt();
        while(number !=1 && number !=2 && number !=3){
            System.out.println("もういちど入力してください");
            number = scan.nextInt();
        }
        String[] jankenMark = { "" , "グー" , "チョキ" , "パー" };
        System.out.println(this.name + "さんの出した手は" + jankenMark[number] + "ですね");
        this.handmark = number;
    }
    public int getHandmark(){
        return this.handmark;
    }
}
