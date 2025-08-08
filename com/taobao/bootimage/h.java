package com.taobao.bootimage;

import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.triver.triver_shop.newShop.event.ucp.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import tb.kej;
import tb.keo;
import tb.keq;
import tb.kge;
import tb.tiq;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f16685a = "";

    static {
        kge.a(-35335355);
    }

    private JSONObject a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eef312bb", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            jSONObject.put("schemeId", (Object) "Page_Home@float_window");
            jSONObject.put("bizId", (Object) "auge-20737");
            jSONObject.put("schemeNumId", (Object) "47");
            jSONObject.put("bizNumId", (Object) "11197");
            jSONObject.put(a.MATERIAL_ID_KEY, (Object) "22692");
        } else {
            jSONObject.put("schemeId", (Object) "Page_Home@float_window");
            jSONObject.put("bizId", (Object) "splash_ad");
            jSONObject.put("schemeNumId", (Object) "25");
            jSONObject.put("bizNumId", (Object) "11122");
            jSONObject.put(a.MATERIAL_ID_KEY, (Object) "22328");
        }
        return jSONObject;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        int a2 = EnvironmentSwitcher.a();
        JSONObject a3 = a(a2);
        JSONObject jSONObject = new JSONObject();
        keq h = com.taobao.bootimage.linked.h.a("").h();
        try {
            h.a(tiq.BIZ_CODE, keo.i(), keq.UCP_START, null, null, null);
            boolean a4 = UCPManager.a(a3, jSONObject);
            kej.a("UcpController", "initUcpSdk isUcpSDKReady = " + a4);
            String string = jSONObject.containsKey("msg") ? jSONObject.getString("msg") : "";
            StringBuilder sb = new StringBuilder();
            sb.append("initUcpSdk tryTriggerUCPEvent error, ");
            sb.append(string);
            sb.append("是否是线上？");
            sb.append(a2 == 0 ? "线上" : "非线上");
            kej.a("UcpController", sb.toString());
            if (!a4) {
                this.f16685a = "";
                h.a(tiq.BIZ_CODE, keo.i(), keq.UCP_ERROR, null, keq.UCP_INIT_ERROR, string);
                AppMonitor.Alarm.commitFail("Page_Topshow", "linkage_pop", "101", string);
                return false;
            }
            this.f16685a = jSONObject.getString("popIndexId");
            if (StringUtils.isEmpty(this.f16685a)) {
                h.a(tiq.BIZ_CODE, keo.i(), keq.UCP_ERROR, null, keq.UCP_POP_INDEX_FAIL, string);
                AppMonitor.Alarm.commitFail("Page_Topshow", "linkage_pop", "102", string);
            }
            kej.a("UcpController", "initUcpSdk popIndexId = " + this.f16685a);
            AppMonitor.Alarm.commitSuccess("Page_Topshow", "linkage_pop");
            return true;
        } catch (Throwable th) {
            this.f16685a = "";
            h.a(tiq.BIZ_CODE, keo.i(), keq.UCP_ERROR, null, keq.UCP_CRASH, th.getMessage());
            AppMonitor.Alarm.commitFail("Page_Topshow", "linkage_pop", "103", th.getMessage());
            kej.a("UcpController", "initUcpSdk throwable = " + th);
            return false;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f16685a;
    }
}
