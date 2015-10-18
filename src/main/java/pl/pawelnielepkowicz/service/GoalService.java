package pl.pawelnielepkowicz.service;

import java.util.List;

import pl.pawelnielepkowicz.model.Goal;
import pl.pawelnielepkowicz.model.GoalReport;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
	
}
