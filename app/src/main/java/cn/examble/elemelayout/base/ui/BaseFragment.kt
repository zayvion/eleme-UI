package cn.examble.elemelayout.base.ui

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cn.examble.elemelayout.base.presenter.BasePresenter
import cn.examble.elemelayout.base.presenter.view.BaseView
import cn.examble.elemelayout.common.FragmentContainer
import cn.examble.elemelayout.common.ext.getClassSimpleName

/**
 * 求贤若饥 虚心若愚
 * @author zayvion
 * @date 2019-03-07 13:21
 */
abstract class BaseFragment<T: BasePresenter<*>>: Fragment(), BaseView {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // 管理Fragment栈
        FragmentContainer.addFragment2Map(this.getClassSimpleName(), this)
        return inflater.inflate(getLayoutId(), container, false)
    }

    abstract fun getLayoutId(): Int

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        afterCreate()
    }

    abstract fun afterCreate()

    override fun onDestroy() {
        FragmentContainer.removeFragment2Map(this.getClassSimpleName())
        super.onDestroy()
    }

}