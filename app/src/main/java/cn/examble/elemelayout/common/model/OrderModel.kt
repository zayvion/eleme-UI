package cn.examble.elemelayout.common.model

import android.widget.TextView

/**
 * 求贤若饥 虚心若愚
 * @author ZayvionLiang
 * @date 2019-03-24 22:27
 */


/**
 *
 *  val productImg = view.findViewById<ImageView>(R.id.produtImg)
    val title = view.findViewById<TextView>(R.id.title)
    val time = view.findViewById<TextView>(R.id.time)
    val productName = view.findViewById<TextView>(R.id.productName)
    val subTitle = view.findViewById<TextView>(R.id.subTitle)
    val price = view.findViewById<TextView>(R.id.price)
    val again = view.findViewById<Button>(R.id.again)
 */
data  class OrderModel (
    val productImg: Int,
    val title: String,
    val time: String,
    val productName: String,
    val subTitle: String,
    val price: String,
    val again: Boolean
)