package com.pe902_gaming.FantasySettlementDataManager.model;

import java.util.ArrayList;

public class TownData
{
  final private double PopSummerPercent = 0.90;
  final private double PopWinterPercent = 1.10;
  final private double HAFarmLandPerPerson = 0.35;
  final private double HATownLandPerBuilding = 0.107136;
  final private double PeoplePerBuildingAverage = 5.0;

  private ArrayList<String[]> PopEconomicClassPercent = new ArrayList<>();

  private String NationName;
  private String SettlementName;
  private int AveragePopulation;
  private int SeasonalEconomicStatus;
  private double CurrentTaxPercent;

  private TownData(BDPO builder)
  {
    PopEconomicClassPercent.add( new String[]{ "Poor" , "0.52" } );
    PopEconomicClassPercent.add( new String[]{ "Modest", "0.30" } );
    PopEconomicClassPercent.add( new String[]{ "Young", "0.125" } );
    PopEconomicClassPercent.add( new String[]{ "Comfortable", "0.03" } );
    PopEconomicClassPercent.add( new String[]{ "Wealthy", "0.01" } );
    PopEconomicClassPercent.add( new String[]{ "Aristocratic", "0.005" } );

    AveragePopulation = builder.AveragePopulation;
    SettlementName = builder.SettlementName;
    NationName = builder.NationName;
    SeasonalEconomicStatus = builder.SeasonalEconomicStatus;
    CurrentTaxPercent = builder.CurrentTaxPercent;
  } // constructor TownData

  public static class BDPO
  {
    // BDPO => Builder Design Pattern Object
    // required params
    private String SettlementName;
    private int AveragePopulation;

    // optional params
    private String NationName;
    private int SeasonalEconomicStatus;
    private double CurrentTaxPercent;

    public BDPO(int ParamAveragePopulation, String ParamSettlementName)
    {
      AveragePopulation = ParamAveragePopulation;
      SettlementName = ParamSettlementName;
      CurrentTaxPercent = 10.0;
    } // builder pattern class constructor

    public BDPO setSeasonalEconomicStatus(int paramSeasonalEconomicStatus)
    {
      SeasonalEconomicStatus = paramSeasonalEconomicStatus;
      return this;
    }

    public BDPO setNationName(String paramNationName)
    {
      NationName = paramNationName;
      return this;
    }

    public BDPO setCurrentTaxPercent(int paramCurrentTaxPercent)
    {
      CurrentTaxPercent = paramCurrentTaxPercent;
      return this;
    }

    public TownData build()
    {
      return new TownData(this);
    }

  } // builder pattern class

  public int getAveragePopulation() { return AveragePopulation; }
  public void setAveragePopulation( int averagePopulation ) { AveragePopulation = averagePopulation; }
  public int getSummerPopulation() { return (int)(Math.round ( AveragePopulation * PopSummerPercent )); }
  public int getWinterPopulation() { return (int)(Math.round ( AveragePopulation * PopWinterPercent )); }

  private double getPopEconomicClassPercent( String ClassDescription )
  {
    double ClassPopPercent = 0.00;
    for ( String[] DataStringArray : PopEconomicClassPercent )
    {
      // TODO - REMOVE : System.out.println(">> Debug: DataStringArray ["+DataStringArray[0]+"]");
      if (DataStringArray[0].toLowerCase().equals(ClassDescription.toLowerCase()))
        ClassPopPercent = Double.parseDouble(DataStringArray[1]);
    }
    return ClassPopPercent;
  } // end getPopEconomicClassPercent

  public String getNationName() { return NationName; }
  public void setNationName( String nationName ) { NationName = nationName; }

  public String getSettlementName() { return SettlementName; }
  public void setSettlementName( String settlementName) { SettlementName = settlementName; }

  public int getPoorPopulation()
  {
    return (int)(Math.round ( AveragePopulation * getPopEconomicClassPercent("poor")));
  }

  public int getModestPopulation()
  {
    return (int)(Math.round ( AveragePopulation * getPopEconomicClassPercent("Modest")));
  }

  public int getComfortablePopulation()
  {
    return (int)(Math.round ( AveragePopulation * getPopEconomicClassPercent("Comfortable")));
  }

  public int getWealthyPopulation()
  {
    return (int)(Math.round ( AveragePopulation * getPopEconomicClassPercent("Wealthy")));
  }

  public int getAristocraticPopulation()
  {
    return (int)(Math.round ( AveragePopulation * getPopEconomicClassPercent("Aristocratic")));
  }

  public int getYoungPopulation()
  {
    return (int)(Math.round ( AveragePopulation * getPopEconomicClassPercent("Young")));
  }

  public int getPoorIncomeGP()
  {
    final int PoorIncomeFactorGP = 6;
    return getPoorPopulation() * PoorIncomeFactorGP;
  }

  public int getModestIncomeGP()
  {
    final int ModestIncomeFactorGP = 30;
    return getModestPopulation() * ModestIncomeFactorGP;
  }

  public int getComfortableIncomeGP()
  {
    final int ComfortableIncomeFactorGP = 60;
    return getComfortablePopulation() * ComfortableIncomeFactorGP;
  }

