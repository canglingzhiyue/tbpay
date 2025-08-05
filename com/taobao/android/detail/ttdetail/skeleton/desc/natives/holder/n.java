package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;
import tb.sym;
import tb.szg;

/* loaded from: classes5.dex */
public class n extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_HEIGHT;
    private final int g;
    private int h;
    private int i;
    private LinearLayout j;
    private RecyclerView k;
    private boolean l;
    private String m;
    private TextView n;
    private ArrayList<m.a> o;
    private ArrayList<m.a> p;
    private sym q;
    private View.OnClickListener r;

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m mVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19f32dc", new Object[]{this, mVar})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ sym a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sym) ipChange.ipc$dispatch("6aebe4b3", new Object[]{nVar}) : nVar.q;
    }

    public static /* synthetic */ void a(n nVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5adf9a", new Object[]{nVar, recyclerView});
        } else {
            nVar.a(recyclerView);
        }
    }

    public static /* synthetic */ void a(n nVar, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22fc17a", new Object[]{nVar, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            nVar.a(recyclerView, i, i2);
        }
    }

    public static /* synthetic */ boolean a(n nVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("373bc5ec", new Object[]{nVar, new Boolean(z)})).booleanValue();
        }
        nVar.l = z;
        return z;
    }

    public static /* synthetic */ boolean b(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9496ef4f", new Object[]{nVar})).booleanValue() : nVar.l;
    }

    public static /* synthetic */ ArrayList c(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("d8aacf04", new Object[]{nVar}) : nVar.p;
    }

    public static /* synthetic */ RecyclerView d(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("1d6cb79b", new Object[]{nVar}) : nVar.k;
    }

    public static /* synthetic */ TextView e(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5f2e7e5c", new Object[]{nVar}) : nVar.n;
    }

    public static /* synthetic */ ArrayList f(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("d61e7d21", new Object[]{nVar}) : nVar.o;
    }

    public static /* synthetic */ int g(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("200c7799", new Object[]{nVar})).intValue() : nVar.h;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, mVar})).booleanValue() : b2(mVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, mVar}) : a2(mVar);
    }

    static {
        kge.a(-305830921);
        DEFAULT_HEIGHT = com.taobao.android.detail.ttdetail.utils.f.a(40.0f);
    }

    public n(Context context) {
        super(context);
        this.g = 2;
        this.h = 5;
        this.i = 8;
        this.m = "";
        this.q = null;
        this.r = new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.n.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (n.a(n.this) == null) {
                } else {
                    if (n.b(n.this) && n.c(n.this) != null && n.c(n.this).size() > 0) {
                        int size = ((int) ((n.c(n.this).size() / 2.0f) + 0.5f)) * n.DEFAULT_HEIGHT;
                        n nVar = n.this;
                        n.a(nVar, n.d(nVar), -1, size);
                        n nVar2 = n.this;
                        n.a(nVar2, n.d(nVar2));
                        n.a(n.this).a(n.c(n.this));
                        n.a(n.this).notifyDataSetChanged();
                        n.e(n.this).setText(n.this.c.getString(R.string.tt_detail_desc_pack_up));
                        n nVar3 = n.this;
                        n.a(nVar3, !n.b(nVar3));
                    } else if (n.b(n.this) || n.f(n.this) == null || n.f(n.this).size() <= 0) {
                    } else {
                        int g = n.g(n.this) * n.DEFAULT_HEIGHT;
                        n nVar4 = n.this;
                        n.a(nVar4, n.d(nVar4), -1, g);
                        n nVar5 = n.this;
                        n.a(nVar5, n.d(nVar5));
                        n.a(n.this).a(n.f(n.this));
                        n.a(n.this).notifyDataSetChanged();
                        n.e(n.this).setText(n.this.c.getString(R.string.tt_detail_desc_see_more));
                        n nVar6 = n.this;
                        n.a(nVar6, !n.b(nVar6));
                    }
                }
            }
        };
        this.j = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_packing_list_layout, (ViewGroup) null);
        this.k = (RecyclerView) this.j.findViewById(R.id.dataColumn);
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
        recyclerView.addItemDecoration(new szg(this.f10821a));
        recyclerView.setOverScrollMode(2);
    }

    private void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f10821a, 2);
        gridLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("98c6899", new Object[]{this, mVar});
        }
        this.p = mVar.f10881a;
        if (mVar.b > 0) {
            this.i = mVar.b;
        }
        if (mVar.c > 0) {
            this.h = mVar.c;
        }
        int i = this.h;
        if (i >= this.i) {
            this.i = i;
        }
        ArrayList<m.a> arrayList = this.p;
        if (arrayList == null || arrayList.size() == 0) {
            return new View(this.f10821a);
        }
        int size = this.p.size();
        this.o = new ArrayList<>();
        int i2 = (int) ((size / 2.0f) + 0.5f);
        if (size <= (this.i << 1)) {
            this.o = this.p;
            TextView textView = this.n;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.l = false;
        } else {
            for (int i3 = 0; i3 < (this.h << 1); i3++) {
                this.o.add(this.p.get(i3));
            }
            TextView textView2 = this.n;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                a(this.c.getString(R.string.tt_detail_desc_see_more), this.r);
                this.j.addView(this.n);
            }
            this.l = true;
            i2 = this.h;
        }
        this.q = new sym(this.f10821a, this.o);
        int i4 = i2 * DEFAULT_HEIGHT;
        this.k.setHasFixedSize(false);
        a(this.k);
        a(this.k, -1, i4);
        this.q.a(2);
        this.k.setAdapter(this.q);
        return this.j;
    }

    public View a(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("daf50b49", new Object[]{this, str, onClickListener});
        }
        if (TextUtils.isEmpty(str) || onClickListener == null) {
            return new View(this.f10821a);
        }
        if (this.n == null) {
            this.n = new TextView(this.f10821a);
            this.n.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.n.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
            this.n.setPadding(0, com.taobao.android.detail.ttdetail.utils.f.a(10.0f), 0, com.taobao.android.detail.ttdetail.utils.f.a(10.0f));
            this.n.setGravity(17);
            this.n.setTextColor(this.c.getColor(R.color.tt_detail_gray));
            this.n.setTextSize(1, 14.0f);
        }
        this.n.setText(str);
        this.n.setOnClickListener(onClickListener);
        return this.n;
    }
}
