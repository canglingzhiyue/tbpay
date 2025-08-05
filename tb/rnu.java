package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.zip.Checksum;

/* loaded from: classes9.dex */
public class rnu implements Checksum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final long[] f33250a = new long[256];
    private long b = 0;

    static {
        for (int i = 0; i < 256; i++) {
            long j = i;
            for (int i2 = 0; i2 < 8; i2++) {
                j = (j & 1) == 1 ? (j >>> 1) ^ (-3932672073523589310L) : j >>> 1;
            }
            f33250a[i] = j;
        }
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d1b766b6", new Object[]{this})).longValue() : this.b;
    }

    public void a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217954", new Object[]{this, new Byte(b)});
            return;
        }
        this.b = ~this.b;
        long[] jArr = f33250a;
        long j = this.b;
        this.b = (j >>> 8) ^ jArr[((int) (b ^ j)) & 255];
        this.b = ~this.b;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafc5c33", new Object[]{this, new Integer(i)});
        } else {
            a((byte) i);
        }
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd800837", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        while (i2 > 0) {
            a(bArr[i]);
            i2--;
            i++;
        }
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.b = 0L;
        }
    }
}
