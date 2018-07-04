package ru.elanlum.task2;

import java.util.HashMap;
import java.util.Map;

public class Tools {


    public class EmployeeWorkplace {

        private int deskNumber;
        private HashMap<Stationery, Integer> stationeryStorage;

        public EmployeeWorkplace(int deskNumber) {
            this.deskNumber = deskNumber;
            this.stationeryStorage = new HashMap<>();
        }

        public void addStationary(Stationery stationery) {
            if (stationeryStorage.containsKey(stationery)) {
                stationeryStorage.put(stationery, stationeryStorage.get(stationery) + 1);
            } else {
                stationeryStorage.put(stationery, 1);
            }
        }

        public void deleteStationary(Stationery stationery) {
            if (stationeryStorage.containsKey(stationery)) {
//                int stationeryCounter = stationeryStorage.get(stationery);
                if (stationeryStorage.get(stationery) > 1) {
                    stationeryStorage.put(stationery, stationeryStorage.get(stationery) - 1);
                } else {
                    stationeryStorage.remove(stationery);
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        public int getStationeryTotalCost() {
            int cost = 0;
            for (Map.Entry<Stationery, Integer> entry : stationeryStorage.entrySet()) {
                cost += entry.getKey().getPriceRub() * entry.getValue();
            }
            return cost;
        }
    }
}
