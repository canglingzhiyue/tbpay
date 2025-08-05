package com.taobao.android.weex_uikit.widget.img;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16163a;
    public boolean b = false;
    private int c = 0;
    private int d = 0;

    static {
        kge.a(-1917547276);
    }

    public synchronized boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        } else if (!this.b) {
            return false;
        } else {
            this.b = false;
            if (this.c == i || this.d == i2) {
                z = false;
            }
            this.c = i;
            this.d = i2;
            return z;
        }
    }

    public synchronized void a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
            return;
        }
        this.b = true;
        iArr[0] = this.c;
        iArr[1] = this.d;
    }
}
