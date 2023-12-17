package com.example.doggy

import android.content.ClipData.Item
import android.os.Bundle
import android.provider.ContactsContract.DisplayPhoto
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.doggy.data.DoggyData
import com.example.doggy.data.dogs
import com.example.doggy.model.Doggy
import com.example.doggy.ui.theme.DoggyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DoggyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Doggy_Data()

                     }
            }
        }
    }
}


@Composable
fun Doggy_Data(){
   LazyColumn{
       items(dogs){
           DogItem(dog=it)

       }

   }
}

@Composable
fun DogItem(dog:Doggy,modifier: Modifier=Modifier){
    Row(modifier= Modifier
        .fillMaxWidth()
        .padding(8.dp)){
        DogIcon(dog.photu, modifier = Modifier);
        DogInformation(dog.name, modifier = Modifier)

    }

}
@Composable
fun DogIcon(@DrawableRes dogPhoto:Int,modifier: Modifier){
    Image(painter = painterResource(id = dogPhoto), contentDescription = null
    , modifier = Modifier)
}
@Composable
fun DogInformation(@StringRes dogAbout:Int,modifier:Modifier){

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    DoggyTheme {

    }
}