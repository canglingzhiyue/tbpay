package com.taobao.android.detail.core.detail.popup;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.adapter.main.DetailMainViewAdapter;
import com.taobao.android.detail.core.detail.widget.listview.DetailListView;
import com.taobao.android.detail.core.open.l;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.List;
import tb.emu;
import tb.emx;
import tb.eoz;
import tb.eqe;
import tb.kge;

/* loaded from: classes4.dex */
public class d extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailMainViewAdapter f9640a;
    public DetailMainViewAdapter b;
    public DetailMainViewAdapter c;
    private i d;
    private LinearLayout e;
    private LinearLayout f;
    private RelativeLayout g;
    private DetailListView h;
    private Context i;
    private JSONObject j;
    private com.taobao.android.detail.datasdk.model.datamodel.node.b k;

    static {
        kge.a(10467592);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a66ad1", new Object[]{dVar});
        } else {
            dVar.d();
        }
    }

    public static /* synthetic */ void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507f0530", new Object[]{dVar});
        } else {
            dVar.e();
        }
    }

    public d(Context context, i iVar, JSONObject jSONObject, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        this.i = context;
        this.d = iVar;
        this.j = jSONObject;
        this.k = bVar;
        c();
        d();
        f();
        e();
        emu.a("com.taobao.android.detail.core.detail.popup.DefaultPopupWindowViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.popup.b
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.android.detail.core.detail.popup.b
    public l b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("a3704cae", new Object[]{this}) : new l() { // from class: com.taobao.android.detail.core.detail.popup.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.open.l
            public eoz getMessageChannel(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (eoz) ipChange2.ipc$dispatch("ed3ce113", new Object[]{this, str});
                }
                if (d.this.f9640a != null) {
                    for (int i = 0; i < d.this.f9640a.getCount(); i++) {
                        com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar = (com.taobao.android.detail.datasdk.model.viewmodel.main.b) d.this.f9640a.getItem(i);
                        if (bVar.getkey().equals(str)) {
                            return bVar;
                        }
                    }
                }
                if (d.this.b != null) {
                    for (int i2 = 0; i2 < d.this.b.getCount(); i2++) {
                        com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar2 = (com.taobao.android.detail.datasdk.model.viewmodel.main.b) d.this.b.getItem(i2);
                        if (bVar2.getkey().equals(str)) {
                            return bVar2;
                        }
                    }
                }
                if (d.this.c == null) {
                    return null;
                }
                for (int i3 = 0; i3 < d.this.c.getCount(); i3++) {
                    com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar3 = (com.taobao.android.detail.datasdk.model.viewmodel.main.b) d.this.c.getItem(i3);
                    if (bVar3.getkey().equals(str)) {
                        return bVar3;
                    }
                }
                return null;
            }

            @Override // com.taobao.android.detail.core.open.l
            public void notifyDataSetChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eee9a4ec", new Object[]{this});
                    return;
                }
                d.a(d.this);
                if (d.this.c != null) {
                    d.this.c.notifyDataSetChanged();
                }
                d.b(d.this);
            }
        };
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.g = (RelativeLayout) LayoutInflater.from(this.i).inflate(R.layout.x_detail_ultron_popop_window, (ViewGroup) null);
        this.g.setClickable(true);
        this.e = (LinearLayout) this.g.findViewById(R.id.ultron_popup_header_view);
        this.f = (LinearLayout) this.g.findViewById(R.id.ultron_popup_footer_view);
        this.h = (DetailListView) this.g.findViewById(R.id.ultron_popup_list_view);
        this.h.setDivider(null);
        this.h.setDividerHeight(0);
        this.h.setDescendantFocusability(393216);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.e;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getChildCount() > 0) {
            this.e.removeAllViews();
        }
        List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> c = c(this.d.a());
        if (c == null || c.isEmpty()) {
            return;
        }
        this.f9640a = new DetailMainViewAdapter((Activity) this.i);
        this.f9640a.setDataSource(c);
        DetailListView detailListView = new DetailListView(this.i);
        detailListView.reset();
        detailListView.setAdapter((ListAdapter) this.f9640a);
        this.e.addView(detailListView);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout == null) {
            return;
        }
        if (linearLayout.getChildCount() > 0) {
            this.f.removeAllViews();
        }
        List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> c = c(this.d.c());
        if (c == null || c.isEmpty()) {
            return;
        }
        this.b = new DetailMainViewAdapter((Activity) this.i);
        this.b.setDataSource(c);
        DetailListView detailListView = new DetailListView(this.i);
        detailListView.reset();
        detailListView.setAdapter((ListAdapter) this.b);
        this.f.addView(detailListView);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            b(this.d.b());
        }
    }

    private void b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> c = c(list);
        if (c == null) {
            return;
        }
        a(c);
    }

    public void a(List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            this.c = new DetailMainViewAdapter((Activity) this.i);
            this.c.setDataSource(list);
            this.h.reset();
            this.h.setAdapter((ListAdapter) this.c);
        }
    }

    private List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> c(List<IDMComponent> list) {
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f9e1c8c", new Object[]{this, list});
        }
        JSONObject jSONObject = this.j;
        if (jSONObject != null) {
            bVar = new com.taobao.android.detail.datasdk.model.datamodel.node.b(jSONObject);
        } else {
            bVar = this.k;
            if (bVar == null) {
                return null;
            }
        }
        return eqe.a(emx.a(this.i).b().m(), emx.a(this.i).b().o(), list, bVar);
    }
}
