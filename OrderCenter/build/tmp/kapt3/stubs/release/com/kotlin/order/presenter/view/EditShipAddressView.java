package com.kotlin.order.presenter.view;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/kotlin/order/presenter/view/EditShipAddressView;", "Lcom/kotlin/base/presenter/view/BaseView;", "onAddShipAddressResult", "", "result", "", "onEditShipAddressResult", "OrderCenter_release"})
public abstract interface EditShipAddressView extends com.kotlin.base.presenter.view.BaseView {
    
    public abstract void onAddShipAddressResult(boolean result);
    
    public abstract void onEditShipAddressResult(boolean result);
}