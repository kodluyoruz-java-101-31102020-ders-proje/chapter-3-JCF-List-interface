package chapter3.list.interfaces;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		//runArrayListSample();
		
		//runLinkedListSample();
		
		//runVectorSample();
		
		//runStackSample();
	}
	
	public static void runArrayListSample() {
		
		// ********* ArrayList Örneği *********
		// ArrayList sınıfı String tipindeki verilerle çalışacaktır.
		// JCF, Generic yapısını çok yoğun şekilde kullanır.
		// Elimizdeki veri kümesi üzerinde yoğunlukla okuma işlemi yapacaksak ArrayList kullanmak mantıklıdır.
		// Array yapısı verileri blok halinde ardışık şekilde saklar.
		// Dolayısıyla ardışık verileri okumak çok daha hızlıdır.
		// Eğer elimizdeki veri kümesine yoğun şekilde ekleme çıkarma yapılacaksa ArrayList kullanılmamalıdır.
		// Array'den eleman çıkarmak eklemek sonucunda kaydırma işlemi uygulanmalıdır.
		// Bu performansı etkileyen bir durumdur. Bu tarz bir senaryoda verileri LinkedList veri tipinde saklamak daha mantıklıdır.
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
		
		// ********* ArrayList Örneği *********
	}
	
	public static void runLinkedListSample() {
		
		// ********* LinkedList Örneği *********
		// Veri yapılarındaki çift yönlü bağlı listeyi ifade eder.
		// Veri kümesine yoğun şekilde eleman ekleme çıkarma işleme yapılacaksa bu durumda tercih edilmelidir.
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
		// ********* LinkedList Örneği *********
	}
	
	public static void runVectorSample() {
		
		// ********* Vector Örneği *********
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
		// ********* Vector Örneği *********
	}
	
	public static void runStackSample() {
		
		// ********* Stack Örneği *********
		// Veri yapılarındaki Stack veri yapısının Java'da kodlanmış halidir.
		// Tabakların üst üste konulmasını Stack yapısına benzetebilirsiniz.
		Stack<String> stackNames = new Stack<String>();
		stackNames.push("Mehmet");
		stackNames.push("Lale");
		stackNames.push("Umut");
		stackNames.push("Ayşe");
		
		printAll(stackNames);
		
		System.out.println(stackNames.pop());
		
		printAll(stackNames);
		// ********* Stack Örneği *********
	}
	
	public static void printAll(List<String> nameList) {
		
		for(String name : nameList) {
			
			System.out.println(name);
		}
	}
}
