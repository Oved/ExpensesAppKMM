import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinprojectkmp.composeapp.generated.resources.Res
import kotlinprojectkmp.composeapp.generated.resources.icon_kmp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "Curso de Sociedad Android")
            Spacer(modifier = Modifier.height(12.dp))
            AnimatedVisibility(visible = showContent) {
                Image(
                    painter = painterResource(Res.drawable.icon_kmp),
                    contentDescription = null
                )
            }
            Button(onClick = { showContent = !showContent }) {
                Text(text = "Bienvenido")
            }
        }
    }
}