package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun TelaDeLista(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 26.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = stringResource(R.string.logo_description),
                        modifier = Modifier.size(50.dp)
                    )
                    Column(
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = stringResource(R.string.lion),
                            fontSize = 15.sp,
                            color = Color(0xFF3347B0),
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = stringResource(R.string.school),
                            fontSize = 15.sp,
                            color = Color(0xFF3347B0),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color(0xFFF9B036), CircleShape)
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(
                        text = stringResource(R.string.ds),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color(0xFF3347B0)
                    )
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 2.dp,
                        end = 2.dp
                    ),
                color = Color(0xFFF9B036)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = Color(0xFFFFC23D),
                    focusedBorderColor = Color(0xFFFFC23D)
                ),
                label = {
                    Text(text = stringResource(R.string.find_student))
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color.Gray
                    )
                },
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(90.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFF3347B0)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.todos),
                        color = Color(0xF5FAFAFA)
                    )
                }
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(90.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFFFFC23D)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.cursando),
                        color = Color(0XFF3347B0)
                    )
                }
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(90.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFFFFC23D)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.finalizado),
                        color = Color(0XFF3347B0)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.student),
                    contentDescription = " list ",
                    modifier = Modifier
                        .size(30.dp)
                )
                Text(
                    text = stringResource(R.string.student_list),
                    fontSize = 20.sp,
                    color = Color(0xFF3347B0),
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn {
                items(7) { index ->
                    StudentCard(
                        studentName = when (index) {
                            0 -> stringResource(R.string.luana)
                            1 -> stringResource(R.string.pedro)
                            2 -> stringResource(R.string.ana_clara)
                            3 -> stringResource(R.string.fabiana_luz)
                            4 -> stringResource(R.string.carlos_augusto)
                            5 -> stringResource(R.string.pedro_xavier)
                            else -> ""
                        },
                        studentCode = when (index) {
                            0 -> "20151001018"
                            1 -> "20151001018"
                            2 -> "20151001018"
                            3 -> "20151001018"
                            4 -> "20151001018"
                            5 -> "20151001018"
                            else -> ""
                        },
                        graduationYear = when (index) {
                            0 -> "2022"
                            1 -> "2022"
                            2 -> "2025"
                            3 -> "2022"
                            4 -> "2025"
                            5 -> "2025"
                            else -> ""
                        },
                        profileImage = when (index) {
                            0 -> R.drawable.luana
                            1 -> R.drawable.pedrosilva
                            2 -> R.drawable.anaclara
                            3 -> R.drawable.fabiana_luz
                            4 -> R.drawable.carlos
                            5 -> R.drawable.pedroxavier
                            else -> R.drawable.pedroxavier
                        }
                    )
                    if (index < 6) {
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun StudentCard(
    studentName: String,
    studentCode: String,
    graduationYear: String,
    profileImage: Int
) {
    Box(
        modifier = Modifier
            .height(85.dp)
            .padding(vertical = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(85.dp)
                .background(
                    Color(0xFFFFC23D),
                    RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp)
                )
        )
        // Card principal
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(85.dp)
                .padding(start = 8.dp),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFACB1E5)
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 12.dp, top = 12.dp, end = 12.dp, bottom = 8.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier
                            .size(45.dp)
                            .clip(CircleShape),
                        painter = painterResource(profileImage),
                        contentDescription = "",
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = studentName,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = Color.White
                        )
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painter = painterResource(R.drawable.identification),
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier.size(12.dp)
                            )
                            Spacer(modifier = Modifier.width(3.dp))
                            Text(
                                text = studentCode,
                                fontSize = 12.sp,
                                color = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.calendario),
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.size(12.dp)
                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    Box(
                        modifier = Modifier
                            .padding(horizontal = 6.dp, vertical = 1.dp)
                    ) {
                        Text(
                            text = graduationYear,
                            fontSize = 10.sp,
                            color = Color(0xFFFFC23D),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaDeListaPreview() {
    TelaDeLista()
}