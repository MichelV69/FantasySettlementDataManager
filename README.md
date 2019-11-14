# Fantasy Settlement Data Manager

***For Fantasy Worlds Settings such as Dungeons & Dragons 5th Edition***

## Current Version
1.0.0

## Purpose
Most Games Masters or Authors are aware that they need to include some basic
economic data about cities in thier campaign worlds.  On the other hand, most
systems are so overwhelmingly detailed as to be irrelevant.

Based on [this Reddit post](... needs a link ... ) I created a spreadsheet in 
LibreOffice that would handle most of it for me.  Over time, this spreadsheet
grew to handle other issues that were useful to me as a world builder.

That complexity meant that the spreadsheet was becoming a monster and hard to
share or upkeep.  So, I decided to put together a simple JAVA/Tomcat 
application that would quickly handle this job.

## Sample Output

| Economic Output & Capacity            |                  |
| ------------------------------------- | ---------------- |
| Economic Trade Volume                 | 160,051 GP/month |
| Treasure Purchase Capacity            |   4,001 GP/week  |
| Taxes Levied (Stronghold & Followers) | 18,006 GP/month  |

## How To Use
* Download WAR file, or source and compile your own
* Copy to the `WEBAPPS` folder of your Tomcat server.
* Restart the Tomcat process as required
* Point your favorite web browser to the running Tomcat server.  
For example http://localhost:8080/FantasySettlementDataManager/
* Enter the data corresponding to current setting circumstances:
  * The minimum required information is:
    * ***Settlement Name*** (cannot be blank)
    * ***Current Average Annual Population*** (must be 100+ people to be considered 
    an individual settlement)
  * ***Economic Status*** defaults to "0".  Values accepted are -2 to +2, where 
  negative is bad and positive is good.
  * ***Current Tax Rate*** defaults to "10.0" and must be greater than 1.  This 
  generates the revenue for "Strongholds & Followers"-style military 
  resources.
* Click `[Submit]` to render the economic data for the settlement.
 * Review results.  Discard anything you don't think fits your setting / needs.
* Click `[New Settlement]` if you'd like to start over.

