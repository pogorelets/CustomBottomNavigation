package ru.lostpolygons.custombottomnavigation

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.bottom_toolbar.view.*


class CustomBottomNavigation  @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(context, attrs, defStyleAttr) {

    interface BottomListener {
        fun onRadioClick()
        fun onProgramClick()
        fun onNewsClick()
        fun onCompetitionClick()
    }

    private lateinit  var listener: BottomListener

    fun setBottomListener(listener: BottomListener) {
        this.listener = listener
    }

    init {
        init(context)
    }

    private fun init(context: Context) {
        LayoutInflater.from(context).inflate(R.layout.bottom_toolbar, this, true)
        changeItem(true,false,false,false)
        navRadio.setOnClickListener {
            changeItem(true,false,false,false)
            listener.onRadioClick()
        }

        navProgram.setOnClickListener {
            changeItem(false,true,false,false)
            listener.onProgramClick()
        }

        navNews.setOnClickListener {
            changeItem(false,false,true,false)
            listener.onNewsClick()
        }

        navCompetition.setOnClickListener {
            changeItem(false,false,false,true)
            listener.onCompetitionClick()
        }

    }

    private fun clickRadio(checked: Boolean){
        navRadio.isSelected = checked
        imRadio.isSelected = checked
        radio.isSelected = checked
    }

    private fun clickProgram(checked: Boolean){
        navProgram.isSelected = checked
        imProgram.isSelected = checked
        program.isSelected = checked
    }

    private fun clickNews(checked: Boolean){
        navNews.isSelected = checked
        imNews.isSelected = checked
        news.isSelected = checked
    }

    private fun clickCompetition(checked: Boolean){
        navCompetition.isSelected = checked
        imCompetition.isSelected = checked
        competition.isSelected = checked
    }

    private fun changeItem(checkedRadio: Boolean,
                           checkedProgram: Boolean,
                           checkedNews: Boolean,
                           checkedCompetition: Boolean){
        clickRadio(checkedRadio)
        clickProgram(checkedProgram)
        clickNews(checkedNews)
        clickCompetition(checkedCompetition)

    }


}