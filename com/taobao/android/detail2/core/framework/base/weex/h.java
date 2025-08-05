package com.taobao.android.detail2.core.framework.base.weex;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.q;
import com.taobao.android.weex.s;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.utils.Global;
import tb.ctu;
import tb.fhi;
import tb.fjt;
import tb.fky;
import tb.idk;
import tb.ipa;
import tb.jvb;
import tb.kge;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ND_CLIENT_ALIGN_PREF_HOME_URL = "ndClientAlignPrefHomeUrl";
    public static final String ND_SERVER_FORCE_ALIGN_PREF_HOME_URL = "ndServerAlignPrefHomeUrl";

    /* renamed from: a  reason: collision with root package name */
    private static volatile String f11504a;
    private static volatile s.a b;
    private static volatile int c;

    static {
        kge.a(2054954929);
        b = null;
        f11504a = null;
        c = 0;
    }

    public static MUSDKInstance c(Context context, String str) {
        jvb jvbVar;
        s.a aVar;
        s.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("aa12b78e", new Object[]{context, str});
        }
        synchronized (h.class) {
            jvbVar = null;
            if (str != null) {
                if (str.equals(f11504a)) {
                    s.a aVar3 = b;
                    fjt.a("WeexAsyncPreLoadUtil", "getMus-musReuse url: " + f11504a);
                    aVar = aVar3;
                    aVar2 = null;
                    b = null;
                    f11504a = null;
                }
            }
            fjt.a("WeexAsyncPreLoadUtil", "getMus-DestroyPreResult url: " + f11504a);
            aVar2 = b;
            aVar = null;
            b = null;
            f11504a = null;
        }
        if (aVar2 != null) {
            aVar2.a();
        }
        if (aVar != null && (context instanceof Activity)) {
            long currentTimeMillis = System.currentTimeMillis();
            WeexInstance a2 = aVar.a((Activity) context);
            fjt.a("WeexAsyncPreLoadUtil", "TikTest result.accept DurationTIme : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            if (a2 == null) {
                return null;
            }
            jvbVar = ((WeexInstanceImpl) a2).getAdapterMUSInstance();
            if (jvbVar == null) {
                fjt.a("WeexAsyncPreLoadUtil", "TikTest getMusInstance getAdapterMUSInstance return null");
            }
        }
        if (jvbVar == null) {
            fjt.a("WeexAsyncPreLoadUtil", "TikTest getMusInstance not find musInstance");
        }
        return jvbVar;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            Coordinator.execute(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.base.weex.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "preloadWeexV2FromCache";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        h.d();
                    }
                }
            });
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (ipa.bi()) {
            fjt.a("WeexAsyncPreLoadUtil", "命中 PreWeexSkip , abort preload .");
        } else if (b != null) {
            fjt.a("WeexAsyncPreLoadUtil", "TikTest preloadWeexV2FromCache 取消执行。因为已经存在一个 sMusResult 。");
        } else {
            fjt.a("WeexAsyncPreLoadUtil", "TikTest preloadWeexV2FromCache 执行中。");
            Application application = Global.getApplication();
            String a2 = fky.a(application, fky.a(application));
            if (TextUtils.isEmpty(a2)) {
                fjt.a("WeexAsyncPreLoadUtil", "TikTest mainPicUrl is empty.");
                return;
            }
            fjt.a("WeexAsyncPreLoadUtil", "TikTest start preloadWeexV2Internal , mainPicUrl = " + a2);
            b(application, a2);
            if (!ipa.g()) {
                return;
            }
            idk.a(a2, (Runnable) null);
        }
    }

    private static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        com.taobao.android.weex.config.b bVar = new com.taobao.android.weex.config.b();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.a(true);
        weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
        bVar.a(weexUnicornConfig);
        q b2 = com.taobao.android.weex.e.b(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
        com.taobao.android.detail2.core.framework.data.model.c g = fky.g(context);
        b2.a(g.c, g.b);
        b2.a(str);
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append("async-pre-");
        int i = c;
        c = i + 1;
        sb.append(i);
        String sb2 = sb.toString();
        if (ipa.V()) {
            jSONObject.put("ndWeexInitType", (Object) sb2);
        }
        jSONObject.put("instanceCache", (Object) "true");
        if (!ipa.ae()) {
            fjt.a(fjt.TAG_TIP, "Native-ndWeexInitType:" + sb2);
        }
        b2.a(com.taobao.android.weex.e.b().a(jSONObject));
        fjt.a("WeexAsyncPreLoadUtil", "TikTest onInstanceCreatedInMain , result create , url = " + str);
        a(b2.a(), str);
    }

    public static s.a a(Context context, String str) {
        s.a aVar;
        s.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s.a) ipChange.ipc$dispatch("355b9fc6", new Object[]{context, str});
        }
        try {
            ctu.a("directPreloadWeexV2Internal");
            synchronized (h.class) {
                if (str != null && str.equals(f11504a)) {
                    aVar2 = b;
                    aVar = null;
                    b = null;
                    f11504a = null;
                }
                fjt.a("WeexAsyncPreLoadUtil", "directPreload-DestroyPreResult url: " + f11504a);
                aVar = b;
                aVar2 = null;
                b = null;
                f11504a = null;
            }
            if (aVar != null) {
                aVar.a();
            }
            if (aVar2 != null) {
                return aVar2;
            }
            com.taobao.android.weex.config.b bVar = new com.taobao.android.weex.config.b();
            WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
            weexUnicornConfig.a(true);
            weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
            bVar.a(weexUnicornConfig);
            q b2 = com.taobao.android.weex.e.b(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
            com.taobao.android.detail2.core.framework.data.model.c g = fky.g(context);
            b2.a(g.c, g.b);
            b2.a(str);
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append("async-direct-");
            int i = c;
            c = i + 1;
            sb.append(i);
            String sb2 = sb.toString();
            if (ipa.V()) {
                jSONObject.put("ndWeexInitType", (Object) sb2);
            }
            if (!ipa.ae()) {
                fjt.a(fjt.TAG_TIP, "Native-ndWeexInitType:" + sb2);
            }
            b2.a(com.taobao.android.weex.e.b().a(jSONObject));
            return b2.a();
        } finally {
            ctu.a();
        }
    }

    public static void a(Context context, String str, s sVar, JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e760f651", new Object[]{context, str, sVar, jSONObject, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.android.weex.config.b bVar = new com.taobao.android.weex.config.b();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.a(true);
        weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
        bVar.a(weexUnicornConfig);
        q b2 = com.taobao.android.weex.e.b(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
        if (i > 0 && i2 > 0 && !ipa.bg()) {
            fjt.a("WeexAsyncPreLoadUtil", "WeexUseContainerSize: containerViewWidth:" + i + " containerViewHeight:" + i2);
        } else if (i2 > 0) {
            com.taobao.android.detail2.core.framework.data.model.c g = fky.g(context);
            i = g.c;
            fjt.a("WeexAsyncPreLoadUtil", "WeexUseContainerSize: model.mWidth:" + g.c + " containerViewHeight:" + i2);
        } else {
            com.taobao.android.detail2.core.framework.data.model.c g2 = fky.g(context);
            i = g2.c;
            i2 = g2.b;
        }
        b2.a(i, i2);
        b2.a(str);
        JSONObject jSONObject2 = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append("async-cb-");
        int i3 = c;
        c = i3 + 1;
        sb.append(i3);
        String sb2 = sb.toString();
        if (ipa.V()) {
            jSONObject2.put("ndWeexInitType", (Object) sb2);
        }
        if (!ipa.ae()) {
            fjt.a(fjt.TAG_TIP, "Native-ndWeexInitType:" + sb2);
        }
        if (jSONObject != null) {
            if (ipa.b()) {
                fjt.a(fjt.TAG_TIP, "prePutRenderDataAbort: onAsyncCbWeex skip put renderData");
            } else {
                jSONObject2.putAll(jSONObject);
            }
        }
        b2.a(com.taobao.android.weex.e.b().a(jSONObject2));
        b2.a(sVar);
    }

    public static void a(s.a aVar, String str) {
        s.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b799644e", new Object[]{aVar, str});
            return;
        }
        synchronized (h.class) {
            aVar2 = b;
            b = aVar;
            f11504a = str;
        }
        if (aVar2 == null) {
            return;
        }
        aVar2.a();
    }

    public static boolean a(JSONObject jSONObject, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16f4b5", new Object[]{jSONObject, fhiVar})).booleanValue();
        }
        if (jSONObject != null && jSONObject.containsKey(ND_SERVER_FORCE_ALIGN_PREF_HOME_URL)) {
            if ("true".equals(jSONObject.get(ND_SERVER_FORCE_ALIGN_PREF_HOME_URL))) {
                return true;
            }
            fjt.a(fjt.TAG_TIP, "ServerAutoAlignWeexUrl，瞬开接口没有支持 prefhome 地址，二跳时接口也不支持。");
            return false;
        } else if (jSONObject != null && jSONObject.containsKey(ND_CLIENT_ALIGN_PREF_HOME_URL)) {
            if ("true".equals(jSONObject.get(ND_CLIENT_ALIGN_PREF_HOME_URL))) {
                return true;
            }
            fjt.a(fjt.TAG_TIP, "ClientAutoAlignWeexUrl，瞬开接口没有支持 prefhome 地址，二跳时接口也不支持。");
            return false;
        } else if (fhiVar != null) {
            return a(fhiVar);
        } else if (ipa.s()) {
            fjt.a(fjt.TAG_TIP, "AutoAlignWeexUrl ,  node is null , hitServerWeexUrl true. ");
            return true;
        } else {
            fjt.a(fjt.TAG_TIP, "AutoAlignWeexUrl ,  node is null , hitServerWeexUrl false. ");
            return false;
        }
    }

    public static boolean a(fhi fhiVar) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e88d8595", new Object[]{fhiVar})).booleanValue();
        }
        if (fhiVar == null || fhiVar.s == null || fhiVar.s.containerInfo == null || (a2 = fhiVar.s.containerInfo.a()) == null) {
            return false;
        }
        return a2.contains("/newdetail/newflow/prefhome") || a2.contains("/newdetail/newguide/home");
    }
}
