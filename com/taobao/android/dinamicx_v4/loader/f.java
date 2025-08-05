package com.taobao.android.dinamicx_v4.loader;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fwr;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f12227a;
    private SparseArray<byte[]> b;

    static {
        kge.a(-1002421695);
        kge.a(-202982083);
    }

    public f(h hVar) {
        this.f12227a = hVar;
    }

    public SparseArray<byte[]> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("69917611", new Object[]{this}) : this.b;
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        h hVar = this.f12227a;
        if (hVar == null) {
            throw new DXLoaderException("error load expr indexSectionLoader null");
        }
        int d = hVar.d();
        fwrVar.c(d);
        try {
            a(fwrVar, d, this.f12227a.e());
            a(fwrVar, d);
            return true;
        } catch (Exception e) {
            throw new DXLoaderException("error load expr " + e.getMessage());
        }
    }

    private void a(fwr fwrVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433b246c", new Object[]{this, fwrVar, new Integer(i)});
            return;
        }
        int i2 = i + 4;
        fwrVar.c(i2 + 4);
        int f = i2 + 8 + (fwrVar.f() * 12);
        fwrVar.c(f);
        int f2 = fwrVar.f();
        if (f2 == 0) {
            return;
        }
        this.b = new SparseArray<>();
        for (int i3 = 0; i3 < f2; i3++) {
            int i4 = f + 4;
            int i5 = i3 * 8;
            fwrVar.c(i4 + i5);
            int f3 = fwrVar.f();
            fwrVar.c(i4 + 4 + i5);
            int i6 = f3 + i;
            this.b.put(i3, fwrVar.a(i6, fwrVar.f() + i6));
        }
    }

    private void a(fwr fwrVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2429dc17", new Object[]{this, fwrVar, new Integer(i), new Integer(i2)});
            return;
        }
        fwrVar.c(i);
        if (fwrVar.f() != 5566) {
            throw new DXLoaderException("Invalid binary, invalid magic number");
        }
        int f = fwrVar.f();
        if (f <= i2) {
            return;
        }
        throw new DXLoaderException("Invalid binary, offset: " + i + "+ fileLen: " + f + " > bytes.length: " + i2);
    }
}
