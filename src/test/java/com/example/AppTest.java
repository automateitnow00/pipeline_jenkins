package com.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testBubbleSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = {1, 2, 5, 5, 6, 9};
        App.bubbleSort(array);
        assertArrayEquals(sortedArray, array);
    }

    @Test
    public void testInsertionSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = {1, 2, 5, 5, 6, 9};
        App.insertionSort(array);
        assertArrayEquals(sortedArray, array);
    }

    @Test
    public void testMergeSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = {1, 2, 5, 5, 6, 9};
        App.mergeSort(array);
        assertArrayEquals(sortedArray, array);
    }

    @Test
    public void testQuickSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = {1, 2, 5, 5, 6, 9};
        App.quickSort(array);
        assertArrayEquals(sortedArray, array);
    }

    @Test
    public void testSelectionSort() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = {1, 2, 5, 5, 6, 9};
        App.selectionSort(array);
        assertArrayEquals(sortedArray, array);
    }
}
