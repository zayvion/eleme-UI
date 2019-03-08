package cn.examble.elemelayout.ui.fragment

import cn.examble.elemelayout.R
import cn.examble.elemelayout.base.ui.BaseFragment
import cn.examble.elemelayout.ui.presenter.OrderPresenter
import cn.examble.elemelayout.ui.presenter.TackPresenter

/**
 * 求贤若饥 虚心若愚
 * @author zayvion
 * @date 2019-03-07 13:29
 */
class OrderFragment: BaseFragment<OrderPresenter>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_order
    }

    override fun afterCreate() {

    }

    companion object {
        private var instance: OrderFragment? = null

        fun getInstance(): OrderFragment {
            if (instance == null) {
                instance = OrderFragment()
            }
            return instance!!
        }
    }
}