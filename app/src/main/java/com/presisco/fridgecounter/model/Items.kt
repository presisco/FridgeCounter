package com.presisco.fridgecounter.model

import java.util.*

/**
 * Created by presisco on 2017/8/13.
 */
data class ShopItem(val name: String, var count: Float, val unit: String)

data class Fridge(val name: String, var count: Float, val unit: String)
data class MealItem(var date: Date, var type: String, var name: String, var ingredients: String)