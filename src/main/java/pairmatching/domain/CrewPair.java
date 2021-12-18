package pairmatching.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.util.Pair;

public class CrewPair {
	public Map<Pair<Course, Mission>, List<String>> pairs;

	public CrewPair() {
		pairs = new HashMap<>();
	}

	public boolean isExist(Pair<Course, Mission> info) {
		return pairs.get(info) != null;
	}

	public void addPair(Pair<Course, Mission> info, List<String> crews) {
		pairs.put(info, crews);
	}

	public List<String> getPair(Pair<Course, Mission> info) {
		return pairs.get(info);
	}
}