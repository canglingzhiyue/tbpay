package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public class qrl implements qrk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f33050a;
    private final int b;
    private final ByteBuffer[] c;
    private final long d;
    private long e;

    static {
        kge.a(-1793101676);
        kge.a(-903683954);
    }

    public qrl(File file, int i, int i2) throws IOException {
        this.f33050a = i;
        this.b = i2;
        this.d = file.length();
        int i3 = ((int) (this.d / this.f33050a)) + 1;
        this.c = new ByteBuffer[i3];
        FileInputStream fileInputStream = new FileInputStream(file);
        long j = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            try {
                this.c[i4] = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, j, Math.min(this.d - j, this.f33050a + this.b));
                this.c[i4].order(HPROF_BYTE_ORDER);
                j += this.f33050a;
            } finally {
                fileInputStream.close();
            }
        }
        this.e = 0L;
    }

    public qrl(File file) throws IOException {
        this(file, 1048576, 1024);
    }

    @Override // tb.qrk
    public byte a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c54", new Object[]{this})).byteValue();
        }
        byte b = this.c[f()].get(g());
        this.e++;
        return b;
    }

    @Override // tb.qrk
    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
            return;
        }
        int f = f();
        this.c[f].position(g());
        if (bArr.length <= this.c[f].remaining()) {
            this.c[f].get(bArr, 0, bArr.length);
        } else {
            int position = this.f33050a - this.c[f].position();
            this.c[f].get(bArr, 0, position);
            int length = bArr.length - position;
            int i = this.f33050a;
            int i2 = ((length + i) - 1) / i;
            int i3 = position;
            for (int i4 = 0; i4 < i2; i4++) {
                int min = Math.min(length, this.f33050a);
                int i5 = f + 1 + i4;
                this.c[i5].position(0);
                this.c[i5].get(bArr, i3, min);
                i3 += min;
                length -= min;
            }
        }
        this.e += bArr.length;
    }

    @Override // tb.qrk
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int i = this.c[f()].getInt(g());
        this.e += 4;
        return i;
    }

    @Override // tb.qrk
    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        long j = this.c[f()].getLong(g());
        this.e += 8;
        return j;
    }

    @Override // tb.qrk
    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue();
        }
        float f = this.c[f()].getFloat(g());
        this.e += 4;
        return f;
    }

    @Override // tb.qrk
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e < this.d;
    }

    private int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : (int) (this.e / this.f33050a);
    }

    private int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : (int) (this.e % this.f33050a);
    }
}
