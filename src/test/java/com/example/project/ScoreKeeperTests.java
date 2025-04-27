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
 
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.params.ParameterizedTest;
 import org.junit.jupiter.params.provider.CsvSource;

 class ScoreKeeperTests {
    ScoreKeeper s = new ScoreKeeper();

    @Test
    void teamAseepoints() {
        s.getTeamApoints();
        assertEquals(0, s.getTeamApoints());
    }

    @Test
    void teamBseepoints() {
        s.getTeamBpoints();
        assertEquals(0, s.getTeamBpoints());
    }

    @Test
    void teamAScoresOne(){
        s.scoreTeamA1();
        s.getTeamApoints();
        assertEquals(1, s.getTeamApoints());
    }

    @Test 
    void teamBScoresOne(){
        s.scoreTeamB1();
        s.getTeamBpoints();
        assertEquals(1, s.getTeamBpoints());
    }
    
 }