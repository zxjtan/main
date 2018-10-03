// package seedu.address.model.calendar;

// import java.util.List;
// import java.util.ArrayList;
// import java.util.TreeMap;
// import java.util.Calendar;

// import seedu.address.model.task.Task;

// class TaskList {
// private TreeMap<Calendar, List<Task>> tasks;

// public TaskList() {
// tasks = new TreeMap<>();
// }

// public void addTask(Task t) {
// Calendar date = buildMapKey(t);

// if (!tasks.containsKey(date)) {
// tasks.put(date, new ArrayList<>());
// }

// tasks.get(date).add(t);
// }

// private Calendar buildMapKey(Task t) {
// Calendar date = (Calendar) t.getStartDateTime().calendar.clone();

// date.set(Calendar.HOUR_OF_DAY, 0);
// date.set(Calendar.MINUTE, 0);
// date.set(Calendar.SECOND, 0);
// date.set(Calendar.MILLISECOND, 0);

// return date;
// }
// }
