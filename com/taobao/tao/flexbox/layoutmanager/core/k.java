package com.taobao.tao.flexbox.layoutmanager.core;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean c;
    private double d = 1.0d;
    private boolean e = false;

    static {
        kge.a(2039834251);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
        } else {
            this.d = d;
        }
    }

    public double d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2d9", new Object[]{this})).doubleValue() : this.d;
    }

    public void a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d dVar, ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8df0f28", new Object[]{this, dVar, abVar});
        } else if (this.e) {
        } else {
            this.e = true;
        }
    }
}
