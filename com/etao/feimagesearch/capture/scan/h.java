package com.etao.feimagesearch.capture.scan;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.gateway.util.n;
import com.taobao.taobao.scancode.v2.result.MaResult;
import tb.kge;

/* loaded from: classes3.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private n.a f6592a;
    private MaResult b;

    static {
        kge.a(165725332);
    }

    public static h a(n.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("24cd563c", new Object[]{aVar});
        }
        h hVar = new h();
        hVar.f6592a = aVar;
        return hVar;
    }

    public static h a(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("d01b3e15", new Object[]{maResult});
        }
        h hVar = new h();
        hVar.b = maResult;
        return hVar;
    }

    public n.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n.a) ipChange.ipc$dispatch("3a0c53f9", new Object[]{this}) : this.f6592a;
    }

    public MaResult b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaResult) ipChange.ipc$dispatch("99c05753", new Object[]{this}) : this.b;
    }
}
