package cn.examble.elemelayout.ui.presenter.view

import cn.examble.elemelayout.base.presenter.view.BaseView

/**
 * 求贤若饥 虚心若愚
 * View
 * @author zayvion
 * @date 2019-03-07 13:31
 */
interface MyView: BaseView {
    fun showToast(tip: String)
}