# Studing Automation

[![Build Status](https://travis-ci.org/dmbarra/studing_automation.svg?branch=master)](https://travis-ci.org/dmbarra/studing_automation)

**All features and scenarios for test are:**<br> 
_'../resources/\*.features'_

**Automation test:**<br> 
_I wrote automation in JAVA + Selenium + Junit.<br>_
_My choice for use RemoteDrive was to avoid problems with environments. I'm using BrowserStack with my personal account.<br>_
_I use PageFactory to register page components_ <br>
_I use travisCI to run test on every commit_<br>
_Why Daniel don't you implement cucumber or Jbehave? I recommend this tools when features are written by Business People (BA, PO)_ <br>
_Cross browser? My suggestion is to make this easy to overpass, in parallel approach_ <br>
_I didn't write automation for all scenarios, because of the complexity to implement could be so much and the test will be flaky_


**Run automation:**<br> 
_To authenticate on BrowserStack, you need to create two local variables on your system, <USERNAME_BROWSER_STACK> and <KEY_BROWSER_STACK> with your credentials_<br>
_I define test as my default task on gradle, to run user './gradlew'<br>_

