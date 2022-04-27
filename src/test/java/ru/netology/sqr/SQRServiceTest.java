package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCalculateNumberRange() {
        SQRService service= new SQRService();
        int expected = 3;
        int actual = service.calculateNumber(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberBelowRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculateNumber(0, 99);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberAboveRange() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.calculateNumber(99, 10000);

        assertEquals(expected, actual);
    }
}