package com.sergtm.application.carTask;

import com.sergtm.application.Interface.IPrintable;
import com.sergtm.application.factory.CollectionType;
import com.sergtm.application.factory.Factory;
import com.sergtm.application.factory.Wrapper;

import java.util.*;

/**
 * Created by admin on 22.08.2016.
 */
public class Main {
    private List<Car> getCars(){
        Car car = new Car(CarBody.SEDAN, "Red", 1.5, 111L);
        Car car1 = new Car(CarBody.SEDAN, "Blue", 1.11, 1111L);
        Car car2 = new Car(CarBody.SEDAN, "Yellow", 1.10, 2111L);
        Car car3 = new Car(CarBody.SEDAN, "Black", 1.15, 3111L);
        Car car4 = new Car(CarBody.SEDAN, "Orange", 1.9, 4111L);

        return Arrays.asList(car, car1, car2, car3, car4);
    }

    private Map populateMap(Map map){
        for(int i = 0; i < getCars().size(); i++){
            map.put(i, getCars().get(i));
        }
        return map;
    }
    private Collection populateCollection(Collection collection){
        for(int i = 0; i < getCars().size(); i++){
            collection.add(getCars().get(i));
        }
        return collection;
    }

    private void printMap(Map<Integer, Car> map){
        Factory factory = new Factory();

        map = populateMap(map);

        Wrapper wrapper = new Wrapper();
        wrapper.setMap(map);

        IPrintable iPrintable = factory.create(CollectionType.MAP, wrapper);
        iPrintable.print();
    }

    private void printCollection(Collection<Car> collection){
        Factory factory = new Factory();

        collection = populateCollection(collection);

        Wrapper wrapper1 = new Wrapper();
        wrapper1.setCollection(collection);

        IPrintable iPrintable = factory.create(CollectionType.COLLECTION, wrapper1);
        iPrintable.print();
    }

    public static void main(String[] args){
        Main main = new Main();

        System.out.println("-------HashMap--------");
        Map<Integer, Car> map = new HashMap<>();
        map = main.populateMap(map);

        main.printMap(map);

        System.out.println("-------ArrayList--------");
        Collection<Car> list = new ArrayList<>();
        list = main.populateCollection(list);

        main.printCollection(list);

        System.out.println("-------HashSet--------");

        Collection<Car> hashSet = new HashSet();
        hashSet = main.populateCollection(hashSet);

        main.printCollection(hashSet);

        System.out.println("-------LinkedHashSet--------");

        Collection<Car> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet = main.populateCollection(linkedHashSet);

        main.printCollection(linkedHashSet);

        System.out.println("-------TreeSet-------");

        Collection<Car> treeSet = new TreeSet<>();
        treeSet = main.populateCollection(treeSet);

        main.printCollection(treeSet);

        System.out.println("-------LinkedList-------");

        Collection<Car> linkedList = new LinkedList<>();
        linkedList = main.populateCollection(linkedList);

        main.printCollection(linkedList);

        System.out.println("-------Stack-------");

        Collection<Car> stack = new Stack<>();
        stack = main.populateCollection(stack);

        main.printCollection(stack);

        System.out.println("-------Queue-------");

        Collection<Car> queue = new ArrayDeque<>();

        queue = main.populateCollection(queue);

        main.printCollection(queue);
    }
}
