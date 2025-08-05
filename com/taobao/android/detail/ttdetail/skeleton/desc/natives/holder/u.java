package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.sys;
import tb.szh;
import tb.szi;
import tb.szq;

/* loaded from: classes5.dex */
public class u extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u> implements View.OnClickListener, com.taobao.android.detail.ttdetail.communication.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, String> p;
    private float g;
    private float h;
    private LinearLayout i;
    private TextView j;
    private String k;
    private String l;
    private boolean m;
    private int n;
    private int o;

    static {
        kge.a(-1500275928);
        kge.a(-1201612728);
        kge.a(-767194759);
    }

    public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35510095", new Object[]{this, uVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, uVar})).booleanValue() : c2(uVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, uVar}) : a2(uVar);
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.g;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.h;
    }

    public u(Context context) {
        super(context);
        this.n = R.drawable.tt_detail_desc_skubar_checked_bg;
        this.o = R.drawable.tt_detail_desc_skubar_unchecked_bg;
        this.i = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_skubar, (ViewGroup) null);
        a(context);
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(context, szq.class, this);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, szq.class);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.m = z;
        this.i.setBackgroundResource(this.m ? this.n : this.o);
        if (TextUtils.isEmpty(this.l)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.m ? "已选: " : "选择: ");
        sb.append(this.l);
        String sb2 = sb.toString();
        if (this.j == null) {
            this.j = new TextView(this.f10821a);
            this.j.setTextColor(this.c.getColor(R.color.tt_detail_ff));
            this.j.setTextSize(1, 12.0f);
            this.j.setGravity(16);
            this.j.setLayoutParams(new ViewGroup.LayoutParams((int) Math.ceil(this.j.getPaint().measureText(sb2)), -2));
            this.i.addView(this.j);
        }
        this.j.setText(sb2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (TextUtils.isEmpty(this.k)) {
        } else {
            a(this.k, !this.m);
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10821a, new szi());
            h();
            if (((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u) this.f).u == null || ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u) this.f).u.isEmpty()) {
                return;
            }
            sys.a(this.f10821a, ((com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u) this.f).u);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        List<String> f = f();
        if (!com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(f)) {
            a(f.contains(this.k));
        } else {
            a(false);
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3dba3d91", new Object[]{this, uVar});
        }
        if (TextUtils.isEmpty(uVar.f10896a)) {
            this.i.setVisibility(8);
            return new View(this.f10821a);
        }
        this.i.setVisibility(0);
        this.k = uVar.f10896a;
        this.l = uVar.b;
        this.g = uVar.c;
        this.h = uVar.d;
        h();
        return this.i;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2d5d0", new Object[]{this, uVar});
        } else {
            this.i.setOnClickListener(this);
        }
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return a(str);
        }
        return c(str);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (b(str)) {
            return true;
        }
        String a2 = szh.a(str);
        if (p == null) {
            p = new ConcurrentHashMap();
        }
        if (p.containsKey(a2)) {
            a(a2, p.get(a2));
        }
        p.put(a2, str);
        return true;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String a2 = szh.a(str);
        return !TextUtils.isEmpty(a2) && !com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(p) && p.containsKey(a2) && p.get(a2).equals(str);
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        a(szh.a(str), str);
        return false;
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(p) || TextUtils.isEmpty(str) || !p.containsKey(str) || !com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.a.a(str2, p.get(str))) {
        } else {
            p.remove(str);
        }
    }

    public List<String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.b.a(p);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        p.clear();
        g();
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public boolean receiveMessage(com.taobao.android.detail.ttdetail.communication.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, dVar})).booleanValue();
        }
        if (!(dVar instanceof szq)) {
            return false;
        }
        h();
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }
}
