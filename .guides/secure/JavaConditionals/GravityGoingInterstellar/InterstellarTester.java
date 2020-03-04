import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.concurrent.ThreadLocalRandom;

public class InterstellarTester {
  
  final private static double GRAVITY_CONSTANT = 0.0000000000667;
  final private static double EQUALITY_THRESHOLD = 0.00000000001;
  final private static int RAND_MAX = 10000;
  final private static int RAND_MIN = 10;
  
  //   these methods help us find the right answer
  private static double calculateForce(double massOne, double massTwo, double distance) {
      return GRAVITY_CONSTANT * (massOne * massTwo) / Math.pow(distance, 2);
  }
  
  private static double calculateMass(double force, double mass, double distance) {
    return (force * Math.pow(distance, 2) / (GRAVITY_CONSTANT * mass));
  }
  
  private static double calculateDistance(double massOne, double massTwo, double force) {
    return Math.sqrt(((GRAVITY_CONSTANT * massOne * massTwo) / force));
  }
  
  // checks to see if floats are equal to each other within 1%
  private static boolean answersAreEqual(double num1, double num2) {
    double percentDiff = Math.abs(num1 - num2) / num2;
    
    return (percentDiff < 0.01);
  }
    /**
   * JUnit Test Methods Below
   * */
  @Test
  public void checkForce() {
    double massOne = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);
    double massTwo = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);
    double distance = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);

    double student_answer = GravitySolver.gravityCalculate(0, massOne, massTwo, distance);
    double correct_answer = calculateForce(massOne, massTwo, distance);
        
    assertTrue(answersAreEqual(student_answer, correct_answer));
  }
  

  
  @Test
  public void checkMassOne() {
    double force = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);
    double massTwo = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);
    double distance = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);

    double student_answer = GravitySolver.gravityCalculate(force, 0, massTwo, distance);
    double correct_answer = calculateMass(force, massTwo, distance);
    
    assertTrue(answersAreEqual(student_answer, correct_answer));
  }
  
  @Test
  public void checkMassTwo() {
    double force = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);
    double massOne = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);
    double distance = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);

    double student_answer = GravitySolver.gravityCalculate(force, massOne, 0, distance);
    double correct_answer = calculateMass(force, massOne, distance);
    
    assertTrue(answersAreEqual(student_answer, correct_answer));
  }
  
  @Test
  public void checkDistance() {
    double force = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);
    double massTwo = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);
    double massOne = ThreadLocalRandom.current().nextDouble(RAND_MIN, RAND_MAX);

    double student_answer = GravitySolver.gravityCalculate(force, massOne, massTwo, 0);
    double correct_answer = calculateDistance(massOne, massTwo, force);
    
    assertTrue(answersAreEqual(student_answer, correct_answer));
  }
} 