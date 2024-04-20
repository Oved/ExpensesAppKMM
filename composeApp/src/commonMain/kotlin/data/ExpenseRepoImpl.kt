package data

import com.expensesApp.db.AppDatabase
import domain.ExpenseRepository
import model.Expense
import model.ExpenseCategory

class ExpenseRepoImpl(
    private val appDatabase: AppDatabase
) : ExpenseRepository {

    private val queries = appDatabase.expensesDbQueries

    override fun getAllExpenses(): List<Expense> {
        return queries.selectAll().executeAsList().map {
            Expense(
                id = it.id,
                amount = it.amount,
                description = it.description,
                category = ExpenseCategory.valueOf(it.categoryName)
            )
        }
    }

    override fun addExpense(expense: Expense) {
        queries.transaction {
            queries.insert(
                amount = expense.amount,
                categoryName = expense.category.name,
                description = expense.description
            )
        }
    }

    override fun editExpense(expense: Expense) {
        queries.transaction {
            queries.update(
                id = expense.id,
                amount = expense.amount,
                categoryName = expense.category.name,
                description = expense.description
            )
        }
    }

    override fun deleteExpense(expense: Expense) {
        queries.delete(expense.id)
    }

    override fun deleteAllExpenses() {
        queries.deleteAll()
    }

    override fun getCategories(): List<ExpenseCategory> {
        return queries.categories().executeAsList().map {
            ExpenseCategory.valueOf(it)
        }
    }

}