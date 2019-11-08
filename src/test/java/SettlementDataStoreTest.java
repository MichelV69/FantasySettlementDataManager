import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.pe902_gaming.FantasySettlementDataManager.SettlementDataStore;

/**
 * Unit test for SettlementDataStoreTest.
 */
public class SettlementDataStoreTest
{
  final private String TestSettlementName =  "Testville";
  final private int TestSettlementPopulation =  1000;
  private SettlementDataStore TestSettlement = new SettlementDataStore.SettlementDataStoreBuilder(TestSettlementPopulation, TestSettlementName).build();

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
} // end class SettlementDataStoreTest
