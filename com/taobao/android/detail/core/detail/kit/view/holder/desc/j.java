package com.taobao.android.detail.core.detail.kit.view.holder.desc;

import android.app.Activity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.viewmodel.desc.f;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.dzh;
import tb.dzl;
import tb.eae;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class j extends b<com.taobao.android.detail.core.model.viewmodel.desc.f> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_HEIGHT;
    private final int k;
    private int l;
    private int m;
    private LinearLayout n;
    private RecyclerView o;
    private boolean p;
    private String q;
    private TextView r;
    private Activity s;
    private ArrayList<f.a> t;
    private ArrayList<f.a> u;
    private dzl v;
    private View.OnClickListener w;

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.core.model.viewmodel.desc.f fVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.core.model.viewmodel.desc.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94660f1e", new Object[]{this, fVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.desc.PackingListViewHolder";
    }

    public static /* synthetic */ dzl a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dzl) ipChange.ipc$dispatch("e1d49d70", new Object[]{jVar}) : jVar.v;
    }

    public static /* synthetic */ void a(j jVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24bde6e", new Object[]{jVar, recyclerView});
        } else {
            jVar.a(recyclerView);
        }
    }

    public static /* synthetic */ void a(j jVar, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edc5b4e", new Object[]{jVar, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            jVar.a(recyclerView, i, i2);
        }
    }

    public static /* synthetic */ boolean a(j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f50bd98", new Object[]{jVar, new Boolean(z)})).booleanValue();
        }
        jVar.p = z;
        return z;
    }

    public static /* synthetic */ boolean b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("20e51905", new Object[]{jVar})).booleanValue() : jVar.p;
    }

    public static /* synthetic */ ArrayList c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("1569839c", new Object[]{jVar}) : jVar.u;
    }

    public static /* synthetic */ RecyclerView d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("6d45eae1", new Object[]{jVar}) : jVar.o;
    }

    public static /* synthetic */ TextView e(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c922a8b8", new Object[]{jVar}) : jVar.r;
    }

    public static /* synthetic */ Activity f(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("29a677c3", new Object[]{jVar}) : jVar.s;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b g(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("8feb0538", new Object[]{jVar}) : jVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b h(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("ac245897", new Object[]{jVar}) : jVar.c;
    }

    public static /* synthetic */ ArrayList i(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ac93eb22", new Object[]{jVar}) : jVar.t;
    }

    public static /* synthetic */ int j(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fef0f6fc", new Object[]{jVar})).intValue() : jVar.l;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b k(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("d052b4", new Object[]{jVar}) : jVar.c;
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.viewmodel.main.b l(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("1d09a613", new Object[]{jVar}) : jVar.c;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(com.taobao.android.detail.core.model.viewmodel.desc.f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fVar})).booleanValue() : b2(fVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(com.taobao.android.detail.core.model.viewmodel.desc.f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fVar}) : a2(fVar);
    }

    static {
        kge.a(1360630949);
        DEFAULT_HEIGHT = epo.b(40);
    }

    public j(Activity activity) {
        super(activity);
        this.k = 2;
        this.l = 5;
        this.m = 8;
        this.q = "";
        this.v = null;
        this.w = new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.holder.desc.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (j.a(j.this) == null) {
                } else {
                    if (j.b(j.this) && j.c(j.this) != null && j.c(j.this).size() > 0) {
                        int size = ((int) ((j.c(j.this).size() / 2.0f) + 0.5f)) * j.DEFAULT_HEIGHT;
                        j jVar = j.this;
                        j.a(jVar, j.d(jVar), -1, size);
                        j jVar2 = j.this;
                        j.a(jVar2, j.d(jVar2));
                        j.a(j.this).a(j.c(j.this));
                        j.a(j.this).notifyDataSetChanged();
                        j.e(j.this).setText(j.this.i.getString(R.string.detail_desc_pack_up));
                        j jVar3 = j.this;
                        j.a(jVar3, !j.b(jVar3));
                        dzh.d(j.f(j.this), ((com.taobao.android.detail.core.model.viewmodel.desc.f) j.g(j.this)).y, ((com.taobao.android.detail.core.model.viewmodel.desc.f) j.h(j.this)).z);
                    } else if (j.b(j.this) || j.i(j.this) == null || j.i(j.this).size() <= 0) {
                    } else {
                        int j = j.j(j.this) * j.DEFAULT_HEIGHT;
                        j jVar4 = j.this;
                        j.a(jVar4, j.d(jVar4), -1, j);
                        j jVar5 = j.this;
                        j.a(jVar5, j.d(jVar5));
                        j.a(j.this).a(j.i(j.this));
                        j.a(j.this).notifyDataSetChanged();
                        j.e(j.this).setText(j.this.i.getString(R.string.detail_desc_see_more));
                        j jVar6 = j.this;
                        j.a(jVar6, !j.b(jVar6));
                        dzh.e(j.f(j.this), ((com.taobao.android.detail.core.model.viewmodel.desc.f) j.k(j.this)).y, ((com.taobao.android.detail.core.model.viewmodel.desc.f) j.l(j.this)).z);
                    }
                }
            }
        };
        this.s = activity;
        this.n = (LinearLayout) View.inflate(activity, R.layout.x_detail_desc_packing_list_layout, null);
        this.o = (RecyclerView) this.n.findViewById(R.id.dataColumn);
    }

    private void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) recyclerView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.addItemDecoration(new eae(this.g));
        recyclerView.setOverScrollMode(2);
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.g, 2);
        gridLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.core.model.viewmodel.desc.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f56b833d", new Object[]{this, fVar});
        }
        this.u = fVar.f9749a;
        if (fVar.b > 0) {
            this.m = fVar.b;
        }
        if (fVar.c > 0) {
            this.l = fVar.c;
        }
        int i = this.l;
        if (i >= this.m) {
            this.m = i;
        }
        ArrayList<f.a> arrayList = this.u;
        if (arrayList == null || arrayList.size() == 0) {
            return new View(this.g);
        }
        int size = this.u.size();
        this.t = new ArrayList<>();
        int i2 = (int) ((size / 2.0f) + 0.5f);
        if (size <= (this.m << 1)) {
            this.t = this.u;
            TextView textView = this.r;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.p = false;
        } else {
            for (int i3 = 0; i3 < (this.l << 1); i3++) {
                this.t.add(this.u.get(i3));
            }
            TextView textView2 = this.r;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                a(this.i.getString(R.string.detail_desc_see_more), this.w);
                this.n.addView(this.r);
            }
            this.p = true;
            i2 = this.l;
        }
        this.v = new dzl(this.g, this.t);
        int i4 = i2 * DEFAULT_HEIGHT;
        this.o.setHasFixedSize(false);
        a(this.o);
        a(this.o, -1, i4);
        this.v.a(2);
        this.o.setAdapter(this.v);
        return this.n;
    }

    public View a(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("daf50b49", new Object[]{this, str, onClickListener});
        }
        if (TextUtils.isEmpty(str) || onClickListener == null) {
            return new View(this.g);
        }
        if (this.r == null) {
            this.r = new TextView(this.g);
            this.r.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.r.setBackgroundColor(this.i.getColor(R.color.detail_white));
            this.r.setPadding(0, epo.b(10), 0, epo.b(10));
            this.r.setGravity(17);
            this.r.setTextColor(this.i.getColor(R.color.taodetail_gray));
            this.r.setTextSize(1, 14.0f);
        }
        this.r.setText(str);
        this.r.setOnClickListener(onClickListener);
        return this.r;
    }
}
