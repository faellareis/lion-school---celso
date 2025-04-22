package br.senai.sp.jandira.lionschool.screens.cards

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun StudentsList(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Black
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically // Alinha os itens verticalmente ao centro
        ) {
            // Elemento 1: Imagem (exemplo de um ícone)
            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = "Ícone de Pessoa",
                modifier = Modifier.size(48.dp),
                tint = Color(0xFF3347B0) // Cor azul Lion School (exemplo)
            )
            Spacer(modifier = Modifier.width(16.dp)) // Espaço entre a imagem e o texto

            // Elemento 2: Coluna com textos (exemplo de nome e matrícula)
            Column {
                Text(
                    text = "Nome do Aluno",
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF3347B0)
                )
                Text(
                    text = "Matrícula: 123456",
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            }

            Spacer(modifier = Modifier.weight(1f)) // Empurra os elementos à esquerda para a esquerda e os à direita para a direita

            // Elemento 3: Ícone e texto (exemplo de data)
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.DateRange,
                    contentDescription = "Ícone de Data",
                    modifier = Modifier.size(20.dp),
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "22/04/2025",
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun StudentsListPreview() {
    StudentsList()
}
