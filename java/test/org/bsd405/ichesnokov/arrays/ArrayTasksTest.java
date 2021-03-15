package org.bsd405.ichesnokov.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTasksTest {

    @Test
    void max() {
        assertEquals(13, ArrayTasks.max(new int[][] {
                { 3, 7, 0},
                { 0, 7, 3},
                { 3, 13, 9}
        }));
    }

    @Test
    void median2() {
        assertEquals(3, ArrayTasks.median2(new int[][] {
                { 3, 7, 0},
                { 0, 7, 3},
                { 3, 12, 9}
        }));

        assertEquals(0, ArrayTasks.median2(new int[][] {
                { 0, 0, 0},
                { 0, 1, 0},
                { 1, 0, 0}
        }));
    }
}