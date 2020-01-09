package behavior.Strategy._01;

import java.util.List;

public interface SortStrategy {

	<T> void sort(List<T> items);
}