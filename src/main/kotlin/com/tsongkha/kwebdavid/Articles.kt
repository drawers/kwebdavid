package com.tsongkha.kwebdavid

// https://www.twilik.com/embed-your-medium-blog

internal data class Article(
    val title: String,
    val image: String,
    val url: String,
    val date: String
)

internal val articles = listOf(
    Article(
        title = "Higher kinds in Kotlin",
        image = "https://miro.medium.com/max/700/1*-8tf-x7Wg9R3eJUEKfdwjA.jpeg",
        url = "https://drawson.medium.com/higher-kinds-in-kotlin-cdb6904c2fdb",
        date = "Nov 16 2020"
    ),
    Article(
        title = "Idiomatic Code - what it is and why it matters",
        image = "https://miro.medium.com/max/700/1*_BAzB5eaH2Ugnj7VbzHYmA.jpeg 700w",
        url = "https://medium.com/swlh/idiomatic-code-a73f17f0f287?sk=91afffb71cddab41da334bc7ea44a9da",
        date = "Jul 28 2020"
    ),
    Article(
        title = "Experimenting with Ktor",
        image = "https://miro.medium.com/max/700/0*7IZoFKeResrrBfpg",
        url = "https://medium.com/default-to-open/experimenting-with-ktor-5c8c1bf78d72",
        date = "Jun 5 2020"
    ),
    Article(
        title = "Explaining the Arrow Android sample",
        image = "https://miro.medium.com/max/396/0*ihQ722cNDwBvBgy-.png",
        url = "https://medium.com/default-to-open/explaining-the-arrow-android-sample-ee5c8bdfe88a",
        date = "Apr 2 2020"
    ),
    Article(
        title = "The case for interface",
        image = "https://miro.medium.com/max/640/0*n79Ps0Tu1JFRI3b6.jpg",
        url = "https://proandroiddev.com/the-case-for-interface-d252ef0408de",
        date = "Mar 3 2020"
    ),
    Article(
        title = "Know when to fold 'em",
        image = "https://miro.medium.com/max/639/0*5xshYQkZNJOic65I.jpg",
        url = "https://medium.com/default-to-open/know-when-to-fold-em-226f5e398ed8",
        date = "Jan 21 2020"
    ),
    Article(
        title = "Property-based testing in Kotlin",
        image = "https://miro.medium.com/max/700/0*VslU5XD2YIGxDOO8",
        url = "https://medium.com/default-to-open/property-based-testing-in-kotlin-part-1-56929927b8b8",
        date = "Dec 13 2019"
    ),
    Article(
        title = "Smooth loading animations in Android",
        image = "https://miro.medium.com/max/350/1*d-5fGJEfCnGwUWVPOMlbEg.png",
        url = "https://medium.com/default-to-open/smooth-loading-animations-in-android-11dcae4ecfd0",
        date = "Aug 25 2019"
    )
)