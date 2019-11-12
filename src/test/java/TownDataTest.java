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

  @DisplayName("Get/Set Tests for Tombstone Data")
  @Test
  public void testBuilderNationName() { assertEquals(TestNationName, TestSettlement.getNationName()); }

  @Test
  public void testBuilderSettlementName() { assertEquals(TestSettlementName, TestSettlement.getSettlementName()); }

  @DisplayName("Get/Set Tests for Seasonal Population Counts")
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

  @DisplayName("Get Tests for population by social status")
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

  @DisplayName("Get Tests for income by social status")
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

  @DisplayName("Goldilocks Tests for SeasonalEconomicStatus")
  @Test
  public void testSeasonalEconomicStatusSetToLow()
  {
    int ShouldBe = -2;
    TestSettlement.setSeasonalEconomicStatus(-99);
    assertEquals(ShouldBe, TestSettlement.getSeasonalEconomicStatus());
  }

  @Test
  public void testSeasonalEconomicStatusSetToHigh()
  {
    int ShouldBe = 2;
    TestSettlement.setSeasonalEconomicStatus(99);
    assertEquals(ShouldBe, TestSettlement.getSeasonalEconomicStatus());
  }

  @Test
  public void testSeasonalEconomicStatusSetJustRight()
  {
    int ShouldBe = 1;
    TestSettlement.setSeasonalEconomicStatus(ShouldBe);
    assertEquals(ShouldBe, TestSettlement.getSeasonalEconomicStatus());
  }

  @DisplayName("get SeasonalEconomicStatus word")
  @Test
  public void testSeasonalEconomicStatusGetText()
  {
    String ShouldBe = "Bust";
    TestSettlement.setSeasonalEconomicStatus(-2);
    assertEquals(ShouldBe, TestSettlement.getSeasonalEconomicStatusText());

    ShouldBe = "Slow";
    TestSettlement.setSeasonalEconomicStatus(-1);
    assertEquals(ShouldBe, TestSettlement.getSeasonalEconomicStatusText());

    ShouldBe = "Average";
    TestSettlement.setSeasonalEconomicStatus(0);
    assertEquals(ShouldBe, TestSettlement.getSeasonalEconomicStatusText());

    ShouldBe = "Busy";
    TestSettlement.setSeasonalEconomicStatus(1);
    assertEquals(ShouldBe, TestSettlement.getSeasonalEconomicStatusText());

    ShouldBe = "Booming";
    TestSettlement.setSeasonalEconomicStatus(2);
    assertEquals(ShouldBe, TestSettlement.getSeasonalEconomicStatusText());
  }

  @DisplayName("get SeasonalEconomicStatus effect")
  @Test
  public void testSeasonalEconomicStatusGetEffectGP()
  {
    int ShouldBe = -1396;
    TestSettlement.setSeasonalEconomicStatus(-1);
    assertEquals(ShouldBe, TestSettlement.getSeasonalEconomicStatusEffectGP());
  }

  @DisplayName("get MonthlyEconomyGPValue")
  @Test
  public void testMonthlyEconomyGPValue()
  {
    int ShouldBe = 18548;
    TestSettlement.setSeasonalEconomicStatus(-1);
    assertEquals(ShouldBe, TestSettlement.getMonthlyEconomyGPValue());
  }

  @DisplayName("get WeeklyTreasureSoakGPValue")
  @Test
  public void testWeeklyTreasureSoakGPValue()
  {
    int ShouldBe = 464;
    TestSettlement.setSeasonalEconomicStatus(-1);
    assertEquals(ShouldBe, TestSettlement.getWeeklyTreasureSoakGPValue());
  }

  @DisplayName("Taxation Revenue for Strongholds")
  @Test
  public void testDefaultTaxRateSetByBuilder()
  {
    double ShouldBe = 10.0;
    assertEquals(ShouldBe, TestSettlement.getCurrentTaxPercent());
  }

  @Test
  public void testSetNewTaxRate()
  {
    double ShouldBe = 11.5;
    TestSettlement.setCurrentTaxPercent(ShouldBe);
    assertEquals(ShouldBe, TestSettlement.getCurrentTaxPercent());
  }

  @Test
  public void testGetMonthlyTaxesGainedGP()
  {
    int ShouldBe = 2087;
    TestSettlement.setSeasonalEconomicStatus(-1);
    TestSettlement.setCurrentTaxPercent(11.25);
    assertEquals(ShouldBe, TestSettlement.getMonthlyTaxesGainedGP());
  }

  @DisplayName("Land Area Calculations")
  @Test
  public void testGetFarmlandHectares()
  {
    int ShouldBe = 420;
    assertEquals(ShouldBe, TestSettlement.getFarmlandHectares());
  }

  @Test
  public void testGetTownAreaHectares()
  {
    int ShouldBe = 26;
    assertEquals(ShouldBe, TestSettlement.getTownAreaHectares());
  }


} // end class TownDataTest
