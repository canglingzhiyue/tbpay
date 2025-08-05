package com.taobao.tbpoplayer.nativerender;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.track.UserResultTrack;
import com.alibaba.poplayer.track.module.ActionLineModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.tbpoplayer.nativerender.c;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.ListenEventModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.e;
import com.taobao.tbpoplayer.nativerender.h;
import com.taobao.tbpoplayer.view.PopLayerWVPlugin;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.alr;
import tb.alu;
import tb.caa;
import tb.cab;
import tb.kge;
import tb.qnu;
import tb.qnv;
import tb.qnw;

/* loaded from: classes8.dex */
public class h implements e.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CUR_ENGINE_VERSION = "4.9.5";

    /* renamed from: a */
    private final e f22224a;
    private final Handler c;
    private final com.alibaba.poplayer.trigger.d d;
    private final a g;
    private OnScreenChangedListener q;
    private boolean h = false;
    private String i = "";
    private String j = "";
    private String k = "";
    private Boolean l = null;
    private long m = 0;
    private volatile boolean n = false;
    private final AtomicInteger o = new AtomicInteger(0);
    private final AtomicInteger p = new AtomicInteger(0);
    private final m b = new m(this);
    private final n f = new n(this);
    private final c e = new c();

    /* loaded from: classes8.dex */
    public interface a {
        void a(Rect rect);

        void a(View view);

        void a(String str, String str2);

        void a(String str, String str2, String str3);

        void b(View view);

        void c(View view);
    }

    static {
        kge.a(-296811864);
        kge.a(-1213528176);
    }

    public static /* synthetic */ void lambda$BEsfKuZV2HGENtem1OW46TngSRM(h hVar) {
        hVar.I();
    }

    public static /* synthetic */ void lambda$JCVF8GPTgjmheEa0kr3r_GUKFTM(h hVar, String str, String str2) {
        hVar.d(str, str2);
    }

    public static /* synthetic */ void lambda$LQS31h5GBgsY5MdAW6_RbCEp4EU(h hVar, com.alibaba.poplayer.utils.i iVar, int i, Configuration configuration) {
        hVar.a(iVar, i, configuration);
    }

    /* renamed from: lambda$M-aXalqGr_uO7wvUkrbCkUOtimQ */
    public static /* synthetic */ void m1445lambda$MaXalqGr_uO7wvUkrbCkUOtimQ(h hVar, boolean z, String str, String str2, boolean z2) {
        hVar.a(z, str, str2, z2);
    }

    public static /* synthetic */ void lambda$NJ4Fn1FqOpP7xSziYR3CVm1U_ec(h hVar) {
        hVar.H();
    }

    public static /* synthetic */ void lambda$VFqI49tDHimtF4hfOzBJLtK75CM(h hVar) {
        hVar.G();
    }

    /* renamed from: lambda$VN-jSV_VKQs6HKKsMrOGVsGwTY8 */
    public static /* synthetic */ void m1446lambda$VNjSV_VKQs6HKKsMrOGVsGwTY8(h hVar, j jVar, boolean z, String str, String str2) {
        hVar.a(jVar, z, str, str2);
    }

    /* renamed from: lambda$X-0bIBsaRyjdQRTUGGgoZe5CYYo */
    public static /* synthetic */ void m1447lambda$X0bIBsaRyjdQRTUGGgoZe5CYYo(h hVar) {
        hVar.F();
    }

    /* renamed from: lambda$Zu2-s9lygJv3OBoQjiLKLilxSqc */
    public static /* synthetic */ void m1448lambda$Zu2s9lygJv3OBoQjiLKLilxSqc(h hVar) {
        hVar.A();
    }

    /* renamed from: lambda$bYQqmykknJRKf-edetjd-yiXZRk */
    public static /* synthetic */ void m1449lambda$bYQqmykknJRKfedetjdyiXZRk(h hVar) {
        hVar.D();
    }

    /* renamed from: lambda$lZRcZxIDD6VGYA5lQtnZlA34-2E */
    public static /* synthetic */ void m1450lambda$lZRcZxIDD6VGYA5lQtnZlA342E(h hVar) {
        hVar.B();
    }

    /* renamed from: lambda$x5-k_iohAhUG0FRmDpMcM9TnihM */
    public static /* synthetic */ void m1451lambda$x5k_iohAhUG0FRmDpMcM9TnihM(h hVar) {
        hVar.E();
    }

    public static /* synthetic */ void lambda$yhf0NCsBLOzRrCDK0N289T9CC2M(h hVar) {
        hVar.C();
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public static /* synthetic */ e a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("83cadab1", new Object[]{hVar}) : hVar.f22224a;
    }

    public static /* synthetic */ com.alibaba.poplayer.trigger.d b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.poplayer.trigger.d) ipChange.ipc$dispatch("a397d262", new Object[]{hVar}) : hVar.d;
    }

    public static /* synthetic */ m c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("3fb1a767", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ void d(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b39bd06", new Object[]{hVar});
        } else {
            hVar.w();
        }
    }

    public h(com.alibaba.poplayer.trigger.d dVar, Handler handler, a aVar) {
        this.d = dVar;
        this.c = handler;
        this.g = aVar;
        this.f22224a = new e(PopLayer.getReference().getApp(), handler, 0, this);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.h;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.j;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.k;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : l() != null && l().isDisplaying();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.f22224a.a().g() || (l() != null && l().isClosed());
    }

    public com.alibaba.poplayer.trigger.d k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.poplayer.trigger.d) ipChange.ipc$dispatch("20a1dcb4", new Object[]{this}) : this.d;
    }

    public PopLayerBaseView l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopLayerBaseView) ipChange.ipc$dispatch("d5b87627", new Object[]{this}) : (PopLayerBaseView) this.d.g();
    }

    public e m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("6e222fa0", new Object[]{this}) : this.f22224a;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        JSONObject f = this.f22224a.a().f();
        try {
            f.put(ConstantsAPI.Token.WX_LAUNCH_PARAM_KEY, (Object) JSON.parseObject(this.d.B()));
        } catch (Throwable unused) {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.parseLaunchParam.error.", new Object[0]);
        }
        try {
            f.put("preCheck", (Object) new JSONObject(this.d.k()));
        } catch (Throwable unused2) {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.parsePreCheck.error.", new Object[0]);
        }
        try {
            Uri parse = Uri.parse(this.d.B());
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            JSONObject jSONObject = new JSONObject();
            for (String str : queryParameterNames) {
                jSONObject.put(str, (Object) parse.getQueryParameter(str));
            }
            f.put("launchParamQuery", (Object) jSONObject);
        } catch (Throwable unused3) {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.parseLaunchParamQuery.error.", new Object[0]);
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : Boolean.TRUE.equals(this.l);
    }

    public String a(com.alibaba.poplayer.trigger.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f50b17e8", new Object[]{this, dVar});
        }
        if (dVar == null) {
            return "INIT_ERROR_REQUEST_NULL";
        }
        BaseConfigItem x = dVar.x();
        if (x == null) {
            return "INIT_ERROR_CONFIG_NULL";
        }
        d a2 = this.f22224a.a();
        a2.c(dVar.z());
        a2.e(dVar.d());
        a2.f(dVar.y().getTraceInfo());
        a2.d(dVar.t().c);
        Context a3 = a2.a();
        JSONObject parseObject = JSONObject.parseObject(x.params);
        String string = parseObject.getString("cdnUrl");
        String string2 = parseObject.getString("url");
        String string3 = parseObject.getString("cdnId");
        String string4 = parseObject.getString("pageId");
        this.i = string2;
        a2.a(string2);
        HashMap hashMap = new HashMap();
        hashMap.put("WVPopLayer", new PopLayerWVPlugin(l()));
        this.f22224a.a(new qnw(new qnv(a3, l(), hashMap, string2)));
        if (!TextUtils.isEmpty(string)) {
            this.j = string;
            this.h = true;
        } else {
            if (TextUtils.isEmpty(string3)) {
                string3 = com.taobao.tbpoplayer.util.e.a(string2, "cdnId");
            }
            if (!TextUtils.isEmpty(string3)) {
                this.j = "https://poplayer.template.alibaba.com/" + string3 + ".json";
                this.h = true;
            } else {
                if (TextUtils.isEmpty(string4)) {
                    string4 = com.taobao.tbpoplayer.util.e.a(string2, "pageId");
                }
                this.h = false;
                if (TextUtils.isEmpty(string4)) {
                    return "INIT_ERROR_PAGE_ID_NULL";
                }
                this.k = string4;
            }
        }
        if (!com.taobao.tbpoplayer.info.a.a().R()) {
            return "";
        }
        boolean b = com.taobao.android.autosize.h.a().b(a3);
        final com.alibaba.poplayer.utils.i l = this.f22224a.l();
        com.alibaba.poplayer.utils.c.a("setPortraitMode.isPortraitLayout=%s", Boolean.valueOf(b));
        if (!com.taobao.tbpoplayer.util.e.b(a3) && !com.taobao.tbpoplayer.util.e.a(a3)) {
            return "";
        }
        this.q = new OnScreenChangedListener() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$LQS31h5GBgsY5MdAW6_RbCEp4EU
            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public final void onScreenChanged(int i, Configuration configuration) {
                h.lambda$LQS31h5GBgsY5MdAW6_RbCEp4EU(h.this, l, i, configuration);
            }
        };
        com.taobao.android.autosize.h.a().c(this.q);
        return "";
    }

    public /* synthetic */ void a(com.alibaba.poplayer.utils.i iVar, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4829087", new Object[]{this, iVar, new Integer(i), configuration});
            return;
        }
        boolean z = 1 == i;
        try {
            if (!iVar.a(z)) {
                return;
            }
            com.alibaba.poplayer.utils.c.a("OnScreenChanged.changeType=%s.curPortraitMode=%s", Integer.valueOf(i), Boolean.valueOf(z));
            y();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("OnScreenChanged.OnScreenChangedListener.error", th);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (this.g == null) {
        } else {
            this.f22224a.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$BEsfKuZV2HGENtem1OW46TngSRM
                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.lambda$BEsfKuZV2HGENtem1OW46TngSRM(h.this);
                }
            });
        }
    }

    public /* synthetic */ void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        try {
            n();
            String a2 = a(this.d);
            if (!TextUtils.isEmpty(a2)) {
                this.f22224a.a("EnvInitFailed", a2, "");
                return;
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.e.a(this, new c.a() { // from class: com.taobao.tbpoplayer.nativerender.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    h.this = this;
                }

                @Override // com.taobao.tbpoplayer.nativerender.c.a
                public void a(DSLModel dSLModel) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("733aa727", new Object[]{this, dSLModel});
                        return;
                    }
                    h.b(h.this).t().J = String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
                    caa.a(0, "track", h.b(h.this), "PopDSLFetched", "");
                    h.a(h.this).a().a(dSLModel);
                    h.d(h.this);
                }

                @Override // com.taobao.tbpoplayer.nativerender.c.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        h.a(h.this).a("FetchDSLFailed", str);
                    }
                }
            });
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.start.error.", th);
            this.f22224a.a("EngineStartFailed", "");
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.alibaba.poplayer.utils.c.a("NativePopEngine.setFirstStateResCount.start.count=%s", Integer.valueOf(i));
        this.o.set(i);
        this.p.set(i);
        com.alibaba.poplayer.utils.c.a("NativePopEngine.setFirstStateResCount.done.count=%s", Integer.valueOf(i));
    }

    public void c(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else {
            this.f22224a.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$JCVF8GPTgjmheEa0kr3r_GUKFTM
                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.lambda$JCVF8GPTgjmheEa0kr3r_GUKFTM(h.this, str, str2);
                }
            });
        }
    }

    public /* synthetic */ void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        try {
            this.b.a(str, JSON.parseObject(str2));
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.onReceiveEvent.error.", th);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            this.b.b();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else {
            this.b.c();
        }
    }

    public JSONObject s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d26c569a", new Object[]{this}) : this.f22224a.k();
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str, str2, "");
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else if (j()) {
        } else {
            this.f22224a.a().a(true);
            DSLModel e = this.f22224a.a().e();
            if (TextUtils.isEmpty(str3)) {
                str3 = (e == null || TextUtils.isEmpty(e.defaultToastText)) ? "活动太火爆啦 弹窗一时没加载出来" : e.defaultToastText;
            }
            this.g.a(str, str2, str3);
            z();
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.c.post(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$NJ4Fn1FqOpP7xSziYR3CVm1U_ec
                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.lambda$NJ4Fn1FqOpP7xSziYR3CVm1U_ec(h.this);
                }
            });
        }
    }

    public /* synthetic */ void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        try {
            l().show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.c.post(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$VFqI49tDHimtF4hfOzBJLtK75CM
                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.lambda$VFqI49tDHimtF4hfOzBJLtK75CM(h.this);
                }
            });
        }
    }

    public /* synthetic */ void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        try {
            l().hide();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(final String str, final String str2, final boolean z, final j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae22edf1", new Object[]{this, str, str2, new Boolean(z), jVar});
        } else {
            this.f22224a.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$VN-jSV_VKQs6HKKsMrOGVsGwTY8
                @Override // java.lang.Runnable
                public final void run() {
                    h.m1446lambda$VNjSV_VKQs6HKKsMrOGVsGwTY8(h.this, jVar, z, str, str2);
                }
            });
        }
    }

    public /* synthetic */ void a(j jVar, final boolean z, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cc4107", new Object[]{this, jVar, new Boolean(z), str, str2});
            return;
        }
        try {
            if (l() != null && l().isClosed()) {
                return;
            }
            if (this.f22224a.a().H()) {
                com.alibaba.poplayer.utils.c.a("NativePopEngine.needClose.runBeforeClose.isEnginePreClosing=true.cancel", new Object[0]);
                return;
            }
            this.f22224a.a().c(true);
            a(jVar);
            a(new e.b() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$M-aXalqGr_uO7wvUkrbCkUOtimQ
                @Override // com.taobao.tbpoplayer.nativerender.e.b
                public final void onPreCloseDone(boolean z2) {
                    h.m1445lambda$MaXalqGr_uO7wvUkrbCkUOtimQ(h.this, z, str, str2, z2);
                }
            });
        } catch (Throwable unused) {
            if (this.g != null) {
                this.f22224a.a().a(true);
                this.g.a(str, str2);
            }
            z();
        }
    }

    public /* synthetic */ void a(boolean z, String str, String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a744054", new Object[]{this, new Boolean(z), str, str2, new Boolean(z2)});
        } else if (z && z2) {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.needClose.runBeforeClose.interrupt=%s", Boolean.valueOf(z2));
        } else {
            if (this.g != null) {
                this.f22224a.a().a(true);
                this.g.a(str, str2);
            }
            z();
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb765981", new Object[]{this, jVar});
        } else if (jVar == null) {
        } else {
            try {
                JSONObject jSONObject = k().t().ar;
                JSONArray jSONArray = jSONObject.getJSONArray("actionLine");
                if (jSONArray == null) {
                    jSONArray = new JSONArray();
                    jSONObject.put("actionLine", (Object) jSONArray);
                }
                d a2 = this.f22224a.a();
                if (a2.q()) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                String a3 = jVar.a();
                String str = "";
                if (TextUtils.isEmpty(a3)) {
                    a3 = str;
                }
                jSONObject2.put("id", (Object) a3);
                if (!TextUtils.isEmpty(jVar.b())) {
                    str = jVar.b();
                }
                jSONObject2.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, (Object) str);
                jSONObject2.put("stateIndex", (Object) Integer.valueOf(jVar.c()));
                jSONObject2.put("componentId", (Object) jVar.d());
                jSONObject2.put("type", (Object) jVar.e());
                jSONObject2.put("behavior", (Object) jVar.f());
                jSONObject2.put("exceptionMessage", (Object) jVar.g());
                jSONObject2.put("duration", (Object) Long.valueOf(jVar.h()));
                jSONArray.add(jSONObject2);
                a2.r();
                com.alibaba.poplayer.utils.c.a("syncPageLine.actionComponentId=%s.actionLine=%s.exceptionMessage=%s", jVar.d(), jSONArray, jVar.g());
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("syncPageLine.error.", th);
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a42395", new Object[]{this, componentBaseModel, str, actionModel, list});
        } else {
            k.a(this, componentBaseModel, str, actionModel, list);
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
        } else {
            this.g.a(rect);
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.f22224a.a().h()) {
        } else {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.onCloseBtnLoaded", new Object[0]);
            this.p.decrementAndGet();
            if (o()) {
                this.c.post(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$X-0bIBsaRyjdQRTUGGgoZe5CYYo
                    {
                        h.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        h.m1447lambda$X0bIBsaRyjdQRTUGGgoZe5CYYo(h.this);
                    }
                });
                u();
                return;
            }
            t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0032 A[Catch: Throwable -> 0x003a, TRY_LEAVE, TryCatch #0 {Throwable -> 0x003a, blocks: (B:29:0x0012, B:31:0x0020, B:36:0x002c, B:38:0x0032, B:32:0x0026), top: B:43:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void F() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tbpoplayer.nativerender.h.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r4
            java.lang.String r2 = "3eff1cd"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            com.taobao.tbpoplayer.nativerender.e r0 = r4.f22224a     // Catch: java.lang.Throwable -> L3a
            com.taobao.tbpoplayer.nativerender.d r0 = r0.a()     // Catch: java.lang.Throwable -> L3a
            com.taobao.tbpoplayer.nativerender.dsl.DSLModel r0 = r0.e()     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r0.neverShow     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L26
            com.alibaba.poplayer.trigger.d r0 = r4.d     // Catch: java.lang.Throwable -> L3a
            r0.w()     // Catch: java.lang.Throwable -> L3a
            goto L2b
        L26:
            boolean r0 = r0.countTire     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            com.alibaba.poplayer.factory.view.base.PopLayerBaseView r0 = r4.l()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            com.alibaba.poplayer.factory.view.base.PopLayerBaseView r0 = r4.l()     // Catch: java.lang.Throwable -> L3a
            r0.displayMe(r2)     // Catch: java.lang.Throwable -> L3a
        L39:
            return
        L3a:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.h.F():void");
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f22224a.a().h()) {
        } else {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.onImageLoaded", new Object[0]);
            this.p.decrementAndGet();
            if (o()) {
                u();
            } else {
                t();
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public boolean a(List<String> list, List<String> list2, boolean z, boolean z2) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("633e544e", new Object[]{this, list, list2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            com.alibaba.poplayer.utils.c.a("needSwitchState.noTargetStateIds.return", new Object[0]);
            return false;
        }
        Pair<StateModel, StateVersionModel> b = this.f22224a.b(list, list2, z, z2);
        if (b == null || b.first == null || (a2 = this.b.a((StateModel) b.first, (StateVersionModel) b.second, false, false)) == null) {
            return false;
        }
        this.g.b(a2);
        a2.addOnAttachStateChangeListener(new AnonymousClass2(a2));
        return true;
    }

    /* renamed from: com.taobao.tbpoplayer.nativerender.h$2 */
    /* loaded from: classes8.dex */
    public class AnonymousClass2 implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ View f22226a;

        public static /* synthetic */ void lambda$kHhD1YM93_km9UorHz13rigmHIE(AnonymousClass2 anonymousClass2, d dVar) {
            anonymousClass2.a(dVar);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }

        public AnonymousClass2(View view) {
            h.this = r1;
            this.f22226a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            final d a2 = h.a(h.this).a();
            a2.a(SystemClock.elapsedRealtime());
            h.a(h.this).b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$2$kHhD1YM93_km9UorHz13rigmHIE
                @Override // java.lang.Runnable
                public final void run() {
                    h.AnonymousClass2.lambda$kHhD1YM93_km9UorHz13rigmHIE(h.AnonymousClass2.this, a2);
                }
            });
            this.f22226a.removeOnAttachStateChangeListener(this);
            UserResultTrack.a(h.b(h.this), "ExposeState", false, h.this.s());
            cab.a(a2.C(), a2.D(), a2.E(), a2.G(), new ActionLineModule(a2.m(), a2.n(), a2.o()));
        }

        public /* synthetic */ void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb739f47", new Object[]{this, dVar});
                return;
            }
            try {
                h.c(h.this).e();
                StateBaseModel k = dVar.k();
                s.a(h.a(h.this), "expose", true, k.triggerActions);
                s.a(h.a(h.this), "autoCountDown", true, k.triggerActions);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopStateManager.onSwitchState.error", th);
            }
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public View a(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("85c77a10", new Object[]{this, stateModel, stateVersionModel}) : this.b.a(stateModel, stateVersionModel, false, false);
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            return this.b.a(str, str2);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.componentBroadcast.error.", th);
            return false;
        }
    }

    @Override // com.taobao.tbpoplayer.nativerender.e.a
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String str2 = this.f22224a.a().e().spm;
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("spm", str2);
            str = qnu.a(str, hashMap);
        }
        return this.f.a(str);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if ((this.o.get() != 0 && (o() || this.p.get() > 0)) || l().isDisplaying() || j() || !this.n) {
        } else {
            this.f22224a.a(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$bYQqmykknJRKf-edetjd-yiXZRk
                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.m1449lambda$bYQqmykknJRKfedetjdyiXZRk(h.this);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0032 A[Catch: Throwable -> 0x0044, TryCatch #0 {Throwable -> 0x0044, blocks: (B:29:0x0012, B:31:0x0020, B:36:0x002c, B:38:0x0032, B:39:0x0039, B:32:0x0026), top: B:44:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void D() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tbpoplayer.nativerender.h.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r4
            java.lang.String r2 = "3d3c2cb"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            com.taobao.tbpoplayer.nativerender.e r0 = r4.f22224a     // Catch: java.lang.Throwable -> L44
            com.taobao.tbpoplayer.nativerender.d r0 = r0.a()     // Catch: java.lang.Throwable -> L44
            com.taobao.tbpoplayer.nativerender.dsl.DSLModel r0 = r0.e()     // Catch: java.lang.Throwable -> L44
            boolean r1 = r0.neverShow     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L26
            com.alibaba.poplayer.trigger.d r0 = r4.d     // Catch: java.lang.Throwable -> L44
            r0.w()     // Catch: java.lang.Throwable -> L44
            goto L2b
        L26:
            boolean r0 = r0.countTire     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            com.alibaba.poplayer.factory.view.base.PopLayerBaseView r0 = r4.l()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L39
            com.alibaba.poplayer.factory.view.base.PopLayerBaseView r0 = r4.l()     // Catch: java.lang.Throwable -> L44
            r0.displayMe(r2)     // Catch: java.lang.Throwable -> L44
        L39:
            com.taobao.tbpoplayer.nativerender.e r0 = r4.f22224a     // Catch: java.lang.Throwable -> L44
            com.taobao.tbpoplayer.nativerender.-$$Lambda$h$x5-k_iohAhUG0FRmDpMcM9TnihM r1 = new com.taobao.tbpoplayer.nativerender.-$$Lambda$h$x5-k_iohAhUG0FRmDpMcM9TnihM     // Catch: java.lang.Throwable -> L44
            r1.<init>()     // Catch: java.lang.Throwable -> L44
            r0.b(r1)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.h.D():void");
    }

    public /* synthetic */ void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        try {
            v();
            this.b.d();
            q.a(this.f22224a);
            this.f.a(this.f22224a.a().e());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.tryDisplay.runInGlobalThread.error", th);
        }
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (!o() || this.p.get() > 0 || j() || !this.n) {
        } else {
            this.f22224a.b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$yhf0NCsBLOzRrCDK0N289T9CC2M
                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.lambda$yhf0NCsBLOzRrCDK0N289T9CC2M(h.this);
                }
            });
        }
    }

    public /* synthetic */ void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        try {
            v();
            this.b.a();
            UserResultTrack.a(this.d, UserResultTrack.USER_RESULT_EXPOSE_REAL, false, s());
            q.a(this.f22224a);
            this.f.a(this.f22224a.a().e());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("NativePopEngine.tryGradualExpose.error.", th);
        }
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        d a2 = this.f22224a.a();
        a2.b(true);
        com.alibaba.poplayer.trigger.d dVar = this.d;
        if (dVar != null) {
            dVar.t().K = String.valueOf(SystemClock.elapsedRealtime() - this.m);
        }
        a2.a(SystemClock.elapsedRealtime());
        cab.a(a2.C(), a2.D(), a2.E(), a2.G(), new ActionLineModule(a2.m(), a2.n(), a2.o()));
        DSLModel e = a2.e();
        long j = e.autoCloseTime;
        if (j >= 1000) {
            this.c.postDelayed(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$lZRcZxIDD6VGYA5lQtnZlA34-2E
                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.m1450lambda$lZRcZxIDD6VGYA5lQtnZlA342E(h.this);
                }
            }, j);
        }
        s.a(this.f22224a, "expose", false, e.triggerActions);
        s.a(this.f22224a, "autoCountDown", false, e.triggerActions);
        StateBaseModel k = a2.k();
        s.a(this.f22224a, "expose", true, k.triggerActions);
        s.a(this.f22224a, "autoCountDown", true, k.triggerActions);
        a(a2.j(), "expose", (ActionModel) null, e.displayActions);
    }

    public /* synthetic */ void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else {
            this.f22224a.a("AutoClose", "", false, (j) null);
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f22224a.b();
        this.d.t().L = String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
        if (j()) {
            return;
        }
        caa.a(0, "track", this.d, "PopPreRequested", "");
        DSLModel e = this.f22224a.a().e();
        if (!b.a(e.condition, this.f22224a, true)) {
            if (e.conditionFalseNeverShow) {
                this.d.w();
            } else if (e.conditionFalseCountTire) {
                this.d.v();
            }
            this.f22224a.a("DisplayConditionCheckNotPass", "", (String) null);
            return;
        }
        x();
        Pair<StateModel, StateVersionModel> b = this.f22224a.b(null, e.startStates, false, false);
        if (b == null || b.first == null) {
            if (e.conditionFalseNeverShow) {
                this.d.w();
            } else if (e.conditionFalseCountTire) {
                this.d.v();
            }
            this.f22224a.a("GetFirstStateVerFailed", "");
            return;
        }
        this.l = Boolean.valueOf(a(e, (StateBaseModel) (b.second != null ? b.second : b.first)));
        if (j()) {
            return;
        }
        this.m = SystemClock.elapsedRealtime();
        View a2 = this.b.a((StateModel) b.first, (StateVersionModel) b.second, true, false);
        if (a2 == null) {
            this.f22224a.a("InitStateViewError", "");
        } else if (j()) {
        } else {
            this.g.a(a2);
            this.n = true;
            if (o()) {
                u();
            } else {
                t();
            }
            if (i()) {
                return;
            }
            this.c.postDelayed(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$Zu2-s9lygJv3OBoQjiLKLilxSqc
                {
                    h.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.m1448lambda$Zu2s9lygJv3OBoQjiLKLilxSqc(h.this);
                }
            }, 60000L);
        }
    }

    public /* synthetic */ void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        try {
            if (this.p.get() <= 0 || i()) {
                return;
            }
            this.f22224a.a("LoadResOutOfTime", "");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        View a2 = this.b.a(this.f22224a.a().j(), this.f22224a.a().A(), false, true);
        if (a2 == null) {
            this.f22224a.a("reRenderStateViewError", "");
        } else if (j()) {
        } else {
            a2.addOnAttachStateChangeListener(new AnonymousClass3(a2));
            this.g.c(a2);
        }
    }

    /* renamed from: com.taobao.tbpoplayer.nativerender.h$3 */
    /* loaded from: classes8.dex */
    public class AnonymousClass3 implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ View f22227a;

        /* renamed from: lambda$-5JjDK7zOX13-oz-iBX7aF9x4q4 */
        public static /* synthetic */ void m1452lambda$5JjDK7zOX13oziBX7aF9x4q4(AnonymousClass3 anonymousClass3) {
            anonymousClass3.a();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }

        public AnonymousClass3(View view) {
            h.this = r1;
            this.f22227a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            h.a(h.this).b(new Runnable() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$h$3$-5JjDK7zOX13-oz-iBX7aF9x4q4
                {
                    h.AnonymousClass3.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    h.AnonymousClass3.m1452lambda$5JjDK7zOX13oziBX7aF9x4q4(h.AnonymousClass3.this);
                }
            });
            this.f22227a.removeOnAttachStateChangeListener(this);
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                com.alibaba.poplayer.utils.c.a("reRenderStateOnScreenChange.onViewAttachedToWindow.onReRenderState", new Object[0]);
                h.c(h.this).i();
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopStateManager.onSwitchState.error", th);
            }
        }
    }

    private void a(e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad932ea8", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.b.a(bVar);
        }
    }

    private boolean a(DSLModel dSLModel, StateBaseModel stateBaseModel) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b3f1591", new Object[]{this, dSLModel, stateBaseModel})).booleanValue();
        }
        if (!"gradual".equals(dSLModel.displayMode) || !"center".equals(stateBaseModel.layout)) {
            return false;
        }
        if (ABGlobal.isFeatureOpened(PopLayer.getReference().getApp(), "android_poplayer_native_dl_gradual_display") && (list = dSLModel.gradualDeviceLevel) != null && !list.isEmpty()) {
            String a2 = com.taobao.tbpoplayer.util.e.a();
            if (!TextUtils.isEmpty(a2) && !list.contains(a2)) {
                return false;
            }
        }
        return ABGlobal.isFeatureOpened(PopLayer.getReference().getApp(), "android_poplayer_native_gradual_display");
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        List<ListenEventModel> list = this.f22224a.a().e().listenEvents;
        if (list != null) {
            for (ListenEventModel listenEventModel : list) {
                if (listenEventModel != null && listenEventModel.isValid()) {
                    hashMap.put(listenEventModel.sourceName, new HashSet(listenEventModel.eventName));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        for (String str : hashMap.keySet()) {
            com.taobao.tbpoplayer.view.c.a().a(str, (Set) hashMap.get(str), k().z(), l());
            if (this.d.y().source == 5) {
                alu aluVar = new alu(new alr("PopHub", "poplayer").a((Context) PopLayer.getReference().internalGetCurrentActivity()));
                this.f22224a.a().a(aluVar);
                com.taobao.tbpoplayer.view.jsbridge.c.a(aluVar, this.d.z());
            }
        }
    }

    private void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        if (this.q != null) {
            com.taobao.android.autosize.h.a().d(this.q);
            this.q = null;
        }
        if (this.d.y().source != 5) {
            return;
        }
        com.taobao.tbpoplayer.view.jsbridge.c.b(this.f22224a.a().B(), this.d.z());
    }
}
