package com.tsongkha.kwebdavid

import kweb.*
import kweb.plugins.fomanticUI.fomantic
import kweb.plugins.fomanticUI.fomanticUIPlugin

fun main() {
    Kweb(port = 16097, plugins = listOf(fomanticUIPlugin)) {

        doc.head.new {
            meta(name = "Description", content = "A personal website for David Rawson")
        }

        doc.body.new {
            div(fomantic.ui.main.container).new {
                div(fomantic.column).new {
                    div(fomantic.ui.vertical.segment).new {
                        h2().innerHTML("Talks")
                        br()
                        div(fomantic.ui.divider)

                        talks.map {
                            div(fomantic.ui.two.column.stackable.left.aligned.grid).new {
                                div(fomantic.column).new {
                                    img(
                                        it.image,
                                        fomantic.ui.image.small
                                    )
                                }
                                div(fomantic.column).new {
                                    h3().innerHTML(it.title)
                                    p().innerHTML(it.date)
                                    p().innerHTML(it.audience)
                                }
                            }
                            div(fomantic.ui.divider).new {}
                        }
                    }

                    div(fomantic.ui.vertical.segment).new {
                        h2().innerHTML("Apps")
                    }

                    div(fomantic.ui.vertical.segment).new {
                        h2().innerHTML(
                            "Articles"
                        )
                    }
                }

                div(fomantic.ui.vertical.segment).new {
                    h2().innerHTML(
                        "Code samples"
                    )
                }
            }
        }
    }
}

