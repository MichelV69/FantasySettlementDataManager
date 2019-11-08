import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.pe902_gaming.FantasySettlementDataManager.TownData;

/**
 * Unit test for TownDataTest.
 */
public class TownDataTest
{
  final private String TestSettlementName =  "Testville";
  final private int TestSettlementPopulation =  1000;
  private TownData TestSettlement = new TownData.BDPO(TestSettlementPopulation, TestSettlementName).build();

  TownDataTest() {;}

  @Test
  @DisplayName("setTestSettlementName")
  void setTestSettlementName()
  {
    assertEquals(TestSettlementName, TestSettlement.getNationName());
  }

  @Test
  @DisplayName("testPopulationPoor")
  void testPopulationPoor()
  {
    int ShouldBe = 0;
    assertEquals(ShouldBe, TestSettlement.getSummerPopulation());
  }
} // end class TownDataTest
