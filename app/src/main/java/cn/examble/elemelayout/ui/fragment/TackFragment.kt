package cn.examble.elemelayout.ui.fragment

import cn.examble.elemelayout.R
import cn.examble.elemelayout.base.ui.BaseFragment
import cn.examble.elemelayout.ui.presenter.TackPresenter

/**
 * 求贤若饥 虚心若愚
 * @author zayvion
 * @date 2019-03-07 13:29
 */
class TackFragment: BaseFragment<TackPresenter>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_tack
    }

    override fun afterCreate() {

    }

    companion object {
        private var instance: TackFragment? = null

        fun getInstance(): TackFragment {
            if (instance == null) {
                instance = TackFragment()
            }
            return instance!!
        }
    }
}