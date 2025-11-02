import 'package:flutter/material.dart';

import '../model/todo.dart';
import '../constants/colors.dart';

class ToDoItem extends StatelessWidget {
  final ToDo todo;
  final onToDoChanged;
  final onDeleteItem;
  final onEditItem;
  final onViewItem;

  const ToDoItem({
    Key? key,
    required this.todo,
    required this.onToDoChanged,
    required this.onDeleteItem,
    required this.onEditItem,
    required this.onViewItem,
  }) : super(key: key);

  // Function to get icon based on task type
  IconData _getTaskTypeIcon(String? type) {
    switch (type?.toLowerCase()) {
      case 'work':
        return Icons.work;
      case 'personal':
        return Icons.person;
      case 'shopping':
        return Icons.shopping_cart;
      case 'health':
        return Icons.health_and_safety;
      case 'study':
        return Icons.school;
      case 'travel':
        return Icons.flight;
      default:
        return Icons.task_alt;
    }
  }

  Color _getTaskTypeColor(String? type) {
    switch (type?.toLowerCase()) {
      case 'work':
        return Colors.blue;
      case 'personal':
        return Colors.green;
      case 'shopping':
        return Colors.orange;
      case 'health':
        return Colors.red;
      case 'study':
        return Colors.purple;
      case 'travel':
        return Colors.teal;
      default:
        return tdBlue;
    }
  }

  void _showMoreOptions(BuildContext context) {
    showModalBottomSheet(
      context: context,
      shape: RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(20)),
      ),
      builder: (BuildContext context) {
        return Container(
          padding: EdgeInsets.all(20),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              Container(
                width: 40,
                height: 4,
                decoration: BoxDecoration(
                  color: Colors.grey[300],
                  borderRadius: BorderRadius.circular(2),
                ),
              ),
              SizedBox(height: 20),
              ListTile(
                leading: Icon(Icons.visibility, color: tdBlue),
                title: Text('View'),
                onTap: () {
                  Navigator.pop(context);
                  onViewItem(todo.id);
                },
              ),
              ListTile(
                leading: Icon(Icons.edit, color: Colors.orange),
                title: Text('Edit'),
                onTap: () {
                  Navigator.pop(context);
                  onEditItem(todo.id);
                },
              ),
              ListTile(
                leading: Icon(Icons.delete, color: tdRed),
                title: Text('Delete'),
                onTap: () {
                  Navigator.pop(context);
                  onDeleteItem(todo.id);
                },
              ),
            ],
          ),
        );
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: EdgeInsets.only(bottom: 20),
      child: ListTile(
        onTap: () {
          onToDoChanged(todo.id);
        },
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(20),
        ),
        contentPadding: EdgeInsets.symmetric(horizontal: 20, vertical: 10),
        tileColor: Colors.white,
        leading: Container(
          padding: EdgeInsets.all(8),
          decoration: BoxDecoration(
            color: _getTaskTypeColor(todo.type).withOpacity(0.1),
            borderRadius: BorderRadius.circular(10),
          ),
          child: Icon(
            _getTaskTypeIcon(todo.type),
            color: _getTaskTypeColor(todo.type),
            size: 24,
          ),
        ),
        title: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              todo.todoText!,
              style: TextStyle(
                fontSize: 16,
                fontWeight: FontWeight.w600,
                color: tdBlack,
                decoration: todo.isDone ? TextDecoration.lineThrough : null,
              ),
            ),
            SizedBox(height: 4),
            Text(
              "desc",
              //todo.description ?? 'No description available',
              style: TextStyle(
                fontSize: 14,
                color: Colors.grey[600],
                decoration: todo.isDone ? TextDecoration.lineThrough : null,
              ),
              maxLines: 1,
              overflow: TextOverflow.ellipsis,
            ),
          ],
        ),
        trailing: Container(
          padding: EdgeInsets.all(8),
          decoration: BoxDecoration(
            color: Colors.grey[100],
            borderRadius: BorderRadius.circular(8),
          ),
          child: InkWell(
            onTap: () => _showMoreOptions(context),
            child: Icon(
              Icons.more_horiz,
              color: Colors.grey[600],
              size: 20,
            ),
          ),
        ),
      ),
    );
  }
}