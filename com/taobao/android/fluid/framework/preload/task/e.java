package com.taobao.android.fluid.framework.preload.task;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import com.taobao.weex.common.WXPerformance;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pil;
import tb.snv;
import tb.soo;
import tb.sor;
import tb.spz;

/* loaded from: classes5.dex */
public class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean e;

    static {
        kge.a(-468169724);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1959610954:
                super.a((sor) objArr[0], (com.taobao.android.fluid.core.a) objArr[1]);
                return null;
            case -1950985330:
                super.a((String) objArr[0], objArr[1]);
                return null;
            case 40303500:
                return new Boolean(super.a((JSONObject) objArr[0]));
            case 152292832:
                return super.d();
            case 381435815:
                return super.b();
            case 1972638560:
                return super.a();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a
    public /* bridge */ /* synthetic */ void a(String str, Object obj) {
        super.a(str, obj);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ void a(sor sorVar, com.taobao.android.fluid.core.a aVar) {
        super.a(sorVar, aVar);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ boolean a(JSONObject jSONObject) {
        return super.a(jSONObject);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ sor b() {
        return super.b();
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a, com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public /* bridge */ /* synthetic */ Map d() {
        return super.d();
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public e(FluidContext fluidContext, Context context, JSONObject jSONObject, soo sooVar) {
        super(fluidContext, context, jSONObject, sooVar);
        this.e = true;
        spz.c("PickPreloadController_InactivePreloadCacheTas", "PickPreloadControllerNew,InactivePreloadCacheTask 初始化");
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a
    public void a(snv snvVar, String str, Map map, String str2, DetailCacheData detailCacheData, com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458b61c0", new Object[]{this, snvVar, str, map, str2, detailCacheData, aVar});
            return;
        }
        spz.c("PickPreloadController_InactivePreloadCacheTas", "[preloadvideo]低活人群请求detail，onComplete，fromCache：" + this.d);
        if (this.d) {
            return;
        }
        if (!a(map)) {
            DetailCacheData b = new DetailCacheData.a().a().b(str).a(str2).d(IDetailCache.SCENE_NAME_ICON_STREAM_PRELOAD_VIDEO).a((JSONObject) map).b();
            spz.c("PickPreloadController_InactivePreloadCacheTas", "低活人群请求detail，onComplete，存detail数据");
            com.taobao.android.fluid.framework.preload.cache.b.b().a(b);
            return;
        }
        spz.c("PickPreloadController_InactivePreloadCacheTas", "低活人群请求detail，onComplete，被过滤广告：" + str);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void b(com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4139c2f", new Object[]{this, aVar});
            return;
        }
        spz.c("PickPreloadController_InactivePreloadCacheTas", "[preloadvideo] InactivePreloadCacheTask execute. preDownload=" + this.e);
        pil.a(this.b, null, "gg_pickpreload_use_cache");
        long currentTimeMillis = System.currentTimeMillis();
        DetailCacheData b = com.taobao.android.fluid.framework.preload.cache.b.b().b();
        HashMap hashMap = new HashMap();
        hashMap.put(WXPerformance.CACHE_TYPE, "none");
        if (b != null) {
            hashMap.put(WXPerformance.CACHE_TYPE, "unexposed");
            hashMap.put("isCacheValid", Boolean.valueOf(com.taobao.android.fluid.framework.preload.cache.b.a(b)));
            hashMap.put("videoId", b.contentId);
        }
        pil.a(this.b, null, "gg_pickpreload_use_cache", hashMap);
        spz.c("PickPreloadController_InactivePreloadCacheTas", "[preloadvideo][stagecost]useCache. cost=" + (System.currentTimeMillis() - currentTimeMillis) + "; execute. cacheData=" + b);
        a(b, (Map) hashMap, this.e, false, aVar);
    }
}
