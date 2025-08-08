package com.taobao.android.fluid.framework.preload.task;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.performance.config.PerfConst;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import com.taobao.weex.common.WXPerformance;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.pil;
import tb.snv;
import tb.son;
import tb.soo;
import tb.sor;
import tb.spz;

/* loaded from: classes5.dex */
public class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean e;
    private boolean f;
    private boolean g;
    private DetailCacheData i;

    static {
        kge.a(-504143156);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
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
            case 1166762432:
                super.a((snv) objArr[0], (String) objArr[1], (Map) objArr[2], (String) objArr[3], (DetailCacheData) objArr[4], (com.taobao.android.fluid.core.a) objArr[5]);
                return null;
            case 1972638560:
                return super.a();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(f fVar, sor sorVar, String str, Map map, String str2, com.taobao.android.fluid.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d4e1db", new Object[]{fVar, sorVar, str, map, str2, aVar});
        } else {
            fVar.a(sorVar, str, map, str2, aVar);
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

    public f(FluidContext fluidContext, Context context, JSONObject jSONObject, soo sooVar) {
        super(fluidContext, context, jSONObject, sooVar);
        this.e = false;
        this.f = true;
        this.g = false;
        this.i = null;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("info");
            if (jSONObject2 != null) {
                this.e = oec.a(jSONObject2.get("isRedPointExpired"), false);
                this.f = oec.a(jSONObject2.get("createPlayer"), true);
                this.g = oec.a(jSONObject2.get("preDownload"), false);
            }
            spz.c("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "NormalPreloadTask isRedPointExpired: " + this.e);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void b(com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4139c2f", new Object[]{this, aVar});
            return;
        }
        spz.c("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "[preloadvideo]NormalPreloadTask execute. isRedPointExpired=" + this.e);
        if (this.e && !son.a(PerfConst.FEATURE_PRELOAD_AFTER_EXPIRED, false)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(e()));
        pil.a(this.b, null, "gg_pickpreload_use_cache");
        long currentTimeMillis = System.currentTimeMillis();
        this.i = com.taobao.android.fluid.framework.preload.cache.b.b().b();
        hashMap.put(WXPerformance.CACHE_TYPE, "none");
        if (this.i != null) {
            hashMap.put(WXPerformance.CACHE_TYPE, "unexposed");
            hashMap.put("isCacheValid", Boolean.valueOf(com.taobao.android.fluid.framework.preload.cache.b.a(this.i)));
            hashMap.put("videoId", this.i.contentId);
        }
        pil.a(this.b, null, "gg_pickpreload_use_cache", hashMap);
        spz.c("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "[preloadvideo][stagecost]useCache. cost=" + (System.currentTimeMillis() - currentTimeMillis) + "; cacheData=" + this.i);
        a(this.i, hashMap, this.g, this.f, aVar);
    }

    @Override // com.taobao.android.fluid.framework.preload.task.a
    public void a(snv snvVar, String str, Map map, String str2, DetailCacheData detailCacheData, com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("458b61c0", new Object[]{this, snvVar, str, map, str2, detailCacheData, aVar});
        } else {
            super.a(snvVar, str, map, str2, detailCacheData, a(str, map, str2, aVar));
        }
    }

    private com.taobao.android.fluid.core.a<sor> a(final String str, final Map map, final String str2, final com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("121a4ba3", new Object[]{this, str, map, str2, aVar}) : new com.taobao.android.fluid.core.a<sor>() { // from class: com.taobao.android.fluid.framework.preload.task.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.fluid.core.a
            public void a(sor sorVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff234182", new Object[]{this, sorVar});
                    return;
                }
                spz.c("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "normalTaskCallBack,videoData:" + sorVar);
                f.a(f.this, sorVar, str, map, str2, aVar);
            }
        };
    }

    private void a(sor sorVar, String str, Map map, String str2, com.taobao.android.fluid.core.a<sor> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe865a95", new Object[]{this, sorVar, str, map, str2, aVar});
            return;
        }
        if (!this.d) {
            if (!a(map)) {
                DetailCacheData b = new DetailCacheData.a().a().b(str).a(str2).d(IDetailCache.SCENE_NAME_ICON_STREAM_PRELOAD_VIDEO).a((JSONObject) map).b();
                spz.c("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "[preloadvideo] NormalTask，onComplete，存detail数据");
                com.taobao.android.fluid.framework.preload.cache.b.b().a(b);
            } else {
                spz.c("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "NormalTask，onComplete，被过滤广告：" + str);
            }
        }
        if (sorVar != null && sorVar.f != null) {
            sorVar.g = this.d;
        }
        DetailCacheData detailCacheData = this.i;
        if (detailCacheData != null && StringUtils.equals(detailCacheData.getSceneName(), IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_UNEXPOSED)) {
            spz.c("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "来自后台存储的未曝光的缓存不为null，设置isFromCache，isExposed");
            sorVar.s = true;
            sorVar.p = false;
        }
        if (aVar == null) {
            return;
        }
        spz.c("PickPreloadController_NormalPreloadTask_PreloadVideoModule", "handleDetailCacheAfterComplete,callBack:" + aVar + ",videoData:" + sorVar);
        aVar.a(sorVar);
    }
}
