Feature: Reset functionality on login page of Application				


Scenario Outline: Verification of reset button with numbers of credential


Given Open the Chrome and launch the application				


When Enter the <username> and <password>				


Then Reset the credential						

Examples:                      		

|username  |password  |		

|User1     |password12 |		

|User2     |password22 |		

|User3     |password32 |



 