package com.etao.feimagesearch.capture.dynamic.hybrid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.etao.feimagesearch.util.ae;
import com.etao.feimagesearch.util.ag;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.h;
import com.taobao.android.weex.q;
import com.taobao.android.weex.s;
import com.taobao.android.weex_framework.p;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import tb.com;
import tb.cot;
import tb.coy;
import tb.cte;
import tb.dau;
import tb.kge;
import tb.noa;

/* loaded from: classes3.dex */
public final class f extends com.etao.feimagesearch.capture.dynamic.hybrid.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "AutoSize_CaptureHybridViewV2";

    /* loaded from: classes3.dex */
    public interface b {
        void a(String str);
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                f.a(f.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q.a f6561a;

        public e(q.a aVar) {
            this.f6561a = aVar;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f6561a.c();
            }
        }
    }

    /* renamed from: com.etao.feimagesearch.capture.dynamic.hybrid.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0217f implements s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.etao.feimagesearch.capture.dynamic.hybrid.f$f$a */
        /* loaded from: classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ s.a b;

            public a(s.a aVar) {
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                s.a aVar = this.b;
                WeexInstance a2 = aVar != null ? aVar.a(f.this.s()) : null;
                if (a2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.weex.WeexInstanceImpl");
                }
                WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) a2;
                f.this.a(weexInstanceImpl.getAdapterMUSInstance());
                if (f.this.g()) {
                    f.b(f.this);
                } else if (!f.this.k()) {
                } else {
                    weexInstanceImpl.destroy();
                }
            }
        }

        public C0217f() {
        }

        @Override // com.taobao.android.weex.s
        public void a(s.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8d89384", new Object[]{this, aVar});
            } else {
                f.this.r().post(new a(aVar));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.etao.feimagesearch.capture.dynamic.hybrid.f.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                f.a(f.this, str);
            }
        }
    }

    static {
        kge.a(-1861689096);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987d973e", new Object[]{fVar});
        } else {
            fVar.n();
        }
    }

    public static final /* synthetic */ void a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24eead88", new Object[]{fVar, str});
        } else {
            fVar.a(str);
        }
    }

    public static final /* synthetic */ void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29915dd", new Object[]{fVar});
        } else {
            fVar.q();
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1097992640);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> parent) {
        super(activity, parent);
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
    }

    @Override // com.etao.feimagesearch.capture.dynamic.hybrid.e
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (ae.INSTANCE.a()) {
            j().a(new d());
        } else {
            n();
        }
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.model.b pageModel = h();
        kotlin.jvm.internal.q.a((Object) pageModel, "pageModel");
        dau.a(pageModel.getPssource(), true);
        a(new g());
    }

    private final void a(b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4a2c40", new Object[]{this, bVar});
            return;
        }
        String m = m();
        if (m != null) {
            if (m.length() <= 0) {
                z = false;
            }
            if (z) {
                bVar.a(m);
                return;
            }
        }
        b(bVar);
    }

    private final void b(b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f807f1f", new Object[]{this, bVar});
            return;
        }
        cot.c(TAG, "loadTemplateWithoutBackSourceLink");
        String ag = com.etao.feimagesearch.config.b.ag();
        String str = ag;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (!z) {
            bVar.a(ag);
        } else {
            c(bVar);
        }
    }

    private final void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b6d1fe", new Object[]{this, bVar});
            return;
        }
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "loadTemplateWithCachedUrl", 19999, new String[0]);
        String a2 = com.etao.feimagesearch.capture.dynamic.templates.b.a(com.etao.feimagesearch.capture.dynamic.templates.b.b());
        if (a2 == null || TextUtils.isEmpty(a2)) {
            a2 = com.etao.feimagesearch.config.b.dB();
        }
        cot.c(TAG, "loadTemplateWithCachedUrl " + a2);
        bVar.a(a2);
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = com.etao.feimagesearch.config.b.dB();
        }
        b(str);
        dau.a(str);
        com.etao.feimagesearch.model.b pageModel = h();
        kotlin.jvm.internal.q.a((Object) pageModel, "pageModel");
        String a2 = ag.a("https://h5.m.taobao.com/tusou/index.html", pageModel.getExtraParams());
        kotlin.jvm.internal.q.a((Object) a2, "UrlUtil.appendQueryParam…del.extraParams\n        )");
        JSONObject o = o();
        q b2 = com.taobao.android.weex.e.b(s(), a2, WeexInstanceMode.MUS, WeexRenderType.UIKIT, null, null);
        kotlin.jvm.internal.q.a((Object) b2, "WeexFactory.createInstan…KIT, null, null\n        )");
        b2.a(com.b(com.b()), com.e(com.b()));
        b2.a(str);
        b2.a(p());
        Activity activity = this.d;
        if (activity != null) {
            b2.a("ali_ms_navigation", new com.etao.feimagesearch.capture.dynamic.hybrid.c((AppCompatActivity) activity));
            WeexValueImpl ofJSONObject = WeexValueImpl.ofJSONObject(o);
            kotlin.jvm.internal.q.a((Object) ofJSONObject, "WeexValueImpl.ofJSONObject(params)");
            b2.a(ofJSONObject);
            q.a a3 = b2.a(new C0217f());
            kotlin.jvm.internal.q.a((Object) a3, "builder.done(object : We…            }\n\n        })");
            ad.c("AutoSize_CaptureHybridViewV2initMuiseInstance", new e(a3));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    private final JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        com.etao.feimagesearch.model.b pageModel = h();
        kotlin.jvm.internal.q.a((Object) pageModel, "pageModel");
        jSONObject2.put((JSONObject) "index", String.valueOf(pageModel.getInitTabIndex()));
        jSONObject2.put((JSONObject) "hideBack", (String) Boolean.valueOf(!CaptureManager.n));
        if (h().scanOnly()) {
            jSONObject2.put((JSONObject) com.etao.feimagesearch.model.d.KEY_IS_SCAN_MODE, String.valueOf(true));
            jSONObject2.put((JSONObject) "isSplitScanAndTakePhoto", String.valueOf(false));
            jSONObject2.put((JSONObject) "alwaysShowCaptureButton", String.valueOf(false));
            jSONObject2.put((JSONObject) "isNativeAlbumShow", String.valueOf(true));
        } else {
            CaptureManager manager = j();
            kotlin.jvm.internal.q.a((Object) manager, "manager");
            int m = manager.m();
            if (m == 0) {
                jSONObject2.put((JSONObject) "isSplitScanAndTakePhoto", String.valueOf(false));
                jSONObject2.put((JSONObject) "alwaysShowCaptureButton", String.valueOf(false));
            } else if (m == 1) {
                jSONObject2.put((JSONObject) "isSplitScanAndTakePhoto", String.valueOf(true));
                jSONObject2.put((JSONObject) "alwaysShowCaptureButton", String.valueOf(false));
            } else {
                jSONObject2.put((JSONObject) "isSplitScanAndTakePhoto", String.valueOf(false));
                jSONObject2.put((JSONObject) "alwaysShowCaptureButton", String.valueOf(true));
            }
            jSONObject2.put((JSONObject) com.etao.feimagesearch.model.d.KEY_IS_SCAN_MODE, String.valueOf(false));
            jSONObject2.put((JSONObject) "isNativeAlbumShow", String.valueOf(!j().o()));
        }
        jSONObject2.put((JSONObject) "isScreenshotFloatBtnEnable", (String) Boolean.valueOf(com.etao.feimagesearch.config.b.cY()));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) noa.KEY_EDITION_CODE, com.taobao.search.mmd.util.g.d());
        jSONObject2.put((JSONObject) "marketingClientParams", (String) jSONObject3);
        jSONObject2.put((JSONObject) "isOpenAlbumPopIntensification", String.valueOf(com.etao.feimagesearch.config.b.ck()));
        jSONObject2.put((JSONObject) "screenshotsIntensHint", com.etao.feimagesearch.config.b.cn());
        CaptureManager manager2 = j();
        kotlin.jvm.internal.q.a((Object) manager2, "manager");
        jSONObject2.put((JSONObject) "isTriggerElder", String.valueOf(manager2.W()));
        CaptureManager manager3 = j();
        kotlin.jvm.internal.q.a((Object) manager3, "manager");
        jSONObject2.put((JSONObject) "enableSecondaryRequest", String.valueOf(manager3.X()));
        cot.c(TAG, "params=" + JSON.toJSONString(jSONObject));
        com.etao.feimagesearch.model.b pageModel2 = h();
        kotlin.jvm.internal.q.a((Object) pageModel2, "pageModel");
        jSONObject.putAll(pageModel2.getAllParams());
        return jSONObject;
    }

    /* loaded from: classes3.dex */
    public static final class c implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.weex.h
        public void onInitSuccess(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            cot.a("Dynamic", f.TAG, "onPrepareSuccess");
            dau.b();
        }

        @Override // com.taobao.android.weex.h
        public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            cot.a("Dynamic", f.TAG, "onInitFailed: isCache=" + z + ", type=" + weexErrorType + ", errorMsg=" + str);
            String valueOf = String.valueOf(weexErrorType);
            if (str == null) {
                str = "unknown";
            }
            dau.a(valueOf, str);
        }

        @Override // com.taobao.android.weex.h
        public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            cot.a("Dynamic", f.TAG, "onRenderSuccess: isRefresh=" + z);
            if (z || f.this.k() || com.etao.feimagesearch.config.b.H()) {
                return;
            }
            CaptureManager manager = f.this.j();
            kotlin.jvm.internal.q.a((Object) manager, "manager");
            if (manager.a()) {
                return;
            }
            dau.c();
            f.this.a(true);
            f.b(f.this);
        }

        @Override // com.taobao.android.weex.h
        public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
                return;
            }
            cot.a("Dynamic", f.TAG, "onRenderFailed: type=" + weexErrorType + ", errorMsg=" + str);
            dau.a(String.valueOf(weexErrorType), str == null ? "unknown" : str);
            CaptureManager manager = f.this.j();
            kotlin.jvm.internal.q.a((Object) manager, "manager");
            com.etao.feimagesearch.structure.capture.f z2 = manager.z();
            if (z2 == null) {
                return;
            }
            z2.a(weexErrorType != null ? Integer.valueOf(weexErrorType.ordinal()) : null, str);
        }

        @Override // com.taobao.android.weex.h
        public void onExecuteSuccess(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            } else {
                cot.a("Dynamic", f.TAG, "onExecuteSuccess:");
            }
        }

        @Override // com.taobao.android.weex.h
        public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            cot.a("Dynamic", f.TAG, "onExecuteFailed: type=" + weexErrorType + ", errorMsg=" + str);
            CaptureManager manager = f.this.j();
            kotlin.jvm.internal.q.a((Object) manager, "manager");
            com.etao.feimagesearch.structure.capture.f z = manager.z();
            if (z == null) {
                return;
            }
            z.b(weexErrorType != null ? Integer.valueOf(weexErrorType.ordinal()) : null, str);
        }

        @Override // com.taobao.android.weex.h
        public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            cot.a("Dynamic", f.TAG, "onScriptException: type=" + weexErrorType + ", errorMsg=" + str);
            CaptureManager manager = f.this.j();
            kotlin.jvm.internal.q.a((Object) manager, "manager");
            com.etao.feimagesearch.structure.capture.f z = manager.z();
            if (z == null) {
                return;
            }
            z.b(weexErrorType != null ? Integer.valueOf(weexErrorType.ordinal()) : null, str);
        }

        @Override // com.taobao.android.weex.h
        public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
                return;
            }
            cot.a("Dynamic", f.TAG, "onEngineException: type=" + weexErrorType + ", errorMsg=" + str);
            CaptureManager manager = f.this.j();
            kotlin.jvm.internal.q.a((Object) manager, "manager");
            com.etao.feimagesearch.structure.capture.f z = manager.z();
            if (z != null) {
                z.b(weexErrorType != null ? Integer.valueOf(weexErrorType.ordinal()) : null, str);
            }
            String valueOf = String.valueOf(weexErrorType);
            if (str == null) {
                str = "unknown";
            }
            dau.a(valueOf, str);
        }

        @Override // com.taobao.android.weex.h
        public void onDestroyed(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
                return;
            }
            p a2 = f.this.a();
            if (a2 == null || a2.getRenderRoot() == null) {
                return;
            }
            f.this.r().removeView(a2.getRenderRoot());
        }
    }

    private final h p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("bf8a961b", new Object[]{this}) : new c();
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        p a2 = a();
        if (a2 == null) {
            return;
        }
        a(a2.getRenderRoot());
        View renderRoot = a2.getRenderRoot();
        kotlin.jvm.internal.q.a((Object) renderRoot, "it.renderRoot");
        Activity activity = this.d;
        kotlin.jvm.internal.q.a((Object) activity, "activity");
        renderRoot.setBackground(new BitmapDrawable(activity.getResources(), Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
        CaptureManager manager = j();
        kotlin.jvm.internal.q.a((Object) manager, "manager");
        com.etao.feimagesearch.structure.capture.f z = manager.z();
        if (z == null) {
            return;
        }
        z.q();
    }

    private final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            r().addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
