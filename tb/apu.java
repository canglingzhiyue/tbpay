package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes.dex */
public class apu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static File f25509a;
    public static FileChannel b;
    public static FileLock c;

    static {
        kge.a(985358677);
        f25509a = null;
    }

    public static synchronized boolean a(Context context) {
        FileLock fileLock;
        synchronized (apu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
            } else if (context == null) {
                return true;
            } else {
                if (f25509a == null) {
                    f25509a = new File(context.getFilesDir() + File.separator + "Analytics.Lock");
                }
                boolean exists = f25509a.exists();
                if (!exists) {
                    try {
                        exists = f25509a.createNewFile();
                    } catch (IOException unused) {
                    }
                }
                if (!exists) {
                    return true;
                }
                if (b == null) {
                    try {
                        b = new RandomAccessFile(f25509a, "rw").getChannel();
                    } catch (Exception unused2) {
                        return false;
                    }
                }
                try {
                    fileLock = b.tryLock();
                    if (fileLock != null) {
                        c = fileLock;
                        return true;
                    }
                } catch (Throwable unused3) {
                    fileLock = null;
                }
                String str = "mLock:" + fileLock;
                return false;
            }
        }
    }

    public static synchronized void a() {
        synchronized (apu.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            if (c != null) {
                try {
                    c.release();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    c = null;
                    throw th;
                }
                c = null;
            }
            if (b == null) {
                return;
            }
            try {
                b.close();
            } catch (Exception unused2) {
            } finally {
                b = null;
            }
        }
    }
}
