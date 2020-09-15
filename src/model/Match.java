package model;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Match {
	private String playerDeck; // e.g. "Grixis Shadow", "Neoform"
	
	private String opponentName; // helps for scouting
	private String opponentDeck;
	
	private String g1Result; // all games are "W", "L", or null
	private String g2Result;
	private String g3Result;
	
	private int cardsSideboarded;
	
	private EventType eventType; // league, prelim, challenge, ptq
	
	private Date date;
	
	private String notes; // misc data
}
