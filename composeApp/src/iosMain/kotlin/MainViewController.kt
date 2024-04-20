import androidx.compose.ui.window.ComposeUIViewController
import com.expensesApp.db.AppDatabase
import data.DatabaseDriverFactory
import di.appModule
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController { App() }

fun initKoin() {
    startKoin {
        modules(appModule(AppDatabase.invoke(DatabaseDriverFactory().createDriver())))
    }.koin //Agregar inyección en iOS
}