package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public final class r implements q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final File f2496a;
    private final String b;
    private Object c;

    static {
        kge.a(1818967410);
        kge.a(-2047881166);
    }

    @Override // com.alibaba.android.split.q
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    public r(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.f2496a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.b = str;
    }

    @Override // com.alibaba.android.split.q
    public final File a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("a060c1a5", new Object[]{this}) : this.f2496a;
    }

    @Override // com.alibaba.android.split.q
    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    @Override // com.alibaba.android.split.q
    public Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.c;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String valueOf = String.valueOf(this.f2496a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(str).length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : ((this.f2496a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
