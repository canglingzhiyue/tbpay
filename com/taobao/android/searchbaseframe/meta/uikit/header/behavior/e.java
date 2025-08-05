package com.taobao.android.searchbaseframe.meta.uikit.header.behavior;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2131113505);
    }

    public e(View view, boolean z) {
        super(view, z, d.STICKY);
    }

    public e(View view, boolean z, int i) {
        super(view, z, d.STICKY, i);
    }

    @Override // tb.itj
    public int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        float f = this.b;
        float f2 = f - i;
        if (i < 0 && f2 > 0.0f) {
            f2 = 0.0f;
        } else if (i >= 0) {
            f2 = Math.max(0.0f, f2);
        }
        this.b = (int) f2;
        return (int) (f - f2);
    }
}
