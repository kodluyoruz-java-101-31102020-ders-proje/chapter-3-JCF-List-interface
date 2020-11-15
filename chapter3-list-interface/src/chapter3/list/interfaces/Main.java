package chapter3.list.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		
		runArrayListSample();
		
		//runLinkedListSample();
		
		//runVectorSample();
		
		//runStackSample();
	}

	public static void runArrayListSample() {
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("Gamze");
		nameList.add("Elif");
		nameList.add("Mustafa");
		nameList.add("Umut");
		nameList.add("Umut");
		nameList.add(null);
		
		printAll(nameList);
		
		System.out.println("Size of list: " + nameList.size());
	
		
		// get ile listeden eleman okuması yapılır. Okunan eleman listeden çıkartılmaz.
		System.out.println("Element of 0 index: " + nameList.get(0));
		System.out.println("Element of 1 index: " + nameList.get(1));
		System.out.println("Element of 2 index: " + nameList.get(2));
		
		
		// ilk geçen noktadaki Umut bilgisinin indis değerini veriyor.
		// eğer eleman yoksa -1 değerini döndürür.
		System.out.println("Index of 'Umut': " + nameList.indexOf("Umut"));
		
		// son geçen noktadaki Umut bilgisinin indis değerini veriyor.
		System.out.println("Index of 'Umut': " + nameList.lastIndexOf("Umut"));
		
		nameList.set(1, "Zeynep");
		
		printAll(nameList);
		
		
		// contains ile liste içinde aradığımız eleman var mı yok mu belirtir.
		// varsa true, yoksa false döner
		System.out.println(nameList.contains("Elif"));
		System.out.println(nameList.contains("Mustafa"));
		
		// remove fonksiyonu ile listeden belirttiğimiz indisteki değer silinir.
		// silinen değer fonksiyondan bize geri döndürülür.
		String firstElement = nameList.remove(0);
		System.out.println(firstElement + " is removed from list!");
		
		
		List<String> newNameList = new ArrayList<String>();
		newNameList.add("Batuhan");
		newNameList.add("Kemal");
		
		// bir listeyi tümüyle bir diğer listeye eklemek için "addAll" fonksiyonu kullanılır.
		nameList.addAll(newNameList);
		
		System.out.println("addAll işleminden sonrası");
		printAll(nameList);
		
		
		// listeden alt bir liste oluşturmak için "sublist" fonksiyonunu kullanırız.
		List<String> subList = nameList.subList(4, 7);
		
		System.out.println("Sublist from name list");
		printAll(subList);
		
		
		// toArray fonksiyonu parametresiz çağırırsanız Object tipinde bir dizi döner.
		Object[] objectArray = nameList.toArray();
		
		// toArray fonksiyonuna hangi tipte bir dizi oluşturmak istiyorsak,
		// o tipten bir nesne üretip parametre olarak göndeririz.
		// String tipinden bir dizi almak istediğimiz için "new String[0]" şeklinde bir nesne üretip, "toArray" fonksiyonuna gönderdik.
		String[] stringArray = nameList.toArray(new String[0]);
	
		
		// listedeki tüm elemanları temizler. yani tümünü listeden siler.
		nameList.clear();
	}
	
	public static void runLinkedListSample() {
		
		List<String> nameList = new LinkedList<String>();
		nameList.add("Hale");
		nameList.add("Jale");
		nameList.add("Lale");
		nameList.add("Ahmet");
		nameList.add("Mehmet");
		nameList.add("Kemal");
		
		// get ile listeden eleman okuması yapılır. Okunan eleman listeden çıkartılmaz.
		System.out.println("Element of 1 index: " + nameList.get(1));
		System.out.println("Element of 2 index: " + nameList.get(2));
		
		
	}
	
	public static void runVectorSample() {
		
		Vector<String> vectorOfNames = new Vector<String>();
		vectorOfNames.add("Ahmet");
		vectorOfNames.add("Hale");
		vectorOfNames.add("Jale");
		vectorOfNames.add("Lale");
		vectorOfNames.add("Ahmet");
		vectorOfNames.add("Mehmet");
		vectorOfNames.add("Kemal");
		
		// get ile listeden eleman okuması yapılır. Okunan eleman listeden çıkartılmaz.
		System.out.println("Element of 1 index: " + vectorOfNames.get(0));
		System.out.println("Element of 2 index: " + vectorOfNames.get(1));
				
	}
	
	public static void runStackSample() {
		
		Stack<String> stackNames = new Stack<String>();
		stackNames.push("Mehmet");
		stackNames.push("Lale");
		stackNames.push("Umut");
		stackNames.push("Ayşe");
		
		printAll(stackNames);
		
		System.out.println(stackNames.pop());
		
		printAll(stackNames);
	}
	
	public static void printAll(List<String> nameList) {
		
		for(String name : nameList) {
			
			System.out.println(name);
		}
	}
}
