package org.xmlpipe.ms.api.examples;

import java.util.GregorianCalendar;

/**
 * Define constants commonly used
 */
public interface Constants {
    String PackageName = "XPE MS examples";
    String Version = "1.0.0.@buildNumber@";
    String BuildDate = "@buildDate@";
    String Revision = "@revision@";
    String YEAR = Integer.toString(GregorianCalendar.getInstance().get(GregorianCalendar.YEAR));

}
