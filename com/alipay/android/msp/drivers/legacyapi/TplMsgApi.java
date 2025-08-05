package com.alipay.android.msp.drivers.legacyapi;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.events.TplMsgStore;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* loaded from: classes3.dex */
public class TplMsgApi extends JSPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.app.template.JSPlugin
    public int getContextHashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc6032e", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.android.app.template.JSPlugin
    public String pluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a669a95b", new Object[]{this}) : "TplMsgApi";
    }

    @Override // com.alipay.android.app.template.JSPlugin
    public Object execute(JSPlugin.FromCall fromCall, String str, String str2, FBDocument fBDocument, long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("796c594e", new Object[]{this, fromCall, str, str2, fBDocument, new Long(j), context});
        }
        LogUtil.record(2, "TplMsgApi:execute", "action=" + str + " ,args=" + str2 + " , doc=" + fBDocument + " , ctx=" + context);
        EventAction eventAction = new EventAction(str);
        eventAction.setEventFrom("invoke");
        eventAction.setInvokeFunKey(j);
        eventAction.setSender(fBDocument);
        eventAction.setInvokeDoc(fBDocument);
        eventAction.setActionData(str2);
        eventAction.setActionParamsJson(JSON.parseObject(str2));
        new TplMsgStore(-1).onMspAction(eventAction, eventAction.getMspEvents()[0]);
        return "{}";
    }
}
