package week6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	// Build ArrayList
	static List<String> menu = new ArrayList<String>();

	public static void main(String[] args) {

		menu.add("tacos");
		menu.add("burgers");
		menu.add("hot dogs");
		menu.add("soda");
		menu.add("hot wings");
		menu.add("french fries");
		menu.add("onion rings");
		menu.add("sandwich");
		menu.add("corn dog");
		menu.add("pizza");
		menu.add("tamales");
		menu.add("fish");

		System.out.println("Original Menu");
		System.out.println(menu);
		System.out.println();
		System.out.println("Menu Alphabetically Sorted");
		alphaSort(menu);
		System.out.println(menu);
		System.out.println();
		System.out.println("Menu Reversed");
		reverseSort(menu);
		System.out.println(menu);
	}

	public static void alphaSort(List<String> menu) {
		String smallest;
        int smallestLocation = 0;

        for(int progressIndex = 0; progressIndex < menu.size(); progressIndex++){
            smallest = menu.get(progressIndex);
            smallestLocation = progressIndex;

            for(int i = progressIndex + 1; i < menu.size(); i++){
                if(smallest.compareTo(menu.get(i)) > 0){
                    smallest = menu.get(i);
                    smallestLocation = i;
                }
            }

            if(smallestLocation != progressIndex){
                String tmpString = menu.get(progressIndex);
                menu.set(progressIndex, menu.get(smallestLocation));
                menu.set(smallestLocation, tmpString);
            }
        }

	}
	public static void reverseSort(List<String> menu) {
		String smallest;
        int smallestLocation = 0;

        for(int progressIndex = 0; progressIndex < menu.size(); progressIndex++){
            smallest = menu.get(progressIndex);
            smallestLocation = progressIndex;

            for(int i = progressIndex + 1; i < menu.size(); i++){
                if(smallest.compareTo(menu.get(i)) < 0){
                    smallest = menu.get(i);
                    smallestLocation = i;
                }
            }

            if(smallestLocation != progressIndex){
                String tmpString = menu.get(progressIndex);
                menu.set(progressIndex, menu.get(smallestLocation));
                menu.set(smallestLocation, tmpString);
            }
        }

	}
}
