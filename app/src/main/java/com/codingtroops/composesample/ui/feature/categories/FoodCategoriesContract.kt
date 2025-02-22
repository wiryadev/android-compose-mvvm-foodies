package com.codingtroops.composesample.ui.feature.categories

import com.codingtroops.composesample.base.ViewSideEffect
import com.codingtroops.composesample.base.ViewEvent
import com.codingtroops.composesample.base.ViewState
import com.codingtroops.composesample.model.FoodItem

class FoodCategoriesContract {
    sealed class Event : ViewEvent {
        data class CategorySelection(val categoryName: String) : Event()
    }

    data class State(val categories: List<FoodItem> = listOf()) : ViewState()

    sealed class Effect : ViewSideEffect {
        object DataWasLoaded : Effect()

        sealed class Navigation : Effect() {
            data class ToCategoryDetails(val categoryName: String) : Navigation()
        }
    }

}