package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int amountStation = 10;
    private int minNumStation = 0;

    public Radio(int amountStation)
    {
        this.amountStation = amountStation;

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
        if (currentStation == amountStation-1) {
            currentStation = minNumStation;
            return;
        }
        ++currentStation;
    }

    public void switchStationPrev() {
        if (currentStation == minNumStation) {
            currentStation = amountStation-1;
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

        if (currentStation > amountStation-1 || currentStation < minNumStation) {

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
