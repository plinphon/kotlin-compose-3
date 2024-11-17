package com.example.compose_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FourQuadrantsScreen()
        }
    }
}

@Composable
fun FourQuadrantsScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            QuadrantCard(
                title = "Earth",
                description = "The earth is full of a wide variety of rocks and minerals which provides the soil to grow vegetation and support life.",
                backgroundColor = Color(0xFF4CAF50), // Green for Earth
                modifier = Modifier.fillMaxHeight().weight(1f)
            )
            QuadrantCard(
                title = "Water",
                description = "Water has many unique properties. The chemical formula of water is H20, meaning it is made of two hydrogen atoms bonded to one oxygen atom.",
                backgroundColor = Color(0xFF2196F3), // Blue for Water
                modifier = Modifier.fillMaxHeight().weight(1f)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            QuadrantCard(
                title = "Air",
                description = "Air was considered a “pure” element, but in fact the air that’s all around us is made up of a variety of gases: primarily nitrogen and oxygen.",
                backgroundColor = Color(0xFFB0BEC5), // Light Gray for Air
                modifier = Modifier.fillMaxHeight().weight(1f)
            )
            QuadrantCard(
                title = "Fire",
                description = "How does fire work? It’s closely linked to air. Fire needs three things in order to exist: oxygen, fuel, and heat.",
                backgroundColor = Color(0xFFFF5722), // Orange for Fire
                modifier = Modifier.fillMaxHeight().weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantCard(title: String, description: String, backgroundColor: Color, modifier: Modifier) {
    Box(
        modifier = modifier
            .background(backgroundColor)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = description,
                fontSize = 16.sp
            )
        }
    }
}
