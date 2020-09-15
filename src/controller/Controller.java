package controller;

import model.Match;
import model.daos.MatchesDao;

public class Controller {
	private MatchesDao matchesDao;
	
	public Controller() {
		matchesDao = new MatchesDao();
	}
	
	public void insertMatch(Match match) {
		matchesDao.insert(match);
	}
}
