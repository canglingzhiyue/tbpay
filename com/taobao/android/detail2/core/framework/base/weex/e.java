package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.util.HashMap;
import tb.ctu;
import tb.fjp;
import tb.fjt;
import tb.fkr;
import tb.fml;
import tb.hnj;
import tb.ipa;
import tb.kge;
import tb.nlb;

/* loaded from: classes5.dex */
public class e implements fml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(333392251);
        kge.a(-1363116467);
    }

    public void a(c cVar, com.taobao.android.detail2.core.framework.b bVar, g gVar, JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e10577f", new Object[]{this, cVar, bVar, gVar, jSONObject, new Boolean(z), new Boolean(z2)});
        } else if (cVar == null || bVar == null || gVar == null) {
        } else {
            a aVar = null;
            if (ipa.I() && z) {
                aVar = b(bVar, gVar);
            } else if (!cVar.a(gVar.a()) && z) {
                nlb.a("weex_sync_delete_code", "findIdleInstance originWeexUrl:" + gVar.a());
            }
            ctu.a("weex_bindData_bindWeexContainerData");
            cVar.a(gVar.a(), gVar.b, jSONObject, aVar, z2);
            ctu.a();
        }
    }

    private a b(com.taobao.android.detail2.core.framework.b bVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4f1f7ef3", new Object[]{this, bVar, gVar});
        }
        if (bVar == null || gVar == null || bVar.g() == null) {
            return null;
        }
        a aVar = new a();
        MUSDKInstance c = h.c(bVar.g(), gVar.a());
        if (ipa.T()) {
            hnj.a(c);
        }
        fjp.a(bVar.f(), "weexKeepLiveHit", (Object) (c == null ? "false" : "true"));
        a(c, bVar);
        aVar.f11500a = c;
        return aVar;
    }

    private void a(MUSDKInstance mUSDKInstance, com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548844f1", new Object[]{this, mUSDKInstance, bVar});
        } else if (mUSDKInstance == null || bVar == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("isReady", String.valueOf(mUSDKInstance.isUIReady()));
            boolean isUIReady = mUSDKInstance.isUIReady();
            fjp.a("eventProcess", fjp.UMBRELLA_TAG_WEEX_CACHE_HIT_SUCCESS, hashMap);
            fjp.a(bVar.f(), "weexKeepLiveReady", (Object) String.valueOf(isUIReady));
            fjt.a(fjt.TAG_RENDER, "命中预加载实例，是否已预加载好： " + isUIReady);
        }
    }

    @Override // tb.fml
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            if (ipa.I()) {
                if (ipa.bj()) {
                    fjt.a(fjt.TAG_TIP, "skipOutPreloadWeex for async.");
                    return;
                }
                fjt.a(fjt.TAG_TIP, "startOutPreloadWeex for async.");
                h.c();
                return;
            }
            nlb.a("weex_sync_delete_code", "preloadWeex context:" + context.getClass().getSimpleName());
        }
    }

    @Override // tb.fml
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : fkr.p();
    }

    /* loaded from: classes5.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public MUSDKInstance f11500a;

        static {
            kge.a(-709944299);
        }

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            MUSDKInstance mUSDKInstance = this.f11500a;
            if (mUSDKInstance == null) {
                return;
            }
            mUSDKInstance.destroy();
        }
    }
}
