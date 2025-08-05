package com.taobao.android.detail.core.detail.content;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.standard.widget.a;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.tao.util.SystemBarDecorator;
import tb.ecg;
import tb.emu;
import tb.hjs;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f9450a;
    private DetailCoreActivity b;
    private com.taobao.android.detail.core.standard.widget.a c;
    private DXRootView d;
    private DXRecyclerLayout e;
    private bd f;
    private int g;
    private int h;

    static {
        kge.a(-876521954);
    }

    public static /* synthetic */ FrameLayout a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("8ae6ce78", new Object[]{gVar}) : gVar.f9450a;
    }

    public static /* synthetic */ DXRootView a(g gVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("b0f57555", new Object[]{gVar, dXRootView});
        }
        gVar.d = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ DXRecyclerLayout a(g gVar, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("cdaf3e7", new Object[]{gVar, dXRecyclerLayout});
        }
        gVar.e = dXRecyclerLayout;
        return dXRecyclerLayout;
    }

    public static /* synthetic */ boolean a(g gVar, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ef61dae", new Object[]{gVar, dXTemplateItem})).booleanValue() : gVar.a(dXTemplateItem);
    }

    public static /* synthetic */ DetailCoreActivity b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("bc9e86b", new Object[]{gVar}) : gVar.b;
    }

    public g(DetailCoreActivity detailCoreActivity, bd bdVar) {
        this.b = detailCoreActivity;
        this.f = bdVar;
        this.c = new com.taobao.android.detail.core.standard.widget.a(detailCoreActivity, this.f.d());
        this.f9450a = new FrameLayout(this.b);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        this.h = SystemBarDecorator.getStatusBarHeight(this.b);
        this.g = h();
        this.f9450a.setPadding(0, this.h + this.g, 0, 0);
        this.f9450a.setLayoutParams(marginLayoutParams);
        this.f9450a.setBackgroundColor(-1);
        emu.a("com.taobao.android.detail.core.detail.content.ContentViewManager");
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f9450a;
    }

    public void a(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b62daff", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem == null) {
        } else {
            if (a(dXTemplateItem)) {
                this.c.a(this.d, jSONObject, b(), new a());
            } else {
                this.c.a(dXTemplateItem, jSONObject, b(), new a());
            }
        }
    }

    private boolean a(DXTemplateItem dXTemplateItem) {
        DXTemplateItem dxTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        DXRootView dXRootView = this.d;
        return (dXRootView == null || (dxTemplateItem = dXRootView.getDxTemplateItem()) == null || dxTemplateItem.b != dXTemplateItem.b) ? false : true;
    }

    public void b(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ef9b5e", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem == null) {
        } else {
            this.c.a(dXTemplateItem, jSONObject, b(), new a());
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : (this.b.b.z().getHeight() - this.h) - this.g;
    }

    public void c(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7c5bbd", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem == null) {
        } else {
            if (a(dXTemplateItem)) {
                a(jSONObject);
            } else {
                this.c.a(dXTemplateItem, jSONObject, b(), new a());
            }
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || this.e == null) {
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray(hjs.UNDER_TAKE_GOODS_LIST);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONArray);
            f.a(DXRecyclerLayout.MSG_METHOD_REFRESH_DATA, jSONObject2, this.e);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            this.d = null;
            this.e = null;
            this.f9450a.removeAllViews();
            com.taobao.android.detail.core.utils.i.d("ContentFrameLayout", "removeAllViews");
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("ContentFrameLayout", "clear error : ", e);
        }
    }

    private int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        TypedValue typedValue = new TypedValue();
        if (!this.b.getTheme().resolveAttribute(16843499, typedValue, true)) {
            return 0;
        }
        return TypedValue.complexToDimensionPixelSize(typedValue.data, this.b.getResources().getDisplayMetrics());
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.e == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str);
            f.a(DXRecyclerLayout.MSG_METHOD_LOAD_MORE, jSONObject, this.e);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.e;
        if (dXRecyclerLayout == null) {
            return;
        }
        dXRecyclerLayout.a(false, i);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            g();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            f();
        }
    }

    /* loaded from: classes4.dex */
    public class a implements a.InterfaceC0381a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1687173214);
            kge.a(860016297);
        }

        private a() {
        }

        @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
        public void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem, dXResult});
                return;
            }
            boolean a2 = g.a(g.this, dXTemplateItem);
            g.a(g.this, dXResult.f11780a);
            g.a(g.this, (DXRecyclerLayout) dXResult.f11780a.getExpandWidgetNode().queryWidgetNodeByUserId("recyclerContentList"));
            if (a2) {
                return;
            }
            g.a(g.this).removeAllViews();
            g.a(g.this).addView(dXResult.f11780a);
        }

        @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
        public void a(DXTemplateItem dXTemplateItem, s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d32a2d0", new Object[]{this, dXTemplateItem, sVar});
                return;
            }
            com.taobao.android.detail.core.utils.i.a("ContentViewManager", "render dx failed, error : " + sVar);
            if (sVar == null || dXTemplateItem == null) {
                return;
            }
            if (String.valueOf(30005).equals(sVar.f11919a)) {
                ecg.b(g.b(g.this), dXTemplateItem.f11925a, String.valueOf(dXTemplateItem.b), dXTemplateItem.c);
            } else {
                ecg.a(g.b(g.this), dXTemplateItem.f11925a, String.valueOf(dXTemplateItem.b), dXTemplateItem.c, sVar.toString());
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.e == null) {
        } else {
            this.f.d().b(this.d);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.e == null) {
        } else {
            this.f.d().a(this.d);
        }
    }
}
