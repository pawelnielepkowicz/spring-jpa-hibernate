package pl.pawelnielepkowicz.service;

import java.util.List;

import pl.pawelnielepkowicz.model.Activity;
import pl.pawelnielepkowicz.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}