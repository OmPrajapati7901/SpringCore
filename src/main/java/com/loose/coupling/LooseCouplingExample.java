package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {

        UserDataProvider dataProvider = new UserDatabaseProvider();
        UserManager userManagerwithDB = new UserManager(dataProvider);
        System.out.println(userManagerwithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());


    }
}
