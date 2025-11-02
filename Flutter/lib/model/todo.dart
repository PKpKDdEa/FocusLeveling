class ToDo {
  String? id;
  String? todoText;
  String? type;
  DateTime dateTime;
  bool isDone;

  ToDo({
    required this.id,
    required this.todoText,
    required this.type,
    required this.dateTime,
    this.isDone = false,
  });

  static List<ToDo> todoList() {
    return [
      ToDo(id: '01', todoText: 'Morning Excercise', type: "personal", dateTime: DateTime.now(), isDone: true ),
      ToDo(id: '02', todoText: 'Buy Groceries', type: "personal", dateTime: DateTime.now(), isDone: true ),
      ToDo(id: '03', todoText: 'Check Emails', type: "personal", dateTime: DateTime.now()),
      ToDo(id: '04', todoText: 'Team Meeting', type: "work", dateTime: DateTime.now()),
      ToDo(id: '05', todoText: 'Work on mobile apps for 2 hour', type: "personal", dateTime: DateTime.now()),
      ToDo(id: '06', todoText: 'Dinner with Jenny', type: "work", dateTime: DateTime.now()),
    ];
  }
}