package com.fizzbuzz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SomethingShould{

    @Test
    public void returnTrueIfNumberIs9andMultipleIs3() {
    	assertTrue(isMultipleOf(3, 9));
    }
    
    private boolean isMultipleOf(int multiple, int number) {
    	return (number % multiple) == 0;
    }
    
}
