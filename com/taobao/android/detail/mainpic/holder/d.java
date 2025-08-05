package com.taobao.android.detail.mainpic.holder;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.bny;
import tb.etx;

/* loaded from: classes4.dex */
public class d extends h implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String e = "lightoffMainpicFrame";

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == -429561876) {
            super.a((IDMComponent) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(bny bnyVar, etx etxVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar, etxVar, gVar);
    }

    public static com.alibaba.android.ultron.vfw.viewholder.e a(final etx etxVar, final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("594ec67c", new Object[]{etxVar, gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new d(bnyVar, etx.this, gVar);
            }
        };
    }

    @Override // com.taobao.android.detail.mainpic.holder.h, com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        if (this.i != null) {
            this.i.setBackgroundColor(0);
        }
        super.a(iDMComponent);
        if (!this.o.u()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.g.setLayoutParams(layoutParams);
    }

    @Override // com.taobao.android.detail.mainpic.holder.c
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        for (com.alibaba.android.ultron.vfw.viewholder.h hVar : this.j) {
            com.alibaba.android.ultron.vfw.viewholder.b b = hVar.b();
            if (b instanceof c) {
                return ((c) b).a(i);
            }
        }
        return true;
    }
}
