package com.nt.beans;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ProffessionalCricketer {
 private CricketBat bat=null;
 public String batting() {
	 //use Bat
	 int runs=bat.ScoreRuns();
	 return "BatsMan Score::"+runs;
 }
}
