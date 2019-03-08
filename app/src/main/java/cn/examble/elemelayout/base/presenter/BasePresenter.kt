package cn.examble.elemelayout.base.presenter

import cn.examble.elemelayout.base.presenter.view.BaseView

/**
 * 求贤若饥 虚心若愚
 * @author zayvion
 * @date 2019-03-07 13:24
 */
open class BasePresenter<T: BaseView> {
    lateinit var mView: T
}