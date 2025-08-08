package com.taobao.mmad.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;
import tb.kge;
import tb.ssf;
import tb.stv;
import tb.tiq;
import tb.tjd;
import tb.tje;
import tb.tjf;
import tb.tjo;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMERCIAL_AD_NORMAL = "commercialAdNormal";
    public static final String COMMERCIAL_AD_VIDEO = "commercialAdVideo";

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.mmad.fatigue.a f18111a;
    private tiq b;
    private Map<String, tje> c = new HashMap();

    static {
        kge.a(130808963);
    }

    private boolean a(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2621735f", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)})).booleanValue() : (1000 == i && z) || (1001 == i && z2);
    }

    public c(tiq tiqVar) {
        this.b = tiqVar;
        this.f18111a = new com.taobao.mmad.fatigue.a(tiqVar);
        this.c.put("popView", new tjf());
        this.c.put("feeds", new tjd());
    }

    public boolean a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c57ee45", new Object[]{this, aVar, new Integer(i)})).booleanValue();
        }
        JSONObject f = aVar.f();
        BaseMmAdModel b = aVar.b();
        boolean a2 = a(f);
        stv.a("RulerVerify", "isTypeAvailable result=" + a2);
        if (!a2) {
            stv.a("RulerVerify", "checkTypeAvailable not Available ");
            return false;
        }
        boolean a3 = a(i, b.coldStart, b.hotStart);
        stv.a("RulerVerify", "checkStartType result=" + a3 + ", startType=" + i + ", coldStart=" + b.coldStart + ", hotStart=" + b.hotStart);
        if (!a3) {
            return false;
        }
        boolean a4 = a(b.gmtStartMs, b.gmtEndMs);
        stv.a("RulerVerify", "checkTimeAvailable result=" + a4 + ", gmtStartMs=" + b.gmtStartMs + ", gmtEndMs=" + b.gmtEndMs);
        if (!a4) {
            return false;
        }
        boolean a5 = a(b.imgUrl, b.bizType, b.videoUrl);
        stv.a("RulerVerify", "checkResourceAvailable result=" + a5 + ", imgUrl=" + b.imgUrl + ", bizType=" + b.bizType + ", videoUrl=" + b.videoUrl);
        if (!a5) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_info", "imageUrl/videoUrl is empty.");
            tjo.a(tjo.ARG1_RESOURCE_FAIL, b, hashMap);
            return false;
        }
        boolean a6 = this.f18111a.a(b.itemId, b.times);
        stv.a("RulerVerify", "fatigueAvailable result=" + a6);
        if (!a6) {
            return false;
        }
        boolean a7 = this.b.f().a();
        stv.a("RulerVerify", "isResourceReady result=" + a7);
        if (!a7) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error_info", "animationLottie/interactImage/gestureImage is empty.");
            tjo.a(tjo.ARG1_RESOURCE_FAIL, b, hashMap2);
            return false;
        }
        tje tjeVar = this.c.get(b.getDataType());
        if (tjeVar == null) {
            return true;
        }
        boolean a8 = tjeVar.a(this.b, i);
        stv.a("RulerVerify", "bizRuleAvailable result=" + a8);
        return a8;
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("from");
        String string2 = jSONObject.getString("bizType");
        String string3 = jSONObject.getString("itemId");
        stv.a("RulerVerify", "from=" + string + ", bizType=" + string2 + ", itemId=" + string3);
        return StringUtils.equals(string, "commercialAd") && (StringUtils.equals(string2, "commercialAdNormal") || StringUtils.equals(string2, "commercialAdVideo")) && (StringUtils.isEmpty(string3) ^ true);
    }

    private boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        long b = b();
        return b <= j2 && b >= j;
    }

    private long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : System.currentTimeMillis() + (SDKUtils.getTimeOffset() * 1000);
    }

    private boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        boolean z = !StringUtils.isEmpty(str);
        if (!StringUtils.equals(str2, "commercialAdVideo")) {
            return z;
        }
        return z && !StringUtils.isEmpty(ssf.f(str3));
    }

    public com.taobao.mmad.fatigue.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mmad.fatigue.a) ipChange.ipc$dispatch("ef97fc59", new Object[]{this}) : this.f18111a;
    }
}
