package com.pe902_gaming.FantasySettlementDataManager.action;
import com.pe902_gaming.FantasySettlementDataManager.model.TownData;
import com.opensymphony.xwork2.ActionSupport;

public class ActionsController extends ActionSupport
{
  private TownData ThisTownData;

  public String execute()
  {
    int DefaultSettlementPopulation = 1200;
    String DefaultSettlementName =  "Breezy Point Bay";
    String DefaultNationName =  "Progress Confederacy";
    ThisTownData = new TownData.BDPO(DefaultSettlementPopulation, DefaultSettlementName).setNationName(DefaultNationName).build();
    return SUCCESS;
  }

  public TownData getThisTownData()
  {
    return ThisTownData;
  }

} // end class ActionsController
