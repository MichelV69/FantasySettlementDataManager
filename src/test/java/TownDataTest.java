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
  public void testBuilderNationName() { assertEquals(TestNationName, TestSettlement.getNationName()); }

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

  @Test
  public void testGetPopulationWinter()
  {
    int ShouldBe = 1320;
    assertEquals(ShouldBe, TestSettlement.getWinterPopulation());
  }

  @Test
  public void testGetPopulationPoor()
  {
    int ShouldBe = 624;
    assertEquals(ShouldBe, TestSettlement.getPoorPopulation());
  }

  @Test
  public void testGetPopulationModest()
  {
    int ShouldBe = 360;
    assertEquals(ShouldBe, TestSettlement.getModestPopulation());
  }

  @Test
  public void testGetPopulationComfortable()
  {
    int ShouldBe = 36;
    assertEquals(ShouldBe, TestSettlement.getComfortablePopulation());
  }

  @Test
  public void testGetPopulationWealthy()
  {
    int ShouldBe = 12;
    assertEquals(ShouldBe, TestSettlement.getWealthyPopulation());
  }

  @Test
  public void testGetPopulationAristocratic()
  {
    int ShouldBe = 6;
    assertEquals(ShouldBe, TestSettlement.getAristocraticPopulation());
  }

  @Test
  public void testGetPopulationYoung()
  {
    int ShouldBe = 150;
    assertEquals(ShouldBe, TestSettlement.getYoungPopulation());
  }

  @Test
  public void testGetIncomePoor()
  {
    int ShouldBe = 3744;
    assertEquals(ShouldBe, TestSettlement.getPoorIncomeGP());
  }

  @Test
  public void testGetIncomeModest()
  {
    int ShouldBe = 10800;
    assertEquals(ShouldBe, TestSettlement.getModestIncomeGP());
  }

  @Test
  public void testGetIncomeComfortable()
  {
    int ShouldBe = 2160;
    assertEquals(ShouldBe, TestSettlement.getComfortableIncomeGP());
  }

  @Test
  public void testGetIncomeWealthy()
  {
    int ShouldBe = 1440;
    assertEquals(ShouldBe, TestSettlement.getWealthyIncomeGP());
  }

  @Test
  public void testGetIncomeAristocratic()
  {
    int ShouldBe = 1800;
    assertEquals(ShouldBe, TestSettlement.getAristocraticIncomeGP());
  }
} // end class TownDataTest
