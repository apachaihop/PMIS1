package by.bsuir.pmis.chernyakova

import android.content.res.Resources
import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.bsuir.pmis.chernyakova.ui.theme.Lab_0Theme
import by.bsuir.pmis.chernyakova.ui.theme.Pink40

class MainActivity : ComponentActivity() {
    companion object {
        val aboutMeStrings = listOf(
            "@string/info"
        )
    }
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab_0Theme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    bottomBar = {
                        BottomAppBar(
                            containerColor = MaterialTheme.colorScheme.background,
                            contentColor = Color.White,
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                text = stringResource(id = R.string.version)
                            )
                        }
                    },
                    topBar = {
                        TopAppBar(
                            colors = topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.background,

                            ),
                            title = {

                                Text("About Ebooks")
                            },
                            navigationIcon = {
                                IconButton(onClick = { /* do something */ }) {
                                    Icon(
                                        imageVector = Icons.Filled.ArrowBack,
                                        contentDescription = "Localized description"
                                    )
                                }
                            }
                        )
                    },
                    modifier = Modifier.fillMaxSize(),
                    containerColor = MaterialTheme.colorScheme.background,

                )
                {
                        innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                       AboutScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        color= Pink40
    )
}
@Composable
fun AboutScreen(){
    Column {


        Image( modifier = Modifier.size(90.dp).align(Alignment.CenterHorizontally),painter = painterResource(id = R.drawable.info), contentDescription = null)
        Text(modifier = Modifier
            .fillMaxWidth().padding(top=15.dp),
            textAlign = TextAlign.Center,
            text = "Artwork by heruga", fontSize = 19.sp)
        Text(modifier = Modifier
            .fillMaxWidth().padding( bottom = 10.dp,top=20.dp),
            textAlign = TextAlign.Center,
            text = "Our networks",fontSize = 19.sp)
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            Image(

                modifier = Modifier.size(50.dp).clickable {  },
                painter = painterResource(id = R.drawable.webbrowser),
                contentDescription = null
            )
            Image(
                modifier = Modifier.size(50.dp).clickable {  },
                painter = painterResource(id = R.drawable.telegram),
                contentDescription = null
            )
            Image(
                modifier = Modifier.size(50.dp).clickable {  },
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = null
            )
        }
        TextButton(onClick = { /*TODO*/ },) {


            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.mail),
                    contentDescription = null
                )
                Column {
                    Text(text = "Email",color= Color.White, fontSize = 16.sp)
                    Text(text = stringResource(R.string.email),color=Color.LightGray, fontSize = 14.sp)
                }

            }
        }
        TextButton(onClick = { /*TODO*/ },) {


            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.information),
                    contentDescription = null
                )
                Column {
                    Text(text = "FAQ",color=Color.White, fontSize = 16.sp)
                    Text(text = stringResource(R.string.FAQ),color=Color.LightGray, fontSize = 14.sp)
                }

            }
        }
        TextButton(onClick = { /*TODO*/ },) {


            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.starrating),
                    contentDescription = null
                )
                Column {
                    Text(text = "Rate us",color=Color.White, fontSize = 16.sp)
                    Text(text = stringResource(R.string.rate),color=Color.LightGray, fontSize = 14.sp)
                }

            }
        }
        TextButton(onClick = { /*TODO*/ },) {


            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Image(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.statistics),
                    contentDescription = null
                )
                Column {
                    Text(text = "Allow us to collect analytics",color=Color.White, fontSize = 16.sp)
                    Text(text = stringResource(R.string.analytics),color= Color.LightGray, fontSize = 14.sp)
                }
                var checked by remember { mutableStateOf(true) }

                Switch(
                    modifier=Modifier.padding(start = 70.dp),
                    checked = checked,
                    onCheckedChange = {
                        checked = it
                    }
                )

            }
        }

    }

}
@Preview(showBackground = true)
@Composable
fun AboutScreenPreview()
{
    Lab_0Theme {
        AboutScreen()
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab_0Theme {
        Greeting("Android")
    }
}