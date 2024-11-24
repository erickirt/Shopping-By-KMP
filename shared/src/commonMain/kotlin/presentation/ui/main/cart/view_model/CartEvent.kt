package presentation.ui.main.cart.view_model

import business.core.NetworkState
import business.core.UIComponent

sealed class CartEvent {

    data class DeleteFromBasket(val id: Long) : CartEvent()

    data class AddProduct(val id: Long) : CartEvent()

   data object OnRemoveHeadFromQueue : CartEvent()

    data class Error(
        val uiComponent: UIComponent
    ) : CartEvent()

   data object OnRetryNetwork : CartEvent()
    data class OnUpdateNetworkState(
        val networkState: NetworkState
    ) : CartEvent()
}
