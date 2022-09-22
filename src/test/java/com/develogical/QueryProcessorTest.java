package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

     @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("nelzer101"));
    }
    @Test
    public void knows9plus17() throws Exception {
        assertThat(queryProcessor.process("what is 9 + 17"), containsString("26"));
    }
     @Test
    public void knows3plus7() throws Exception {
        assertThat(queryProcessor.process("what is 3 + 7"), containsString("10"));
    }
     @Test
    public void knows14plus5() throws Exception {
        assertThat(queryProcessor.process("what is 14 + 5"), containsString("19"));
    }
     @Test
    public void largestNumber() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 38, 449"), containsString("449"));
    }

}
