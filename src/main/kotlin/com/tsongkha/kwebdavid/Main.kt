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
            div(fomantic.pusher).new {
                div(fomantic.ui.inverted.vertical.masthead.center.aligned.segment).new {
                    div(fomantic.ui.text.container).new {
                        h1(fomantic.ui.inverted.header).innerHTML("David Rawson")
                        h2().innerHTML(
                            "Android specialist"
                        )
                    }
                }
                div(fomantic.ui.vertical.striped.segment).new {
                    div(fomantic.ui.middle.aligned.stackable.grid.container).new {
                        div(fomantic.row).new {
                            div(fomantic.eight.wide.column).new {
                                h3(fomantic.ui.header).innerHTML("SleepStyle")
                                p().innerHTML(
                                    "SleepStyle is an app for managing OSA therapy. " +
                                            "It connects to your CPAP medical device over Bluetooth and downloads your therapy data " +
                                            "visualizing your treatment over day, month, and year. SleepStyle is part of a " +
                                            "suite of apps that won an award at the Designers' Institute of NZ Best Design Awards for 2018. " +
                                            "I was very proud to deliver this app for Fisher & Paykel Healthcare."
//                                            https://bestawards.co.nz/user-experience-award/empowering/fisher-paykel-healthcare-osa/sleepstyle-patient-app/
                                )
                                h3(fomantic.ui.header).innerHTML("Trade Me")
                                p().innerHTML("Yes")
                            }
                            div(fomantic.six.wide.right.floated.column).new {
                                img(
                                    src = "assets/images/wireframe/white-image.png",
                                    attributes = fomantic.ui.large.image
                                )
                            }
                        }
                    }
                }
            }
        }

//        doc.body.new {
//            div(fomantic.ui.main.container).new {
//                div(fomantic.column).new {
//                    div(fomantic.ui.vertical.segment).new {
//                        h2().innerHTML("Talks")
//                        br()
//                        div(fomantic.ui.divider)
//
//                        talks.map {
//                            div(fomantic.ui.two.column.stackable.left.aligned.grid).new {
//                                div(fomantic.column).new {
//                                    img(
//                                        it.image,
//                                        fomantic.ui.image.small
//                                    )
//                                }
//                                div(fomantic.column).new {
//                                    h3().innerHTML(it.title)
//                                    p().innerHTML(it.date)
//                                    p().innerHTML(it.audience)
//                                }
//                            }
//                            div(fomantic.ui.divider).new {}
//                        }
//                    }
//
//                    div(fomantic.ui.vertical.segment).new {
//                        h2().innerHTML("Apps")
//                    }
//
//                    div(fomantic.ui.vertical.segment).new {
//                        h2().innerHTML(
//                            "Articles"
//                        )
//                    }
//                }
//
//                div(fomantic.ui.vertical.segment).new {
//                    h2().innerHTML(
//                        "Code samples"
//                    )
//                }
//            }
//        }
    }
}

