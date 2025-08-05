package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.utils.io.i;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes9.dex */
public class toe implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OPEN_DELETE = 4;
    public static final int OPEN_READ = 1;
    public static final String TAG = "TarFile";

    /* renamed from: a  reason: collision with root package name */
    private final String f34240a;
    private File b;
    private RandomAccessFile c;
    private MappedByteBuffer d;
    private tod e;
    private long f;
    private long g;

    static {
        kge.a(-1436238470);
        kge.a(-1811054506);
    }

    public toe(String str) {
        this(new File(str), 1);
    }

    public toe(File file, int i) {
        this.f34240a = file.getPath();
        if (i != 1 && i != 5) {
            throw new IllegalArgumentException("Bad mode: " + i);
        }
        if ((i & 4) != 0) {
            this.b = file;
            this.b.deleteOnExit();
        } else {
            this.b = null;
        }
        try {
            this.c = new RandomAccessFile(this.f34240a, "r");
            this.d = this.c.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, this.c.length());
        } catch (Throwable unused) {
            i.a(this.d);
            i.a(this.c);
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            super.finalize();
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile == null) {
            return;
        }
        synchronized (randomAccessFile) {
            i.a(this.d);
            this.c = null;
            randomAccessFile.close();
        }
        File file = this.b;
        if (file == null) {
            return;
        }
        file.delete();
        this.b = null;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c == null) {
            throw new IllegalStateException("Tar file closed");
        }
    }

    public int a(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{this, bArr})).intValue() : a(bArr, 0, bArr.length);
    }

    public int a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6ab7c2", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        d();
        tod todVar = this.e;
        if (todVar != null) {
            if (this.f == todVar.b()) {
                return -1;
            }
            if (this.e.b() - this.f < i2) {
                i2 = (int) (this.e.b() - this.f);
            }
        }
        try {
            this.d.get(bArr, i, i2);
            i3 = i2;
        } catch (BufferUnderflowException unused) {
            i3 = -1;
        }
        if (i3 != -1) {
            if (this.e != null) {
                this.f += i2;
            }
            this.g += i2;
            return i2;
        }
        throw new IOException();
    }

    public tod a() throws IOException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (tod) ipChange.ipc$dispatch("f0b0cf5", new Object[]{this});
        }
        d();
        b();
        byte[] a2 = i.a(512);
        try {
            this.d.get(a2, 0, 512);
        } catch (BufferUnderflowException unused) {
        }
        int length = a2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (a2[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            this.e = new tod(a2);
        }
        i.a(a2);
        return this.e;
    }

    public void b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        tod todVar = this.e;
        if (todVar == null) {
            return;
        }
        if (todVar.b() > this.f) {
            long j = 0;
            while (j < this.e.b() - this.f) {
                long a2 = a((this.e.b() - this.f) - j);
                if (a2 == 0 && this.e.b() - this.f > 0) {
                    throw new IOException("Possible tar file corruption");
                }
                j += a2;
            }
        }
        this.e = null;
        this.f = 0L;
        c();
    }

    public void c() throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        long j = this.g;
        long j2 = 0;
        if (j <= 0 || (i = (int) (j % 512)) <= 0) {
            return;
        }
        while (true) {
            long j3 = 512 - i;
            if (j2 >= j3) {
                return;
            }
            j2 += a(j3 - j2);
        }
    }

    public long a(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue();
        }
        if (j <= 0) {
            return 0L;
        }
        byte[] a2 = i.a(2048);
        long j2 = j;
        while (j2 > 0) {
            long j3 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
            if (j2 < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                j3 = j2;
            }
            int a3 = a(a2, 0, (int) j3);
            if (a3 < 0) {
                break;
            }
            j2 -= a3;
        }
        i.a(a2);
        return j - j2;
    }
}
