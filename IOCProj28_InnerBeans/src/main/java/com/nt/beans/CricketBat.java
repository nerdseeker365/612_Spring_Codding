package com.nt.beans;

import java.util.Random;


import lombok.ToString;

@ToString
public class CricketBat {
public int ScoreRuns() {
	return new Random().nextInt(10);
}
}
