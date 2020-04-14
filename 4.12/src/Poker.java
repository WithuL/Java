import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker {
    //通过这个类来模拟一副牌，洗牌，发牌
    //不加static的内部类，当我们创建card对象的时候，需要依靠Poker的实例才能创建
    //加上static的内部类，当我们创建card对象的时候，积极不需要依靠Poker的实例
    static class  Card {
        public String suit;
        public String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "(" + suit   + rank + ")";
        }
    }

    public static List<Card> buyPoker() {
        String[] suits = new String[] {"♥","♠","♣","♦"};
        List<Card> poker = new ArrayList<>();
        for(int i = 0; i < 4; i++ ) {
            for(int j = 2 ; j <= 10; j++) {
                Card card = new Card(suits[i],String.valueOf(j));
                poker.add(card);
            }
            poker.add(new Card(suits[i],"J"));
            poker.add(new Card(suits[i],"Q"));
            poker.add(new Card(suits[i],"K"));
            poker.add(new Card(suits[i],"A"));
        }
        return poker;
    }

    public static void shuffle(List<Card> poker) {
        //洗牌
        Random random = new Random();
        for(int i = poker.size()-1; i > 0 ; i--) {
            //产生一个[0-i)随机数
            int r = random.nextInt(i);
            swap(poker,i,r);
        }
    }

    private static void swap(List<Card> poker,int i , int j) {
        Card tmp = poker.get(i);
        poker.set(i,poker.get(j));
        poker.set(j,tmp);
    }

    public static void main(String[] args) {
        //先买一副牌
        List<Card> poker = buyPoker();
        //2.洗牌
        shuffle(poker);
        System.out.println(poker);
        //3.发牌，把牌发给三个玩家
        //通过嵌套List实现
        //每个玩家的手牌是一个list，多个玩家的手牌再放入一个list
        //players中的元素个数就是玩家的总数，有几个玩家就有几个元素，每个玩家又是一个list
        List<List<Card>> players = new ArrayList<List<Card>>();
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());
        players.add(new ArrayList<Card>());

        for(int cardIndex = 0 ;cardIndex< 5 ; cardIndex++) {
            for(int playerIndex = 0; playerIndex < 3 ; playerIndex++) {
                //先获取到当前玩家
                List<Card> player = players.get(playerIndex);
                //再把poker中的最前面元素发给当前玩家
                Card topCard = poker.remove(0);
                player.add(topCard);
            }
        }

        //4.展示手牌
        System.out.println("玩家1的牌");
        System.out.println(players.get(0));
        System.out.println("玩家2的牌");
        System.out.println(players.get(1));
        System.out.println("玩家3的牌");
        System.out.println(players.get(2));
    }
}
