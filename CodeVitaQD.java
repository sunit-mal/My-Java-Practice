import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CodeVitaQD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        ArrayList<Integer> tokens = readList(sc, days);
        ArrayList<Integer> status = readList(sc, days);
        int offerDays = sc.nextInt();
        sc.nextLine(); 
        String itemsInput = sc.nextLine();

        sc.close();

        int maxCoins = calculateMaxCoins(tokens, status, offerDays);
        findAndPrintItems(itemsInput, maxCoins);
    }

    static ArrayList<Integer> readList(Scanner sc, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }

    static int calculateMaxCoins(ArrayList<Integer> tokens, ArrayList<Integer> status, int offerDays) {
        int totalClaimedTokens = 0;
        for (int i = 0; i < tokens.size(); i++) {
            if (status.get(i) == 1) {
                totalClaimedTokens += tokens.get(i);
            }
        }

        int maxUnclaimedTokens = 0;
        for (int index = 0; index <= tokens.size() - offerDays; index++) {
            int unclaimedTokens = 0;
            for (int i = index; i < index + offerDays; i++) {
                if (status.get(i) == 0) {
                    unclaimedTokens += tokens.get(i);
                }
            }
            maxUnclaimedTokens = Math.max(maxUnclaimedTokens, unclaimedTokens);
        }

        return totalClaimedTokens + maxUnclaimedTokens;
    }

    static void findAndPrintItems(String itemsInput, int maxCoins) {
        String[] elements = itemsInput.split(" ");
        String[] items = new String[elements.length];
        int[] prices = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            String[] temp = elements[i].split(":");
            items[i] = temp[0];
            prices[i] = Integer.parseInt(temp[1]);
        }

        ArrayList<String> affordableItems = new ArrayList<>();
        int maxWastage = Math.abs(prices[0] - maxCoins);

        for (int i = 0; i < prices.length; i++) {
            int wastage = Math.abs(prices[i] - maxCoins);
            if (wastage <= maxWastage) {
                if (wastage < maxWastage) {
                    affordableItems.clear();
                }
                affordableItems.add(items[i]);
                maxWastage = wastage;
            }
        }

        Collections.sort(affordableItems);
        for (String item : affordableItems) {
            System.out.print(item + " ");
        }
    }
}
