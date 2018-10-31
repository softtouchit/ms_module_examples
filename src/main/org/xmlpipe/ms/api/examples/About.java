package org.xmlpipe.ms.api.examples;

import java.util.GregorianCalendar;

public class About {
    public static void main(String[] args) {
        System.out.println("Package: "+Constants.PackageName);
        System.out.printf("Version: %s , Revision: %s , Date: %s\n",Constants.Version, Constants.Revision, Constants.BuildDate);
        System.out.println("Copyright 2010 - "+ GregorianCalendar.getInstance().get(GregorianCalendar.YEAR)+" SoftTouch Information Technology Pty Ltd");
        System.out.println("http://softtouchit.com");
    }
}
