package com.tsongkha.kwebdavid

internal data class Talk(
    val image: String,
    val title: String,
    val date: String,
    val audience: String,
    val url: String
)

internal val talks = listOf(
    Talk(
        image = "https://camo.githubusercontent.com/01325d058289958fb40415facdc02d5209de23a1a03dab6815bd1d06154767e5/68747470733a2f2f7261772e6769746875622e636f6d2f5068696c4a61792f4d5043686172742f6d61737465722f73637265656e73686f74732f73696d706c6564657369676e5f6261726368617274332e706e67",
        title = "Data visualisation in Android using MPAndroid/Chart",
        date = "15 Nov 2017",
        audience = "Google Developers Group Auckland",
        url = "https://www.meetup.com/GDGAuckland/events/244741507/"
    ),
    Talk(
        image = "https://sydney-devfest-2019.web.app/images/logos/kotlin-everywhere.png",
        title = "Property-based testing in Kotlin",
        date = "16 Nov 2019",
        audience = "GDG DevFest Sydney",
        url = "https://sydney-devfest-2019.web.app/schedule/2019-11-16?sessionId=109"
    ),
    Talk(
        image = "https://secure.meetupstatic.com/photos/event/7/a/d/0/highres_488971440.jpeg",
        title = "Property-based testing",
        date = "13 Feb 2020",
        audience = "GDG Wellington",
        url = "https://www.meetup.com/GDG-Wellington/events/267917860/"
    ),
    Talk(
        image = "https://secure.meetupstatic.com/photos/event/7/a/d/0/highres_488971440.jpeg",
        title = "Property-based testing in Android - are we testing like it's 1999?",
        date = "14 Dec 2020",
        audience = "Droidcon APAC",
        url = "https://www.droidcon.com/media-detail?video=491022325"
    )
)