package com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.tao.topmultitab.c;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ldf;
import tb.ljs;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ACTION_TYPE = "click";
    public static final String NETWORK_ACTION_TYPE = "network";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f17452a;
    private Map<String, Map<String, Object>> b = new HashMap();
    private ljs c;

    static {
        kge.a(-429369581);
    }

    public a(ljs ljsVar) {
        this.c = ljsVar;
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        if (this.f17452a == null) {
            this.f17452a = new HashMap(8);
        }
        try {
            this.f17452a.put(str, String.valueOf(j));
        } catch (Exception e) {
            ldf.d("MonitorParamsConstructor", "记录数据链路的耗时出现异常：" + e);
        }
        if (!GatewayPhaseEnum.uiRenderTime.name().equals(str)) {
            return;
        }
        this.b.put("network", this.f17452a);
        this.f17452a = null;
    }

    public Map<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        if (this.b.isEmpty()) {
            ldf.d("MonitorParamsConstructor", "mRecordMap.isEmpty()");
            return null;
        }
        for (Map.Entry<String, Map<String, Object>> entry : this.b.entrySet()) {
            if (str.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.b.isEmpty()) {
            ldf.d("MonitorParamsConstructor", "clearMonitorParams mRecordMap.isEmpty()");
        } else if (!this.b.containsKey(str)) {
            ldf.d("MonitorParamsConstructor", "clearMonitorParams !mRecordMap.containsKey(actionType)");
        } else {
            this.b.remove(str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("realtimeClickParam", str);
        JSONObject a2 = a();
        if (a2 != null) {
            hashMap.put(c.SERVICE_REALTIME_PASS_PARAMS, a2);
        }
        this.b.put("click", hashMap);
    }

    private JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        IHostService iHostService = (IHostService) this.c.a(IHostService.class);
        if (iHostService == null) {
            ldf.d("MonitorParamsConstructor", "getRealTimePassParams hostService == null");
            return null;
        }
        return iHostService.getInvokeCallback().j().a();
    }
}
