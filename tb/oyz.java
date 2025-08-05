package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;
import com.taobao.taobaoavsdk.cache.library.a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes8.dex */
public class oyz implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TEMP_POSTFIX = ".download";

    /* renamed from: a  reason: collision with root package name */
    public File f32502a;
    private final oyy b;
    private RandomAccessFile c;

    static {
        kge.a(-1842396609);
        kge.a(1039126038);
    }

    public oyz(File file, oyy oyyVar) throws IOException {
        File file2;
        try {
            if (oyyVar == null) {
                throw new NullPointerException();
            }
            this.b = oyyVar;
            ozb.a(file.getParentFile());
            boolean exists = file.exists();
            if (exists) {
                file2 = file;
            } else {
                File parentFile = file.getParentFile();
                file2 = new File(parentFile, file.getName() + TEMP_POSTFIX);
            }
            this.f32502a = file2;
            this.c = new RandomAccessFile(this.f32502a, exists ? "r" : "rw");
        } catch (IOException e) {
            throw new IOException("Error using file " + file + " as disc cache", e);
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.a
    public synchronized long a() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
        }
        try {
            return this.c.length();
        } catch (IOException e) {
            throw new ProxyCacheException("Error reading length of file " + this.f32502a, e);
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.a
    public synchronized int a(byte[] bArr, long j, int i) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6b2c21", new Object[]{this, bArr, new Long(j), new Integer(i)})).intValue();
        }
        try {
            this.c.seek(j);
            return this.c.read(bArr, 0, i);
        } catch (IOException e) {
            throw new ProxyCacheException(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(a()), Integer.valueOf(bArr.length)), e);
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.a
    public synchronized void a(byte[] bArr, int i) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
            return;
        }
        try {
            if (d()) {
                throw new ProxyCacheException("Error append cache: cache file " + this.f32502a + " is completed!");
            }
            this.c.seek(a());
            this.c.write(bArr, 0, i);
        } catch (IOException e) {
            throw new ProxyCacheException(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.c, Integer.valueOf(bArr.length)), e);
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.a
    public synchronized void b() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            this.c.close();
            this.b.a(this.f32502a);
        } catch (IOException e) {
            throw new ProxyCacheException("Error closing file " + this.f32502a, e);
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.a
    public synchronized void c() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (d()) {
        } else {
            b();
            File file = new File(this.f32502a.getParentFile(), this.f32502a.getName().substring(0, this.f32502a.getName().length() - 9));
            if (!this.f32502a.renameTo(file)) {
                throw new ProxyCacheException("Error renaming file " + this.f32502a + " to " + file + " for completion!");
            }
            this.f32502a = file;
            try {
                this.c = new RandomAccessFile(this.f32502a, "r");
            } catch (IOException e) {
                throw new ProxyCacheException("Error opening " + this.f32502a + " as disc cache", e);
            }
        }
    }

    @Override // com.taobao.taobaoavsdk.cache.library.a
    public synchronized boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return !a(this.f32502a);
    }

    private boolean a(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{this, file})).booleanValue() : file.getName().endsWith(TEMP_POSTFIX);
    }
}
