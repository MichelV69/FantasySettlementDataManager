import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.pe902_gaming.FantasySettlementDataManager.TownData;

/**
 * Unit test for TownDataTest.
 */
public class TownDataTest
{
  private int TestSettlementPopulation;
  private String TestSettlementName;
  private TownData TestSettlement;

  TownDataTest()
  {
    TestSettlementName =  "Testville";
    TestSettlementPopulation = 1000;
    TestSettlement = new TownData.BDPO(TestSettlementPopulation, TestSettlementName).build();
  }

  @DisplayName("setTestSettlementName")
  @Test
  public void setTestSettlementName()
  {
    assertEquals(TestSettlementName, TestSettlement.getNationName());
  }

  @DisplayName("testPopulationPoor")
  @Test
  public void testPopulationPoor()
  {
    int ShouldBe = 0;
    assertEquals(ShouldBe, TestSettlement.getSummerPopulation());
  }
} // end class TownDataTest
