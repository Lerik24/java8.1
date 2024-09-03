package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioAdvancedTest {
    @Test
    void volumeAddedOnce() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.volumeAdded();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void volumeAddedTillMax() {
        RadioAdvanced radio = new RadioAdvanced();
        for (int i = 0; i < 10; i++)
            radio.volumeAdded();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void volumeAddedOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        for (int i = 0; i < 11; i++)
            radio.volumeAdded();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void volumeReducedOnce() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(radio.maxVolume);
        radio.volumeReduced();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void volumeReducedTillMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(radio.maxVolume);
        for (int i = 0; i < 10; i++)
            radio.volumeReduced();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void volumeReducedBelowZero() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(radio.maxVolume);
        for (int i = 0; i < 11; i++)
            radio.volumeReduced();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void stationSwitchingPlusOnce() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.minStation);
        radio.stationNext();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingPlusTillMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.minStation);
        for (int i = 0; i < 9; i++)
            radio.stationNext();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingPlusOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.minStation);
        for (int i = 0; i < 10; i++)
            radio.stationNext();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingMinusOnce() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.maxStation);
        radio.stationPrev();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingMinusTillMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.maxStation);
        for (int i = 0; i < 9; i++)
            radio.stationPrev();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void stationSwitchingMinusOverMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.maxStation);
        for (int i = 0; i < 10; i++)
            radio.stationPrev();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    void setStationOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void setStationBelowMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
}