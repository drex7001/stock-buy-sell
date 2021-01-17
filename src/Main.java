import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static ArrayList<Stock> stockList = new ArrayList<>();
    static Queue<Stock> stockQueue= new LinkedList<Stock>();
    static float n,m = 0;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("D:\\Work\\Virya consulting java\\Quiz\\java_test\\src\\main\\resources\\trades.dat"));
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] parts = line.split(",");
            Stock stock = new Stock(parts[0],parts[1],parts[2],parts[3],parts[4]);
            stockList.add(stock);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Trade ID");
        String stock_id = scanner.nextLine();
        System.out.println("Enter Stock Symbol");
        String stock_symbol = scanner.nextLine();
        toQueue(stock_id,stock_symbol);

    }

    public static void toQueue(String trade_id, String stock_symbol){

        for (int i = 0; i < stockList.size(); i++) {
            float qQuantity = Float.parseFloat(stockList.get(i).getQuantity());
            float qPrice = Float.parseFloat(stockList.get(i).getPrice());

            if(trade_id.equals(stockList.get(i).getTrade_id())  && stock_symbol.equals(stockList.get(i).getStock_symbol()) && stockList.get(i).getBuy_sell().equals("B")){
                stockQueue.add(stockList.get(i));
//                System.out.println("inside Buy");
//                System.out.println(qPrice);
//                System.out.println(qQuantity);
//                System.out.println(stockQueue.peek().getPrice());
            }
            else if(trade_id.equals(stockList.get(i).getTrade_id())  && stock_symbol.equals(stockList.get(i).getStock_symbol()) && stockList.get(i).getBuy_sell().equals("S")){
                float pQuantity = Float.parseFloat(stockQueue.peek().getQuantity());
                float pPrice = Float.parseFloat(stockQueue.peek().getPrice());
//                System.out.println("inside sell");
//                System.out.println(qPrice);
//                System.out.println(qQuantity);

                if(qQuantity > pQuantity){
                    m = qPrice * pQuantity - pQuantity * pPrice;
                    System.out.println(m);
                    stockQueue.remove();
                }
                if((qQuantity - pQuantity) < pQuantity){
                    n = qPrice * qQuantity - pQuantity * qPrice;
                    System.out.println(n);
                    stockList.get(i).setQuantity(Float.toString(pQuantity-qQuantity));
                }

            }
        }

        //System.out.println(m+n);

    }
}
