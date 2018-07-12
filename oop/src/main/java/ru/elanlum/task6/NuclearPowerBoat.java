package ru.elanlum.task6;


import ru.elanlum.task7.Boat;

import java.time.LocalDate;
@Boat(
        uniqueNumber = 123321,
        length = 20,
        width = 5,
        name = "Enterprise"
)
public class NuclearPowerBoat {

    private final String model;
    private final LocalDate manufactureDate;
    private int nuclearRocketNumber;
    private Engine engine;

    public NuclearPowerBoat(String model, LocalDate manufactureDate, int nuclearRocketNumber, Engine engine){
    this.model = model;
    this.manufactureDate = manufactureDate;
    this.nuclearRocketNumber = nuclearRocketNumber;
    this.engine = engine;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public boolean launchRocket(){
        boolean islaunched = false;
        if(nuclearRocketNumber > 0){
            nuclearRocketNumber --;
            islaunched = true;
        }
        return islaunched;
    }

    class Engine {

        private final int maxSpeed;
        private int currentSpeed;
        private boolean isStarted;

        public Engine(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public void startEngine() {
            isStarted = true;

        }

        public void stopEngine() {
            if (isStarted) {
                while (currentSpeed > 0) {
                    currentSpeed--;
                }
                isStarted = false;
            }
        }

        public void increaseCurrentSpeed(int increaseAmount) {
            if (isStarted) {
                while (currentSpeed < maxSpeed && increaseAmount > 0) {
                    currentSpeed++;
                    increaseAmount--;
                }
            }
        }

        public void decreaseCurrentSpeed(int decreaseAmount) {
            if (isStarted) {
                while (currentSpeed > 0 && decreaseAmount > 0) {
                    currentSpeed--;
                    decreaseAmount--;

                }
            }
        }

        public boolean isStarted() {
            return isStarted;
        }

        public int getCurrentSpeed() {
            return currentSpeed;
        }
    }

}
