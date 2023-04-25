package com.example.cartaodevisitaenzodotti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.foundation.layout.Arrangement.Top
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisitaenzodotti.ui.theme.CartaoDeVisitaEnzoDottiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaEnzoDottiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(48, 89, 57)
                ) {
                    PlanoDeFundo()
                }
            }
        }
    }
@Composable
fun PlanoDeFundo(){
    Image(
        painter = painterResource(id = R.drawable.fundobranco1),
        contentDescription = null ,
        contentScale = ContentScale.Crop
    )
    Cabecalho()
    Rodape()
}

@Composable
fun Rodape(){
    Column(
        verticalArrangement = Arrangement.Bottom
    ) {
        Contato(
            painter = painterResource(id = R.drawable.iconetelefone2),
            text = "(11) 96016-2966"
        )
        Contato(
            painter = painterResource(id = R.drawable.iconeemail7),
            text = "dottidelbiancoenzo@gmail.com"
        )
        Contato(
            painter = painterResource(id = R.drawable.iconeinstagram),
            text = "_enzo.dotti"
        )
    }

}
    @Composable
    fun Contato(painter: Painter, text:String){

        Divider(
            color = Color. Black,
            modifier = Modifier
                .fillMaxWidth()
                .height(0.5.dp)
        )

        Row (
            modifier = Modifier.
            padding(bottom = 20.dp, top = 20.dp,
            start = 20.dp
            )


        )
        {

            Image(
                painter = painter,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(35.dp)
                    .clip(CircleShape)
            )
            Text(
                modifier = Modifier.padding(start = 15.dp),
                text = text,
                fontSize = 22.sp,

            )
        }
    }
}
@Composable
fun Cabecalho() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.iconealuno2),
            contentDescription = null,
            modifier = Modifier
                .size(130.dp)
                .clip(CircleShape)
        )
        Text(
            text = "Enzo Dotti",
            fontSize = 30.sp,
            fontWeight = FontWeight.Black
        )
        Text(
            text = "Aluno",
            fontSize = 20.sp
        )

    }
}


    
