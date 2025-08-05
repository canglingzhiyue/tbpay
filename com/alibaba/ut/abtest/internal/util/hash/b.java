package com.alibaba.ut.abtest.internal.util.hash;

import com.alibaba.ut.abtest.internal.util.j;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-295573354);
        kge.a(-1061103916);
    }

    @Override // com.alibaba.ut.abtest.internal.util.hash.d
    public d a(CharSequence charSequence, Charset charset) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b4879700", new Object[]{this, charSequence, charset}) : a(charSequence.toString().getBytes(charset));
    }

    public d a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("d07fcd0b", new Object[]{this, bArr}) : a(bArr, 0, bArr.length);
    }

    @Override // com.alibaba.ut.abtest.internal.util.hash.d
    public d a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("1d3e586b", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        j.a(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            a(bArr[i + i3]);
        }
        return this;
    }
}
