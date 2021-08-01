package com.lid.navigation_playground

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

private val modifier = Modifier.fillMaxSize()
private val centerVertical = Arrangement.Center
private val centerHorizontal = Alignment.CenterHorizontally

@Composable
fun HomeScreen() {
    Column(
        modifier = modifier,
        verticalArrangement = centerVertical,
        horizontalAlignment = centerHorizontal
    ) {
        Text("HomeScreen", style = MaterialTheme.typography.h3)
    }
}

@Composable
fun SecondScreen() {
    Column(
        modifier = modifier,
        verticalArrangement = centerVertical,
        horizontalAlignment = centerHorizontal
    ) {
        Text("SecondScreen", style = MaterialTheme.typography.h3)
    }
}

@Composable
fun ThirdScreen() {
    Column(
        modifier = modifier,
        verticalArrangement = centerVertical,
        horizontalAlignment = centerHorizontal
    ) {
        Text("ThirdScreen", style = MaterialTheme.typography.h3)
    }
}

@Composable
fun FourthScreen() {
    Column(
        modifier = modifier,
        verticalArrangement = centerVertical,
        horizontalAlignment = centerHorizontal
    ) {
        Text("FourthScreen", style = MaterialTheme.typography.h3)
    }
}

@Composable
fun FifthScreen() {
    Column(
        modifier = modifier,
        verticalArrangement = centerVertical,
        horizontalAlignment = centerHorizontal
    ) {
        Text("FifthScreen", style = MaterialTheme.typography.h3)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}