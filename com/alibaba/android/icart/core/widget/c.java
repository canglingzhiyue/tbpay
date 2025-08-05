package com.alibaba.android.icart.core.widget;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bny;
import tb.gbg;
import tb.jqd;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends com.alibaba.android.ultron.vfw.viewholder.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e CREATOR;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -77284055) {
            return super.a((ViewGroup) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(bny bnyVar) {
        super(bnyVar);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.c, com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        View a2 = super.a(viewGroup);
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        if (layoutParams != null) {
            if (jqd.a("iCart").b("isShot2024ItemV2Gray", false)) {
                layoutParams.height = gbg.a(this.f2738a.k(), 8.0f);
            } else {
                layoutParams.height = gbg.a(this.f2738a.k(), 9.0f);
            }
        }
        return a2;
    }

    static {
        kge.a(452638985);
        CREATOR = new e() { // from class: com.alibaba.android.icart.core.widget.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new c(bnyVar);
            }
        };
    }
}
