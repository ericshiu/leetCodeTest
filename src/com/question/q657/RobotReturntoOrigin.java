package com.question.q657;

public class RobotReturntoOrigin {
	/**
	 * There is a robot starting at position (0, 0), the originNew, on a 2D plane. Given a sequence
	 * of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
	 * 
	 * The move sequence is represented by a string, and the character moves[i] represents its ith
	 * move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the
	 * originNew after it finishes all of its moves, return true. Otherwise, return false.
	 * 
	 * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move
	 * to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of
	 * the robot's movement is the same for each move.
	 * 
	 */
	// public static boolean judgeCircle(String moves) {
	// String[] moveArr = moves.split("");
	// int[] origin = { 0, 0 };
	// int[] originNew = { 0, 0 };
	// for (String move : moveArr) {
	// if (move.equals("U")) {
	// originNew[0] = originNew[0] + 1;
	// }
	// if (move.equals("D")) {
	// originNew[0] = originNew[0] - 1;
	// }
	// if (move.equals("R")) {
	// originNew[1] = originNew[1] + 1;
	// }
	// if (move.equals("L")) {
	// originNew[1] = originNew[1] - 1;
	// }
	// }
	// return Arrays.equals(originNew, origin);
	// }
	public static boolean judgeCircle(String moves) {
		if (moves.replaceAll("U", "").length() == moves.replaceAll("D", "").length()) {
			if (moves.replaceAll("R", "").length() == moves.replaceAll("L", "").length()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// Input: "UD"
		// Output: true
		System.out.println(RobotReturntoOrigin.judgeCircle("UD"));

	}
}
