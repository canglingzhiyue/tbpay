package com.alibaba.triver.triver_shop.container.shopLoft;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.rir;
import tb.ris;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class a extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f3709a;
    private String b;
    private String c;
    private boolean g;
    private boolean h;
    private boolean i;
    private String j;
    private String k;
    private JSONObject l;
    private ris m;
    private com.alibaba.triver.triver_shop.container.shopLoft.b n;
    private View o;
    private Activity p;
    private ruw<? super String, ? super JSONObject, t> q;
    private com.alibaba.triver.triver_shop.newShop.data.d s;
    private rul<? super JSONObject, t> t;
    private b.a d = new b.a();
    private boolean e = true;
    private boolean f = true;
    private final rir r = new b();

    /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0125a implements b.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0125a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
        @Override // com.alibaba.triver.triver_shop.container.shopLoft.b.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.String r4, com.alibaba.fastjson.JSONObject r5) {
            /*
                r3 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.container.shopLoft.a.C0125a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L18
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r3
                r2 = 1
                r1[r2] = r4
                r4 = 2
                r1[r4] = r5
                java.lang.String r4 = "6635bcfe"
                r0.ipc$dispatch(r4, r1)
                return
            L18:
                if (r4 == 0) goto L65
                int r0 = r4.hashCode()
                switch(r0) {
                    case -2003762904: goto L57;
                    case -1349867671: goto L4a;
                    case -1340212393: goto L3c;
                    case -1013054029: goto L2f;
                    case 1123967826: goto L22;
                    default: goto L21;
                }
            L21:
                goto L65
            L22:
                java.lang.String r0 = "onFinish"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L2c
                goto L65
            L2c:
                java.lang.String r0 = "finish"
                goto L66
            L2f:
                java.lang.String r0 = "onPlay"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L65
                java.lang.String r0 = "play"
                goto L66
            L3c:
                java.lang.String r0 = "onPause"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L46
                goto L65
            L46:
                java.lang.String r0 = "pause"
                goto L66
            L4a:
                java.lang.String r0 = "onError"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L54
                goto L65
            L54:
                java.lang.String r0 = "error"
                goto L66
            L57:
                java.lang.String r0 = "onMessage"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L61
                goto L65
            L61:
                java.lang.String r0 = "message"
                goto L66
            L65:
                r0 = r4
            L66:
                java.lang.String r1 = "utPageAppear"
                boolean r1 = kotlin.jvm.internal.q.a(r4, r1)
                if (r1 == 0) goto L81
                com.ut.mini.UTAnalytics r1 = com.ut.mini.UTAnalytics.getInstance()
                com.ut.mini.UTTracker r1 = r1.getDefaultTracker()
                com.alibaba.triver.triver_shop.container.shopLoft.a r2 = com.alibaba.triver.triver_shop.container.shopLoft.a.this
                android.app.Activity r2 = r2.e()
                r1.pageAppear(r2)
                goto L9b
            L81:
                java.lang.String r1 = "utPageDisappear"
                boolean r1 = kotlin.jvm.internal.q.a(r4, r1)
                if (r1 == 0) goto L9b
                com.ut.mini.UTAnalytics r1 = com.ut.mini.UTAnalytics.getInstance()
                com.ut.mini.UTTracker r1 = r1.getDefaultTracker()
                com.alibaba.triver.triver_shop.container.shopLoft.a r2 = com.alibaba.triver.triver_shop.container.shopLoft.a.this
                android.app.Activity r2 = r2.e()
                r1.pageDisAppear(r2)
            L9b:
                com.alibaba.triver.triver_shop.container.shopLoft.a r1 = com.alibaba.triver.triver_shop.container.shopLoft.a.this
                r2 = 0
                r1.sendEvent(r0, r5, r2)
                tb.ceg$a r0 = tb.ceg.Companion
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "embedSecondFloor onEvent : "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ", data : "
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = r1.toString()
                r0.a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.shopLoft.a.C0125a.a(java.lang.String, com.alibaba.fastjson.JSONObject):void");
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements rir {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rir
        public final void a(Object obj) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            if (obj instanceof String) {
                jSONObject = com.alibaba.triver.triver_shop.newShop.ext.d.a((String) obj);
            } else {
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                jSONObject = (JSONObject) obj;
            }
            if (jSONObject == null || !q.a((Object) "shoploft.page2component.message", (Object) jSONObject.getString("_msg_type"))) {
                return;
            }
            jSONObject.getString("_msg_name");
            JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(jSONObject.getString("_msg_data"));
            if (a2 == null || a.this.m() == null) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.b.b(new EmbedSecondFloorView$messageCallback$1$1(a.this, a2));
        }
    }

    static {
        kge.a(-253451978);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -759742441) {
            super.sendEvent((String) objArr[0], (JSONObject) objArr[1], (IEmbedCallback) objArr[2]);
            return null;
        } else if (hashCode != 1664325763) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Map) objArr[0]);
            return null;
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : "shop-loft";
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    public static final /* synthetic */ void a(a aVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f3fa9dc", new Object[]{aVar, str, jSONObject});
        } else {
            aVar.a(str, jSONObject);
        }
    }

    public final b.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("b6ec23cc", new Object[]{this}) : this.d;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.g;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.h;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.i;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{this, dVar});
        } else {
            this.s = dVar;
        }
    }

    public final com.alibaba.triver.triver_shop.container.shopLoft.b m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.container.shopLoft.b) ipChange.ipc$dispatch("3f445075", new Object[]{this}) : this.n;
    }

    public final void a(ruw<? super String, ? super JSONObject, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, ruwVar});
        } else {
            this.q = ruwVar;
        }
    }

    public final void a(rul<? super JSONObject, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, rulVar});
        } else {
            this.t = rulVar;
        }
    }

    public final rul<JSONObject, t> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("730fa188", new Object[]{this}) : this.t;
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            super.onCreate(map);
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar != null) {
            bVar.onDestroyed();
        }
        ris risVar = this.m;
        if (risVar == null) {
            return;
        }
        risVar.b();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        Object m2371constructorimpl;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        a(map);
        Activity activity = this.p;
        View view = null;
        Application applicationContext = activity == null ? null : activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
        }
        this.m = new ris(applicationContext, "mashop_broadcast", this.r);
        String str3 = this.j;
        if (!this.i) {
            if (q.a((Object) str3, (Object) ShopLoftViewManager.TYPE_VIDEO)) {
                str3 = ShopLoftViewManager.TYPE_MINI_CARD_VIDEO;
                this.g = true;
            }
            if (q.a((Object) str3, (Object) ShopLoftViewManager.TYPE_MARKET)) {
                JSONObject jSONObject2 = this.l;
                if (q.a((Object) "video", (Object) (jSONObject2 == null ? null : jSONObject2.getString("marketType")))) {
                    str3 = ShopLoftViewManager.TYPE_MARKET_VIDEO;
                    this.g = true;
                }
            }
            if (q.a((Object) str3, (Object) ShopLoftViewManager.TYPE_LIVE)) {
                str3 = ShopLoftViewManager.TYPE_MINI_CARD_LIVE;
                this.h = true;
            }
        } else {
            str3 = ShopLoftViewManager.TYPE_SHOP_2023_LIVE;
            com.alibaba.triver.triver_shop.newShop.data.d dVar = this.s;
            if (dVar != null && dVar.bx()) {
                str3 = ShopLoftViewManager.TYPE_SHOP_2023_LIVE_NEW;
            }
            this.h = true;
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar2 = this.s;
        if (dVar2 != null && dVar2.bw()) {
            com.alibaba.triver.triver_shop.newShop.data.d dVar3 = this.s;
            if (dVar3 != null && dVar3.ae()) {
                z = true;
            }
            if (z) {
                str3 = ShopLoftViewManager.TYPE_SHOP_2023_LIVE_NEW;
                this.h = true;
                JSONObject jSONObject3 = this.l;
                if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("data")) != null) {
                    this.l = jSONObject;
                }
            }
        }
        this.n = ShopLoftViewManager.createShopLoftViewByType(str3);
        if (this.n == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            ceg.a aVar2 = ceg.Companion;
            JSONObject jSONObject4 = this.l;
            aVar2.b(q.a("shop loft view init with data : ", (Object) (jSONObject4 == null ? null : jSONObject4.toString())));
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        k kVar = bVar instanceof k ? (k) bVar : null;
        if (kVar != null) {
            kVar.a(new EmbedSecondFloorView$getView$3$1(this));
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar2 = this.n;
        if (bVar2 != null) {
            bVar2.initWithData(e(), this.l, new C0125a(), this.d);
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar3 = this.n;
        if (bVar3 != null) {
            view = bVar3.getView();
        }
        this.o = view;
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar4 = this.n;
        if (bVar4 != null) {
            bVar4.mute(this.e);
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new EmbedSecondFloorView$getView$5(this));
        if (!q.a((Object) str3, (Object) ShopLoftViewManager.TYPE_MARKET)) {
            f();
        }
        return this.o;
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Activity e = e();
        if (e == null || com.alibaba.triver.triver_shop.newShop.ext.b.b((Context) e)) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new EmbedSecondFloorView$showNoWifiTips$1$1(e));
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
            return;
        }
        ruw<? super String, ? super JSONObject, t> ruwVar = this.q;
        if (ruwVar != null) {
            ruwVar.mo2423invoke(str, jSONObject);
        }
        if (getOuterPage() == null) {
            return;
        }
        super.sendEvent(str, jSONObject, iEmbedCallback);
    }

    private final void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("shopLoftEmbed processMessage : " + ((Object) str) + " , " + jSONObject);
        if (str == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1601273667:
                if (!str.equals("willSizing2FullScreen")) {
                    return;
                }
                g();
                return;
            case -1313014864:
                if (!str.equals("didSizing2FullScreen")) {
                    return;
                }
                h();
                return;
            case -934641255:
                if (!str.equals("reload")) {
                }
                return;
            case 3363353:
                if (!str.equals("mute") || jSONObject == null) {
                    return;
                }
                Object obj = jSONObject.get("value");
                if (!(obj instanceof String)) {
                    obj = "false";
                }
                c(q.a(obj, (Object) "true"));
                return;
            case 3443508:
                if (!str.equals("play")) {
                    return;
                }
                k();
                return;
            case 106440182:
                if (!str.equals("pause")) {
                    return;
                }
                l();
                return;
            case 930382652:
                if (!str.equals("didSizing2Normal")) {
                    return;
                }
                j();
                return;
            case 985962185:
                if (!str.equals("willSizing2Normal")) {
                    return;
                }
                i();
                return;
            default:
                return;
        }
    }

    private final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.mute(z);
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.startAnimation();
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.endAnimation();
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.startAnimation();
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.endAnimation();
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.play();
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.pause();
    }

    private final void a(Map<String, String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            ceg.Companion.b(q.a("shopLoftEmbed getView1 : ", (Object) com.alibaba.triver.triver_shop.newShop.ext.b.b(map)));
            this.f3709a = map.get("weexShopToken");
            this.b = map.get("weexShopTabId");
            this.c = map.get("sellerId");
            if (map.containsKey("mute")) {
                this.e = q.a((Object) "true", (Object) map.get("mute"));
            }
            if (map.containsKey("visible")) {
                this.f = q.a((Object) "true", (Object) map.get("visible"));
            }
            if (map.containsKey("contentData")) {
                this.l = com.alibaba.triver.triver_shop.newShop.ext.d.a(map.get("contentData"));
                JSONObject jSONObject3 = this.l;
                if (jSONObject3 != null) {
                    jSONObject3.put("inBigCard", (Object) "true");
                }
            }
            this.k = map.get("contentId");
            this.j = ShopLoftViewManager.getTypeFromSceneId(map.get("contentType"));
            String str = map.get("paddingBottom");
            if (str != null && (jSONObject2 = this.l) != null) {
                jSONObject2.put("paddingBottom", (Object) str);
            }
            String str2 = map.get(com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.ASPECT_RATIO);
            if (str2 == null || (jSONObject = this.l) == null) {
                return;
            }
            jSONObject.put(com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.ASPECT_RATIO, (Object) str2);
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        ceg.Companion.b(q.a("shopLoftEmbed onReceivedMessage : ", (Object) (jSONObject == null ? null : jSONObject.toJSONString())));
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new EmbedSecondFloorView$onReceivedMessage$1(this, str, jSONObject));
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.play();
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.pause();
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.mute(z);
    }

    public final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.p = activity;
        }
    }

    public final Activity e() {
        PageContext pageContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("28c80bbc", new Object[]{this});
        }
        Activity activity = this.p;
        if (activity != null) {
            return activity;
        }
        Page outerPage = getOuterPage();
        if (outerPage != null && (pageContext = outerPage.getPageContext()) != null) {
            return pageContext.getActivity();
        }
        return null;
    }
}
