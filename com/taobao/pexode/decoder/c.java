package com.taobao.pexode.decoder;

import com.android.alibaba.ip.runtime.IpChange;
import tb.nec;
import tb.ned;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f18696a = ned.a("avif");
    public static final nec AVIF = new nec("AVIF", "AVIF", new String[]{"avif"}, new nec.a() { // from class: com.taobao.pexode.decoder.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.nec.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : bArr != null && bArr.length >= 4 && ned.a(bArr, 8, c.a());
        }
    });

    public static /* synthetic */ byte[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[0]) : f18696a;
    }
}
