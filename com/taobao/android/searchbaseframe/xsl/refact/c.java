package com.taobao.android.searchbaseframe.xsl.refact;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ite;
import tb.iuk;
import tb.kge;

/* loaded from: classes6.dex */
public final class c extends ite {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean d;

    static {
        kge.a(-2088107362);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 639203630) {
            return new Integer(super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(iuk<?, ?> iukVar) {
        super(iukVar);
    }

    @Override // tb.ite, tb.itj
    public int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int a2 = super.a(i, i2, i3);
        if (b() > i2 - e() && e() > i2) {
            z = false;
        }
        this.d = z;
        return a2;
    }
}
