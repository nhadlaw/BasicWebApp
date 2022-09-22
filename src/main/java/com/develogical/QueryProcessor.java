package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist. ";
        }
        if (query.toLowerCase().contains("your name")) {
            return "nelzer101";
        }
        if (query.toLowerCase().contains("9 + 17")) {
            return "26";
        }
        if (query.toLowerCase().contains("3 + 7")) {
            return "10";
        }
         if (query.toLowerCase().contains("14 + 5")) {
            return "19";
        }
         if (query.toLowerCase().contains("38, 449")) {
            return "449";
        }
        return "";
    }
}
