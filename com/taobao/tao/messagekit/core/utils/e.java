package com.taobao.tao.messagekit.core.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.njv;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1824240272);
    }

    public static byte[] a(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d475ea3f", new Object[]{njvVar});
        }
        byte[] bArr = new byte[njvVar.k];
        System.arraycopy(njvVar.n, njv.b(0) + 1 + 1, bArr, 0, njvVar.k);
        return bArr;
    }

    public static byte[] b(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b653b3de", new Object[]{njvVar});
        }
        byte[] bArr = new byte[njvVar.l];
        System.arraycopy(njvVar.n, njv.a(0, njvVar) + 1 + 1, bArr, 0, njvVar.l);
        return bArr;
    }

    public static byte[] c(njv njvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("98317d7d", new Object[]{njvVar});
        }
        byte[] bArr = new byte[njvVar.m];
        System.arraycopy(njvVar.n, njv.b(0, njvVar) + 1 + 1, bArr, 0, njvVar.m);
        return bArr;
    }
}
