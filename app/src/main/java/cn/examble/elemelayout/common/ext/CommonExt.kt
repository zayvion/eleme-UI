package cn.examble.elemelayout.common.ext

import android.app.Activity
import android.content.SharedPreferences
import android.support.v4.app.Fragment

import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import cn.examble.elemelayout.R
import cn.examble.elemelayout.common.FragmentContainer

/**
 * 求贤若饥 虚心若愚
 * 公有扩展函数
 * @author zayvion
 * @date 2019-03-07 13:18
 */


fun Any.getClassSimpleName(): String{
    return this::class.java.simpleName.toString()
}

fun View.onClick(method: (view: View) -> Unit): View {
    setOnClickListener {
        method(it)
    }
    return this
}

/**
 * 显示出传入的FragmentTag
 */
fun AppCompatActivity.showFragment(fragment: Fragment) {
    val transaction = supportFragmentManager.beginTransaction()
    val queryFragment = FragmentContainer.fragmentContainerMap[fragment.getClassSimpleName()]
    val fragments = FragmentContainer.fragmentContainerMap.values
    for (let in fragments) {
        if (let.tag != fragment.getClassSimpleName()) {
            transaction.hide(let)
        }
    }
    if (queryFragment == null) {
        addFragment(fragment)
    } else {
        transaction.show(fragment)
    }
    transaction.commitAllowingStateLoss()


}

fun AppCompatActivity.addFragment(fragment: Fragment) =
    supportFragmentManager.beginTransaction().add(R.id.mainFrame, fragment, fragment.getClassSimpleName()).commit()

fun SharedPreferences.edit(action: SharedPreferences.Editor.() -> Unit) {
    val editor = edit()
    action(editor)
    editor.apply()
}

fun Activity.showToast(tip:String = "请稍后") {
    Toast.makeText(this, tip, Toast.LENGTH_SHORT).show()
}