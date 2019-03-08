package cn.examble.elemelayout.ui.adapter

import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import cn.examble.elemelayout.R
import cn.examble.elemelayout.common.model.ListTieModel
import cn.examble.elemelayout.common.widget.ListTie

/**
 * 求贤若饥 虚心若愚
 * 列表项的适配器。 这里需要传入一个list来动态获取列表项具体要展示的内容，暂时写死
 * @author zayvion
 * @date 2019-03-07 14:11
 */
class MyAdapter(private val tieModels: List<ListTieModel>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    var onMyAdapterClickListener: (listTieModel: ListTieModel) -> Unit = {}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_item, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.mListTie.setOnClickListener {
            val position = viewHolder.adapterPosition
            onMyAdapterClickListener(tieModels[position])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return tieModels.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val listTieModel = tieModels[position]
        val mListTie = viewHolder.mListTie
        mListTie.subTitle.text = listTieModel.subTitleText
        mListTie.mainTitle.text = listTieModel.mainTitleText
        mListTie.leadImg.setImageResource(listTieModel.leadImgResource)
        if (listTieModel.sumImgResource != 0) {
            mListTie.subImg.setImageResource(listTieModel.sumImgResource)
        }
        if (position == tieModels.size - 1) {
            viewHolder.mListTie.changeToWrapperLine()
        }
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val mListTie = view.findViewById<ListTie>(R.id.mListTie)
    }

    fun setOnMyAdapterClickListeneR(function: (listTieModel: ListTieModel) -> Unit) {
        this@MyAdapter.onMyAdapterClickListener = function
    }
}