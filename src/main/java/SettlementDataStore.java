package com.pe902_gaming.FantasySettlementDataManager.model;

public class SettlementDataStore
{
  private int Population;
  private double final WealthyPopPercent = 0.02;

  private String SettlementName;

  private SettlementDataStore(SettlementDataStoreBuilder builder)
  {
    Population = builder.Population;
    SettlementName = builder.SettlementName;
  } // constructor SettlementDataStore

  public static class SettlementDataStoreBuilder
  {
    // required params
    private int Population;
    private String SettlementName;

    // optional params
    private int something;
    private String something_else;

    public SettlementDataStoreBuilder(int ParamPopulation, String ParamSettlementName)
    {
      Population = ParamPopulation;
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