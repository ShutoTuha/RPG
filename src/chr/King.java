package chr;

public class King implements Npc{
    String[] talkcontant = {"勇者よ、よく来たな",
    "魔王が現れて民たちは危険にさらされている。",
    "そこで君には魔王の討伐を任せたい。",
    "旅に必要な資金は渡しておこう。",
    "gigi"};


    public void talk(){
        for (int i = 0;i < talkcontant.length;i++){
            System.out.println(talkcontant[i]);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println("割り込まれました！");
            }
            
        }
    }
}
