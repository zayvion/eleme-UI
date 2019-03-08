package cn.examble.elemelayout.ui.activity

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cn.examble.elemelayout.R
import cn.examble.elemelayout.common.ext.showFragment
import cn.examble.elemelayout.ui.fragment.MyFragment
import cn.examble.elemelayout.ui.fragment.OrderFragment
import cn.examble.elemelayout.ui.fragment.ShopFragment
import cn.examble.elemelayout.ui.fragment.TackFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initToolBar()
        initView()

    }

    /**
     * 初始化Toolbar，title需要动态改变
     */
    private fun initToolBar() {
        mainToolBar.title = "饿了么"
        mainToolBar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(mainToolBar)
    }

    private fun initView() {
        // 监听下方导航栏选择事件
        navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_take_out -> {
                    showFragment(TackFragment.getInstance())
                }
                R.id.navigation_shop -> {
                    showFragment(ShopFragment.getInstance())
                }
                R.id.navigation_order -> {
                    showFragment(OrderFragment.getInstance())
                }
                R.id.navigation_my -> {
                    showFragment(MyFragment.getInstance())
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

    }
}
