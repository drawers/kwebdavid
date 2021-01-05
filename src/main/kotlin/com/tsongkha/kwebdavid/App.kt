package com.tsongkha.kwebdavid

internal data class App(
    val name: String,
    val body: String,
    val image: String,
    val url: String
)

internal val apps = listOf(
    App(
        name = "SleepStyle for Android",
        body = "SleepStyle for Android is a",
        image = "https://play-lh.googleusercontent.com/StJchtxvgcKSBYG3WanButSH4N-EjRZ50mfEDdqiINRqOfmklywSkG1_EU4PSQsKcgk=s180-rw",
        url = "https://play.google.com/store/apps/details?id=com.fphcare.sleepstyle&hl=en_NZ&gl=US"
    ),
    App(
        name = "Trade Me Yellow App",
        body = "Trade Me is ",
        image = "https://play-lh.googleusercontent.com/CyY5bOcCjbbFJUcMvO46c6BDat9AEjWb5ye5mdqZ97Ra05oX3l1PSyLQgDo0ozd5TfcU=s180-rw",
        url = "https://play.google.com/store/apps/details?id=nz.co.trademe.trademe&hl=en_NZ&gl=US"
    )
)