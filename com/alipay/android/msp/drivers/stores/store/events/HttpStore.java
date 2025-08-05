package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.net.LdcUtils;
import com.alipay.android.msp.utils.net.LogicHeaderUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* loaded from: classes3.dex */
public class HttpStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap<String, String> g;

    public static /* synthetic */ Object ipc$super(HttpStore httpStore, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HttpStore(int i) {
        super(i);
        this.g = new HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r13, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r14) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.HttpStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }

    private ResData a(JSONObject jSONObject, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("98590123", new Object[]{this, jSONObject, new Integer(i)});
        }
        Object obj = null;
        JSONObject jSONObject2 = jSONObject.containsKey("header") ? jSONObject.getJSONObject("header") : null;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject.containsKey(AgooConstants.MESSAGE_BODY)) {
            obj = jSONObject.get(AgooConstants.MESSAGE_BODY);
        }
        if (obj == null) {
            obj = new JSONObject();
        }
        a(obj.toString());
        for (String str : jSONObject2.keySet()) {
            this.g.put(str, jSONObject2.getString(str));
        }
        String string = jSONObject.containsKey("url") ? jSONObject.getString("url") : "https://mobilegw.alipay.com/mgw.htm";
        String str2 = this.g.containsKey("Content-Type") ? this.g.get("Content-Type") : "application/json;charset=utf-8";
        this.f.onStatistic("action", "http|".concat(String.valueOf(string)));
        StEvent stEvent = this.f;
        StringBuilder sb = new StringBuilder();
        sb.append(obj.toString().length());
        stEvent.onStatistic(StEvent.SEND_MSG, sb.toString());
        ResData<byte[]> requestData = PluginManager.getTransChannel().requestData(obj.toString().getBytes(), str2, string, a(), i);
        StEvent stEvent2 = this.f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(requestData.getLength());
        stEvent2.onStatistic(StEvent.RECV_MSG, sb2.toString());
        this.f.onStatistic(StEvent.SERVER_COST, "0");
        return requestData;
    }

    private static JSONObject[] a(JSONObject jSONObject) {
        String str = "param";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject[]) ipChange.ipc$dispatch("70db3d89", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            if (jSONObject.containsKey(str) || jSONObject.containsKey("params")) {
                if (!jSONObject.containsKey(str)) {
                    str = "params";
                }
                jSONObject2 = jSONObject.getJSONObject(str);
            }
            if (jSONObject.containsKey("action")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("action");
                if (jSONObject4.containsKey("params")) {
                    jSONObject2 = JsonUtil.merge(jSONObject2, jSONObject4.getJSONObject("params"));
                }
                jSONObject3 = jSONObject.getJSONObject("action");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return new JSONObject[]{jSONObject2, jSONObject3};
    }

    private void a(String str) {
        TradeLogicData tradeLogicData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (Header header : LogicHeaderUtil.generateDefaultHeaders()) {
            this.g.put(header.getName(), header.getValue());
        }
        if (this.b == null || (tradeLogicData = this.b.getTradeLogicData()) == null) {
            return;
        }
        this.g.put(MspNetConstants.Request.MSP_PARAM, LdcUtils.getMspParams(tradeLogicData, str));
    }

    private List<Header> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.g.keySet().size());
        for (String str : this.g.keySet()) {
            arrayList.add(new BasicHeader(str, this.g.get(str)));
        }
        return arrayList;
    }

    private static Map<String, String> a(List<Header> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{list});
        }
        HashMap hashMap = new HashMap(list.size());
        for (Header header : list) {
            hashMap.put(header.getName(), header.getValue());
        }
        return hashMap;
    }
}
