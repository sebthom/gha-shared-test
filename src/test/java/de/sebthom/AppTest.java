package de.sebthom;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Sebastian Thomschke
 */
class AppTest {

   @Test
   void test() {
      // Fail on JDK24 which is marked as allow failure in the build.yml
      assertNotEquals(Runtime.version().feature(), 24);
   }
}
