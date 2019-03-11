package cn.examble.elemelayout.ui.fragment

import android.support.v7.widget.LinearLayoutManager
import android.text.Html
import android.widget.Toast
import cn.examble.elemelayout.R
import cn.examble.elemelayout.base.ui.BaseFragment
import cn.examble.elemelayout.common.ext.showToast
import cn.examble.elemelayout.common.model.ListTieModel
import cn.examble.elemelayout.common.widget.HorizontalListTie
import cn.examble.elemelayout.ui.adapter.ELinearLayoutManager
import cn.examble.elemelayout.ui.adapter.MyAdapter
import cn.examble.elemelayout.ui.presenter.MyPresenter
import cn.examble.elemelayout.ui.presenter.TackPresenter
import cn.examble.elemelayout.ui.presenter.view.MyView
import kotlinx.android.synthetic.main.fragment_my.*
import kotlinx.android.synthetic.main.widget_list_tie.*

/**
 * 求贤若饥 虚心若愚
 * 我的页面
 * @author zayvion
 * @date 2019-03-07 13:29
 */
class MyFragment: BaseFragment<MyPresenter>(), MyView {


    override fun getLayoutId(): Int {
        return R.layout.fragment_my
    }

    override fun afterCreate() {
        initView()
    }

    private fun initView() {

        val myAdapter = MyAdapter(initData())
        myRec.layoutManager = ELinearLayoutManager(activity!!)
        myRec.adapter = myAdapter
        myRec.isNestedScrollingEnabled = false

//        centerHorizontalListTie.changeToWrapperLine()
        centerHorizontalListTie.changeType(HorizontalListTie.center)
        endHorizontalListTie.changeType(HorizontalListTie.end)
        val centerTextString = "成为<font color='#b6ac58'>超级会员</font>·每月拿<font color='#b6ac58'>20元</font>红包"
        centerTitle.text = Html.fromHtml(centerTextString)

        myAdapter.setOnMyAdapterClickListeneR {
            activity!!.showToast(it.mainTitleText)
        }
    }

    private fun initData(): List<ListTieModel> {
         // 不想要subImg 就传0
        return mutableListOf<ListTieModel>(
            ListTieModel(R.drawable.icon_heart, 0, ">", "我的收藏"),
            ListTieModel(R.drawable.anr, 0, ">", "我的客服"),
            //ListTieModel(R.drawable.icon_heart, 0, "免费领百元红包>", "饿了么联名卡"),
            ListTieModel(R.drawable.ans, R.drawable.icon_sell, "10元现金拿不停>", "推荐有奖"),
            ListTieModel(R.drawable.anm, R.drawable.icon_sell, "0元好物在这里>", "金币商城"),
            ListTieModel(R.drawable.ade, 0, "领10元红包>", "签到领红包"),
            ListTieModel(R.drawable.ano, R.drawable.afh, ">", "加盟合作")
        )
    }

    /**
     * 单例
     */
    companion object {
        private var instance: MyFragment? = null

        fun getInstance(): MyFragment {
            if (instance == null) {
                instance = MyFragment()
            }
            return instance!!
        }
    }

    /**
     * 接口需要实现的方法
     */
    override fun showToast(tip: String) {
        Toast.makeText(activity, tip, Toast.LENGTH_SHORT).show()
    }
}