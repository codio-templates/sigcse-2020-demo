public class GravitySolverTestRun {
  public static void main(String[] args) {
    double force = Double.parseDouble(args[0]);
    double massOne = Double.parseDouble(args[1]);
    double massTwo = Double.parseDouble(args[2]);
    double distance = Double.parseDouble(args[3]);

    double answer = GravitySolver.gravityCalculate(force, massOne, massTwo, distance);
    
    System.out.println(answer);
  }
}