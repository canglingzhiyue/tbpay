package com.taobao.android.fluid.framework.card.cards.album;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1797139684);
    }

    public static void a(int i, int i2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604fceb7", new Object[]{new Integer(i), new Integer(i2), dVar});
            return;
        }
        int i3 = dVar.b;
        int i4 = dVar.f12479a;
        if (i3 == 0 || i4 == 0) {
            dVar.d = i;
            dVar.c = i2;
            return;
        }
        float f = i3 / i4;
        float f2 = i;
        float f3 = i2;
        int i5 = (f > (f2 / f3) ? 1 : (f == (f2 / f3) ? 0 : -1));
        if (i5 > 0) {
            dVar.d = i;
            dVar.c = (int) (f2 / f);
        } else {
            dVar.d = (int) (f3 * f);
            dVar.c = i2;
        }
        if (i5 > 0) {
            dVar.e = (i2 - dVar.c) / 2;
            dVar.f = 0;
            return;
        }
        dVar.e = 0;
        dVar.f = (i - dVar.d) / 2;
    }
}
