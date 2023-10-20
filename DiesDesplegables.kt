package cat.institutmontilivi.excalculadora.Composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun DiesDesplegablesPreview()
{
    val dies = listOf("DG", "DL", "DM", "DC", "DJ", "DV", "DS")
    DiesDesplegables(dies)
}

@Composable
fun DiesDesplegables(opcions: List<String>) {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { expanded = true }
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = opcions[selectedOption], fontSize = 40.sp)
        if (expanded) {
            Column(
                modifier = Modifier.weight(1f)
                    .background(Color.LightGray)
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                opcions.forEachIndexed { index, value ->
                    Text(
                        text = value,
                        fontSize = 40.sp,
                        modifier = Modifier.weight(1f)
                            .clickable {
                                selectedOption = index
                                expanded = false
                            }
                    )
                }
            }
        }
    }
}
