package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void createRadio() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        assertEquals(0, radio.currentVolume);
    }

    @Test
    public void changeStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        radio.currentStation = 10;
        assertEquals(10, radio.currentStation);
    }
}