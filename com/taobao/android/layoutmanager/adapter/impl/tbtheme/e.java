package com.taobao.android.layoutmanager.adapter.impl.tbtheme;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.adapter.impl.tbtheme.TBDrawType;
import tb.kge;

/* loaded from: classes5.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final c f13147a = new c();
    private final d b = new d();

    static {
        kge.a(930221598);
    }

    public int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        g.a("origin=" + Integer.toHexString(i2));
        if (i == 0) {
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            int alpha = Color.alpha(i2);
            if (red >= 250 && green >= 250 && blue >= 250 && alpha >= 125) {
                g.a("while text, do not change=" + Integer.toHexString(i2));
                return i2;
            }
        }
        b bVar = new b();
        this.f13147a.a(i2, bVar);
        if (bVar.f13144a) {
            g.a("found in colorMapping=" + Integer.toHexString(bVar.b));
            return bVar.b;
        }
        this.b.a(i2, bVar);
        if (bVar.f13144a) {
            g.a("wow found in colorRangeMapping=" + Integer.toHexString(bVar.b));
            return bVar.b;
        }
        g.a("draw type=" + TBDrawType.a.a(i) + "  ， color=" + Integer.toHexString(i2));
        return i2;
    }
}
