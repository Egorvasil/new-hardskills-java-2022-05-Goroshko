import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class VisualizeSort {
    public static int[] bubbleSort(int[] numbersArray){ // bubble sorting
        for(int i=1,clipboard;i!=12;i++){
            if(numbersArray[i]>numbersArray[i-1]){
                clipboard = map[i-1];
                map[i-1] = map[i];
                map[i] = clipboard;
            }
        }
        return numbersArray;
    }
    public static int[] insertSort(int[] numbersArray){ // insert sorting
        for(int i=0;i!=12;i++){
            if(11-numbersArray[i]!=i){
                int startNumber=i%12,endNumber;
                for(endNumber=startNumber;endNumber!=12;endNumber++) if(numbersArray[startNumber]<numbersArray[endNumber]) break;
                int j, clipboard = numbersArray[endNumber];
                for (j = endNumber - 1; j >= startNumber; j--) numbersArray[j + 1] = numbersArray[j];
                numbersArray[j+1] = clipboard;
                break;
            }
        }
        return numbersArray;
    }
    public static int[] selectionSort(int[] numbersArray){ // selection sorting
        for(int i=0;i!=12;i++){
            if(11-numbersArray[i]!=i){
                int minNumber=i;
                for(int j=i+1;j!=12;j++) if(numbersArray[minNumber]<numbersArray[j]) minNumber=j;
                int clipboard = map[minNumber];
                map[minNumber] = map[i];
                map[i] = clipboard;
                break;
            }
        }
        return numbersArray;
    }

    public static boolean checkArray(int[] numbersArray){ // check array for sequence
        for(int i=1;i!=12;i++) if(numbersArray[i]>numbersArray[i-1]) return false;
        return true;
    }
    public static void drawArray(int[] numbersArray){ // displays an array
        for(int i=0;i!=12;i++){
            for(int j=0;j!=12;j++) {
                System.out.print(((numbersArray[j]>i) ? " " : "|"));
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static int[] arrayMaker(){ // creates an array of random non-repeating numbers
        int[] array = new int[12];
        for (int i = 0; i != 12; i++) map[i] = i;
        for (int i = 0, clipboard, randomIndex; i != 24; i++) {
            randomIndex = (int) (11 * Math.random());
            clipboard = map[randomIndex];
            map[randomIndex] = map[i%12];
            map[i%12] = clipboard;
        }
        return map;
    }

    public static int[] map = new int[12];

    public static void main(String[] args) throws IOException, InterruptedException {
        map=arrayMaker();
        Scanner in = new Scanner(System.in);
        String String = in.nextLine();
        int kindSorting=0;
        switch (String) {
            case "insert":
                kindSorting = 1;
                break;
            case "selection":
                kindSorting = 2;
                break;
        }
        for(int j=0;j!=42;j++) {
            if(checkArray(map)) return;
            //map=bubbleSort(map);
            map=((kindSorting==0) ? bubbleSort(map) : ((kindSorting==1) ? insertSort(map) : selectionSort(map)));
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            drawArray(map);
            TimeUnit.MILLISECONDS.sleep(70);
        }
    }
}