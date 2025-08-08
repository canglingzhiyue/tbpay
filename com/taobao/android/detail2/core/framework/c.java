package com.taobao.android.detail2.core.framework;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.s;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.ctu;
import tb.fhi;
import tb.fig;
import tb.fjp;
import tb.fjs;
import tb.fjt;
import tb.fjx;
import tb.fjy;
import tb.fko;
import tb.fkr;
import tb.fkt;
import tb.fln;
import tb.flo;
import tb.gso;
import tb.idk;
import tb.ipa;
import tb.kge;
import tb.nlb;
import tb.ojy;
import tb.qxo;
import tb.xjf;
import tb.xjg;
import tb.xji;

/* loaded from: classes5.dex */
public class c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_ENABLE_TRANSITION = "extraEnableTransition";
    public static final String KEY_EXTRA_ENABLE_TRA_STYLE_DATA = "extraEnableTraStyleData";
    public static final String KEY_EXTRA_FRAME_ANIM_HIT_FIXED = "extraFrameAnimHitFixed";
    public static final String KEY_EXTRA_FRAME_ANIM_ND_REASON = "extraFrameAnimNdReason";
    public static final String KEY_EXTRA_FRAME_ANIM_REASON = "extraFrameAnimReason";
    public static final String KEY_EXTRA_FRAME_ANIM_TYPE = "extraFrameAnimType";
    public static final String KEY_LOW_BATTERY_ND_QUICK_JUMP = "lowBatteryNdQuickJump";
    public static final String KEY_NAV_HIT_TOP_SPEED_FIRST_PIC = "navHitTopSpeedFirstPic";
    public static final String KEY_NAV_LONG_TOKEN = "NewDetailLongToken";
    public static final String KEY_ON_NAV_HIT_PRE_CACHE_DATA = "onNavHitPreCacheData";
    public static final String KEY_REAL_HIT_MASK_FRAME_ANIM = "realHitMaskFrameAnim";
    private static boolean b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11507a;
    private boolean c;
    private boolean d;
    private boolean e;
    public boolean f;
    public String g;
    public Uri h;
    private volatile long j = -1;

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "NewDetailInnerNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ long a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8be5aa", new Object[]{cVar})).longValue() : cVar.j;
    }

    public static /* synthetic */ void a(c cVar, Context context, Intent intent, String str, ojy ojyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399f3f4b", new Object[]{cVar, context, intent, str, ojyVar});
        } else {
            cVar.a(context, intent, str, ojyVar);
        }
    }

    public static /* synthetic */ void a(c cVar, Intent intent, Intent intent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c4a30", new Object[]{cVar, intent, intent2});
        } else {
            cVar.a(intent, intent2);
        }
    }

    public static /* synthetic */ boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1358bd9", new Object[]{cVar})).booleanValue() : cVar.d;
    }

    static {
        kge.a(-919585708);
        kge.a(-719787762);
        b = true;
    }

    private void a(Intent intent, com.taobao.android.nav.d dVar, ojy<JSONObject, JSONObject> ojyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07abee1", new Object[]{this, intent, dVar, ojyVar});
            return;
        }
        String valueOf = String.valueOf(this.j);
        intent.putExtra(b.NAV_TOKEN, valueOf);
        NavPreRequestManager.a().a(valueOf);
        idk.a(new AnonymousClass1(ipa.ar() ? intent : (Intent) intent.clone(), intent, dVar, xjf.a(), valueOf, ojyVar));
    }

    /* renamed from: com.taobao.android.detail2.core.framework.c$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 extends ipa.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f11508a;
        public final /* synthetic */ com.taobao.android.nav.d b;
        public final /* synthetic */ Intent d;
        public final /* synthetic */ String e;
        public final /* synthetic */ ojy f;
        public final /* synthetic */ xjf g;

        @Override // tb.ipa.c
        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "preInitIoInfoTask";
        }

        public AnonymousClass1(Intent intent, Intent intent2, com.taobao.android.nav.d dVar, xjf xjfVar, String str, ojy ojyVar) {
            this.f11508a = intent;
            this.d = intent2;
            this.b = dVar;
            this.g = xjfVar;
            this.e = str;
            this.f = ojyVar;
        }

        @Override // tb.ipa.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (c.a(c.this) < ipa.D()) {
                fjt.a(fjt.TAG_TIP, "preloadResources>> 命中了 Weex、Sp 异步加载。当前跳转被其它跳转替代。不再执行后续逻辑。。");
                c.a(c.this, this.f11508a, this.d);
            } else {
                Context a2 = this.b.a();
                c.this.c();
                if (c.this.f11507a) {
                    xjf.a(c.a(c.this), this.g);
                    this.g.b(c.b(c.this));
                }
                c.a(c.this, a2, this.f11508a, this.e, this.f);
                ipa.N().post(new Runnable() { // from class: com.taobao.android.detail2.core.framework.c.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        Bundle extras;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (ipa.bf()) {
                            ipa.a(AnonymousClass1.this.f11508a, true);
                        } else {
                            if (!ipa.ar() && (extras = AnonymousClass1.this.f11508a.getExtras()) != null) {
                                try {
                                    AnonymousClass1.this.d.putExtras(extras);
                                } catch (Exception e) {
                                    nlb.a("fastRealIntentPutExtraError", "errorMsg:" + e.getMessage());
                                    fjt.b(fjt.TAG_TIP, "runTask with error. taskName: " + AnonymousClass1.this.b(), e);
                                    qxo.a("fastRealIntentPutExtraError", e);
                                }
                            }
                            ipa.E();
                        }
                    }
                });
            }
        }
    }

    private void a(final Intent intent, final Intent intent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e85e4e2", new Object[]{this, intent, intent2});
        } else {
            ipa.N().post(new Runnable() { // from class: com.taobao.android.detail2.core.framework.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Bundle extras;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ipa.bf()) {
                        ipa.a(intent, true);
                    } else {
                        if (!ipa.ar() && (extras = intent.getExtras()) != null) {
                            try {
                                intent2.putExtras(extras);
                            } catch (Exception e) {
                                fjt.a(fjt.TAG_TIP, "realIntent.putExtras 异常。", e);
                                if (qxo.a()) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        ipa.E();
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        ctu.a("NewDetailInnerNavProcessor_process");
        boolean a2 = a(intent, dVar);
        ctu.a();
        return a2;
    }

    private void a(fkr fkrVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccddc6bd", new Object[]{this, fkrVar, context});
            return;
        }
        com.taobao.phenix.intf.b.h().a(fln.a(context, fkrVar.t())).fetch();
        if (!"false".equals(fkrVar.am().getString("enableBlurImage"))) {
            com.taobao.phenix.intf.b.h().a(fln.a(context, fkrVar.t())).bitmapProcessors(true, new com.taobao.phenix.compat.effects.b(context, fkrVar.b().p(), 2)).fetch();
        }
        fjt.a(fjt.TAG_RENDER, "preloadTargetPic: " + fkrVar.t());
    }

    private static void a(Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec32209c", new Object[]{uri, intent});
        } else if (uri == null) {
        } else {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen");
            intent.setData(buildUpon.build());
        }
    }

    public void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            return;
        }
        this.h = intent.getData();
        try {
            if (this.h != null) {
                this.g = this.h.getQueryParameter("newDetailChannel");
            }
        } catch (Exception e) {
            qxo.a("ND基本参数获取失败。", e);
        }
        this.f11507a = intent.getBooleanExtra("lowBatteryNdQuickJump", false);
        if (Boolean.TRUE.equals(Boolean.valueOf(intent.getBooleanExtra("extraEnableTransition", Boolean.FALSE.booleanValue())))) {
            this.f = ipa.a(true, this.f11507a, this.g);
            if (!this.f) {
                return;
            }
            e();
            this.d = true;
            return;
        }
        this.f = ipa.a(false, this.f11507a, this.g);
    }

    public boolean a(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40d54a33", new Object[]{this, intent, dVar})).booleanValue();
        }
        b(intent);
        b();
        b(intent, dVar, new ojy<>());
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f11507a) {
        } else {
            ctu.a("t_nd_boostCpu");
            try {
                ADaemon.boostCpu(1);
            } catch (Throwable th) {
                qxo.a("boostCpu 异常。", th);
            }
            ctu.a();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f11507a) {
        } else {
            ctu.a("t_nd_bindCPU_preloadResources");
            gso.a();
            ctu.a();
        }
    }

    public boolean b(final Intent intent, final com.taobao.android.nav.d dVar, final ojy<JSONObject, JSONObject> ojyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("940a4326", new Object[]{this, intent, dVar, ojyVar})).booleanValue();
        }
        xjg xjgVar = null;
        if (this.f) {
            xjgVar = new xjg(true, xji.a());
        }
        if (this.f && xjg.a(intent, ojyVar, xjgVar)) {
            ipa.m();
            c(intent);
            xjgVar.a(this.d);
            xjg.a(this.j, xjgVar);
            f();
            a(intent, dVar, ojyVar, (Uri) null, dVar.a());
            final xjg xjgVar2 = xjgVar;
            xjgVar.a(new Runnable() { // from class: com.taobao.android.detail2.core.framework.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    c.this.c(intent, dVar, ojyVar);
                    xjgVar2.a(intent);
                }
            });
            return true;
        }
        this.f = false;
        return c(intent, dVar, ojyVar);
    }

    private void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa30527", new Object[]{this, intent});
            return;
        }
        long D = ipa.D();
        intent.putExtra(KEY_NAV_LONG_TOKEN, D);
        this.j = D;
    }

    public boolean c(Intent intent, com.taobao.android.nav.d dVar, ojy<JSONObject, JSONObject> ojyVar) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8799c767", new Object[]{this, intent, dVar, ojyVar})).booleanValue();
        }
        if (d()) {
            f();
            ipa.m();
            c(intent);
        }
        boolean k = fkt.k();
        if (!k) {
            uri = intent.getData();
            a(uri, intent);
            fjt.a(fjt.TAG_TIP, "appendNdParamsToIntentUri , 已提前处理。");
        } else {
            uri = null;
        }
        if (ipa.z()) {
            this.j = ipa.D();
            a(intent, dVar, ojyVar);
        }
        if (ipa.h()) {
            idk.a((Runnable) null, true);
        }
        fjt.a(fjt.TAG_RENDER, "用户点击");
        intent.putExtra("enableTppUpdate", true);
        if (k) {
            uri = intent.getData();
            a(uri, intent);
        }
        Uri uri2 = uri;
        Context a2 = dVar.a();
        if (d()) {
            e();
        }
        if (!ipa.ao()) {
            b(intent, dVar);
        }
        if (!ipa.z()) {
            a(a2, intent, (String) null, (ojy<JSONObject, JSONObject>) null);
        }
        if (d()) {
            a(intent, dVar, ojyVar, uri2, a2);
        }
        return true;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c = false;
        this.e = false;
        this.d = false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : !this.f;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!a()) {
        } else {
            ipa.h("oldNav");
            ipa.i("oldNav");
            ipa.aJ();
        }
    }

    private void b(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a299f70", new Object[]{this, intent, dVar});
            return;
        }
        try {
            if (!fkt.ao()) {
                return;
            }
            if (Boolean.TRUE.equals(Boolean.valueOf(intent.getBooleanExtra("extraEnableTransition", Boolean.FALSE.booleanValue())))) {
                if (NewDetailMaskFrameLayout.checkHasMaskFrameAnimParams(dVar.n())) {
                    this.d = true;
                    intent.putExtra(KEY_EXTRA_FRAME_ANIM_ND_REASON, "animSuccess-WithFlag");
                    return;
                }
                fjt.a(fjt.TAG_FAST_ANIM, "一跳虽然传递了无极缩放标识，但是未传递坐标参数。");
                StringBuilder sb = new StringBuilder();
                sb.append("noAnimExtra:null-");
                if (dVar.n() == null) {
                    z = true;
                }
                sb.append(z);
                intent.putExtra(KEY_EXTRA_FRAME_ANIM_ND_REASON, sb.toString());
                return;
            }
            fjt.a(fjt.TAG_FAST_ANIM, "一跳未传递无极缩放标识。");
            intent.putExtra(KEY_EXTRA_FRAME_ANIM_ND_REASON, "noAnimFlag");
        } catch (Throwable th) {
            fjt.a(fjt.TAG_FAST_ANIM, "未知异常。 无极缩放动画 , Orange 数据初始化失败。", th);
            intent.putExtra(KEY_EXTRA_FRAME_ANIM_ND_REASON, "errorCheck:" + th.getCause());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: Throwable -> 0x00fa, TryCatch #2 {Throwable -> 0x00fa, blocks: (B:6:0x0023, B:8:0x0027, B:13:0x002f, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:20:0x0043, B:22:0x0049, B:26:0x0053, B:28:0x0059, B:30:0x0068, B:33:0x0078, B:35:0x0080, B:37:0x0086, B:39:0x008e, B:40:0x0092, B:41:0x0096, B:43:0x00ae, B:46:0x00b6, B:48:0x00ba, B:50:0x00c5, B:52:0x00c9, B:56:0x00cf, B:62:0x00f0, B:64:0x00f6, B:57:0x00db, B:59:0x00df), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: Throwable -> 0x00fa, TryCatch #2 {Throwable -> 0x00fa, blocks: (B:6:0x0023, B:8:0x0027, B:13:0x002f, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:20:0x0043, B:22:0x0049, B:26:0x0053, B:28:0x0059, B:30:0x0068, B:33:0x0078, B:35:0x0080, B:37:0x0086, B:39:0x008e, B:40:0x0092, B:41:0x0096, B:43:0x00ae, B:46:0x00b6, B:48:0x00ba, B:50:0x00c5, B:52:0x00c9, B:56:0x00cf, B:62:0x00f0, B:64:0x00f6, B:57:0x00db, B:59:0x00df), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6 A[Catch: Throwable -> 0x00fa, TRY_LEAVE, TryCatch #2 {Throwable -> 0x00fa, blocks: (B:6:0x0023, B:8:0x0027, B:13:0x002f, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:20:0x0043, B:22:0x0049, B:26:0x0053, B:28:0x0059, B:30:0x0068, B:33:0x0078, B:35:0x0080, B:37:0x0086, B:39:0x008e, B:40:0x0092, B:41:0x0096, B:43:0x00ae, B:46:0x00b6, B:48:0x00ba, B:50:0x00c5, B:52:0x00c9, B:56:0x00cf, B:62:0x00f0, B:64:0x00f6, B:57:0x00db, B:59:0x00df), top: B:69:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v14, types: [F, com.alibaba.fastjson.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Intent r7, com.taobao.android.nav.d r8, tb.ojy<com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject> r9, android.net.Uri r10, android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.c.a(android.content.Intent, com.taobao.android.nav.d, tb.ojy, android.net.Uri, android.content.Context):void");
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [S, com.alibaba.fastjson.JSONObject] */
    private void a(Context context, Intent intent, String str, ojy<JSONObject, JSONObject> ojyVar) {
        JSONObject jSONObject;
        String valueOf;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9c8559", new Object[]{this, context, intent, str, ojyVar});
            return;
        }
        try {
            ctu.a("preloadResources");
            fjt.a(fjt.TAG_TIP, "preloadResources>> 实际开始执行。。 ");
            String uuid = str == null ? UUID.randomUUID().toString() : str;
            if (str == null) {
                intent.putExtra(b.NAV_TOKEN, uuid);
                NavPreRequestManager.a().a(uuid);
            }
            ctu.a("preloadResources_NewDetailFeedsConfig");
            fkr fkrVar = new fkr(intent);
            ctu.a();
            fko.a(uuid, fkrVar);
            if (ojyVar != null && ojyVar.f32128a != null) {
                jSONObject = ojyVar.f32128a;
            } else {
                ?? a2 = a(intent);
                if (ojyVar != null) {
                    ojyVar.b = a2;
                }
                jSONObject = a2;
            }
            if (jSONObject == null) {
                a(context, intent, fkrVar);
                return;
            }
            this.e = true;
            if (ipa.z()) {
                valueOf = a(jSONObject, intent, context, fkrVar);
            } else {
                nlb.a("weex_sync_delete_code", "preSendDataToWeexNew sjs:" + ipa.ba());
                valueOf = String.valueOf(this.j);
            }
            if (this.c && this.d && fkt.an()) {
                z = true;
            }
            flo floVar = new flo();
            fko.a(valueOf, floVar);
            fln.a(floVar, context, jSONObject.getJSONObject("preloadResources"), a(jSONObject), z);
            fjt.a(fjt.TAG_TIP, "preloadResources>> 实际执行结束，未发生异常。 ");
        } catch (Throwable th) {
            try {
                fjp.a(fjp.SCENE_OPEN_IMMEDIATELY, fjp.a(fjp.ERROR_CODE_OPEN_IMMEDIATELY_PRELOAD_RESOURCES_EXCEPTION), "点击时预加载资源异常", (Map<String, String>) null, th);
            } finally {
                ctu.a();
            }
        }
    }

    private void a(Context context, Intent intent, fkr fkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79acbe20", new Object[]{this, context, intent, fkrVar});
            return;
        }
        a(fkrVar, context);
        com.taobao.android.detail2.core.optimize.prerender.b.a().a(fkrVar);
        com.taobao.android.detail2.core.optimize.prerender.b.a().b(fkrVar);
        NavPreRequestManager.a().a(context, intent, fkrVar);
    }

    private void a(Context context, fkr fkrVar, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb5518c", new Object[]{this, context, fkrVar, fhiVar});
            return;
        }
        ctu.a("doOptimizeWhenHitOpenImmed");
        a(fkrVar, context);
        com.taobao.android.detail2.core.optimize.prerender.b.a().a(fkrVar);
        com.taobao.android.detail2.core.optimize.prerender.b.a().b(fkrVar);
        NavPreRequestManager.a().a(context, fkrVar, fhiVar);
        ctu.a();
    }

    private TaobaoImageUrlStrategy.ImageBlur a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageBlur) ipChange.ipc$dispatch("ba37e71d", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("detailInfo");
        if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("biz")) == null || (jSONObject3 = jSONObject2.getJSONObject("feature")) == null) {
            return null;
        }
        String string = jSONObject3.getString("openImmediatelyBlur");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (TaobaoImageUrlStrategy.ImageBlur) Enum.valueOf(TaobaoImageUrlStrategy.ImageBlur.class, string);
        } catch (Exception unused) {
            fjp.a(fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_OPEN_IMMEDIATELY_BLUR_PARSE_ERROR, "解析高斯模糊参数出错", (Map<String, String>) null);
            return null;
        }
    }

    private String a(JSONObject jSONObject, Intent intent, Context context, fkr fkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b160913a", new Object[]{this, jSONObject, intent, context, fkrVar});
        }
        ctu.a("preSendDataToWeexNewForAsyncV2_DetailCardItemNode");
        fhi fhiVar = new fhi(fkrVar);
        fhiVar.a(jSONObject, false, this.d || ipa.K(), false);
        fhiVar.y = false;
        fhiVar.f = 0;
        fhiVar.C = true;
        fhiVar.F = true;
        fhiVar.a("nativeHalfGuide", Boolean.valueOf(fkrVar.a(0, fhiVar.g)));
        ctu.a();
        fko.a(fkrVar.y(), fhiVar);
        com.taobao.android.detail2.core.optimize.preload.a.a(fkrVar, fhiVar, false);
        fln.a(context, fhiVar);
        a(context, fkrVar, fhiVar);
        HashMap hashMap = new HashMap();
        hashMap.put("entryNDNum", String.valueOf(fig.f27971a));
        fjp.a("eventProcess", fjp.UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_PRE_SEND_DATA_REQUEST, hashMap);
        String m = fhiVar.m();
        if (ipa.g()) {
            idk.a(m, (Runnable) null);
        }
        s.a a2 = com.taobao.android.detail2.core.framework.base.weex.h.a(context, m);
        a2.b("hasSendDataWhenNav", "true");
        fjp.a("eventProcess", fjp.UMBRELLA_TAG_WEEX_OPEN_IMMEDIATELY_PRE_SEND_DATA_SUCCESS, hashMap);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("detailDataRefresh", (Object) fhiVar.f27944a.dataContext);
        WeexValue a3 = com.taobao.android.weex.e.b().a(jSONObject2);
        if (ipa.aA()) {
            a2.b(WeexEventTarget.BODY_TARGET, "newdetailcallback", a3);
            fjt.a(fjt.TAG_TIP, "v2-NavUseOldOptimizeKeyForWeex");
        } else if (ipa.aT()) {
            if (com.taobao.android.detail2.core.framework.base.weex.h.a(fjs.c(fjs.c(fhiVar.f27944a.dataContext, "context"), "preloadPassParams"), fhiVar)) {
                a2.b(WeexEventTarget.BODY_TARGET, "optimizenewdetailcallback", a3);
            } else {
                a2.b(WeexEventTarget.BODY_TARGET, "newdetailcallback", a3);
                fjt.a(fjt.TAG_TIP, "align-v2-NavUseOldOptimizeKeyForWeex");
            }
        } else {
            a2.b(WeexEventTarget.BODY_TARGET, "optimizenewdetailcallback", a3);
        }
        fjt.a(fjt.TAG_TIP, "saveMusResult url: " + m);
        com.taobao.android.detail2.core.framework.base.weex.h.a(a2, m);
        fjt.a(fjt.TAG_RENDER, "nav阶段提前发送数据成功new");
        this.c = true;
        return fkrVar.y();
    }

    public static JSONObject a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4801345", new Object[]{intent});
        }
        if (intent != null) {
            return fjx.a(fjx.b(fjy.a(intent), fjx.a(intent)), "nav");
        }
        return null;
    }
}
