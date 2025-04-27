/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

 package com.example.project;

 import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.params.ParameterizedTest;
 import org.junit.jupiter.params.provider.CsvSource;

 class ScoreKeeperTests {
    ScoreKeeper s = new ScoreKeeper();

    @Test
    void teamAseepoints() {
        assertEquals(0, s.getTeamApoints());
    }

    @Test
    void teamBseepoints() {
        assertEquals(0, s.getTeamBpoints());
    }

    @Test
    void teamAScoresOne(){
        s.scoreTeamA1();
        assertEquals(1, s.getTeamApoints());
    }

    @Test 
    void teamBScoresOne(){
        s.scoreTeamB1();
        assertEquals(1, s.getTeamBpoints());
    }
    

    @Test 
    void teamAScoresTwo(){
        s.scoreTeamA2();
        assertEquals(2, s.getTeamApoints());
    }

    @Test 
    void teamBScoresTwo(){
        s.scoreTeamB2();
        assertEquals(2, s.getTeamBpoints());
    }
 }