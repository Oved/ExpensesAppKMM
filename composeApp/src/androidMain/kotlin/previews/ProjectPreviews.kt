package previews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import data.ExpenseManager
import model.Expense
import model.ExpenseCategory
import ui.AllExpensesHeader
import ui.ExpenseItem
import ui.ExpensesScreen
import ui.ExpensesTotalHeader

@Preview(showBackground = true)
@Composable
fun ExpensesTotalHeaderPreview() {
    ExpensesTotalHeader(23.5)
}

@Preview(showBackground = true)
@Composable
fun AllExpensesHeaderPreview() {
    AllExpensesHeader()
}

@Preview(showBackground = true)
@Composable
fun ExpenseItemPreview() {
    Box(modifier = Modifier.padding(8.dp)) {
        ExpenseItem(expense = ExpenseManager.fakeExpenseList[3]) {}
    }
}

@Preview(showBackground = true)
@Composable
fun ExpensesScreenPreview() {
    ExpensesScreen(){}
}

