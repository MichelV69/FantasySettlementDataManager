<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
  <head>
    <meta charset="UTF-8">
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
    <h1>Welcome To FSDM</h1>

    <div class="container">

      <div class="card">
        <div class="card-body">
          <h4 class="card-title">Core Settlement Data</h4>
          <h5 class="card-subtitle mb-2 text-muted"> Please fill in the form below. </h5>
          <s:form action="RenderTown" class="ThisTownData" theme = "bootstrap">
          <!--- --->
          <div class="row justify-content-center">
            <div class="col-md-3">
              <s:textfield name="NationName" label="Nation Name" />
            </div>
            <div class="col-md-3">
              <s:textfield name="SettlementName" label="Settlement Name" />
            </div>
          </div>
          <!--- --->
          <div class="row justify-content-center">
            <div class="col-md-3">
              <s:textfield name="AveragePopulation" label="Current Average Annual Population" />
            </div>
            <div class="col-md-3">
              <s:textfield name="SeasonalEconomicStatus" label="Economic Status for this Season" />
            </div>
          </div>
          <!--- --->
          <div class="row justify-content-center">
            <div class="col-md-3">
              <s:textfield name="CurrentTaxPercent" label="Current Tax Rate (Percent)" />
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