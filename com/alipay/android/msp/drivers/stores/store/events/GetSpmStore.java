package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.phone.wallet.spmtracker.SpmTracker;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class GetSpmStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public GetSpmStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null || this.c.getCurrentPresenter() == null || this.d == null || (currentPresenter = this.c.getCurrentPresenter()) == null || currentPresenter.mo545getIView() == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String miniPageId = SpmTracker.getMiniPageId(currentPresenter.getActivity());
            String pageId = SpmTracker.getPageId(currentPresenter.getActivity());
            String srcSpm = SpmTracker.getSrcSpm(currentPresenter.getActivity());
            if (!TextUtils.isEmpty(miniPageId)) {
                jSONObject.put("miniPageId", (Object) miniPageId);
            }
            if (!TextUtils.isEmpty(pageId)) {
                jSONObject.put("pageId", (Object) pageId);
            }
            if (!TextUtils.isEmpty(srcSpm)) {
                jSONObject.put("srcSpm", (Object) srcSpm);
            }
            return jSONObject.toJSONString();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "{}";
        }
    }
}
