package kitob153;

public class DeckOfCardsTest {
    public static void main(String[] args) {
        DeckOfCars myDeckOfCars = new DeckOfCars();
        myDeckOfCars.shuffle();
        for (int i=1; i<=52; i++){
            System.out.printf("%-19s", myDeckOfCars.dealCard());
            if (i %4==0)
                System.out.println();
        }
    }
}
