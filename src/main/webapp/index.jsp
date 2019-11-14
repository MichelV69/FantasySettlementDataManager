<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title> <s:text name="app.title.long" /> </title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
  </head>
  <body>
    <h1>Welcome To <s:text name="app.title.short" /></h1>

    <div class="container">

      <div class="card">
        <div class="card-body">
          <h4 class="card-title"><s:text name="index.card.title" /></h4>
          <h5 class="card-subtitle mb-2 text-muted"> <s:text name="index.card.subtitle" /> </h5>
          <s:form action="RenderTown" class="ThisTownData" theme = "bootstrap">
          <!--- --->
          <div class="row justify-content-center">
            <div class="col-md-3">
              <s:textfield name="NationName" key="NationName.label" />
            </div>
            <div class="col-md-3">
              <s:textfield name="SettlementName" key="SettlementName.label" />
            </div>
          </div>
          <!--- --->
          <div class="row justify-content-center">
            <div class="col-md-3">
              <s:textfield name="AveragePopulation" key="AveragePopulation.label" />
            </div>
            <div class="col-md-3">
              <s:textfield name="SeasonalEconomicStatus" key="SeasonalEconomicStatus.label" />
            </div>
          </div>
          <!--- --->
          <div class="row justify-content-center">
            <div class="col-md-3">
              <s:textfield name="CurrentTaxPercent" key="CurrentTaxPercent.label" />
            </div>
            <div class="col-md-3">
              <s:submit value="Submit" cssClass = "btn btn-primary" cssRole = "button" />
            </div>
          </div>
          <!--- --->
          </s:form>
        </div>
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