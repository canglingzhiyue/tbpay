package com.etao.feimagesearch.capture.dynamic.hybrid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.etao.feimagesearch.util.ag;
import com.etao.feimagesearch.util.s;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.LinkedHashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cot;
import tb.coy;
import tb.cte;
import tb.dau;
import tb.kge;
import tb.ljl;
import tb.noa;

/* loaded from: classes3.dex */
public final class b extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "AutoSize_CaptureHybridView";

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.b(b.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ JSONObject d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, JSONObject jSONObject, String str3) {
            super(str3);
            this.b = str;
            this.c = str2;
            this.d = jSONObject;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            s.Companion.a(b.this.a(), this.b, this.c, this.d, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(WVMicorPublishPlugin.TEMPLATE_URL, this.b);
            TLogTracker.b("Default", "HybridLoad", linkedHashMap);
        }
    }

    static {
        kge.a(918732124);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ Activity a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2698a226", new Object[]{bVar}) : bVar.d;
    }

    public static final /* synthetic */ void a(b bVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ff47d0", new Object[]{bVar, view});
        } else {
            bVar.a(view);
        }
    }

    public static final /* synthetic */ void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2974461", new Object[]{bVar});
        } else {
            bVar.o();
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(66758052);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> parent) {
        super(activity, parent);
        q.c(activity, "activity");
        q.c(parent, "parent");
    }

    @Override // com.etao.feimagesearch.capture.dynamic.hybrid.e
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        com.etao.feimagesearch.model.b pageModel = h();
        q.a((Object) pageModel, "pageModel");
        dau.a(pageModel.getPssource(), true);
        n();
        if (com.etao.feimagesearch.config.b.dQ()) {
            o();
        } else {
            j().a(new c());
        }
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        p a2 = com.taobao.android.weex_framework.q.a().a(this.d);
        a(a2);
        if (!StringUtils.isEmpty(ScreenType.a(v()))) {
            a2.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, ScreenType.a(v()));
        }
        Activity activity = this.d;
        if (activity != null) {
            a2.setTag("ali_ms_navigation", new com.etao.feimagesearch.capture.dynamic.hybrid.c((AppCompatActivity) activity));
            a2.registerRenderListener(new C0216b());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    /* renamed from: com.etao.feimagesearch.capture.dynamic.hybrid.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0216b implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.weex_framework.g
        public void onForeground(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            }
        }

        public C0216b() {
        }

        @Override // com.taobao.android.weex_framework.g
        public void onPrepareSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                return;
            }
            cot.a("Dynamic", b.TAG, "onPrepareSuccess");
            dau.b();
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                return;
            }
            cot.a("Dynamic", b.TAG, ljl.RENDER_SUCCESS_TIME);
            if (pVar == null || com.etao.feimagesearch.config.b.H()) {
                return;
            }
            CaptureManager manager = b.this.j();
            q.a((Object) manager, "manager");
            if (manager.a() || pVar.isDestroyed()) {
                return;
            }
            dau.c();
            b.this.a(true);
            b.a(b.this, pVar.getRenderRoot());
            View renderRoot = pVar.getRenderRoot();
            q.a((Object) renderRoot, "instance.renderRoot");
            Activity activity = b.a(b.this);
            q.a((Object) activity, "activity");
            renderRoot.setBackground(new BitmapDrawable(activity.getResources(), Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
            CaptureManager manager2 = b.this.j();
            q.a((Object) manager2, "manager");
            com.etao.feimagesearch.structure.capture.f z = manager2.z();
            if (z == null) {
                return;
            }
            z.q();
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            cot.a("Dynamic", b.TAG, "onRenderFailed: type=" + i + ", errorMsg=" + str);
            dau.a(String.valueOf(i), str == null ? "unknown" : str);
            CaptureManager manager = b.this.j();
            q.a((Object) manager, "manager");
            com.etao.feimagesearch.structure.capture.f z2 = manager.z();
            if (z2 == null) {
                return;
            }
            z2.a(Integer.valueOf(i), str);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            CaptureManager manager = b.this.j();
            q.a((Object) manager, "manager");
            com.etao.feimagesearch.structure.capture.f z2 = manager.z();
            if (z2 == null) {
                return;
            }
            z2.b(Integer.valueOf(i), str);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onJSException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
                return;
            }
            CaptureManager manager = b.this.j();
            q.a((Object) manager, "manager");
            com.etao.feimagesearch.structure.capture.f z = manager.z();
            if (z != null) {
                z.b(Integer.valueOf(i), str);
            }
            cot.a("Dynamic", b.TAG, "onJSException: type=" + i + ", errorMsg=" + str);
            String valueOf = String.valueOf(i);
            if (str == null) {
                str = "unknown";
            }
            dau.a(valueOf, str);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onFatalException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
                return;
            }
            cot.a("Dynamic", b.TAG, "onFatalException: type=" + i + ", errorMsg=" + str);
            CaptureManager manager = b.this.j();
            q.a((Object) manager, "manager");
            com.etao.feimagesearch.structure.capture.f z = manager.z();
            if (z != null) {
                z.b(Integer.valueOf(i), str);
            }
            String valueOf = String.valueOf(i);
            if (str == null) {
                str = "unknown";
            }
            dau.a(valueOf, str);
        }

        @Override // com.taobao.android.weex_framework.g
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            } else if (mUSDKInstance == null || mUSDKInstance.getRenderRoot() == null) {
            } else {
                b.this.r().removeView(mUSDKInstance.getRenderRoot());
            }
        }
    }

    private final void o() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        String m = m();
        if (m != null) {
            if (m.length() > 0) {
                z = true;
            }
            if (z) {
                a(m);
                return;
            }
        }
        p();
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        cot.c(TAG, "loadTemplateWithoutBackSourceLink");
        String ag = com.etao.feimagesearch.config.b.ag();
        String str = ag;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!z) {
            a(ag);
        } else {
            q();
        }
    }

    private final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "loadTemplateWithCachedUrl", 19999, new String[0]);
        String a2 = com.etao.feimagesearch.capture.dynamic.templates.b.a(com.etao.feimagesearch.capture.dynamic.templates.b.b());
        if (a2 == null || StringUtils.isEmpty(a2)) {
            a2 = com.etao.feimagesearch.config.b.dB();
        }
        cot.c(TAG, "loadTemplateWithCachedUrl " + a2);
        if (a2 == null) {
            q.a();
        }
        a(a2);
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        cot.c(TAG, "onGetTemplateUrl: " + str);
        if (a() == null) {
            cot.b(TAG, "mMuiseInstance is null");
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = com.etao.feimagesearch.config.b.dB();
        }
        String str2 = str;
        b(str2);
        dau.a(str2);
        com.etao.feimagesearch.model.b pageModel = h();
        q.a((Object) pageModel, "pageModel");
        String a2 = ag.a("https://h5.m.taobao.com/tusou/index.html", pageModel.getExtraParams());
        q.a((Object) a2, "UrlUtil.appendQueryParam…geModel.extraParams\n    )");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        com.etao.feimagesearch.model.b pageModel2 = h();
        q.a((Object) pageModel2, "pageModel");
        jSONObject2.put((JSONObject) "index", String.valueOf(pageModel2.getInitTabIndex()));
        jSONObject2.put((JSONObject) "hideBack", (String) Boolean.valueOf(!CaptureManager.n));
        if (h().scanOnly()) {
            jSONObject2.put((JSONObject) com.etao.feimagesearch.model.d.KEY_IS_SCAN_MODE, String.valueOf(true));
            jSONObject2.put((JSONObject) "isSplitScanAndTakePhoto", String.valueOf(false));
            jSONObject2.put((JSONObject) "alwaysShowCaptureButton", String.valueOf(false));
            jSONObject2.put((JSONObject) "isNativeAlbumShow", String.valueOf(true));
        } else {
            CaptureManager manager = j();
            q.a((Object) manager, "manager");
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
            jSONObject2.put((JSONObject) "isNativeAlbumShow", String.valueOf(true ^ j().o()));
        }
        jSONObject2.put((JSONObject) "isScreenshotFloatBtnEnable", (String) Boolean.valueOf(com.etao.feimagesearch.config.b.cY()));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) noa.KEY_EDITION_CODE, com.taobao.search.mmd.util.g.d());
        jSONObject2.put((JSONObject) "marketingClientParams", (String) jSONObject3);
        jSONObject2.put((JSONObject) "isOpenAlbumPopIntensification", String.valueOf(com.etao.feimagesearch.config.b.ck()));
        jSONObject2.put((JSONObject) "screenshotsIntensHint", com.etao.feimagesearch.config.b.cn());
        CaptureManager manager2 = j();
        q.a((Object) manager2, "manager");
        jSONObject2.put((JSONObject) "triggerElder", String.valueOf(manager2.W()));
        CaptureManager manager3 = j();
        q.a((Object) manager3, "manager");
        jSONObject2.put((JSONObject) "enableSecondaryRequest", String.valueOf(manager3.X()));
        cot.c(TAG, "params=" + JSON.toJSONString(jSONObject));
        com.etao.feimagesearch.model.b pageModel3 = h();
        q.a((Object) pageModel3, "pageModel");
        jSONObject.putAll(pageModel3.getAllParams());
        ad.c("renderMuise", new d(str2, a2, jSONObject, TAG));
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
