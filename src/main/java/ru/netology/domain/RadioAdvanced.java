package ru.netology.domain;

public class RadioAdvanced {
    public int maxVolume = 10;
    public int minVolume = 0;
    public int currentVolume;
    public int maxStation = 9;
    public int minStation = 0;
    public int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume>=maxVolume){
            this.currentVolume=maxVolume;
        }
        else{
            this.currentVolume = currentVolume;
        }

    }
    public void volumeAdded() {
        currentVolume++;
        if (currentVolume >= maxVolume)
            currentVolume = maxVolume;
    }

    public void volumeReduced() {
        currentVolume--;
        if (currentVolume <= minVolume)
            currentVolume = minVolume;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void stationNext() {
        currentStation++;

        if (currentStation > maxStation){
            currentStation = minStation;
        }
    }
    public void stationPrev() {
        currentStation--;

        if (currentStation < minStation){
            currentStation = maxStation;
        }
    }
}


