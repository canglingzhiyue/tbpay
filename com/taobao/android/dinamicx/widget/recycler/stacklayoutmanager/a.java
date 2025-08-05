package com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    private final float c;
    private final float d;

    static {
        kge.a(831904764);
    }

    public void a(float f, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bac0c9", new Object[]{this, new Float(f), view, new Integer(i)});
            return;
        }
        float f2 = 0.0f;
        if (i != this.b) {
            f2 = 1.0f;
        } else if (f != 0.0f) {
            float f3 = this.d;
            f2 = f3 + ((1.0f - f3) * f);
        }
        float a2 = a(f, i);
        view.setScaleY(a2);
        view.setScaleX(a2);
        view.setAlpha(f2);
    }

    public float a(float f, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0ff59b", new Object[]{this, new Float(f), new Integer(i)})).floatValue();
        }
        if (i == 0 || (i2 = this.b) == 0) {
            return 1.0f;
        }
        float f2 = (1.0f - this.c) / i2;
        float f3 = 1.0f - (i * f2);
        return (((1.0f - (f2 * (i - 1))) - f3) * f) + f3;
    }
}