  public int getWealthyIncomeGP()
  {
    final int WealthyIncomeFactorGP = 120;
    return getWealthyPopulation() * WealthyIncomeFactorGP;
  }

  public int getAristocraticIncomeGP()
  {
    final int AristocraticIncomeFactorGP = 300;
    return getAristocraticPopulation() * AristocraticIncomeFactorGP;
  }

  public void setSeasonalEconomicStatus(int incomingSeasonalEconomicStatusValue)
  {
    SeasonalEconomicStatus = incomingSeasonalEconomicStatusValue;
    if ( SeasonalEconomicStatus < -2 )
      SeasonalEconomicStatus = -2;
    if ( SeasonalEconomicStatus > 2 )
      SeasonalEconomicStatus = 2;
  }

  public int getSeasonalEconomicStatus()
  {
    return SeasonalEconomicStatus;
  }

  public String getSeasonalEconomicStatusText()
  {
    String StatusText = "";
    switch (SeasonalEconomicStatus)
    {
      case -2:
        StatusText = "Bust";
        break;
      case -1:
        StatusText = "Slow";
        break;
      case 0:
        StatusText = "Average";
        break;
      case 1:
        StatusText = "Busy";
        break;
      case 2:
        StatusText = "Booming";
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + SeasonalEconomicStatus);
    } // end switch

    return StatusText;
  }

  private int getRawEconomicOutput()
  {
    return getPoorIncomeGP() + getModestIncomeGP() + getComfortableIncomeGP()
        + getWealthyIncomeGP() + getAristocraticIncomeGP();
  }

  public int getSeasonalEconomicStatusEffectGP()
  {
    final double EconomicImpactFactor = 0.07;
    return (int)(Math.round (SeasonalEconomicStatus * EconomicImpactFactor * getRawEconomicOutput()));
  }

  public int getMonthlyEconomyGPValue() { return getRawEconomicOutput() + getSeasonalEconomicStatusEffectGP(); }

  public int getWeeklyTreasureSoakGPValue()
  {
    final double TreasureInfluxSoakFactor = 40.0;
    return (int)(Math.round ( getMonthlyEconomyGPValue() / TreasureInfluxSoakFactor ));
  }

  public void setCurrentTaxPercent(double newTaxPercent) { CurrentTaxPercent = newTaxPercent; }

  public double getCurrentTaxPercent() { return CurrentTaxPercent; }

  public int getMonthlyTaxesGainedGP()
  {
    return (int)(Math.round (  CurrentTaxPercent / 100.0 * getMonthlyEconomyGPValue() ));
  }

  public int getFarmlandHectares() { return (int)(Math.round (  AveragePopulation * HAFarmLandPerPerson)); }

  public int getTownAreaHectares()
  {
    return (int)(Math.round ((getOldTownBuildingCount() + getNewTownBuildingCount()) * HATownLandPerBuilding ));
  }

  public int getOldTownBuildingCount()
  {
    int OldTownAdultPop = getComfortablePopulation()+getWealthyPopulation()+getAristocraticPopulation();
    OldTownAdultPop +=  (int)(Math.round (0.6 * getModestPopulation()));

    int OldTownYouthCount = (int)(Math.round (OldTownAdultPop/AveragePopulation * getYoungPopulation() ));

    int OldTownBuildingCount = (int)(Math.round (OldTownAdultPop + OldTownYouthCount) / PeoplePerBuildingAverage );

    return OldTownBuildingCount;
  }

  public int getNewTownBuildingCount()
  {
    return (int)(Math.round ((AveragePopulation / PeoplePerBuildingAverage) - getOldTownBuildingCount()));
  }

  public int getTownRadiusMetres()
  {
    final int SqMperHA = 10000;
    return (int)(Math.round (Math.sqrt (getTownAreaHectares() * SqMperHA / Math.PI)));
  }

  public int getMapHeightMetres()
  {
    final double RadiusToDiameter = 2.0;
    final double MarginPadding = 1.2;
    return (int)(Math.round (getTownRadiusMetres() * RadiusToDiameter * MarginPadding));
  }

  public int getMapWidthMetres()
  {
    final double PageFormat = 11.0/8.5;
    return (int)(Math.round (getMapHeightMetres() * PageFormat));
  }

  public int getWallOldTownRadiusMetres()
  {
    final double OldTownWallRadiusFactor = 0.4;
    return (int)(Math.round (getTownRadiusMetres() * OldTownWallRadiusFactor));
  }

  public int getWallNewTownRadiusMetres()
  {
    final double NewTownWallRadiusFactor = 2.0;
    return (int)(Math.round (getWallOldTownRadiusMetres() * NewTownWallRadiusFactor));
  }

  public int getTownGuardHeadCount()
  {
    final double TownGuardPopFactor = 0.02;
    return (int)(Math.round (AveragePopulation * TownGuardPopFactor));
  }

  public int getTownMilitiaHeadCount()
  {
    final double TownMilitiaPopFactor = 0.01;
    return (int)(Math.round (AveragePopulation * TownMilitiaPopFactor));
  }

} // end class TownData