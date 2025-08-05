package tb;

import anetwork.channel.aidl.ParcelableInputStream;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class klq implements kma {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ParcelableInputStream f30139a;

    public klq(ParcelableInputStream parcelableInputStream) {
        this.f30139a = parcelableInputStream;
    }

    @Override // tb.kma
    public int a(byte[] bArr) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{this, bArr})).intValue() : this.f30139a.read(bArr);
    }

    @Override // tb.kma
    public void a() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30139a.close();
        }
    }
}
