package com.taobao.android.searchbaseframe.meta.uikit.header.behavior;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1102801772);
    }

    public c(View view, boolean z, int i) {
        super(view, z, d.LIST_HEADER, i);
    }

    public c(View view, boolean z, int i, d dVar) {
        super(view, z, dVar, i);
    }

    public c(View view, boolean z, d dVar) {
        super(view, z, dVar);
    }

    public View j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this}) : this.f14987a;
    }

    @Override // tb.itj
    public int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (j().getMeasuredHeight() == 0) {
            this.b = 0;
            return 0;
        }
        float f = this.b;
        float f2 = f - i;
        float f3 = 0.0f;
        if (i < 0 && f2 > 0.0f) {
            f2 = 0.0f;
        } else if (i > 0) {
            float measuredHeight = (j().getMeasuredHeight() + f2) - g();
            if (!f()) {
                measuredHeight += i2;
            }
            float f4 = i2;
            if (measuredHeight < f4) {
                if (f()) {
                    f3 = f4;
                }
                f2 = (f3 - j().getMeasuredHeight()) + g();
            }
        }
        this.b = (int) f2;
        if (f()) {
            a(1.0f - ((Math.abs(this.b) * 1.0f) / ((j().getMeasuredHeight() - g()) - i2)));
        } else {
            a(1.0f - ((Math.abs(this.b) * 1.0f) / (j().getMeasuredHeight() - g())));
        }
        return (int) (f - f2);
    }
}
