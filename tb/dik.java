package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.common.internal.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class dik implements dij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f26786a;

    static {
        kge.a(-958983428);
        kge.a(-1013970829);
    }

    public dik() {
    }

    public dik(byte[] bArr) {
        this.f26786a = (byte[]) c.a(bArr);
    }

    @Override // tb.dij
    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.f26786a.length;
    }

    @Override // tb.dij
    public InputStream a() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("13bf636b", new Object[]{this}) : new ByteArrayInputStream(this.f26786a);
    }
}
