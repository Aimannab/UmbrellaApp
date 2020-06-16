package com.raywenderlich.android.rwandroidtutorial

//All view classes should implement this
//View is given a generic type T
interface BaseView<T> {

    fun setPresenter(presenter: T)
}