package cn.examble.elemelayout.ui.fragment

import cn.examble.elemelayout.R
import cn.examble.elemelayout.base.ui.BaseFragment
import cn.examble.elemelayout.ui.presenter.ShopPresenter
import cn.examble.elemelayout.ui.presenter.TackPresenter

/**
 * 求贤若饥 虚心若愚
 * @author zayvion
 * @date 2019-03-07 13:29
 */
class ShopFragment: BaseFragment<ShopPresenter>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_shop
    }

    override fun afterCreate() {

    }

    companion object {
        private var instance: ShopFragment? = null

        fun getInstance(): ShopFragment {
            if (instance == null) {
                instance = ShopFragment()
            }
            return instance!!
        }
    }
}