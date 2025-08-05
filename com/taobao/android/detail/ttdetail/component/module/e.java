package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.b;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.component.module.e;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.utils.bq;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.eyx;
import tb.eyy;
import tb.ezh;
import tb.ezi;
import tb.fpr;
import tb.gbg;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final j f10539a;
    private StringBuilder b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private long h;
    private long i;
    private volatile long j;
    private volatile long k;
    private boolean l;
    private volatile ViewGroup m;
    private volatile boolean n;
    private volatile boolean o;
    private volatile boolean p;
    private volatile boolean q;
    private ComponentViewMeta r;
    private a s;
    private int t;
    private int u;
    private String v;
    private TextView w;

    static {
        kge.a(-586469834);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1857981988) {
            super.onDidAppear();
            return null;
        } else if (hashCode != 1652629691) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.updateComponent();
            return null;
        }
    }

    public static /* synthetic */ int a(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d4108a4", new Object[]{eVar, new Integer(i)})).intValue();
        }
        eVar.t = i;
        return i;
    }

    public static /* synthetic */ ViewGroup a(e eVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("aaceec24", new Object[]{eVar, viewGroup});
        }
        eVar.m = viewGroup;
        return viewGroup;
    }

    public static /* synthetic */ void a(e eVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb27f00", new Object[]{eVar, view});
        } else {
            eVar.d(view);
        }
    }

    public static /* synthetic */ void a(e eVar, ComponentViewMeta componentViewMeta, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d4be49", new Object[]{eVar, componentViewMeta, str});
        } else {
            eVar.a(componentViewMeta, str);
        }
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d414886", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.o = z;
        return z;
    }

    public static /* synthetic */ ViewGroup b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8319f304", new Object[]{eVar}) : eVar.m;
    }

    public static /* synthetic */ void b(e eVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32db6141", new Object[]{eVar, view});
        } else {
            eVar.c(view);
        }
    }

    public static /* synthetic */ boolean b(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7b6e907", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.n = z;
        return z;
    }

    public static /* synthetic */ void c(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922c8984", new Object[]{eVar, new Boolean(z)});
        } else {
            eVar.a(z);
        }
    }

    public static /* synthetic */ boolean c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2a69354", new Object[]{eVar})).booleanValue() : eVar.q;
    }

    public static /* synthetic */ boolean d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8aa5eb3", new Object[]{eVar})).booleanValue() : eVar.a();
    }

    public static /* synthetic */ boolean d(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ca22a09", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.q = z;
        return z;
    }

    public static /* synthetic */ void e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceae2a0e", new Object[]{eVar});
        } else {
            eVar.b();
        }
    }

    public static /* synthetic */ boolean f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4b1f571", new Object[]{eVar})).booleanValue() : eVar.d();
    }

    public static /* synthetic */ void g(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab5c0cc", new Object[]{eVar});
        } else {
            eVar.c();
        }
    }

    public static /* synthetic */ ComponentViewMeta i(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComponentViewMeta) ipChange.ipc$dispatch("2627cb39", new Object[]{eVar}) : eVar.r;
    }

    public static /* synthetic */ void j(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc122e9", new Object[]{eVar});
        } else {
            eVar.h();
        }
    }

    public e(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.f10539a = new j(-1, -1, 17);
        this.b = new StringBuilder();
        this.h = -1L;
        this.i = -1L;
        this.l = Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sShowDxRenderCost));
        this.o = false;
        this.q = false;
        this.t = 0;
        this.u = 0;
        this.s = new a(this, null);
        this.r = this.mDetailContext.d().a(this.mComponentData.c());
        this.v = g();
    }

    private String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        JSONObject d = this.mComponentData.d();
        if (d != null && !d.isEmpty()) {
            return d.getString("style");
        }
        return null;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view}) : a(view);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public j onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dd5270c3", new Object[]{this, new Integer(i), new Integer(i2)}) : this.f10539a;
    }

    public View a(View view) {
        View findViewById;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.ll_dinamicx_with_time_container) {
            com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.mContext);
            if (a2 != null) {
                view = a2.a(this.mContext, R.layout.tt_detail_dinamicx_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_dinamicx_component, (ViewGroup) null);
            }
        }
        if (this.l) {
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.vs_time_container);
            if (viewStub != null) {
                findViewById = viewStub.inflate();
            } else {
                findViewById = view.findViewById(R.id.ll_time_container);
            }
            this.c = (TextView) findViewById.findViewById(R.id.tv_dx_create_time);
            this.d = (TextView) findViewById.findViewById(R.id.tv_dx_render_time);
            this.w = (TextView) findViewById.findViewById(R.id.tv_dx_ultron_name);
            this.e = (TextView) findViewById.findViewById(R.id.tv_dx_name);
            this.f = (TextView) findViewById.findViewById(R.id.tv_dx_version);
            this.g = (TextView) findViewById.findViewById(R.id.tv_dx_detail_info);
            findViewById.setVisibility(0);
        }
        ViewGroup b = b(view);
        if (this.m == null || b != this.m) {
            z = false;
        }
        this.n = z;
        if (this.n && !i()) {
            this.n = false;
        }
        this.m = b;
        c(view);
        if (this.q || this.o || (d() && this.m.getChildCount() <= 0)) {
            b();
        } else {
            c();
        }
        view.setTag(R.id.tt_detail_dx_view_bind_component_id, Integer.valueOf(hashCode()));
        if (com.taobao.android.detail.ttdetail.utils.e.a(this.mContext) && (view instanceof ObserverFrameLayout)) {
            ((ObserverFrameLayout) view).setOnSizeChangedListener(new f(this));
        }
        return view;
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (this.mView != null && (this.mView.getTag(R.id.tt_detail_dx_view_bind_component_data_id) instanceof String)) {
            return ((String) this.mView.getTag(R.id.tt_detail_dx_view_bind_component_data_id)).equals(this.mComponentData.b());
        }
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void updateComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628120bb", new Object[]{this});
            return;
        }
        super.updateComponent();
        this.n = false;
        if (!a()) {
            return;
        }
        a(true);
    }

    private boolean a() {
        Object tag;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : (this.mView == null || (tag = this.mView.getTag(R.id.tt_detail_dx_view_bind_component_id)) == null || tag.hashCode() != hashCode()) ? false : true;
    }

    private void b() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.mView == null || (findViewById = this.mView.findViewById(R.id.ll_dinamicx_container)) == null) {
        } else {
            findViewById.setVisibility(8);
        }
    }

    private void c() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.mView == null || (findViewById = this.mView.findViewById(R.id.ll_dinamicx_container)) == null) {
        } else {
            findViewById.setVisibility(0);
        }
    }

    private ViewGroup b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, view});
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ll_dinamicx_container);
        View childAt = frameLayout.getChildCount() == 1 ? frameLayout.getChildAt(0) : null;
        if (!(childAt instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) childAt;
    }

    private void c(View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else if (view == null) {
        } else {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ll_dinamicx_container);
            if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == this.m) {
                z = false;
            }
            if (!z) {
                return;
            }
            frameLayout.removeAllViews();
            if (this.m == null) {
                return;
            }
            ViewParent parent = this.m.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.m);
            }
            frameLayout.addView(this.m, new FrameLayout.LayoutParams(-2, -2, 83));
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        boolean d = com.taobao.android.detail.ttdetail.utils.a.d(this.mComponentData);
        if (d) {
            super.onDidAppear();
        }
        f();
        a(true);
        if (!d) {
            return;
        }
        h();
    }

    private void a(ComponentViewMeta componentViewMeta, String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54749f", new Object[]{this, componentViewMeta, str});
        } else if (!this.l || this.w == null || this.e == null || this.f == null || this.g == null) {
        } else {
            if (componentViewMeta != null) {
                str2 = "dxName: " + componentViewMeta.getName();
                str3 = "dxVersion: " + componentViewMeta.getVersion();
            } else {
                str2 = "dxName: error";
                str3 = "dxVersion: error";
            }
            if (TextUtils.isEmpty(str)) {
                str = "no info";
            }
            this.w.setText(j());
            this.e.setText(str2);
            this.f.setText(str3);
            this.g.setText(str);
        }
    }

    private String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        String b = bq.b(this);
        return !TextUtils.isEmpty(b) ? b : "dxUltronName: error";
    }

    private void d(View view) {
        DXTemplateItem dxTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{this, view});
        } else if (this.l && this.w != null && this.e != null && this.f != null && this.g != null) {
            String str = "dxName: error";
            String str2 = "dxVersion: error";
            String str3 = "";
            if (view instanceof DXRootView) {
                DXRootView dXRootView = (DXRootView) view;
                if (dXRootView.getDxTemplateItem() != null) {
                    str = "dxName: " + dxTemplateItem.f();
                    str2 = "dxVersion: " + dxTemplateItem.g();
                }
                Map<String, String> perfromTrackData = dXRootView.getPerfromTrackData();
                if (perfromTrackData != null) {
                    StringBuilder sb = this.b;
                    sb.delete(0, sb.length());
                    for (Map.Entry<String, String> entry : perfromTrackData.entrySet()) {
                        StringBuilder sb2 = this.b;
                        sb2.append(", ");
                        sb2.append(entry.getKey());
                        sb2.append(ResponseProtocolType.COMMENT);
                        sb2.append(entry.getValue());
                    }
                    if (this.b.length() >= 2) {
                        str3 = this.b.substring(2);
                    }
                }
            }
            this.w.setText(j());
            this.e.setText(str);
            this.f.setText(str2);
            this.g.setText(str3);
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.m != null && ((float) this.m.getMeasuredHeight()) > ((float) com.taobao.android.detail.ttdetail.utils.f.b(this.mContext)) * 1.0086f;
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile boolean b;

        static {
            kge.a(686960256);
            kge.a(-1390502639);
        }

        private a() {
            e.this = r1;
        }

        public /* synthetic */ a(e eVar, f fVar) {
            this();
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e.b(e.this) == null) {
            } else {
                if (e.c(e.this)) {
                    if (!e.d(e.this)) {
                        return;
                    }
                    e.e(e.this);
                } else if (this.b && e.f(e.this)) {
                    com.taobao.android.detail.ttdetail.utils.i.a(com.alibaba.android.ultron.vfw.viewholder.d.TAG_DINAMICX_VIEW_COMPONENT, "renderDinamicX() failure: dinamicXView measuredHeight > 1.0086f * screenHeight");
                    e.a(e.this, true);
                    if (!e.d(e.this)) {
                        return;
                    }
                    e.e(e.this);
                    com.taobao.android.detail.ttdetail.utils.i.a(com.alibaba.android.ultron.vfw.viewholder.d.TAG_DINAMICX_VIEW_COMPONENT, "renderDinamicX() failure: hide dx view");
                } else {
                    e.a(e.this, false);
                    if (!e.d(e.this)) {
                        return;
                    }
                    e.g(e.this);
                }
            }
        }
    }

    private void a(boolean z) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.m == null || this.r == null) {
        } else {
            if (!this.n) {
                long currentTimeMillis = System.currentTimeMillis();
                int a2 = gbg.a();
                int b = gbg.b();
                int i = this.t;
                if (i != 0) {
                    a2 = DXWidgetNode.DXMeasureSpec.a(i, 1073741824);
                } else {
                    int a3 = com.taobao.android.detail.ttdetail.utils.f.a(this.mContext);
                    boolean a4 = com.taobao.android.detail.ttdetail.utils.e.a(this.mContext);
                    if (TextUtils.equals(com.taobao.android.detail.ttdetail.constant.a.STYLE_DOUBLE_COLUMN, this.v)) {
                        if (a4) {
                            a3 /= 2;
                        }
                        a2 = a(a3, a4 ? 12.0f : 24.0f);
                    } else if (a4) {
                        a2 = a(a3, 32.0f);
                    }
                }
                int i2 = a2;
                int i3 = this.u;
                if (i3 != 0) {
                    b = DXWidgetNode.DXMeasureSpec.a(i3, 1073741824);
                }
                this.mDetailContext.f().a(this.m, i2, b, this.mComponentData.e(), new g(this));
                this.k++;
                if (!z) {
                    this.mDetailContext.b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.component.module.e.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            e.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                com.taobao.android.detail.ttdetail.communication.c.a(e.this.mContext, new DescNativeController.a(e.this.mComponentData.b()));
                            }
                        }
                    });
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                this.i = currentTimeMillis2 - currentTimeMillis;
                av.d(this.mDetailContext, this.mDetailContext.a().c() ? "preDxRender" : "dxRender", this.i);
                av.b(this.mDetailContext, "lastDxRender", currentTimeMillis2);
                if (this.l && (textView = this.d) != null) {
                    StringBuilder sb = new StringBuilder("render: ");
                    sb.append(this.i);
                    sb.append("(ms);N: ");
                    sb.append(this.k);
                    textView.setText(sb);
                }
            }
            if (!com.taobao.android.detail.ttdetail.utils.a.a(this.mComponentData) || this.p) {
                return;
            }
            new com.taobao.android.detail.ttdetail.async.b(this.mDetailContext).a(this.mComponentData, new AnonymousClass2(), appendTriggerComponent(true, new RuntimeAbilityParam[0]));
            this.p = true;
        }
    }

    /* renamed from: com.taobao.android.detail.ttdetail.component.module.e$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass2() {
            e.this = r1;
        }

        @Override // com.taobao.android.detail.ttdetail.async.b.a
        public void a(JSONObject jSONObject, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            } else if (com.taobao.android.detail.ttdetail.utils.a.b(e.this.mComponentData)) {
                e.b(e.this, false);
                if (!e.d(e.this)) {
                    return;
                }
                e.this.fireExposeEvent(new RuntimeAbilityParam[0]);
                e.c(e.this, false);
                e.j(e.this);
            } else {
                a("not set component fields asyncStatus=success");
            }
        }

        @Override // com.taobao.android.detail.ttdetail.async.b.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            e.d(e.this, true);
            if (e.this.mDetailContext != null && e.this.mDetailContext.e() != null) {
                z = true;
            }
            final String str2 = "";
            final String str3 = z ? (String) e.this.mDetailContext.e().a("traceId") : str2;
            if (z) {
                str2 = (String) e.this.mDetailContext.e().a("requestItemId");
            }
            ae.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent$4$1
                {
                    put("itemId", str2);
                    put("traceId", str3);
                    put("DxName", e.i(e.this).getName());
                    put("DxVersion", e.i(e.this).getVersion());
                    put("isAsyncDx", Boolean.TRUE.toString());
                }
            }, -100008, str);
            com.taobao.android.detail.ttdetail.utils.i.a(com.alibaba.android.ultron.vfw.viewholder.d.TAG_DINAMICX_VIEW_COMPONENT, "AsyncProcessor().process() failure: " + str);
            if (!e.d(e.this)) {
                return;
            }
            e.e(e.this);
        }
    }

    private int a(int i, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c114778", new Object[]{this, new Integer(i), new Float(f)})).intValue() : DXWidgetNode.DXMeasureSpec.a((i - fpr.a(this.mContext, f)) / 2, 1073741824);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!(this.m instanceof DXRootView)) {
        } else {
            this.mDetailContext.f().a((DXRootView) this.m);
        }
    }

    private ViewGroup e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4fb55629", new Object[]{this});
        }
        if (this.mView != null) {
            return (ViewGroup) this.mView.findViewById(R.id.ll_dinamicx_container);
        }
        return null;
    }

    private void f() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.m != null || this.r == null) {
        } else {
            ezi c = new ezi().a(this.r.getName()).b(this.r.getVersion()).c(this.r.getUrl());
            long currentTimeMillis = System.currentTimeMillis();
            this.m = this.mDetailContext.f().a(c, e(), new AnonymousClass3(com.taobao.android.detail.ttdetail.utils.a.a(this.mComponentData)));
            this.j++;
            long currentTimeMillis2 = System.currentTimeMillis();
            this.h = currentTimeMillis2 - currentTimeMillis;
            av.b(this.mDetailContext, "lastDxRender", currentTimeMillis2);
            c(this.mView);
            if (!this.l || (textView = this.c) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("create: ");
            sb.append(this.h);
            sb.append("(ms);N: ");
            sb.append(this.j);
            textView.setText(sb);
        }
    }

    /* renamed from: com.taobao.android.detail.ttdetail.component.module.e$3 */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements ezh.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ boolean f10540a;

        public AnonymousClass3(boolean z) {
            e.this = r1;
            this.f10540a = z;
        }

        @Override // tb.ezh.b
        public void a(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
                return;
            }
            e.a(e.this, viewGroup);
            e.b(e.this, false);
            if (!e.d(e.this)) {
                return;
            }
            e eVar = e.this;
            e.b(eVar, eVar.mView);
            e.c(e.this, false);
        }

        @Override // tb.ezh.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            ae.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.component.module.DinamicXComponent$5$1
                {
                    put("DxName", e.i(e.this).getName());
                    put("DxVersion", e.i(e.this).getVersion());
                    put("isAsyncDx", String.valueOf(e.AnonymousClass3.this.f10540a));
                }
            }, -100006, str);
            com.taobao.android.detail.ttdetail.utils.i.a(com.alibaba.android.ultron.vfw.viewholder.d.TAG_DINAMICX_VIEW_COMPONENT, "createDinamicX() failure: " + str);
        }
    }
}
