package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class m extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final double c;
    private final boolean d = false;

    static {
        kge.a(-1890161610);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public m(int i) {
        this.c = i;
    }

    public m(double d) {
        this.c = d;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.d;
    }

    public double m_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf507907", new Object[]{this})).doubleValue() : this.c;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        if (!this.d) {
            throw new AssertionError("Not a integer");
        }
        return (int) this.c;
    }

    @Override // com.alibaba.jsi.standard.js.w
    public String a_(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb92a9ee", new Object[]{this, dVar});
        }
        if (this.d) {
            return String.valueOf((int) this.c);
        }
        return String.valueOf(this.c);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public w b(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("8d90a414", new Object[]{this, dVar});
        }
        if (this.d) {
            return new m((int) this.c);
        }
        return new m(this.c);
    }
}
