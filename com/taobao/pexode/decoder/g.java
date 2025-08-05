package com.taobao.pexode.decoder;

import com.android.alibaba.ip.runtime.IpChange;
import tb.nec;
import tb.ned;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f18698a = ned.a("heic");
    public static final nec HEIF = new nec("HEIF", "HEIF", new String[]{"heic"}, new nec.a() { // from class: com.taobao.pexode.decoder.g.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.nec.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : bArr != null && bArr.length >= 4 && ned.a(bArr, 20, g.a());
        }
    });

    public static /* synthetic */ byte[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[0]) : f18698a;
    }
}
