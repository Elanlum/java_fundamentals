package ru.elanlum.task3;

import ru.elanlum.task3.basic.AbstractStationery;

import java.util.*;

public class EmployeeWorkplace {

    private int deskNumber;
    private HashMap<AbstractStationery, Integer> stationeryStorage;

    public EmployeeWorkplace(int deskNumber) {
        this.deskNumber = deskNumber;
        stationeryStorage = new HashMap<>();
    }

    public void addStationary(AbstractStationery stationery) {
        if (stationeryStorage.containsKey(stationery)) {
            stationeryStorage.put(stationery, stationeryStorage.get(stationery) + 1);
        } else {
            stationeryStorage.put(stationery, 1);
        }
    }

    public void deleteStationary(AbstractStationery stationery) {
        if (stationeryStorage.containsKey(stationery)) {
//            int stationeryCounter = stationeryStorage.get(stationery);
            if (stationeryStorage.get(stationery) <= 1) {
                stationeryStorage.remove(stationery);
            } else {
                stationeryStorage.put(stationery, stationeryStorage.get(stationery) - 1);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getStationeryTotalCost() {
        int cost = 0;
        for (Map.Entry<AbstractStationery, Integer> entry : stationeryStorage.entrySet()) {
            cost += entry.getKey().getPrice() * entry.getValue();
        }
        return cost;
    }

    public void clearStationery() {
        stationeryStorage.clear();
    }

    public List<AbstractStationery> sortStationaryByCost() {
        List<AbstractStationery> stationeryList = new ArrayList<>();
        stationeryList.addAll(stationeryStorage.keySet());
        stationeryList.sort(Comparator.comparingInt(abstractStationery -> abstractStationery.getPrice()));
        return stationeryList;
    }

    public List<AbstractStationery> sortStationaryByType() {
        List<AbstractStationery> stationeryList = new ArrayList<>();
        stationeryList.addAll(stationeryStorage.keySet());
        stationeryList.sort(Comparator.comparing(o -> o.getClass().getName()));
        return stationeryList;
    }

    public List<AbstractStationery> sortStationaryByTypeAndCost() {
        List<AbstractStationery> stationeryList = new ArrayList<>();
        stationeryList.addAll(stationeryStorage.keySet());
        stationeryList.sort((o1, o2) ->
                o1.getClass().getName().compareTo(o2.getClass().getName()) == 0 ?
                        Integer.compare(o1.getPrice(), o2.getPrice()) :
                        o1.getClass().getName().compareTo(o2.getClass().getName()));
        return stationeryList;
    }

    @Override
    public String toString() {
        return "EmployeeWorkplace{" +
                "deskNumber=" + deskNumber +
                ", stationeryStorage=" + stationeryStorage +
                '}';
    }
}
