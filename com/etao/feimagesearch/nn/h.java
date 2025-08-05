package com.etao.feimagesearch.nn;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.o;
import java.util.ArrayList;
import java.util.HashMap;
import tb.com;
import tb.cot;
import tb.cox;
import tb.kge;

/* loaded from: classes3.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(696628506);
        a();
        b();
        c();
        d();
        e();
    }

    private static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        int b = com.e() ? 1 : o.b();
        return b != 1 ? b != 4 ? "OTHER" : "NETWORK_4G" : "NETWORK_WIFI";
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("run_time");
        arrayList.add("pre_process_time");
        arrayList.add("post_process_time");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("net_name");
        arrayList2.add("net_mode");
        arrayList2.add("cpu_model");
        arrayList2.add("mobile_model");
        cox.a("PLT_NN", "core_unit_run", arrayList, arrayList2);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("run_time");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("net_name");
        arrayList2.add("net_mode");
        arrayList2.add("cpu_model");
        arrayList2.add("mobile_model");
        cox.a("PLT_NN", "build_NN_model", arrayList, arrayList2);
    }

    public static void a(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a154e70", new Object[]{new Long(j), str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("run_time", Double.valueOf(j));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("net_name", str);
        hashMap2.put("net_mode", str2);
        hashMap2.put("cpu_model", com.l());
        hashMap2.put("mobile_model", com.n());
        cot.b("NNMonitor", "NNModelName:%s NNBuildTime:%d", str, Long.valueOf(j));
        cox.a("PLT_NN", "build_NN_model", hashMap, hashMap2);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("run_time");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("net_name");
        arrayList2.add("network_type");
        arrayList2.add("mobile_model");
        cox.a("PLT_NN", "download_NN_model", arrayList, arrayList2);
    }

    public static void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{new Long(j), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("run_time", Double.valueOf(j));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("net_name", str);
        hashMap2.put("network_type", f());
        hashMap2.put("mobile_model", com.n());
        cox.a("PLT_NN", "download_NN_model", hashMap, hashMap2);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("run_time");
        arrayList.add("pre_process_time");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("unit_name");
        arrayList2.add("cpu_model");
        arrayList2.add("mobile_model");
        cox.a(com.etao.feimagesearch.newresult.perf.b.MODULE_CHAIN, "core_unit_run", arrayList, arrayList2);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            cox.a("PLT_NN", "NN_runtime_failed", new ArrayList());
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("net_name", (Object) str2);
        jSONObject.put("network_type", (Object) f());
        jSONObject.put("cpu_model", (Object) com.l());
        jSONObject.put("mobile_model", (Object) com.n());
        cox.a("PLT_NN", "NN_runtime_failed", str, jSONObject.toJSONString());
    }
}
