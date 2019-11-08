package com.pe902_gaming.FantasySettlementDataManager.model;

public class SettlementDataStore
{
  private int AveragePopulation;
  private double final WealthyPopPercent = 0.02;

  private String NationName;
  private String SettlementName;

  private SettlementDataStore(SettlementDataStoreBuilder builder)
  {
    AveragePopulation = builder.AveragePopulation;
    SettlementName = builder.SettlementName;
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

} // end class SettlementDataStore