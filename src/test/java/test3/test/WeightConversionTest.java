package test3.test;

import static org.junit.Assert.*;
import org.junit.Test;
import test3.logic.WeightConversion;

public class WeightConversionTest {

  @Test
  public void TestPoundsToKilosWith10() {
    WeightConversion wc = new WeightConversion();
    assertEquals(4.54, wc.PoundsToKilos(10), 0.01);
  }
  
  @Test
  public void TestKilosToPoundsWith10() {
    WeightConversion wc = new WeightConversion();
    assertEquals(22.026, wc.KilosToPounds(10), 0.01);
  }

}
