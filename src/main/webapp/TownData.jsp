<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
  <head>
    <title> <s:text name="app.title.long" /> (<s:property value="ThisTownData.SettlementName" />)</title>
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
          <div class="col-md-4">
            <div class="text-right"><s:text name="AveragePopulation.label" /></div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.AveragePopulation})" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right"><s:text name="SeasonalEconomicStatus.label" /></div>
          </div>
          <div class="col-md-2">
            <s:property value="ThisTownData.SeasonalEconomicStatusText" />
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right"><s:text name="CurrentTaxPercent.label" /></div>
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
          <div class="col-md-4">
            <div class="text-right">Summer</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.SummerPopulation})" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Winter</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.WinterPopulation})" /> people
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Economic Input By Social Status
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <p class="text-right"> Aristocratic <br />
            (<s:property value="getText('{0,number,#,##0}',{ThisTownData.AristocraticIncomeGP})" /> GP/month)</p>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.AristocraticPopulation})" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <p class="text-right"> Wealthy  <br />
              (<s:property value="getText('{0,number,#,##0}',{ThisTownData.WealthyIncomeGP})" /> GP/month)</p>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.WealthyPopulation})" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <p class="text-right"> Comfortable <br />
              (<s:property value="getText('{0,number,#,##0}',{ThisTownData.ComfortableIncomeGP})" /> GP/month)</p>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.ComfortablePopulation})" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <p class="text-right"> Modest <br />
              (<s:property value="getText('{0,number,#,##0}',{ThisTownData.ModestIncomeGP})" /> GP/month)</p>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.ModestPopulation})" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <p class="text-right"> Poor <br />
              (<s:property value="getText('{0,number,#,##0}',{ThisTownData.PoorIncomeGP})" /> GP/month) </p>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.PoorPopulation})" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <p class="text-right">Youth </p>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.YoungPopulation})" /> people
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Economic Output & Capacity
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Economic Trade Volume</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.MonthlyEconomyGPValue})" /> GP/month
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Treasure Purchase Capacity</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.WeeklyTreasureSoakGPValue})" /> GP/week
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Taxes Levied<br />(Stronghold & Followers) </div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.MonthlyTaxesGainedGP})" /> GP/month
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Geography
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Area of Town Proper</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.TownAreaHectares})" /> Hectares
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Minimum Area of Supporting Farmland</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.FarmlandHectares})" /> Hectares
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Cartography
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Approximate Town Radius</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.TownRadiusMetres})" /> Metres
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">"Old Town"</div>
          </div>
          <div class="col-md-2">
            ~<s:property value="getText('{0,number,#,##0}',{ThisTownData.WallOldTownRadiusMetres})" /> Metre Radius, <br />
            ~<s:property value="getText('{0,number,#,##0}',{ThisTownData.OldTownBuildingCount})" /> buildings
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">"New Town"</div>
          </div>
          <div class="col-md-2">
            ~<s:property value="getText('{0,number,#,##0}',{ThisTownData.WallNewTownRadiusMetres})" /> Metre Radius, <br />
            ~<s:property value="getText('{0,number,#,##0}',{ThisTownData.NewTownBuildingCount})" /> buildings
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Approximate Map Dimensions</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.MapHeightMetres})" /> Metres x <br />
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.MapWidthMetres})" /> Metres
          </div>
        </div>
        <!--- --->
        <hr />
        <h6 class="card-subtitle mb-2 text-muted">
          Civil Security & Military
        </h6>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Volunteer Militia and / or <br /> Professional Soldiers</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.TownMilitiaHeadCount})" /> people
          </div>
        </div>
        <!--- --->
        <div class="row justify-content-center">
          <div class="col-md-4">
            <div class="text-right">Volunteer Constables and / or <br /> Professional Guards</div>
          </div>
          <div class="col-md-2">
            <s:property value="getText('{0,number,#,##0}',{ThisTownData.TownGuardHeadCount})" /> people
          </div>
        </div>
        <!--- --->
      </div>
    </div>

  <s:url action="index" var="indexURL" />
  <s:a href="%{indexURL}" cssClass = "btn btn-secondary float-right" cssRole = "button" > New Settlement </s:a>

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
