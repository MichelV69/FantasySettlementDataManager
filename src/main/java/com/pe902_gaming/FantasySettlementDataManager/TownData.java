package com.pe902_gaming.FantasySettlementDataManager;

import java.util.ArrayList;

public class TownData
{
  final private double PopSummerPercent = 0.90;
  final private double PopWinterPercent = 1.10;

  private ArrayList<String[]> PopEconomicClassPercent = new ArrayList<>();

  private String NationName;
  private String SettlementName;
  private int AveragePopulation;
  private int SeasonalEconomicStatus;

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
  } // constructor TownData

  public static class BDPO
  {
    // BDPO => Builder Design Pattern Object
    // required params
    private int AveragePopulation;
    private String SettlementName;

    // optional params
    private int SeasonalEconomicStatus;
    private String NationName;

    public BDPO(int ParamAveragePopulation, String ParamSettlementName)
    {
      AveragePopulation = ParamAveragePopulation;
      SettlementName = ParamSettlementName;
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
  }

  public int getSeasonalEconomicStatus()
  {
    return SeasonalEconomicStatus;
  }

} // end class TownData