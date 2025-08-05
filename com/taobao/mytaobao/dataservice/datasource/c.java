package com.taobao.mytaobao.dataservice.datasource;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.h;
import com.taobao.mytaobao.homepage.busniess.model.a;
import com.taobao.tao.Globals;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.muh;
import tb.mxk;
import tb.xnv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/mytaobao/dataservice/datasource/MainPageLocalDataSource;", "", "userId", "", "(Ljava/lang/String;)V", "cacheService", "Lcom/taobao/alivfssdk/cache/IAVFSCache;", "snapshotKey", "fetchDefaultData", "fetchSnapshotData", "processMainDataBeforeSaveDisk", "Lcom/alibaba/fastjson/JSONObject;", "data", "saveSnapshotData", "", "dataMerger", "Lcom/taobao/mytaobao/dataservice/utils/DataMerger;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f18370a;
    private final h b;

    static {
        kge.a(-66208956);
    }

    public c(String userId) {
        q.c(userId, "userId");
        this.f18370a = "homeSnp_" + userId;
        com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule("MyTaobaoV2");
        if (cacheForModule == null) {
            q.a();
        }
        com.taobao.alivfssdk.cache.b a2 = cacheForModule.a(getClass().getClassLoader()).a(new com.taobao.alivfssdk.cache.c());
        q.a((Object) a2, "AVFSCacheManager.getInst…Config(AVFSCacheConfig())");
        h a3 = a2.a();
        q.a((Object) a3, "AVFSCacheManager.getInst…))\n            .fileCache");
        this.b = a3;
    }

    public final void a(xnv dataMerger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f3698", new Object[]{this, dataMerger});
            return;
        }
        q.c(dataMerger, "dataMerger");
        JSONObject n = dataMerger.n();
        if (n == null) {
            return;
        }
        JSONObject b = dataMerger.b();
        if (b != null && b.getBooleanValue("openNewService")) {
            muh.a("mtbPageV2", "true");
        } else {
            muh.a("mtbPageV2", "false");
        }
        this.b.a(this.f18370a, (Object) a(n).toJSONString());
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        JSONObject jSONObject8;
        JSONObject jSONObject9;
        JSONObject jSONObject10;
        JSONObject jSONObject11;
        JSONObject jSONObject12;
        JSONObject jSONObject13;
        JSONObject jSONObject14;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject mainData = JSONObject.parseObject(jSONObject.toJSONString());
        JSONObject jSONObject15 = mainData.getJSONObject("data");
        if (jSONObject15 != null && (jSONObject10 = jSONObject15.getJSONObject("hierarchyData")) != null && (jSONObject11 = jSONObject10.getJSONObject("headerModule")) != null && (jSONObject12 = jSONObject11.getJSONObject("fields")) != null && (jSONObject13 = jSONObject12.getJSONObject("benefit")) != null && (jSONObject14 = jSONObject13.getJSONObject("taoBaoTotalSaving")) != null) {
            jSONObject14.remove("amountChanges");
        }
        JSONObject jSONObject16 = mainData.getJSONObject("data");
        if (jSONObject16 != null && (jSONObject5 = jSONObject16.getJSONObject("hierarchyData")) != null && (jSONObject6 = jSONObject5.getJSONObject("benefitModule2024V2")) != null && (jSONObject7 = jSONObject6.getJSONObject("fields")) != null && (jSONObject8 = jSONObject7.getJSONObject("benefit")) != null && (jSONObject9 = jSONObject8.getJSONObject("taoBaoTotalSaving")) != null) {
            jSONObject9.remove("amountChanges");
        }
        JSONObject jSONObject17 = mainData.getJSONObject("data");
        JSONObject jSONObject18 = (jSONObject17 == null || (jSONObject2 = jSONObject17.getJSONObject("hierarchyData")) == null || (jSONObject3 = jSONObject2.getJSONObject("orderModule")) == null || (jSONObject4 = jSONObject3.getJSONObject("fields")) == null) ? null : jSONObject4.getJSONObject("orderInfo");
        if (jSONObject18 != null) {
            JSONObject jSONObject19 = jSONObject18.getJSONObject(a.C0733a.KEY_ORDER_PAY);
            if (jSONObject19 != null) {
                jSONObject19.put("count", (Object) "0");
            }
            JSONObject jSONObject20 = jSONObject18.getJSONObject(a.C0733a.KEY_ORDER_DELIVER);
            if (jSONObject20 != null) {
                jSONObject20.put("count", (Object) "0");
            }
            JSONObject jSONObject21 = jSONObject18.getJSONObject(a.C0733a.KEY_ORDER_RECEIVE);
            if (jSONObject21 != null) {
                jSONObject21.put("count", (Object) "0");
            }
            JSONObject jSONObject22 = jSONObject18.getJSONObject(a.C0733a.KEY_ORDER_RATE);
            if (jSONObject22 != null) {
                jSONObject22.put("count", (Object) "0");
            }
            JSONObject jSONObject23 = jSONObject18.getJSONObject(a.C0733a.KEY_ORDER_REFUND);
            if (jSONObject23 != null) {
                jSONObject23.put("count", (Object) "0");
            }
        }
        q.a((Object) mainData, "mainData");
        return mainData;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : (String) this.b.b(this.f18370a);
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String a2 = mxk.a(Globals.getApplication(), "mytaobao/ultron_mtb_2024_v2.json");
        q.a((Object) a2, "FileUtil.getFromAssets(G…ultron_mtb_2024_v2.json\")");
        return a2;
    }
}
