package br.senai.sp.jandira.lionschool.screens.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable

fun StudentsList(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF9FA9E1)
        )
    ) {
        Box(
            modifier = Modifier
                .width(10.dp)
                .height(44.dp)
                .background(Color(0xFFF9B036))
        )
    }
    Spacer(modifier = Modifier.width(8.dp)) // Espaçamento entre a borda e o texto
    Column {
        Text(
            stringResource(R.string.luana),
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            color = Color(0xFFFFFFFF)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.identification), // Substitua pelo seu ícone
                contentDescription = stringResource(R.string.numero_estudante),
                tint = Color.White,
                modifier = Modifier.size(16.dp) // Ajuste o tamanho conforme necessário
            )
            Spacer(modifier = Modifier.width(4.dp)) // Espaçamento entre o ícone e o texto
            Text(
                stringResource(R.string.numero_estudante),
                color = Color.White,
                fontSize = 12.sp
            )
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun StudentsListPreview() {
    StudentsList()
}
