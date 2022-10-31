package com.juaracoding.cucumber.pageobject.drivers.strategies;

//import com.juaracoding.cucumber.pageobject.utils.Constants;


import com.juaracoding.cucumber.pageobject.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();


            case Constants.CHROMEHEADLESS:
                return new ChromeHeadless();

            case Constants.FIREFOX:
                return new Firefox();

            default:
                return null;
        }
    }
}