package di

import com.expensesApp.db.AppDatabase
import data.ExpenseRepoImpl
import domain.ExpenseRepository
import org.koin.dsl.module
import presentation.ExpensesViewModel

fun appModule(appDatabase: AppDatabase) = module {
    single<ExpenseRepository> { ExpenseRepoImpl(appDatabase) }
    factory { ExpensesViewModel(get()) }
}