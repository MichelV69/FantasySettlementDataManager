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
  private String TestNationName;
  private TownData TestSettlement;

  TownDataTest()
  {
    TestNationName =  "TestNation";
    TestSettlementName =  "Testville";
    TestSettlementPopulation = 1000;
    TestSettlement = new TownData.BDPO(TestSettlementPopulation, TestSettlementName).setNationName(TestNationName).build();
  }

  @DisplayName("testBuilderNationName")
  @Test
  public void testBuilderNationName()
  {
    assertEquals(TestNationName, TestSettlement.getNationName());
  }

  @DisplayName("testBuilderSettlementName")
  @Test
  public void testBuilderSettlementName() { assertEquals(TestSettlementName, TestSettlement.getSettlementName()); }

  @DisplayName("testGetPopulationPoor")
  @Test
  public void testGetPopulationPoor()
  {
    int ShouldBe = 0;
    assertEquals(ShouldBe, TestSettlement.getSummerPopulation());
  }
} // end class TownDataTest
