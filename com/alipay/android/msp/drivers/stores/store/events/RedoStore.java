package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RedoStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RedoStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.f4584a == null) {
            return null;
        }
        MspBasePresenter mspBasePresenter = this.f4584a.getMspBasePresenter();
        if (this.f4584a.getMspNetHandler().isGraySyncRenderSupport() || !this.f4584a.getMspNetHandler().hasSyncPayResult()) {
            String[] actionParamsArray = mspEvent.getActionParamsArray();
            MspBaseContract.IView mo545getIView = mspBasePresenter != null ? mspBasePresenter.mo545getIView() : null;
            if (actionParamsArray != null && actionParamsArray.length > 0) {
                JSONObject parseObject = JSON.parseObject(actionParamsArray[0]);
                String string = parseObject.getString("loadstyle");
                if (parseObject.containsKey(MspWebActivity.LOADTXT)) {
                    str = parseObject.getString(MspWebActivity.LOADTXT);
                    if (!TextUtils.isEmpty(str) && mo545getIView != null) {
                        if (!TextUtils.equals(string, InvokeActionPlugin.SHOW_LOADING_STYLE_PLAIN)) {
                            mo545getIView.showLoadingView(str);
                        }
                        mo545getIView.showCusLoadingView(str);
                    }
                } else if (mo545getIView != null) {
                    if (TextUtils.equals(string, InvokeActionPlugin.SHOW_LOADING_STYLE_PLAIN)) {
                        str = "";
                        mo545getIView.showCusLoadingView(str);
                    } else {
                        mo545getIView.showLoadingView(new String[0]);
                    }
                }
            } else if (mo545getIView != null) {
                mspBasePresenter.mo545getIView().showLoadingView(new String[0]);
            }
            if (mo545getIView != null) {
                mo545getIView.addMaskView();
            }
            ActionsCreator.get(this.f4584a).createNetRetryRequestAction();
            if (this.c != null) {
                this.c.showPrePageLoading();
            }
        } else if (!this.f4584a.getMspNetHandler().isShowSyncPayResult()) {
            this.f4584a.getMspNetHandler().showSyncPayResultView(false);
        }
        return null;
    }
}
