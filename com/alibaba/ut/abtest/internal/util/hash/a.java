package com.alibaba.ut.abtest.internal.util.hash;

import com.alibaba.ut.abtest.internal.util.j;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import tb.kge;

/* loaded from: classes.dex */
public abstract class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1376215329);
        kge.a(1086204127);
    }

    @Override // com.alibaba.ut.abtest.internal.util.hash.c
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashCode) ipChange.ipc$dispatch("ac2330f5", new Object[]{this, charSequence, charset}) : newHasher().a(charSequence, charset).a();
    }

    public HashCode hashBytes(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashCode) ipChange.ipc$dispatch("bcc8c7c8", new Object[]{this, bArr}) : hashBytes(bArr, 0, bArr.length);
    }

    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("4d663968", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        j.a(i, i + i2, bArr.length);
        return newHasher(i2).a(bArr, i, i2).a();
    }

    public d newHasher(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("376ad8b9", new Object[]{this, new Integer(i)});
        }
        j.a(i >= 0, "expectedInputSize must be >= 0 but was %s", Integer.valueOf(i));
        return newHasher();
    }
}
