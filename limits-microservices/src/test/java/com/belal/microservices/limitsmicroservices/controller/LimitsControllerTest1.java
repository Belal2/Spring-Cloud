package com.belal.microservices.limitsmicroservices.controller;

import com.belal.microservices.limitsmicroservices.bean.Limits;
import com.belal.microservices.limitsmicroservices.configuration.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class LimitsControllerTest1 {
    @Mock
    Configuration configuration;
    @InjectMocks
    LimitsController limitsController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRetrieveLimits() {
        when(configuration.getMinimum()).thenReturn(0);
        when(configuration.getMaximum()).thenReturn(0);

        Limits result = limitsController.retrieveLimits();
        Assertions.assertEquals(new Limits(0, 0), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme