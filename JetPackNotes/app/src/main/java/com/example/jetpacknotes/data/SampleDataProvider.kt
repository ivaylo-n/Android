package com.example.jetpacknotes.data

import java.util.*

class SampleDataProvider {
    companion object{
        private val sampleText1 = "A simple Note"
        private val sampleText2 = "A note a\nline feed"
        private val sampleText3 =  """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer accumsan maximus mi vel ultricies. Donec semper nulla at sagittis rhoncus. Phasellus eu pharetra ante. Nulla facilisi. Suspendisse molestie nunc eget leo aliquam volutpat. In cursus lectus ut sapien pretium, et ultricies metus volutpat. Vivamus orci elit, luctus at ex non, ultrices sagittis velit. Nulla facilisi. Cras sit amet cursus turpis. Aliquam euismod, massa eu consectetur vestibulum, felis lectus porta metus, et placerat est nulla nec augue. Morbi sit amet ornare magna, et venenatis urna. Aliquam dapibus tortor eget nulla tristique, non scelerisque sem ullamcorper. In vitae purus est. Suspendisse id lectus iaculis, viverra nibh et, auctor neque. Aenean bibendum risus vestibulum neque lobortis, et lacinia tortor gravida. Fusce orci metus, posuere eget sagittis id, finibus at quam.

            Mauris at aliquam leo. Maecenas ultrices eget nulla ut malesuada. Donec euismod bibendum sodales. Nunc at mi euismod augue ullamcorper gravida lacinia sed enim. Curabitur cursus risus non blandit elementum. Aliquam non vulputate turpis, quis condimentum nisi. Duis id ullamcorper turpis, et bibendum ligula. Suspendisse suscipit nisl vel risus pulvinar auctor. Aliquam at euismod nisl, in pharetra massa. Praesent ullamcorper risus turpis, ac ultricies magna fringilla eget. Praesent tincidunt aliquet massa eget euismod. Proin eget auctor mi. Curabitur sit amet pulvinar massa, eu ullamcorper nulla. Maecenas eleifend odio nunc, eget blandit mi consectetur ut. Proin rutrum lectus eros, cursus bibendum ex placerat at.
            
            """.trimIndent()

        private fun getDate(diff: Long): Date {
            return Date(Date().time + diff)
        }

        fun getNotes() = arrayListOf(
            NoteEntity(1, getDate(0), sampleText1),
            NoteEntity(2, getDate(1), sampleText2),
            NoteEntity(3, getDate(2), sampleText3)
        )

    }
}