package com.develogical;

public class QueryProcessor {

    public String addSum(input) {
        String[] parts = input.split(" plus ");
        int sum = 0;
        for (int i = 0; i < parts.length; i++) {
            sum += Integer.parseInt(parts[i]);
        }
        return String.valueOf(sum);

    }
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist. ";
        }
        if (query.toLowerCase().contains("plus")) {
            return addSum(query.substring(8, query.length));
            //what is _ + _?
            //012345678
        }
        return "";
    }
}
