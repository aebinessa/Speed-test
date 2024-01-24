package com.binjesus.creditcardproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.binjesus.creditcardproject.ui.theme.CreditCardProjectTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreditCardView(
                        creditName = PersonRepo.abdullah.creditCard.creditName,
                        cardNumber = PersonRepo.abdullah.creditCard.cardNumber,
                        expiryDate = PersonRepo.abdullah.creditCard.expiryDate,
                        oasisId = PersonRepo.abdullah.creditCard.oasisId,
                        personName = PersonRepo.abdullah.personName
                    )
                }
            }
        }
    }
}

@Composable
fun CreditCardView(
    creditName: String, cardNumber: String, expiryDate: String, oasisId: Int, personName: String


) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(200.dp)
    ) {
        Column(verticalArrangement = Arrangement.SpaceBetween) {
            Text(modifier = Modifier, text = cardNumber)
            Spacer(modifier = Modifier.size(50.dp))
            Text("$personName      ||      $oasisId")
            Spacer(modifier = Modifier.size(50.dp))
            Text("$creditName      ||      $expiryDate")
        }
    }
}

data class CreditCard(
    val creditName: String, val cardNumber: String, val expiryDate: String, val oasisId: Int
)

enum class CardType {
    MASTERCARD, VISA
}

class Person(val personName: String, val age: Int, val salary: Double, var creditCard: CreditCard)

