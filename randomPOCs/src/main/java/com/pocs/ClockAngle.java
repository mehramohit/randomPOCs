package com.pocs;

public class ClockAngle {

	public static final double ONE_MINUTE_HAND_ANGLE = 6;
	public static final double ONE_HOUR_HAND_ANGLE_PER_MINUTE = 0.5;
	
	public static void calcAngleDifference(int hour, int min) {
		double hourHandAngle = hour * 60 * ONE_HOUR_HAND_ANGLE_PER_MINUTE;
		double minuteHandAngle = min * ONE_MINUTE_HAND_ANGLE;
		
		System.out.println("Hour hand angle: "+hourHandAngle + " " + "Minute Hand Angle: "+minuteHandAngle);
		System.out.println("Difference: " + Math.abs(hourHandAngle-minuteHandAngle));
	}
	
	public static void main(String[] args) {
		calcAngleDifference(1, 3);
	}
}
