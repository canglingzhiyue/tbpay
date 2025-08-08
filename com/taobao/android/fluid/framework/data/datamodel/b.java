package com.taobao.android.fluid.framework.data.datamodel;

import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.f;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.gwe;
import tb.jcs;
import tb.jcu;
import tb.kge;
import tb.obz;
import tb.sij;
import tb.sjt;
import tb.skk;
import tb.skl;
import tb.sll;
import tb.slu;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f12532a;
    private final JSONObject b;

    static {
        kge.a(-182272714);
    }

    private b(sps spsVar) {
        Map<String, String> c = spsVar.c();
        JSONObject a2 = obz.a(spsVar.v);
        a2 = a2 == null ? new JSONObject() : a2;
        if (c != null) {
            a2.putAll(c);
        }
        a2.put("page", (Object) spsVar.c);
        if (!StringUtils.isEmpty(spsVar.J)) {
            a2.put(aw.PARAM_UT_PARAMS, (Object) spsVar.J);
        }
        a2.put("tbvs_version", (Object) 31);
        if (spsVar.b() != null) {
            a2.putAll(spsVar.b());
        }
        a2.put(FluidSDK.FLUID_SDK_FLAG, (Object) "1");
        a2.put(f.FLUID_SDK_REMOTE_VERSION, (Object) f.FLUID_SDK_REMOTE_VERSION_VALUE);
        this.b = a2;
    }

    public static b a(sps spsVar, skl sklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("df3b21d9", new Object[]{spsVar, sklVar});
        }
        b bVar = new b(spsVar);
        if (sklVar != null) {
            bVar.e(sklVar.c());
        }
        return bVar;
    }

    public b a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("285d6238", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        this.b.put(com.taobao.android.gateway.util.b.KEY_ACTION_PARAM, (Object) map);
        return this;
    }

    public b a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ab11c0b6", new Object[]{this, new Integer(i)});
        }
        try {
            this.b.put(c.COLLECTION_ORDER, (Object) Integer.valueOf(i));
        } catch (Throwable unused) {
        }
        return this;
    }

    public b b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("aaa81717", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        this.b.put(c.KEY_CONTENT_PASSPARAMS, (Object) map);
        return this;
    }

    public b a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("70e78335", new Object[]{this, fluidContext});
        }
        try {
            this.b.put(c.KEY_TAB3COMPONENTSOURCE, (Object) fluidContext.getInstanceConfig().getTab3ComponentSource());
        } catch (Throwable unused) {
        }
        return this;
    }

    public b c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2cf2cbf6", new Object[]{this, map});
        }
        if (map != null) {
            this.b.putAll(map);
        }
        return this;
    }

    public b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7520bd03", new Object[]{this});
        }
        try {
            if (jcs.a()) {
                String a2 = sll.a();
                spz.c("RecommendParams", "cflog bxFeatures " + a2);
                if (!StringUtils.isEmpty(a2)) {
                    this.b.put("bxFeature", (Object) a2);
                }
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    public b d(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("af3d80d5", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        this.b.put("edgeComputeParam", (Object) map);
        return this;
    }

    public b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9ab4c604", new Object[]{this});
        }
        try {
            if (skk.e()) {
                this.b.put(c.KEY_ENABLE_SERVER_ABR, (Object) true);
            }
        } catch (Exception unused) {
        }
        return this;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b.toJSONString();
    }

    public b a(LruCache<String, jcu> lruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("51ee1eb4", new Object[]{this, lruCache});
        }
        if (lruCache == null) {
            return this;
        }
        ArrayList arrayList = new ArrayList(lruCache.snapshot().values());
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", ((jcu) arrayList.get(i)).c());
            hashMap.put(AdvertisementOption.PRIORITY_VALID_TIME, String.valueOf(Long.parseLong(((jcu) arrayList.get(i)).e()) / 1000));
            hashMap.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, String.valueOf(Long.parseLong(((jcu) arrayList.get(i)).g()) / 1000));
            arrayList2.add(hashMap);
        }
        if (arrayList2.size() != 0) {
            this.b.put("feedBackList", (Object) arrayList2);
        }
        return this;
    }

    public b b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c9f2ceb6", new Object[]{this, fluidContext});
        }
        this.b.put("forceWeex", (Object) Boolean.valueOf(((IInteractionService) fluidContext.getService(IInteractionService.class)).getConfig().m()));
        return this;
    }

    public b d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e5dcd806", new Object[]{this});
        }
        try {
            if (jcs.f()) {
                String b = sll.b();
                spz.c("RecommendParams", "cflog ggBxFeatures " + b);
                if (!StringUtils.isEmpty(b)) {
                    this.b.put("bxFeature", (Object) b);
                }
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    public b e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b70e107", new Object[]{this});
        }
        try {
            this.b.put(c.KEY_LBS_DATA, (Object) obz.a(gwe.a()));
        } catch (Throwable unused) {
        }
        return this;
    }

    public b e(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("318835b4", new Object[]{this, map});
        }
        if (map != null) {
            this.b.put("module", (Object) map);
        }
        return this;
    }

    public b h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7c2cfc0a", new Object[]{this});
        }
        this.b.put(c.KEY_VERTICAL_LAYOUT, (Object) Boolean.valueOf(sjt.u()));
        return this;
    }

    public b f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3104ea08", new Object[]{this});
        }
        try {
            int a2 = com.taobao.taobaoavsdk.util.f.a();
            spz.c("mtop", "request recommend buildExtendParameters netSpeedValue=" + a2);
            this.b.put(c.KEY_NETWORK_SPEED, (Object) Integer.valueOf(a2));
        } catch (Exception unused) {
        }
        return this;
    }

    public b c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("22fe1a37", new Object[]{this, fluidContext});
        }
        try {
            String detailRequestRefreshType = ((IDataService) fluidContext.getService(IDataService.class)).getDetailRequestRefreshType();
            if (detailRequestRefreshType != null) {
                this.b.put(c.KEY_REFRESH_TYPE, (Object) detailRequestRefreshType);
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    public b a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("69ab6a07", new Object[]{this, new Boolean(z)});
        }
        this.b.put("slideAction", (Object) (z ? "up" : "down"));
        return this;
    }

    public b g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5698f309", new Object[]{this});
        }
        this.b.put(com.taobao.android.shop.features.category.b.REQ_SUPPORTWEEX, (Object) true);
        return this;
    }

    public b d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7c0965b8", new Object[]{this, fluidContext});
        }
        IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
        if (iDataService != null && iDataService.getConfig() != null && iDataService.getConfig().j() != null) {
            z = sij.a(iDataService.getConfig().j().q);
        }
        this.b.put(c.KEY_ISAUTOSLIDE, (Object) Boolean.valueOf(z));
        return this;
    }

    public b f(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b3d2ea93", new Object[]{this, map});
        }
        if (map != null) {
            this.b.putAll(map);
        }
        return this;
    }

    public b a(slu sluVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e063f6b7", new Object[]{this, sluVar});
        }
        if (sluVar != null && !sluVar.c()) {
            this.b.put("negFeedback", (Object) sluVar.b());
        }
        return this;
    }
}
