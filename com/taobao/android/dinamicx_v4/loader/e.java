package com.taobao.android.dinamicx_v4.loader;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.fwr;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f12226a;
    private SparseArray<Object> b;

    static {
        kge.a(97185266);
        kge.a(-202982083);
    }

    public e(h hVar) {
        this.f12226a = hVar;
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        fwrVar.c(this.f12226a.c());
        int f = fwrVar.f();
        for (int i = 0; i < f; i++) {
            short e = fwrVar.e();
            if (e == 4) {
                int a2 = a(fwrVar);
                if (a2 > 0) {
                    str = new String(fwrVar.a(), fwrVar.b(), a2);
                    fwrVar.c(fwrVar.b() + a2);
                } else if (a2 != 0) {
                    throw new DXLoaderException("字符串长度有问题: " + a2);
                } else {
                    str = "";
                }
                if (this.b == null) {
                    this.b = new SparseArray<>();
                }
                this.b.put(i, str);
            } else {
                throw new DXLoaderException("不认识的常量类型" + ((int) e));
            }
        }
        return true;
    }

    private int a(fwr fwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e964fd6a", new Object[]{this, fwrVar})).intValue();
        }
        byte d = fwrVar.d();
        if (d >= 0 && d <= 125) {
            return d;
        }
        if (d == 126) {
            return fwrVar.e();
        }
        if (d == Byte.MAX_VALUE) {
            return fwrVar.f();
        }
        if (DinamicXEngine.j()) {
            throw new DXLoaderException("字符串过长, 已经超出最大长度2147483647");
        }
        return -1;
    }

    public SparseArray<Object> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("69917611", new Object[]{this}) : this.b;
    }

    public String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        SparseArray<Object> sparseArray = this.b;
        if (sparseArray != null) {
            return String.valueOf(sparseArray.valueAt(i));
        }
        return null;
    }
}
