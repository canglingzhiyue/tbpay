package com.taobao.alivfssdk.fresco.common.statfs;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;

/* loaded from: classes.dex */
public class StatFsHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static StatFsHelper f8517a;
    private static final long b;
    private volatile File d;
    private long e;
    private volatile StatFs c = null;
    private volatile boolean g = false;
    private final Lock f = new ReentrantLock();

    /* loaded from: classes4.dex */
    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    static {
        kge.a(-415742763);
        b = TimeUnit.MINUTES.toMillis(2L);
    }

    public static synchronized StatFsHelper a() {
        synchronized (StatFsHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StatFsHelper) ipChange.ipc$dispatch("adccd7e8", new Object[0]);
            }
            if (f8517a == null) {
                f8517a = new StatFsHelper();
            }
            return f8517a;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g) {
        } else {
            this.f.lock();
            try {
                if (!this.g) {
                    this.d = Environment.getDataDirectory();
                    d();
                    this.g = true;
                }
            } finally {
                this.f.unlock();
            }
        }
    }

    public boolean a(StorageType storageType, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62e191f7", new Object[]{this, storageType, new Long(j)})).booleanValue();
        }
        b();
        long a2 = a(storageType);
        return a2 <= 0 || a2 < j;
    }

    public long a(StorageType storageType) {
        long blockSize;
        long availableBlocks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e0742e5", new Object[]{this, storageType})).longValue();
        }
        b();
        c();
        StatFs statFs = this.c;
        if (statFs == null) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return blockSize * availableBlocks;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f.tryLock()) {
        } else {
            try {
                if (SystemClock.uptimeMillis() - this.e > b) {
                    d();
                }
            } finally {
                this.f.unlock();
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c = a(this.c, this.d);
        this.e = SystemClock.uptimeMillis();
    }

    private StatFs a(StatFs statFs, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatFs) ipChange.ipc$dispatch("32dae9e9", new Object[]{this, statFs, file});
        }
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            return statFs;
        } catch (IllegalArgumentException unused) {
            return null;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static StatFs a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StatFs) ipChange.ipc$dispatch("38195e97", new Object[]{str}) : new StatFs(str);
    }
}
