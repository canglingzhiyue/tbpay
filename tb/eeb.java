package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.etao.feimagesearch.util.ag;
import com.etao.feimagesearch.util.ah;
import com.etao.feimagesearch.util.s;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.cpr;

/* loaded from: classes3.dex */
public final class eeb extends ctc<bry, com.etao.feimagesearch.model.b, CaptureManager> implements cpr.b, cps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f27225a;
    private FrameLayout g;
    private View h;
    private View i;
    private View j;
    private p k;
    private boolean l;
    private JSONObject m;
    private boolean n;
    private int o;
    private int p;

    /* loaded from: classes3.dex */
    public static final class b extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public b(boolean z, ViewGroup viewGroup, boolean z2, int i, int i2) {
            this.b = z;
            this.c = viewGroup;
            this.d = z2;
            this.e = i;
            this.f = i2;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (this.b) {
                this.c.removeAllViews();
                this.c.addView(eeb.d(eeb.this), -1, -1);
                eeb.b(eeb.this, this.d);
            }
            eeb.this.b(this.e, this.f);
        }
    }

    static {
        kge.a(1352718890);
        kge.a(605119092);
        kge.a(469456750);
    }

    public static /* synthetic */ Object ipc$super(eeb eebVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1474194533:
                super.a(((Number) objArr[0]).intValue());
                return null;
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 95609325:
                super.f();
                return null;
            case 1978668644:
                super.B_();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.cpr.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    public static final /* synthetic */ p a(eeb eebVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("a19b1253", new Object[]{eebVar}) : eebVar.k;
    }

    public static final /* synthetic */ void a(eeb eebVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eebc75be", new Object[]{eebVar, new Boolean(z)});
        } else {
            eebVar.l = z;
        }
    }

    public static final /* synthetic */ FrameLayout b(eeb eebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("205c8c22", new Object[]{eebVar});
        }
        FrameLayout frameLayout = eebVar.g;
        if (frameLayout == null) {
            q.b("browsedContainer");
        }
        return frameLayout;
    }

    public static final /* synthetic */ void b(eeb eebVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09a3f5d", new Object[]{eebVar, new Boolean(z)});
        } else {
            eebVar.b(z);
        }
    }

    public static final /* synthetic */ JSONObject c(eeb eebVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("33e68ff8", new Object[]{eebVar}) : eebVar.m;
    }

    public static final /* synthetic */ FrameLayout d(eeb eebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ce986de0", new Object[]{eebVar});
        }
        FrameLayout frameLayout = eebVar.f27225a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tb.bry, tb.ctb] */
    @Override // tb.ctc
    public /* synthetic */ bry b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeb(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> cteVar) {
        super(activity, cteVar, true);
        q.c(activity, "activity");
    }

    @Override // tb.ctc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.feis_view_capture_borwsed, (ViewGroup) null, false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f27225a = (FrameLayout) inflate;
        FrameLayout frameLayout = this.f27225a;
        if (frameLayout == null) {
            q.b("rootView");
        }
        View findViewById = frameLayout.findViewById(R.id.fl_browsed_container);
        q.a((Object) findViewById, "rootView.findViewById(R.id.fl_browsed_container)");
        this.g = (FrameLayout) findViewById;
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 == null) {
            q.b("browsedContainer");
        }
        frameLayout2.setTranslationY(-j.b(40.0f));
        FrameLayout frameLayout3 = this.f27225a;
        if (frameLayout3 == null) {
            q.b("rootView");
        }
        View findViewById2 = frameLayout3.findViewById(R.id.fl_empty_container);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.fl_empty_container)");
        this.h = findViewById2;
        View view = this.h;
        if (view == null) {
            q.b("hintContainer");
        }
        view.setVisibility(0);
        FrameLayout frameLayout4 = this.f27225a;
        if (frameLayout4 == null) {
            q.b("rootView");
        }
        View findViewById3 = frameLayout4.findViewById(R.id.ll_empty_hint);
        q.a((Object) findViewById3, "rootView.findViewById(R.id.ll_empty_hint)");
        this.i = findViewById3;
        FrameLayout frameLayout5 = this.f27225a;
        if (frameLayout5 == null) {
            q.b("rootView");
        }
        View findViewById4 = frameLayout5.findViewById(R.id.iv_empty_hint);
        q.a((Object) findViewById4, "rootView.findViewById<TU…View>(R.id.iv_empty_hint)");
        ((TUrlImageView) findViewById4).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01p6cuBa1ClvBluXI7s_!!6000000000122-2-tps-104-102.png");
        FrameLayout frameLayout6 = this.f27225a;
        if (frameLayout6 == null) {
            q.b("rootView");
        }
        View findViewById5 = frameLayout6.findViewById(R.id.ll_empty_full);
        q.a((Object) findViewById5, "rootView.findViewById(R.id.ll_empty_full)");
        this.j = findViewById5;
        FrameLayout frameLayout7 = this.f27225a;
        if (frameLayout7 == null) {
            q.b("rootView");
        }
        TextView textView = (TextView) frameLayout7.findViewById(R.id.tv_empty_hint);
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        textView.setTextSize(1, manager.W() ? 17.0f : 15.0f);
        FrameLayout frameLayout8 = this.f27225a;
        if (frameLayout8 == null) {
            q.b("rootView");
        }
        View findViewById6 = frameLayout8.findViewById(R.id.iv_empty_hint_full);
        q.a((Object) findViewById6, "rootView.findViewById<TU…(R.id.iv_empty_hint_full)");
        ((TUrlImageView) findViewById6).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01p6cuBa1ClvBluXI7s_!!6000000000122-2-tps-104-102.png");
        k();
        i();
    }

    public bry g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bry) ipChange.ipc$dispatch("3d2ccc4f", new Object[]{this}) : new bry();
    }

    @Override // tb.ctc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        try {
            p pVar = this.k;
            if (pVar == null) {
                return;
            }
            pVar.onActivityResume();
        } catch (Exception unused) {
        }
    }

    @Override // tb.ctc
    public void B_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f01664", new Object[]{this});
            return;
        }
        super.B_();
        try {
            p pVar = this.k;
            if (pVar == null) {
                return;
            }
            pVar.onActivityPause();
        } catch (Exception unused) {
        }
    }

    @Override // tb.ctc
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        p pVar = this.k;
        if (pVar != null && !pVar.isDestroyed()) {
            pVar.destroy();
        }
        this.k = null;
    }

    @Override // tb.ctc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        super.a(i);
        p pVar = this.k;
        if (pVar == null) {
            return;
        }
        pVar.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, ScreenType.a(i));
        pVar.refresh(null, null);
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                q.b("browsedContainer");
            }
            frameLayout.setVisibility(8);
            View view = this.h;
            if (view == null) {
                q.b("hintContainer");
            }
            view.setVisibility(0);
            c(this.o, this.p);
        } else {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                q.b("browsedContainer");
            }
            frameLayout2.setVisibility(0);
            View view2 = this.h;
            if (view2 == null) {
                q.b("hintContainer");
            }
            view2.setVisibility(8);
            if (this.l) {
                p pVar = this.k;
                if (pVar == null) {
                    return;
                }
                pVar.refresh(jSONObject, null);
                return;
            }
            this.m = jSONObject;
        }
    }

    @Override // tb.cpr.b
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        b(i, i2);
        if (i <= i2 / 2) {
            z = false;
        }
        b(z);
    }

    @Override // tb.cpr.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        p pVar = this.k;
        if (pVar == null) {
            return false;
        }
        if (pVar == null) {
            q.a();
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) ah.a(pVar.getRenderRoot(), XslMUSLayout.class);
        if (xslMUSLayout != null) {
            return xslMUSLayout.isReachTop();
        }
        return false;
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.o == i) {
        } else {
            this.o = i;
            this.p = i2;
            c(i, i2);
        }
    }

    public void a(ViewGroup container, boolean z, boolean z2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7411d007", new Object[]{this, container, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2)});
            return;
        }
        q.c(container, "container");
        if (this.n == z) {
            return;
        }
        this.n = z;
        ad.c("CaptureBrowsedView_addView", new b(z, container, z2, i, i2));
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.h;
            if (view == null) {
                q.b("hintContainer");
            }
            if (view.getVisibility() == 0) {
                return;
            }
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                q.b("browsedContainer");
            }
            frameLayout.setTranslationY(0.0f);
        } else {
            FrameLayout frameLayout2 = this.g;
            if (frameLayout2 == null) {
                q.b("browsedContainer");
            }
            frameLayout2.setTranslationY(-j.b(40.0f));
        }
    }

    private final void i() {
        LinkedHashMap linkedHashMap;
        com.etao.feimagesearch.model.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        p pVar = this.k;
        if (pVar == null) {
            return;
        }
        String k = com.etao.feimagesearch.config.b.k("orangeCameraTab3Url");
        if (StringUtils.isEmpty(k)) {
            k = com.etao.feimagesearch.capture.dynamic.templates.b.a("plt_camera_page_tab3");
            if (StringUtils.isEmpty(k)) {
                k = com.etao.feimagesearch.config.b.aQ();
            }
        }
        String str = k;
        cte<M, C> cteVar = this.c;
        if (cteVar == 0 || (bVar = (com.etao.feimagesearch.model.b) cteVar.h()) == null || (linkedHashMap = bVar.getAllParams()) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(com.taobao.vessel.utils.b.WX_TPL, str);
        String a2 = ag.a("https://h5.m.taobao.com/tusou/image_editor/index.html?", linkedHashMap);
        q.a((Object) a2, "UrlUtil.appendQueryParam…,\n      innerParams\n    )");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            if (!StringUtils.isEmpty(entry.getKey()) && !StringUtils.isEmpty(entry.getValue())) {
                jSONObject.put((JSONObject) entry.getKey(), entry.getValue());
            }
        }
        s.Companion.a(pVar, str, a2, jSONObject, null);
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        p a2 = com.taobao.android.weex_framework.q.a().a(this.d);
        a2.setTag(XslMUSComponent.KEY_META_SEARCH, Boolean.valueOf(com.etao.feimagesearch.config.b.bQ()));
        a2.registerRenderListener(new a());
        ScreenType a3 = ScreenType.a(this.d);
        if (a3 != null) {
            a2.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, ScreenType.a(a3.a()));
        }
        this.k = a2;
    }

    /* loaded from: classes3.dex */
    public static final class a implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.weex_framework.g
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onFatalException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onForeground(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onJSException(p pVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onPrepareSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRefreshSuccess(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
            }
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderFailed(p pVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            }
        }

        public a() {
        }

        @Override // com.taobao.android.weex_framework.g
        public void onRenderSuccess(p pVar) {
            p a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                return;
            }
            eeb.a(eeb.this, true);
            p a3 = eeb.a(eeb.this);
            eeb.b(eeb.this).addView(a3 != null ? a3.getRenderRoot() : null);
            JSONObject c = eeb.c(eeb.this);
            if (c == null || (a2 = eeb.a(eeb.this)) == null) {
                return;
            }
            a2.refresh(c, null);
        }
    }

    private final void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        View view = this.h;
        if (view == null) {
            q.b("hintContainer");
        }
        if (view.getVisibility() != 0) {
            return;
        }
        if (i <= i2 / 3) {
            z = false;
        }
        if (z) {
            View view2 = this.i;
            if (view2 == null) {
                q.b("emptyHintView");
            }
            if (view2.getVisibility() != 8) {
                View view3 = this.i;
                if (view3 == null) {
                    q.b("emptyHintView");
                }
                view3.setVisibility(8);
                View view4 = this.i;
                if (view4 == null) {
                    q.b("emptyHintView");
                }
                view4.setVisibility(8);
            }
            View view5 = this.j;
            if (view5 == null) {
                q.b("emptyHintFullView");
            }
            if (view5.getVisibility() != 0) {
                View view6 = this.j;
                if (view6 == null) {
                    q.b("emptyHintFullView");
                }
                view6.setVisibility(0);
            }
        } else {
            View view7 = this.i;
            if (view7 == null) {
                q.b("emptyHintView");
            }
            if (view7.getVisibility() != 0) {
                View view8 = this.i;
                if (view8 == null) {
                    q.b("emptyHintView");
                }
                view8.setVisibility(0);
                View view9 = this.i;
                if (view9 == null) {
                    q.b("emptyHintView");
                }
                view9.setVisibility(0);
            }
            View view10 = this.j;
            if (view10 == null) {
                q.b("emptyHintFullView");
            }
            if (view10.getVisibility() != 8) {
                View view11 = this.j;
                if (view11 == null) {
                    q.b("emptyHintFullView");
                }
                view11.setVisibility(8);
            }
        }
        View view12 = this.i;
        if (view12 == null) {
            q.b("emptyHintView");
        }
        if (view12.getVisibility() == 0) {
            View view13 = this.i;
            if (view13 == null) {
                q.b("emptyHintView");
            }
            ViewGroup.LayoutParams layoutParams = view13.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = ((i - j.a(48.0f)) - cpr.Companion.a()) / 2;
            View view14 = this.i;
            if (view14 == null) {
                q.b("emptyHintView");
            }
            view14.setLayoutParams(layoutParams2);
        }
        View view15 = this.j;
        if (view15 == null) {
            q.b("emptyHintFullView");
        }
        if (view15.getVisibility() != 0) {
            return;
        }
        View view16 = this.j;
        if (view16 == null) {
            q.b("emptyHintFullView");
        }
        ViewGroup.LayoutParams layoutParams3 = view16.getLayoutParams();
        if (layoutParams3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = ((i - cpr.Companion.a()) / 2) - j.a(152.0f);
        View view17 = this.j;
        if (view17 == null) {
            q.b("emptyHintFullView");
        }
        view17.setLayoutParams(layoutParams4);
    }
}
