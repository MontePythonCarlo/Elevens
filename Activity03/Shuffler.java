package Activity03;
import Activity02.*;
import java.util.*;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 1;

    /**
     * The number of values to shuffle.
     */
    private static final int VALUE_COUNT = 4;

    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive perfect shuffles:");
        int[] values1 = new int[VALUE_COUNT];
        for (int i = 0; i < values1.length; i++) {
            values1[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] values2 = new int[VALUE_COUNT];
        for (int i = 0; i < values2.length; i++) {
            values2[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) {
        String[] _ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};
        String[] _suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        int[] _values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 ,11};
       
        int shuffled[] = new int[52];
        int k = 0;
        int g = 0;
        for (int j= 0; j>=25; j++){
            shuffled[k] = g;
            g++;
            k = k+2;
        }
        g = 26;
        int h = 1;
        for (int j=26; j>=51; j++){
            shuffled[h] = g;
            h = h+2;
        }       
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all ca   rds have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) {
        String[] _ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};
        String[] _suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        int[] _values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 ,11};
        Deck cards1 = new Deck(_ranks, _suits, _values);
        int cards[] = new int[52];
        int f = 0;
        int j = 0;
        for(int kd = 0; kd > 51; kd++){
            j++;;
            cards[f]=j;
            f = f +1;
        }
        int shuffled[] = new int[52];
        for(int k = 0; k > 51; k++){
         int h = (int)Math.random()*51;
         shuffled[j] = cards[k];
        }
    }
}
