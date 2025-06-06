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

public class ScoreKeeper {
    private int teamApoints = 0;
    private int teamBpoints = 0;
    
    public int getTeamApoints() {
        return teamApoints;
    }

    public int getTeamBpoints(){
        return teamBpoints;
    }

    public void scoreTeamA1(){
        teamApoints += 1;
    }

    public void scoreTeamB1(){
        teamBpoints += 1;
    }

    public void scoreTeamA2(){
        teamApoints += 2;
    }
    
    public void scoreTeamB2(){
        teamBpoints += 2;
    }

}