package com.example.listcompose

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listcompose.ui.theme.ListComposeTheme

@Composable

fun StateCard(name: String,){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
//        Image(
//            painter = painterResource(id = image),
//            contentDescription = null,
//            modifier = Modifier.size(130.dp)
//                .padding(8.dp),
//            contentScale = ContentScale.Fit,
//        )
        Column(Modifier.padding(8.dp)) {
            Text(
                text = name,
                style = MaterialTheme.typography.body2,
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth(),
                color = MaterialTheme.colors.onSurface,

            )
//            Text(
//                text = description,
//                style = MaterialTheme.typography.body2,
//                modifier = Modifier.padding(bottom = 4.dp)
//            )
        }
    }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCardPreview() {
    ListComposeTheme {
        StateCard(states[0].name)
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCard1Preview() {
    ListComposeTheme {
        StateCard(states[1].name)
    }
}
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCard2Preview() {
    ListComposeTheme {
        StateCard(states[2].name)
    }
}
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCard3Preview() {
    ListComposeTheme {
        StateCard(states[3].name)
    }
}
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCard4Preview() {
    ListComposeTheme {
        StateCard(states[4].name)
    }
}
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCard5Preview() {
    ListComposeTheme {
        StateCard(states[5].name)
    }
}
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCard6Preview() {
    ListComposeTheme {
        StateCard(states[6].name)
    }
}
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCard7Preview() {
    ListComposeTheme {
        StateCard(states[7].name)
    }
}
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCard8Preview() {
    ListComposeTheme {
        StateCard(states[8].name)
    }
}
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Composable
fun StateCard9Preview() {
    ListComposeTheme {
        StateCard(states[9].name)
    }
}