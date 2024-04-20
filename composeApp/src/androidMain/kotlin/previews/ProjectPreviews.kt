package previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ui.AllExpensesHeader
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

