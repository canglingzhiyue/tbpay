package com.alibaba.android.aura.taobao.adapter.extension.performance;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.NetworkStats;
import tb.arc;
import tb.asd;
import tb.asf;
import tb.azl;
import tb.baq;
import tb.baw;
import tb.bbk;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.performance.commonArgs")
/* loaded from: classes2.dex */
public final class b extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f2209a;

    static {
        kge.a(1672445647);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 1702025934) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((com.alibaba.android.aura.datamodel.nextrpc.a) objArr[0]);
            return null;
        }
    }

    @Override // tb.asf, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f2209a = fVar;
        super.onCreate(qVar, fVar);
    }

    @Override // tb.asf, tb.asg
    public void a(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
        AURAPerformanceStageModel aURAPerformanceStageModel;
        Map<String, String> map;
        String str;
        boolean z;
        b bVar = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6572dace", new Object[]{bVar, aVar});
            return;
        }
        super.a(aVar);
        if (!aVar.d()) {
            return;
        }
        String a2 = baq.a(aVar);
        Map<String, String> d = d(aVar);
        Map<String, String> b = b(aVar);
        String str2 = (String) c().a("purchaseFrom", String.class);
        String c = c(aVar);
        String str3 = (String) c().a("bucket", String.class);
        com.alibaba.android.aura.datamodel.nextrpc.d i = aVar.i();
        AURAPerformanceStageModel aURAPerformanceStageModel2 = null;
        if (i == null || !i.e()) {
            aURAPerformanceStageModel = null;
        } else {
            aURAPerformanceStageModel2 = new AURAPerformanceStageModel("pareJsonDataTime");
            aURAPerformanceStageModel2.setStartMills(i.f());
            aURAPerformanceStageModel2.setEndMills(i.g());
            aURAPerformanceStageModel = new AURAPerformanceStageModel("switchThreadTime");
            aURAPerformanceStageModel.setStartMills(i.h());
            aURAPerformanceStageModel.setEndMills(i.i());
        }
        try {
            for (azl azlVar : bVar.f2209a.b(azl.class)) {
                HashMap<String, String> a3 = bVar.a(a2, c, d, b);
                if (!TextUtils.isEmpty(str2)) {
                    a3.put("purchaseFrom", str2);
                }
                String str4 = a2;
                StringBuilder sb = new StringBuilder();
                Map<String, String> map2 = d;
                sb.append(com.alibaba.ability.localization.b.c());
                sb.append("");
                a3.put("isI18n", sb.toString());
                a3.put("isHitMTopStreamJson", i != null ? String.valueOf(i.d()) : "none");
                if (!TextUtils.isEmpty(str3)) {
                    a3.put("bucket", str3);
                }
                if (i == null || i.j() <= 0) {
                    map = b;
                    str = str2;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    map = b;
                    str = str2;
                    sb2.append(i.j());
                    sb2.append("");
                    a3.put("preRequestSaveTime", sb2.toString());
                }
                if (aURAPerformanceStageModel2 != null) {
                    z = false;
                    azlVar.a(aURAPerformanceStageModel2, asd.NEXT_RPC_SERVICE_CODE, false);
                } else {
                    z = false;
                }
                if (aURAPerformanceStageModel != null) {
                    azlVar.a(aURAPerformanceStageModel, asd.NEXT_RPC_SERVICE_CODE, z);
                }
                azlVar.a(a3);
                bVar = this;
                b = map;
                a2 = str4;
                d = map2;
                str2 = str;
            }
            e(aVar);
        } catch (Throwable th) {
            String a4 = AURATraceUtil.a(th);
            arc.a().b(a4);
            baw.a(a4);
        }
    }

    private void e(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739f51d2", new Object[]{this, aVar});
            return;
        }
        JSONObject jSONObject5 = aVar.f().getJSONObject("data");
        if (jSONObject5 == null || (jSONObject = jSONObject5.getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("submit")) == null || (jSONObject3 = jSONObject2.getJSONObject("events")) == null || (jSONArray = jSONObject3.getJSONArray(AURAEventKey.exposureItem)) == null) {
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject6 = (JSONObject) next;
                if ("userTrack".equals(jSONObject6.getString("type")) && (jSONObject4 = jSONObject6.getJSONObject("fields")) != null && "Page_NewConfirmOrder_Button-submit".equals(jSONObject4.getString("arg1"))) {
                    e().update("submitExposureItemArgs", jSONObject4.getJSONObject("args"));
                }
            }
        }
    }

    private HashMap<String, String> a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5297a83f", new Object[]{this, str, str2, map, map2});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!bbk.a(str)) {
            hashMap.put(HttpConstant.EAGLE_EYE_ID_2, str);
        }
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        if (str2 != null) {
            hashMap.put("page", str2);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    private Map<String, String> d(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7bed5486", new Object[]{this, aVar});
        }
        com.alibaba.android.aura.datamodel.nextrpc.d i = aVar.i();
        if (i == null) {
            return null;
        }
        long c = i.c();
        HashMap hashMap = new HashMap();
        hashMap.put("requestStartTime", i.a() + "");
        hashMap.put("requestEndTime", i.b() + "");
        hashMap.put("requestTotalTime_thread", c + "");
        if (i.l() > 0) {
            c -= i.l();
        }
        if (i.k() > 0) {
            c -= i.k();
        }
        hashMap.put("requestTotalTime", c + "");
        hashMap.put("parseJsonTime", i.k() + "");
        hashMap.put("switchMainThreadTime", i.l() + "");
        return hashMap;
    }

    private String c(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6d64850", new Object[]{this, aVar});
        }
        JSONObject f = aVar.f();
        if (f != null && (jSONObject = f.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT)) != null) {
            return jSONObject2.getString("page");
        }
        return null;
    }

    private Map<String, String> b(com.alibaba.android.aura.datamodel.nextrpc.a aVar) {
        MtopStatistics mtopStat;
        NetworkStats networkStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e06e6484", new Object[]{this, aVar});
        }
        MtopResponse g = aVar.g();
        if (g == null || (mtopStat = g.getMtopStat()) == null || (networkStats = mtopStat.getNetworkStats()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("serverRT", String.valueOf(networkStats.serverRT));
            hashMap.put("sendSize", String.valueOf(networkStats.sendSize));
            hashMap.put("recvSize", String.valueOf(networkStats.recvSize));
            hashMap.put("firstDataTime", String.valueOf(networkStats.firstDataTime));
            hashMap.put("NetworkStats汇总", networkStats.toString());
            hashMap.put("totalTime", String.valueOf(mtopStat.totalTime));
            hashMap.put("startTime", String.valueOf(mtopStat.startTime));
            hashMap.put("netSendStartTime", String.valueOf(mtopStat.netSendStartTime));
            hashMap.put("netSendEndTime", String.valueOf(mtopStat.netSendEndTime));
            hashMap.put("netTotalTime", String.valueOf(mtopStat.netTotalTime));
            hashMap.put("bxSleep", String.valueOf(mtopStat.bxSleep));
            hashMap.put("bxUI", String.valueOf(mtopStat.bxUI));
            hashMap.put("bxMainAction", String.valueOf(mtopStat.bxMainAction));
            hashMap.put("rspCbStart", String.valueOf(mtopStat.rspCbStart));
            hashMap.put("rspCbEnd", String.valueOf(mtopStat.rspCbEnd));
            hashMap.put("MtopStatistics汇总", mtopStat.toString());
        } catch (Throwable unused) {
        }
        return hashMap;
    }
}
