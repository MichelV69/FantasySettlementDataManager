package com.pe902_gaming.FantasySettlementDataManager.Controller;
import com.pe902_gaming.FantasySettlementDataManager.Model.TownData;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ActionsController extends ActionSupport
{
  // properties
  private TownData ThisTownData = new TownData.BDPO(99, "DemoVille").setNationName("State of Demoish").build();;

  // overrides
  @Override
  public void validate()
  {
    if (ThisTownData.getSettlementName().length() == 0)
      addFieldError("SettlementName", "Settlement Name cannot be blank.");

    if (ThisTownData.getAveragePopulation() < 100)
    {
      String ErrorMessageText = "Current Average Annual Population must be 100+ people"
      + " to be considered an individual settlement.";
      addFieldError("AveragePopulation", ErrorMessageText);
    }

    if (ThisTownData.getCurrentTaxPercent() < 1.0)
      addFieldError("CurrentTaxPercent", "Current Tax Rate must be at least 1.0.");
  }

  @Override
  public String execute() throws Exception { return ActionSupport.SUCCESS; }

  // expose child object for GETs
  public TownData getThisTownData() {return ThisTownData; }

  // explicit SETs to child object
  public void setNationName(String newNationName) {ThisTownData.setNationName(newNationName);}
  public void setSettlementName(String newSettlementName) {ThisTownData.setSettlementName(newSettlementName);}
  public void setAveragePopulation(String newAveragePopulation)
  {
    ThisTownData.setAveragePopulation(Integer.parseInt(newAveragePopulation));
  }
  public void setSeasonalEconomicStatus(String newSeasonalEconomicStatus)
  {
    ThisTownData.setSeasonalEconomicStatus(Integer.parseInt(newSeasonalEconomicStatus));
  }
  public void setCurrentTaxPercent(String newCurrentTaxPercent)
  {
    ThisTownData.setCurrentTaxPercent(Double.parseDouble(newCurrentTaxPercent));
  }

} // end class ActionsController
