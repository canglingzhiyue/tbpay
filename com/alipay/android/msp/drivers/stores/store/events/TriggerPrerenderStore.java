package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;

/* loaded from: classes3.dex */
public class TriggerPrerenderStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ StEvent a(TriggerPrerenderStore triggerPrerenderStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StEvent) ipChange.ipc$dispatch("b241cde3", new Object[]{triggerPrerenderStore}) : triggerPrerenderStore.f;
    }

    public static /* synthetic */ MspContext b(TriggerPrerenderStore triggerPrerenderStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("447ab6e9", new Object[]{triggerPrerenderStore}) : triggerPrerenderStore.f4584a;
    }

    public TriggerPrerenderStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        JSONObject actionParamsJson;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
            if (this.f4584a == null || this.f4584a.getContext() == null || this.c == null || this.c.getCurrentPresenter() == null || this.f4584a.isUpgradePreRendTpl() || (actionParamsJson = mspEvent.getActionParamsJson()) == null) {
                return null;
            }
            String string = actionParamsJson.getString("tplId");
            String string2 = actionParamsJson.getString("action");
            Activity activity = this.c.getCurrentPresenter().getActivity();
            PreRendManager.OnTplPreRendListener onTplPreRendListener = new PreRendManager.OnTplPreRendListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.TriggerPrerenderStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.ui.base.PreRendManager.OnTplPreRendListener
                public void onTplPreRendSuccess(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9fb79ff9", new Object[]{this, str});
                    } else if (StringUtils.isEmpty(str)) {
                    } else {
                        if (str.startsWith("QUICKPAY@")) {
                            str = str.substring(9);
                        }
                        TriggerPrerenderStore.a(TriggerPrerenderStore.this).onStatistic("action", "triggerPrerender|".concat(String.valueOf(str)));
                    }
                }

                @Override // com.alipay.android.msp.ui.base.PreRendManager.OnTplPreRendListener
                public void onTplPreRendFail(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("496d4923", new Object[]{this, new Integer(i)});
                        return;
                    }
                    LogUtil.record(8, "TriggerPrerenderStore:onMspAction", "onTplPreRendFail=".concat(String.valueOf(i)));
                    TriggerPrerenderStore.b(TriggerPrerenderStore.this).getStatisticInfo().addError("tpl", "triggerPrerenderFail", ag.ARG_ERROR_CODE.concat(String.valueOf(i)));
                }
            };
            if (!StringUtils.isEmpty(string)) {
                PreRendManager.getInstance().doPreloadTpl(activity, string, this.e, onTplPreRendListener, "event");
            } else if (!StringUtils.isEmpty(string2)) {
                PreRendManager.getInstance().preRendTpl(activity, this.f4584a.getBizId(), string2, onTplPreRendListener, "event");
            }
            return "{\"result\":true}";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }
}
