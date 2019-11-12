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
    TestNationName =  "Progress Confederacy";
    TestSettlementName =  "Breezy Point Bay";
    TestSettlementPopulation = 1200;
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

  @DisplayName("testGetPopulationSummer")
  @Test
  public void testGetPopulationSummer()
  {
    int ShouldBe = 1080;
    assertEquals(ShouldBe, TestSettlement.getSummerPopulation());
  }
} // end class TownDataTest
