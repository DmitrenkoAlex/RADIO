package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxStation = 10;
    private int minStation = 0;

    public Radio(int currentStation, int currentVolume, int minStation, int maxStation, int maxVolume, int minVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio() {

    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        ++currentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        --currentVolume;
    }

    public void switchStationNext() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        ++currentStation;
    }

    public void switchStationPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        --currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > maxStation || currentStation < minStation) {

            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume || currentVolume < minVolume) {

            return;
        }

        this.currentVolume = currentVolume;
    }
}
