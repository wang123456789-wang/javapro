package f13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入玩家人数：");
        int player = scanner.nextInt();
            if (player > 18 || player < 12) {
                System.out.println("输入人数错误");
            } else {
                List<String> all = new ArrayList<>();
                List<String> play = new ArrayList<>();
                List<String> di = new ArrayList<>();
                all(all);
                //System.out.println(all);
                init(play);
                play(play, player);
                play.remove("盗贼");
                dipai(di, play);
                play.add("盗贼");
                System.out.println("玩家手牌" + play);
                System.out.println("底牌" + di);
            }
    }
    //初始化所有牌
    public static void all(List<String> all){
        all.add("预言家");
        all.add("女巫");
        all.add("丘比特");
        all.add("守护");
        all.add("猎人");
        all.add("村长");
        all.add("替罪羊");
        all.add("吹笛者");
        all.add("盗贼");
        for(int i = 0;i<5;i++){
            all.add("狼人");
        }
        for(int i = 0;i<7;i++){
            all.add("村民");
        }
    }
    //初始化十二人的牌
    public static void init(List<String> play){
        play.add("预言家");
        play.add("女巫");
        play.add("丘比特");
        play.add("守护");
        play.add("猎人");
        play.add("村长");
        play.add("盗贼");
        for (int i = 0;i<4 ;i++){
            play.add("狼人");
        }
        for (int i = 0;i<4 ;i++){
            play.add("村民");
        }
    }
    public static void play(List<String> play,int player){
//
        if(player>12)
            play.add("村民");
        if(player>13)
            play.add("替罪羊");
        if(player>14)
            play.add("狼人");
        if(player>15)
            play.add("村民");
        if(player>16)
            play.add("村民");
        if(player>17)
            play.add("吹笛者");
    }
    //取出底牌
    public static void dipai(List<String> di ,List<String> play){
        while (di.size()<3){
            Random random = new Random();
            int index = random.nextInt(play.size());

            if(di.contains("狼人")&&play.get(index).equals("狼人")){
                continue;
            }else{
                di.add(play.remove(index));
            }
        }

    }
}
