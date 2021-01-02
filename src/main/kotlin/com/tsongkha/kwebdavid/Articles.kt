package com.tsongkha.kwebdavid

internal data class Article(
    val title: String,
    val image: String,
    val url: String
)

internal val articles = listOf(
    Article(
        title = "Higher kinds in Kotlin",
        image = "https://miro.medium.com/max/700/1*-8tf-x7Wg9R3eJUEKfdwjA.jpeg",
        url = "https://drawson.medium.com/higher-kinds-in-kotlin-cdb6904c2fdb"
    ),
    Article(
        title = "Idiomatic Code - what it is and why it matters",
        image = "https://miro.medium.com/max/700/1*_BAzB5eaH2Ugnj7VbzHYmA.jpeg 700w",
        url = "https://medium.com/swlh/idiomatic-code-a73f17f0f287?sk=91afffb71cddab41da334bc7ea44a9da"
    ),
    Article(
        title = "Experimenting with Ktor",
        image = "https://miro.medium.com/max/700/0*7IZoFKeResrrBfpg",
        url = "https://medium.com/default-to-open/experimenting-with-ktor-5c8c1bf78d72"
    ),
    Article(
        title = "Explaining the Arrow Android sample",
        image = "https://miro.medium.com/max/396/0*ihQ722cNDwBvBgy-.png",
        url = "https://medium.com/default-to-open/explaining-the-arrow-android-sample-ee5c8bdfe88a"
    ),
    Article(
        title = "The case for interface",
        image = "https://miro.medium.com/max/640/0*n79Ps0Tu1JFRI3b6.jpg",
        url = "https://proandroiddev.com/the-case-for-interface-d252ef0408de"
    )
)