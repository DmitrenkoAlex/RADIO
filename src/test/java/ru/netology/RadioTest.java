package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;





class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(3);
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationOverMax() {
        radio.setCurrentStation(12);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        radio.setCurrentStation(-12);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(3);
        radio.switchStationNext();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation0() {
        radio.setCurrentStation(9);
        radio.switchStationNext();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        radio.setCurrentStation(1);
        radio.switchStationPrev();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationWhenCurrent0() {
        radio.switchStationPrev();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNotDecreaseVolume0() {
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeUnderMinimum() {
        radio.setCurrentVolume(-100);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeOverMaximum() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

}