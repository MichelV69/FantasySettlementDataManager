package com.pe902_gaming.FantasySettlementDataManager.Controller;
import com.pe902_gaming.FantasySettlementDataManager.Model.TownData;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ActionsController extends ActionSupport
{
  private TownData ThisTownData = new TownData.BDPO(123, "DemoVille").setNationName("State of Demoish").build();;

  public String execute()
  {
    return SUCCESS;
  }

  public TownData getThisTownData() {return ThisTownData; }

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
    ThisTownData.setCurrentTaxPercent(Integer.parseInt(newCurrentTaxPercent));
  }

} // end class ActionsController
