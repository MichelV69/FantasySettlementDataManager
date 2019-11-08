package com.pe902_gaming.FantasySettlementDataManager.model;

import java.util.Arrays;
import java.util.ArrayList;

public class SettlementDataStore
{
  final private double PopSummerPercent = 0.09;
  final private double PopWinterPercent = 1.10;

  private ArrayList<String[]> PopEconomicClassPercent;

  private String NationName;
  private String SettlementName;
  private int AveragePopulation;

  private SettlementDataStore(SettlementDataStoreBuilder builder)
  {
    AveragePopulation = builder.AveragePopulation;
    SettlementName = builder.SettlementName;

    PopEconomicClassPercent.add( new String[]{ "Poor" , "0.52" } );
    PopEconomicClassPercent.add( new String[]{ "Modest", "0.30" } );
    PopEconomicClassPercent.add( new String[]{ "Young", "0.125" } );
    PopEconomicClassPercent.add( new String[]{ "Comfortable", "0.03" } );
    PopEconomicClassPercent.add( new String[]{ "Wealthy", "0.01" } );
    PopEconomicClassPercent.add( new String[]{ "Aristocratic", "0.005" } );
  } // constructor SettlementDataStore

  public static class SettlementDataStoreBuilder
  {
    // required params
    private int AveragePopulation;
    private String SettlementName;

    // optional params
    private int something;
    private String something_else;

    public SettlementDataStoreBuilder(int ParamAveragePopulation, String ParamSettlementName)
    {
      AveragePopulation = ParamAveragePopulation;
      SettlementName = ParamSettlementName;
    } // builder pattern class constructor

    public SettlementDataStoreBuilder setSomething(int parmaSomething)
    {
      something = parmaSomething;
      return this;
    }

    public SettlementDataStore build(){
      return new SettlementDataStore(this);
    }

  } // builder pattern class

  public int getAveragePopulation() { return AveragePopulation; }
  public void setAveragePopulation( int averagePopulation ) { AveragePopulation = averagePopulation; }
  public int getSummerPopulation() { return (int)(Math.round ( AveragePopulation * PopSummerPercent )); }
  public int getWinterPopulation() { return (int)(Math.round ( AveragePopulation * PopWinterPercent )); }

  public int getPopEconomicClassPercent( String ClassDescription )
  {
    double ClassPopPercent = 0.00;
    for ( String[] DataStringArray : PopEconomicClassPercent )
    {
      if ( DataStringArray[0].toLowerCase() == ClassDescription.toLowerCase() )
        ClassPopPercent = Double.parseDouble(DataStringArray[1]);
    }
    return (int)(Math.round ( AveragePopulation * ClassPopPercent ));
  } // end getPopEconomicClassPercent

  public String getNationName() { return NationName; }
  public void setNationName( String nationName ) { NationName = nationName; }

  public String getSettlementName() { return SettlementName; }
  public void setSettlementName( String settlementName) { SettlementName = settlementName; }

} // end class SettlementDataStore