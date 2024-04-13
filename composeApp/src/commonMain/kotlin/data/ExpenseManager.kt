package data

import model.Expense
import model.ExpenseCategory

object ExpenseManager {

    private var currentId = 1L

    val fakeExpenseList = mutableListOf(
        Expense(currentId++, 254.6, ExpenseCategory.HOUSE, "Cleaning"),
        Expense(currentId++, 150.0, ExpenseCategory.CAR, "Maintenance"),
        Expense(currentId++, 35.0, ExpenseCategory.COFFEE, "Went out"),
        Expense(currentId++, 71.0, ExpenseCategory.PARTY, "Birthday"),
        Expense(currentId++, 88.6, ExpenseCategory.OTHER, "Dates and more"),
        Expense(currentId++, 192.0, ExpenseCategory.GROCERIES, "Market"),
        Expense(currentId++, 27.9, ExpenseCategory.SNACKS, "Birthday snacks"),
    )
}