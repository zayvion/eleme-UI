package cn.examble.elemelayout.common.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.*
import cn.examble.elemelayout.R

/**
 * 列表选择项
 */
class ListTie : LinearLayout {
    lateinit var leadImg: ImageView
    lateinit var subImg: ImageView
    lateinit var rootLayout: LinearLayout
    lateinit var subTitle: TextView
    lateinit var mainTitle: TextView

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
        val rootView = LayoutInflater.from(context).inflate(R.layout.widget_list_tie, null)
        val params = FrameLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        rootLayout = rootView.findViewById<LinearLayout>(R.id.rootLayout)
        leadImg = rootView.findViewById<ImageView>(R.id.leadImg)
        subImg = rootView.findViewById<ImageView>(R.id.subImg)
        subTitle = rootView.findViewById<TextView>(R.id.subTitle)
        mainTitle = rootView.findViewById<TextView>(R.id.mainTitle)

        addView(rootView, params)
    }

    /**
     * 最后一个需要上下边框
     */
    fun changeToWrapperLine() {
        rootLayout.setBackgroundResource(R.drawable.border_line_bottom)
    }

    fun setLeadImg(resourceId: Int) {
        leadImg.setImageResource(resourceId)
    }

    fun setSubImg(resourceId: Int) {
        subImg.setImageResource(resourceId)
    }

    fun setMainTitle(title: String) {
        mainTitle.text = title
    }

    fun setSubTitle(title: String) {
        subTitle.text = title
    }
}
