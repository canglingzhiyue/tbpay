package com.taobao.android.detail.core.standard.widget;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.ak;
import java.util.Collections;
import java.util.List;
import tb.dln;
import tb.eaz;
import tb.emu;
import tb.fut;
import tb.fvb;
import tb.fve;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final DinamicXEngine f9887a;
    private final Context b;
    private boolean c;

    /* renamed from: com.taobao.android.detail.core.standard.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0381a {
        void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult);

        void a(DXTemplateItem dXTemplateItem, s sVar);
    }

    static {
        kge.a(1347394666);
    }

    public static /* synthetic */ View a(a aVar, DXTemplateItem dXTemplateItem, JSONObject jSONObject, boolean z, int i, boolean z2, int i2, InterfaceC0381a interfaceC0381a, ba baVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4ee71b5f", new Object[]{aVar, dXTemplateItem, jSONObject, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2), interfaceC0381a, baVar}) : aVar.b(dXTemplateItem, jSONObject, z, i, z2, i2, interfaceC0381a, baVar);
    }

    public static /* synthetic */ DinamicXEngine a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("6f967e93", new Object[]{aVar}) : aVar.f9887a;
    }

    public static /* synthetic */ DXTemplateItem a(a aVar, String str, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("6b82570", new Object[]{aVar, str, list}) : aVar.a(str, list);
    }

    public a(Context context, DinamicXEngine dinamicXEngine) {
        this.f9887a = dinamicXEngine;
        this.b = context;
        emu.a("com.taobao.android.detail.core.standard.widget.DXViewLoader");
    }

    public DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("4d3f629f", new Object[]{this}) : this.f9887a;
    }

    public a(Context context) {
        this.f9887a = new bd(eaz.b()).d();
        this.b = context;
        this.c = true;
        emu.a("com.taobao.android.detail.core.standard.widget.DXViewLoader");
    }

    public void a(long j, ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a2b983", new Object[]{this, new Long(j), akVar});
        } else {
            this.f9887a.a(j, akVar);
        }
    }

    public void a(long j, bn bnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa971a4c", new Object[]{this, new Long(j), bnVar});
        } else {
            this.f9887a.a(j, bnVar);
        }
    }

    public void a(long j, fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926eae27", new Object[]{this, new Long(j), futVar});
        } else {
            this.f9887a.a(j, futVar);
        }
    }

    public void a(long j, dln dlnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e836f26", new Object[]{this, new Long(j), dlnVar});
        } else {
            this.f9887a.a(j, dlnVar);
        }
    }

    public View a(DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i, InterfaceC0381a interfaceC0381a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4f927b15", new Object[]{this, dXTemplateItem, jSONObject, new Integer(i), interfaceC0381a}) : a(dXTemplateItem, jSONObject, true, i, interfaceC0381a);
    }

    public View a(DXTemplateItem dXTemplateItem, JSONObject jSONObject, InterfaceC0381a interfaceC0381a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("34ca05f0", new Object[]{this, dXTemplateItem, jSONObject, interfaceC0381a}) : a(dXTemplateItem, jSONObject, false, 0, interfaceC0381a);
    }

    public View a(DXTemplateItem dXTemplateItem, JSONObject jSONObject, boolean z, int i, InterfaceC0381a interfaceC0381a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4f59359f", new Object[]{this, dXTemplateItem, jSONObject, new Boolean(z), new Integer(i), interfaceC0381a}) : a(dXTemplateItem, jSONObject, z, i, interfaceC0381a, null);
    }

    public View a(DXTemplateItem dXTemplateItem, JSONObject jSONObject, boolean z, int i, InterfaceC0381a interfaceC0381a, ba baVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("45271e7c", new Object[]{this, dXTemplateItem, jSONObject, new Boolean(z), new Integer(i), interfaceC0381a, baVar}) : a(dXTemplateItem, jSONObject, z, i, false, 0, interfaceC0381a, baVar);
    }

    public View a(final DXTemplateItem dXTemplateItem, final JSONObject jSONObject, final boolean z, final int i, final boolean z2, final int i2, final InterfaceC0381a interfaceC0381a, final ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1555a26b", new Object[]{this, dXTemplateItem, jSONObject, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2), interfaceC0381a, baVar});
        }
        View view = null;
        if (!a(dXTemplateItem)) {
            StringBuilder sb = new StringBuilder();
            sb.append("renderDX, item is illegal : ");
            sb.append(dXTemplateItem == null ? "null" : dXTemplateItem.toString());
            i.a("DXViewLoader", sb.toString());
            return null;
        }
        DXTemplateItem a2 = this.f9887a.a(dXTemplateItem);
        final String str = dXTemplateItem.f11925a;
        if (a2 != null && a2.b == dXTemplateItem.b) {
            return b(a2, jSONObject, z, i, z2, i2, interfaceC0381a, baVar);
        }
        if (a2 != null) {
            view = b(a2, jSONObject, z, i, z2, i2, interfaceC0381a, baVar);
        }
        View view2 = view;
        this.f9887a.a(new fve() { // from class: com.taobao.android.detail.core.standard.widget.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fve
            public void onNotificationListener(fvb fvbVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                    return;
                }
                a.a(a.this).d(this);
                DXTemplateItem a3 = a.a(a.this, str, fvbVar.f28139a);
                if (a3 != null) {
                    a.a(a.this, a3, jSONObject, z, i, z2, i2, interfaceC0381a, baVar);
                    return;
                }
                interfaceC0381a.a(dXTemplateItem, new s(String.valueOf(30005)));
                i.a("DXViewLoader", "下载内容DX失败");
            }
        });
        this.f9887a.a(Collections.singletonList(dXTemplateItem));
        return view2;
    }

    private View b(DXTemplateItem dXTemplateItem, JSONObject jSONObject, boolean z, int i, boolean z2, int i2, InterfaceC0381a interfaceC0381a, ba baVar) {
        DXResult<DXRootView> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fbde040a", new Object[]{this, dXTemplateItem, jSONObject, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2), interfaceC0381a, baVar});
        }
        DXResult<DXRootView> b = this.f9887a.b(this.b, dXTemplateItem);
        DXRenderOptions.a aVar = new DXRenderOptions.a();
        if (!z && !z2) {
            a2 = this.f9887a.a(b.f11780a, jSONObject);
        } else {
            if (z) {
                aVar.b(View.MeasureSpec.makeMeasureSpec(i, 1073741824)).a(baVar).a();
            }
            if (z2) {
                aVar.a(View.MeasureSpec.makeMeasureSpec(i2, 1073741824)).a(baVar).a();
            }
            a2 = this.f9887a.a(this.b, b.f11780a, dXTemplateItem, jSONObject, 0, aVar.a());
        }
        a(dXTemplateItem, a2, interfaceC0381a);
        return a2.f11780a;
    }

    private void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult, InterfaceC0381a interfaceC0381a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f3f4b", new Object[]{this, dXTemplateItem, dXResult, interfaceC0381a});
        } else if (dXResult.b()) {
            i.d("DXViewLoader", "renderDXView, renderResult hasError");
            interfaceC0381a.a(dXTemplateItem, dXResult.a());
        } else {
            interfaceC0381a.a(dXTemplateItem, dXResult);
        }
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject, InterfaceC0381a interfaceC0381a, ba baVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c047273", new Object[]{this, dXRootView, jSONObject, interfaceC0381a, baVar});
        } else if (dXRootView == null) {
            i.d("DXViewLoader", "update dx, dx root view is null");
        } else {
            a(dXRootView.getDxTemplateItem(), this.f9887a.a(this.b, dXRootView, dXRootView.getDxTemplateItem(), jSONObject, 0, new DXRenderOptions.a().a(baVar).a()), interfaceC0381a);
        }
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject, InterfaceC0381a interfaceC0381a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25874056", new Object[]{this, dXRootView, jSONObject, interfaceC0381a});
        } else if (dXRootView == null) {
            i.d("DXViewLoader", "update dx, dx root view is null");
        } else {
            a(dXRootView.getDxTemplateItem(), this.f9887a.a(dXRootView, jSONObject), interfaceC0381a);
        }
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject, int i, InterfaceC0381a interfaceC0381a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce34436b", new Object[]{this, dXRootView, jSONObject, new Integer(i), interfaceC0381a});
        } else if (dXRootView == null) {
            i.d("DXViewLoader", "update match parent dx, dx root view is null");
        } else {
            a(dXRootView.getDxTemplateItem(), this.f9887a.a(this.b, dXRootView, dXRootView.getDxTemplateItem(), jSONObject, 0, new DXRenderOptions.a().b(View.MeasureSpec.makeMeasureSpec(i, 1073741824)).a()), interfaceC0381a);
        }
    }

    private DXTemplateItem a(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("c5375b7c", new Object[]{this, str, list});
        }
        if (list != null && !list.isEmpty() && str != null) {
            for (DXTemplateItem dXTemplateItem : list) {
                if (str.equals(dXTemplateItem.f11925a)) {
                    return dXTemplateItem;
                }
            }
        }
        return null;
    }

    private boolean a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{this, dXTemplateItem})).booleanValue() : (dXTemplateItem == null || dXTemplateItem.f11925a == null || dXTemplateItem.b <= 0) ? false : true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c) {
        } else {
            try {
                this.f9887a.o();
            } catch (Exception e) {
                i.a("DXViewLoader", "destroy dx engine error : ", e);
            }
        }
    }
}
