package com.cxz.wanandroid.mvp.contract

import com.cxz.wanandroid.base.IPresenter
import com.cxz.wanandroid.base.IView
import com.cxz.wanandroid.mvp.model.bean.ProjectTreeBean

/**
 * Created by chenxz on 2018/5/15.
 */
interface ProjectContract {

    interface View : IView {

        fun scrollToTop()

        fun setProjectTree(list: List<ProjectTreeBean>)

    }

    interface Presenter : IPresenter<View> {

        fun requestProjectTree()

    }

}