package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PayStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        String buildPayOrderInfo;
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null || this.c.getCurrentPresenter() == null) {
            return null;
        }
        MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
        if (currentPresenter.mo545getIView() == null) {
            return null;
        }
        Activity activity = currentPresenter.getActivity();
        if (currentPresenter.mo545getIView() == null) {
            PhoneCashierMspEngine.getMspBase().invokePay(null, null, eventAction, activity);
            return InvokeActionPlugin.AYSNC_CALLBACK;
        }
        PhoneCashierMspEngine.getMspBase().loadProperties(activity);
        try {
            buildPayOrderInfo = PhoneCashierMspEngine.getMspWallet().buildPayOrderInfo(mspEvent.getActionParamsJson().toJSONString());
            parseObject = mspEvent.getActionParamsJson();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            this.f4584a.getStatisticInfo().addError(ErrorType.DEFAULT, "PayStore", e);
            buildPayOrderInfo = PhoneCashierMspEngine.getMspWallet().buildPayOrderInfo(eventAction.getActionData());
            parseObject = JSON.parseObject(eventAction.getActionData());
        }
        JSONObject jSONObject2 = new JSONObject();
        if (parseObject != null) {
            if (parseObject.containsKey("extInfo") && (jSONObject = parseObject.getJSONObject("extInfo")) != null) {
                for (String str : jSONObject.keySet()) {
                    jSONObject2.put(str, (Object) jSONObject.getString(str));
                }
            }
            if (parseObject.containsKey("sourceBundleId")) {
                String string = parseObject.getString("sourceBundleId");
                if (!StringUtils.isEmpty(string)) {
                    jSONObject2.put("sourceBundleId", (Object) string);
                }
            }
        }
        if (this.d != null && FastStartActivityHelper.getBoolConfig(this.d, DrmKey.GRAY_NEW_AP_LINK_TOKEN_CREATE_100370) && jSONObject2.containsKey("ap_link_token")) {
            String string2 = jSONObject2.getString("ap_link_token");
            jSONObject2.put("ap_link_token", (Object) (string2 + ApLinkTokenUtils.generateUniqueSuffixForOuterApLinkToken(buildPayOrderInfo)));
        }
        PhoneCashierMspEngine.getMspBase().invokePay(buildPayOrderInfo, jSONObject2.toJSONString(), eventAction, activity);
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }
}
