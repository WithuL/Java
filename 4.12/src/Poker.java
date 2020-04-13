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
            //产生一个[0-i) 随机数
        }
    }
    public static void main(String[] args) {
        List<Card> card = buyPoker();
        System.out.println(card);
    }
}
