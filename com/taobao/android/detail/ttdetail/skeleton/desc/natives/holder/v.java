package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes5.dex */
public class v extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.v> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LinearLayout g;
    private final int h;
    private final int i;
    private int j;
    private LinearLayout k;
    private ArrayList<e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e>> l;

    static {
        kge.a(1522146975);
    }

    public static /* synthetic */ Object ipc$super(v vVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("355174f4", new Object[]{this, vVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.v vVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, vVar})).booleanValue() : c2(vVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.v vVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, vVar}) : a2(vVar);
    }

    public v(Context context) {
        super(context);
        this.h = com.taobao.android.detail.ttdetail.utils.f.a(9.0f);
        this.i = com.taobao.android.detail.ttdetail.utils.f.a(12.0f);
        this.j = 0;
        this.l = new ArrayList<>();
        this.j = (int) Math.ceil((com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a) - this.h) / 2);
        this.g = new LinearLayout(this.f10821a);
        this.g.setOrientation(1);
        this.g.setPadding(0, 0, 0, this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbff195", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        e<? extends com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> a2 = com.taobao.android.detail.ttdetail.skeleton.desc.natives.d.a(this.f10821a, eVar);
        if (a2 == null) {
            return;
        }
        this.l.add(a2);
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        View d = a2.d(eVar);
        if (d == null) {
            return;
        }
        if (d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) d.getLayoutParams();
        }
        if (marginLayoutParams == null) {
            marginLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        if (this.k == null) {
            this.k = new LinearLayout(this.f10821a);
            this.k.setOrientation(0);
        }
        marginLayoutParams.width = this.j;
        if (!z) {
            marginLayoutParams.rightMargin = this.h;
        } else {
            marginLayoutParams.rightMargin = 0;
        }
        this.k.addView(d, marginLayoutParams);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c43ff830", new Object[]{this, vVar});
        }
        if (!vVar.f().isEmpty()) {
            this.j = (int) Math.ceil(((com.taobao.android.detail.ttdetail.utils.f.a(this.f10821a) - (this.i << 1)) - (this.h * (vVar.f().size() - 1))) / vVar.f().size());
            Iterator<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> it = vVar.f().iterator();
            while (it.hasNext()) {
                com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e next = it.next();
                if (vVar.f().indexOf(next) == vVar.f().size() - 1) {
                    a(next, true);
                } else {
                    a(next, false);
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i = this.i;
            layoutParams.setMargins(i, 0, i, 0);
            this.g.addView(this.k, layoutParams);
        }
        return this.g;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a34a2f", new Object[]{this, vVar});
            return;
        }
        int size = vVar.f().size();
        for (int i = 0; i < size; i++) {
            e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> eVar = this.l.get(i);
            if (i <= size - 1) {
                eVar.b(e());
                eVar.e(vVar.f().get(i));
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ff8829", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        Iterator<e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e>> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().b(z, z2);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public void cG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3813ba2", new Object[]{this});
            return;
        }
        Iterator<e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e>> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().cG_();
        }
    }
}
