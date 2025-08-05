package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class kme implements kma {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private InputStream f30157a;

    public kme(InputStream inputStream) {
        this.f30157a = new BufferedInputStream(inputStream, kly.f30154a);
    }

    @Override // tb.kma
    public int a(byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{this, bArr})).intValue() : this.f30157a.read(bArr, 0, bArr.length);
    }

    @Override // tb.kma
    public void a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30157a.close();
        }
    }
}
