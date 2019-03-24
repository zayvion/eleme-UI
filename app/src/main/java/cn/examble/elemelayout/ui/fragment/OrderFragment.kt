package cn.examble.elemelayout.ui.fragment

import android.support.v7.widget.LinearLayoutManager
import cn.examble.elemelayout.R
import cn.examble.elemelayout.base.ui.BaseFragment
import cn.examble.elemelayout.common.model.ListTieModel
import cn.examble.elemelayout.common.model.OrderModel
import cn.examble.elemelayout.ui.adapter.OrderAdapter
import cn.examble.elemelayout.ui.presenter.OrderPresenter
import cn.examble.elemelayout.ui.presenter.TackPresenter
import kotlinx.android.synthetic.main.fragment_order.*

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
        orderRec.layoutManager = LinearLayoutManager(activity)
        orderRec.adapter = OrderAdapter(initData())

    }

    /**
    val productImg: Int,
    val title: String,
    val time: String,
    val productName: String,
    val subTitle: String,
    val price: String,
    val again: Boolean
     */
    private fun initData(): List<OrderModel> {
        // 不想要subImg 就传0
        return mutableListOf(
            OrderModel(R.drawable.account, "老地方私房菜1", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", false),
            OrderModel(R.drawable.account, "老地方私房菜2", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜3", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", false),
            OrderModel(R.drawable.account, "老地方私房菜4", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", true),
            OrderModel(R.drawable.account, "老地方私房菜X", "2019-03-12 11:29", "麻辣鸡丁", "订单已取消", "￥7", false)
        )
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