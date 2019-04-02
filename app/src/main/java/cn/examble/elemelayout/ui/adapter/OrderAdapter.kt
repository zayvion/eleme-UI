package cn.examble.elemelayout.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import cn.examble.elemelayout.R
import cn.examble.elemelayout.common.model.OrderModel

/**
 * 求贤若饥 虚心若愚
 * @author ZayvionLiang
 * @date 2019-03-22 09:14
 */
class OrderAdapter(private val orderModels: List<OrderModel>) : RecyclerView.Adapter<OrderAdapter.ViewHoler>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHoler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.order_item, parent, false)
        val viewHolder = OrderAdapter.ViewHoler(view)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return orderModels.size
    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
        val orderModel = orderModels[position]
        holder.productImg.setImageResource(orderModel.productImg)
        holder.title.text = orderModel.title
        holder.time.text = orderModel.time
        holder.productName.text = orderModel.productName
        holder.subTitle.text = orderModel.subTitle
        holder.price.text = orderModel.price
        if (orderModel.again) {
            holder.again.visibility = View.VISIBLE
        } else {
            holder.again.visibility = View.INVISIBLE
        }
    }


    class ViewHoler(view: View): RecyclerView.ViewHolder(view){
        val productImg = view.findViewById<ImageView>(R.id.produtImg)
        val title = view.findViewById<TextView>(R.id.title)
        val time = view.findViewById<TextView>(R.id.time)
        val productName = view.findViewById<TextView>(R.id.productName)
        val subTitle = view.findViewById<TextView>(R.id.subTitle)
        val price = view.findViewById<TextView>(R.id.price)
        val again = view.findViewById<Button>(R.id.again)
    }
}