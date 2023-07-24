package Seminar2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class seminar2 {
    public interface QueueBehavior {
        void takeInQueue(Buyer actor);
        void takeOrder();
        void giveOrder();
        void releaseFromQueue();
    }

    public interface BuyerBehavior {
        void setMakeOrder();
        void setTakeOrder();
        boolean isMakeOrder();
        boolean isTakeOrder();
    }

    public interface MarketBehavior {
        void acceptToMarket(Buyer actor);
        void releaseFromMarket(Buyer actor);
        void update();
    }

    public abstract class Buyer implements BuyerBehavior {
        protected String name;
        protected boolean isMakeOrderClass;
        protected boolean isTakeOrderClass;
    
        abstract String getName();
    
    
    }
    
    public class Human extends Buyer {

        @Override
        String getName() {
            return name;
        }
    
        @Override
        public void setMakeOrder() {
            isMakeOrderClass = true;
        }
    
        @Override
        public void setTakeOrder() {
            isTakeOrderClass = true;
        }
    
        @Override
        public boolean isMakeOrder() {
             return isMakeOrderClass;
        }
    
        @Override
        public boolean isTakeOrder() {
            return isTakeOrderClass;
        }
    }

    public class Market implements MarketBehavior, QueueBehavior {
        List<Buyer> actors = new LinkedList<>();
        Queue<Buyer> actorsQueue = new ArrayDeque<>();

        @Override
        public void acceptToMarket(Buyer actor) {
            System.out.println(actor.getName() + " зашел в магазин");
            actors.add(actor);
        }

        @Override
        public void releaseFromMarket(Buyer actor) {
            actors.remove(actor);
            System.out.println(actor.getName() + " покинул магазин");
        }

        @Override
            public void update() {
        }

        @Override
        public void takeInQueue(Buyer actor) {
            actorsQueue.add(actor);
            System.out.println(actor.getName() + " встал в очередь");
        }

        @Override
        public void takeOrder() {
            actorsQueue.peek().isTakeOrder();
            System.out.println(actorsQueue.peek().getName() + " забрал заказ");
        }

        @Override
        public void giveOrder() {
            actorsQueue.peek().isMakeOrder();
            System.out.println(actorsQueue.peek().getName() + " сделал заказ");
        }

        @Override
        public void releaseFromQueue() {
            System.out.println(actorsQueue.peek().getName() + " покинул очередь");
            actorsQueue.poll();
        }
    }

    public class Main {
        public static void main(String[] args) {
    
            Human hm = new Human();
            hm.name = "Roman";
    
            Market market = new Market();
    
            market.acceptToMarket(hm);
            market.takeInQueue(hm);
            market.giveOrder();
            market.takeOrder();
            market.releaseFromQueue();
            market.releaseFromMarket(hm);
            market.update();
    
        }
    }
}

