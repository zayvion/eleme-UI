package cn.examble.elemelayout.common

import android.support.v4.app.Fragment


/**
 *  求贤若饥 虚心若愚
 *  容器管理
 * @author zayvion
 * @date 2019-03-04 15:05
 */
object FragmentContainer {

    val fragmentContainer = mutableListOf<Fragment>()

    val fragmentContainerMap =  LinkedHashMap<String, Fragment>()

    fun addFragment2Container(fragment: Fragment){
        fragmentContainer.add(fragment)
    }

    fun removeFragment2Container(fragment: Fragment) {
        fragmentContainer.remove(fragment)
    }

    fun addFragment2Map(tag: String, fragment: Fragment) {
        fragmentContainerMap[tag] = fragment
    }

    fun removeFragment2Map(tag: String) {
        fragmentContainerMap.remove(tag)
    }


}