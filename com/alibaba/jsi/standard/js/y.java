package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class y extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final y d;
    private static final y e;
    private final boolean c;

    @Override // com.alibaba.jsi.standard.js.w
    public w b(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("8d90a414", new Object[]{this, dVar}) : this;
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(927873473);
        d = new y(true);
        e = new y(false);
    }

    public y() {
        this.c = true;
    }

    public y(boolean z) {
        this.c = z;
    }

    public static y p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (y) ipChange.ipc$dispatch("6207b853", new Object[0]) : d;
    }

    public static y q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (y) ipChange.ipc$dispatch("c8e07814", new Object[0]) : e;
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // com.alibaba.jsi.standard.js.w
    public String a_(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb92a9ee", new Object[]{this, dVar});
        }
        Object[] objArr = new Object[1];
        objArr[0] = this.c ? "undefined" : "null";
        return String.format("Void(%s)", objArr);
    }
}
