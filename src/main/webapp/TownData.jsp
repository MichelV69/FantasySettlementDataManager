<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
  <head>
    <title>Fantasy Settlement Data Manager</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
  </head>
  <body>

  <div class="container">

    <div class="card">
      <div class="card-body">
        <h4 class="card-title">Settlement Info</h4>
        <h5 class="card-subtitle mb-2 text-muted">
          <s:property value="ThisTownData.SettlementName" />
          <s:if test="ThisTownData.NationName != null && ThisTownData.NationName != ''">
            , <s:property value="ThisTownData.NationName" />
          </s:if>
        </h5>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            AveragePopulation
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.AveragePopulation" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            SeasonalEconomicStatus
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.SeasonalEconomicStatusText" />
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            CurrentTaxPercent
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.CurrentTaxPercent" />%
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Population Shifts By Season
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Summer
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.SummerPopulation" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Winter
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.WinterPopulation" /> people
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Economic Input By Social Status
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Aristocratic <br />
            (<s:property value="ThisTownData.AristocraticIncomeGP" /> GP/month)
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.AristocraticPopulation" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Wealthy  <br />
            (<s:property value="ThisTownData.WealthyIncomeGP" /> GP/month)
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.WealthyPopulation" />people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Comfortable <br />
            (<s:property value="ThisTownData.ComfortableIncomeGP" /> GP/month)
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.ComfortablePopulation" />
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Modest <br />
            (<s:property value="ThisTownData.ModestIncomeGP" /> GP/month)
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.ModestPopulation" />
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Poor <br />
            (<s:property value="ThisTownData.PoorIncomeGP" /> GP/month)
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.PoorPopulation" />
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Youth
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.YoungPopulation" />
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Economic Output & Capacity
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Economic Trade Volume
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.MonthlyEconomyGPValue" /> GP/month
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Treasure Purchase Capacity
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.WeeklyTreasureSoakGPValue" /> GP/week
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Taxes Levied<br />(Stronghold & Followers)
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.MonthlyTaxesGainedGP" /> GP/month
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Geography
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Area of Town Proper
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.TownAreaHectares" /> Hectares
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Minimum Area of Supporting Farmland
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.FarmlandHectares" /> Hectares
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Cartography
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Approximate Map Dimensions
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.MapHeightMetres" /> Metres x <br />
            <s:property value="ThisTownData.MapWidthMetres" /> Metres
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Approximate Town Radius
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.TownRadiusMetres" /> Metres
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            "Old Town"
          </div>
          <div class="col-md-2">
            ~<s:property value="ThisTownData.WallOldTownRadiusMetres" /> Metre Radius, <br />
            ~<s:property value="ThisTownData.OldTownBuildingCount" /> buildings
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            "New Town"
          </div>
          <div class="col-md-2">
            ~<s:property value="ThisTownData.WallNewTownRadiusMetres" /> Metre Radius, <br />
            ~<s:property value="ThisTownData.NewTownBuildingCount" /> buildings
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Civil Security & Military
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Volunteer Militia and / or Professional Soldiers
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.TownMilitiaHeadCount" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-3">
            Volunteer Constables and / or Professional Guards
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.TownGuardHeadCount" /> people
          </div>
        </div>
        <!--- --->
      </div>
    </div>

  <s:url action="index" var="indexURL" />
  <s:a href="%{indexURL}" cssClass = "btn btn-secondary" cssRole = "button" > New Settlement </s:a>

  </div>
  <!-- Optional JavaScript -->
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
          integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
          crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
          integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
          crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
          integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
          crossorigin="anonymous"></script>
  </body>
</html>
