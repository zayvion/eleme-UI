package cn.examble.elemelayout.common.widget

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.*
import cn.examble.elemelayout.R
import kotlinx.android.synthetic.main.widget_horizontal_list_tie.view.*

/**
 * 自定义控件钱包/红包/金币
 */
class HorizontalListTie : LinearLayout {
    private lateinit var rootLayout: LinearLayout
    private lateinit var numberText: TextView
    private lateinit var unitText: TextView
    private lateinit var descText: TextView

    companion object {
        const val center = 1
        const val end = 2
    }

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initView(attrs)
    }


    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    )

    private fun initView(attrs: AttributeSet) {
        val rootView = LayoutInflater.from(context).inflate(R.layout.widget_horizontal_list_tie, null)


        rootLayout = rootView.findViewById<LinearLayout>(R.id.rootLayout)
        numberText = rootView.findViewById<TextView>(R.id.numberText)
        unitText = rootView.findViewById<TextView>(R.id.unitText)
        descText = rootView.findViewById<TextView>(R.id.descText)

        addView(rootView)
    }

    /**
     * 中间一个需要左右边框
     */
    fun changeToWrapperLine() {
        rootLayout.setBackgroundResource(R.drawable.border_line_arround)
    }

    /**
     * 改变
     */
    fun changeType(type: Int) {
        when(type) {
            HorizontalListTie.center -> {
                numberText.setTextColor(Color.parseColor("#c56251"))
                unitText.setTextColor(Color.parseColor("#c56251"))
                numberText.text = "10"
                unitText.text =  "个"
                descText.text = "红包"
            }
            HorizontalListTie.end -> {
                numberText.setTextColor(Color.parseColor("#e5ab46"))
                unitText.setTextColor(Color.parseColor("#e5ab46"))
                numberText.text = "2000"
                unitText.text =  "个"
                descText.text = "金币"
            }
        }
    }
}
