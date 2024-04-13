import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeApp

@Composable
fun App() {

    val colors = getColorsTheme()

    AppTheme {
        PreComposeApp {
            Text("Test")
        }
    }
    
}