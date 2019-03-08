package cn.examble.elemelayout.ui.adapter

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.util.AttributeSet

/**
 * 需要禁止RecycleView滑动，所以需要重写LineareLayoutManager
 */
class ELinearLayoutManager : LinearLayoutManager {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, orientation: Int, reverseLayout: Boolean) : super(
        context,
        orientation,
        reverseLayout
    ) {
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    ) {
    }

    override fun canScrollVertically(): Boolean {
        return false
    }
}
