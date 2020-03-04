public class GravitySolver {
 	public static double gravityCalculate(double force, double massOne, double massTwo, double distance) {
		// your code goes here
		final double GRAVITY_CONSTANT = 0.0000000000667;

		// solving for force
		if (force == 0) {
			force = GRAVITY_CONSTANT * (massOne * massTwo) / Math.pow(distance, 2);
			return force;
      
    // solving for massOne
		} else if (massOne == 0) {
			massOne = (force * Math.pow(distance, 2)) / (GRAVITY_CONSTANT * massTwo);
			return massOne;
      
    // solving for massTwo
		} else if (massTwo == 0) {
			massTwo = (force * Math.pow(distance, 2)) / (GRAVITY_CONSTANT * massOne);
			return massTwo;
      
    // solving for distance
		} else if (distance == 0) {
			distance = Math.sqrt(((GRAVITY_CONSTANT * massOne * massTwo) / force));
			return distance;
		}
    
		return 1;
	}
}