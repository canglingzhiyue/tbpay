package com.etao.feimagesearch.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cot;
import tb.cst;
import tb.kge;

/* loaded from: classes4.dex */
public class v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(652807245);
    }

    public static String a(Context context, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99d0fdec", new Object[]{context, str, new Boolean(z), str2});
        }
        byte[] b = j.a(str).b();
        if (b == null || b.length == 0) {
            return null;
        }
        if (!r.b(b).equals(str2)) {
            cot.d("ModelUtil", "md5error!");
            return null;
        }
        if (z) {
            b = a(b);
        }
        return cst.a(context, str, b);
    }

    public static byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr});
        }
        byte[] bytes = "sfed".getBytes();
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ bytes[i % bytes.length]);
        }
        return bArr2;
    }
}
