package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.b> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout g;
    private LinearLayout h;
    private ArrayList<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> i;
    private String j;
    private String k;
    private TextView l;
    private LinearLayout m;

    static {
        kge.a(292079788);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.b bVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19a32c7", new Object[]{this, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, bVar})).booleanValue() : b2(bVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, bVar}) : a2(bVar);
    }

    public b(Context context) {
        super(context);
        this.i = new ArrayList<>();
        this.g = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_containerstyle4, (ViewGroup) null);
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    private void c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35485d84", new Object[]{this, bVar});
            return;
        }
        this.h = (LinearLayout) this.g.findViewById(R.id.childrenContainer);
        String str = bVar.f10868a;
        if (!com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(str)) {
            this.k = str;
        }
        this.m = (LinearLayout) this.g.findViewById(R.id.btnMore);
        if (StringUtils.isEmpty(this.k)) {
            this.k = this.c.getString(R.string.tt_detail_desc_see_more);
        }
        if (this.i.size() <= 0) {
            return;
        }
        a(this.k, this);
        this.m.addView(this.l);
        a(this.i.get(0), false);
        if (this.i.size() > 1) {
            a(true);
        } else {
            a(false);
        }
    }

    private void a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbff195", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        e<? extends com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> a2 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.d.a(this.f10821a, eVar);
        View d = a2.d(eVar);
        a2.e(eVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (z) {
            layoutParams.topMargin = com.taobao.android.detail.ttdetail.utils.f.a(15.0f);
        }
        this.h.addView(d, layoutParams);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int childCount = this.h.getChildCount();
        if (childCount == 1) {
            this.l.setText(this.c.getString(R.string.tt_detail_desc_pack_up));
            if (1 >= this.i.size()) {
                return;
            }
            for (int i = 1; i < this.i.size(); i++) {
                a(this.i.get(i), false);
            }
        } else if (childCount > 1) {
            this.l.setText(this.k);
            for (int i2 = childCount - 1; i2 >= 1; i2--) {
                this.h.removeViewAt(i2);
            }
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("41cd63c4", new Object[]{this, bVar});
        }
        this.i = bVar.f();
        this.j = bVar.k;
        c2(bVar);
        return this.g;
    }

    public View a(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("daf50b49", new Object[]{this, str, onClickListener});
        }
        if (StringUtils.isEmpty(str) || onClickListener == null) {
            return new View(this.f10821a);
        }
        if (this.l == null) {
            this.l = new TextView(this.f10821a);
            this.l.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.l.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
            this.l.setPadding(0, com.taobao.android.detail.ttdetail.utils.f.a(10.0f), 0, com.taobao.android.detail.ttdetail.utils.f.a(10.0f));
            this.l.setGravity(17);
            this.l.setTextColor(this.c.getColor(R.color.tt_detail_gray));
            this.l.setTextSize(1, 14.0f);
        }
        this.l.setText(str);
        this.l.setOnClickListener(onClickListener);
        return this.l;
    }
}
