package by.bsuir.pmis.chernyakova.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.bsuir.pmis.chernyakova.R
import by.bsuir.pmis.chernyakova.ui.theme.Lab_0Theme

class AboutScreen {
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
                        Text(text = "Email", fontSize = 16.sp)
                        Text(text = stringResource(R.string.email), fontSize = 14.sp)
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
                        Text(text = "FAQ", fontSize = 16.sp)
                        Text(text = stringResource(R.string.FAQ), fontSize = 14.sp)
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
                        Text(text = "Rate us", fontSize = 16.sp)
                        Text(text = stringResource(R.string.rate), fontSize = 14.sp)
                    }

                }
            }
            TextButton(onClick = { /*TODO*/ },) {

                Row(modifier = Modifier.fillMaxWidth()
                    .padding(end=30.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    )
                {
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
                            Text(
                                text = "Allow us to collect analytics",

                                fontSize = 16.sp
                            )
                            Text(
                                text = stringResource(R.string.analytics),

                                fontSize = 14.sp
                            )
                        }



                    }
                    var checked by remember { mutableStateOf(true) }

                    Switch(

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
}