package cnu.lecture;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class InGameSummonerQuerierTest {
    private InGameSummonerQuerier querier;
    

    public void setup() {
        final String apiKey = "8242f154-342d-4b86-9642-dfa78cdb9d9c";
        GameParticipantListener dontCareListener = mock(GameParticipantListener.class);

        querier = new InGameSummonerQuerier(apiKey, dontCareListener);
        
        querier = mock(InGameSummonerQuerier.class);
    }

    public void shouldQuerierIdentifyGameKeyWhenSpecificSummonerNameIsGiven() throws Exception {
        final String summonerName;

        GIVEN: {
            summonerName = "akane24";
            when(querier.queryGameKey(summonerName)).thenReturn("4/bl4DC8HBir8w7bGHq6hvuHluBd+3xM");
        }

        final String actualGameKey;
        WHEN: {
            actualGameKey = querier.queryGameKey(summonerName);
            
        }

        final String expectedGameKey = "4/bl4DC8HBir8w7bGHq6hvuHluBd+3xM";
        THEN: {
            assertThat(actualGameKey, is(expectedGameKey));
        }
    }
    public void shouldQuerierReportMoreThan5Summoners() throws Exception {
    	final int summonerNumber;
    }
}
