package com.alipay.android.msp.drivers.stores.store.events;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.container.MspContainerResult;
import com.alipay.android.msp.core.MspEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ServiceStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Context a(ServiceStore serviceStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f627a7da", new Object[]{serviceStore}) : serviceStore.d;
    }

    public static /* synthetic */ MspContext b(ServiceStore serviceStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("f2f1a26b", new Object[]{serviceStore}) : serviceStore.f4584a;
    }

    public ServiceStore(int i) {
        super(i);
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        JSONObject actionParamsJson;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.c == null || this.c.getCurrentPresenter() == null || this.d == null || this.f4584a == null || this.c.getCurrentPresenter().mo545getIView() == null || (actionParamsJson = mspEvent.getActionParamsJson()) == null) {
            return null;
        }
        EventLogUtil.logPayEvent("1010970", "value", "service_plugin");
        actionParamsJson.getString("serviceType");
        final JSONObject jSONObject = actionParamsJson.getJSONObject("serviceParams");
        final String string = actionParamsJson.getString("bizType");
        if (jSONObject == null) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "pageDataJsonNull", "null");
        }
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ServiceStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MspContainerResult startRenderForResult = MspEngine.startRenderForResult(jSONObject, string, false, ServiceStore.a(ServiceStore.this));
                    if (startRenderForResult == null) {
                        Utils.sendToDocument(eventAction, "{}");
                        return;
                    }
                    Utils.sendToDocument(eventAction, startRenderForResult.getBizResult());
                    StEvent stEvent = new StEvent();
                    stEvent.onStatistic("actionType", "service");
                    stEvent.onStatistic("action", startRenderForResult.toString());
                    ServiceStore.b(ServiceStore.this).getStatisticInfo().addEvent(stEvent);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        });
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }
}
