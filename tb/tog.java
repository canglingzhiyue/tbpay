package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.utils.io.i;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes9.dex */
public class tog extends FilterInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tod f34242a;
    private long b;
    private long c;
    private boolean d;

    static {
        kge.a(1012593196);
    }

    public static /* synthetic */ Object ipc$super(tog togVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 862063607) {
            if (hashCode != 2047096050) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Long(super.skip(((Number) objArr[0]).longValue()));
        }
        return new Integer(super.read((byte[]) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f11b06c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public tog(InputStream inputStream) {
        super(inputStream);
        this.d = false;
        this.b = 0L;
        this.c = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52db0af", new Object[]{this, new Integer(i)});
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            throw new IOException("mark/reset not supported");
        }
        ipChange.ipc$dispatch("788e6256", new Object[]{this});
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read != -1 ? bArr[0] & 255 : read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        tod todVar = this.f34242a;
        if (todVar != null) {
            if (this.b == todVar.b()) {
                return -1;
            }
            if (this.f34242a.b() - this.b < i2) {
                i2 = (int) (this.f34242a.b() - this.b);
            }
        }
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            if (this.f34242a != null) {
                this.b += read;
            }
            this.c += read;
        }
        return read;
    }

    public tod a() throws IOException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (tod) ipChange.ipc$dispatch("f0b0cf5", new Object[]{this});
        }
        b();
        byte[] a2 = i.a(512);
        byte[] a3 = i.a(512);
        int i = 0;
        while (i < 512) {
            int read = read(a3, 0, 512 - i);
            if (read < 0) {
                break;
            }
            System.arraycopy(a3, 0, a2, i, read);
            i += read;
        }
        int length = a2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (a2[i2] != 0) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            this.f34242a = new tod(a2);
        }
        i.a(a2);
        i.a(a3);
        return this.f34242a;
    }

    public void b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        tod todVar = this.f34242a;
        if (todVar == null) {
            return;
        }
        if (todVar.b() > this.b) {
            long j = 0;
            while (j < this.f34242a.b() - this.b) {
                long skip = skip((this.f34242a.b() - this.b) - j);
                if (skip == 0 && this.f34242a.b() - this.b > 0) {
                    throw new IOException("Possible tar file corruption");
                }
                j += skip;
            }
        }
        this.f34242a = null;
        this.b = 0L;
        c();
    }

    public void c() throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        long j = this.c;
        long j2 = 0;
        if (j <= 0 || (i = (int) (j % 512)) <= 0) {
            return;
        }
        while (true) {
            long j3 = 512 - i;
            if (j2 >= j3) {
                return;
            }
            j2 += skip(j3 - j2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a0434f2", new Object[]{this, new Long(j)})).longValue();
        }
        if (this.d) {
            long skip = super.skip(j);
            this.c += skip;
            return skip;
        } else if (j <= 0) {
            return 0L;
        } else {
            byte[] a2 = i.a(2048);
            long j2 = j;
            while (j2 > 0) {
                long j3 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX;
                if (j2 < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                    j3 = j2;
                }
                int read = read(a2, 0, (int) j3);
                if (read < 0) {
                    break;
                }
                j2 -= read;
            }
            i.a(a2);
            return j - j2;
        }
    }
}
