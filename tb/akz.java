package tb;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.mto;

/* loaded from: classes.dex */
public class akz implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PROC_COMBINE = 256;
    public static final int PROC_OUT_FLOAT = 16384;
    public static final int PROC_OUT_LONG = 8192;
    public static final int PROC_OUT_STRING = 4096;
    public static final int PROC_PARENS = 512;
    public static final int PROC_QUOTES = 1024;
    public static final int PROC_SPACE_TERM = 32;
    public static final int PROC_TAB_TERM = 9;
    public static final int PROC_TERM_MASK = 255;
    public static final int PROC_ZERO_TERM = 0;
    private static final int[] b = {32, 544, 32, 32, 32, 32, 32, 32, 32, 8224, 32, 8224, 32, 8224, 8224};
    private static final int[] c = {288, 8224, 8224, 8224, 8224, 8224, 8224, 8224};
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private int l;
    private Method o;
    private String p;
    private Handler s;
    private final long[] m = new long[4];
    private long[] n = new long[7];
    private float q = -1.0f;
    private float r = -1.0f;
    private ReadWriteLock t = new ReentrantReadWriteLock();
    private ReadWriteLock u = new ReentrantReadWriteLock();

    /* renamed from: a  reason: collision with root package name */
    public long f25415a = 7000;
    private long v = 2000;
    private volatile boolean w = true;
    private volatile boolean x = true;
    private volatile double y = mto.a.GEO_NOT_SUPPORT;
    private volatile double z = mto.a.GEO_NOT_SUPPORT;

    public akz(int i, Handler handler) {
        if (handler != null) {
            this.s = handler;
        } else {
            HandlerThread handlerThread = new HandlerThread("CpuTracker");
            handlerThread.start();
            this.s = new Handler(handlerThread.getLooper());
        }
        a(i);
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.p = "/proc/" + i + "/stat";
            this.o = Process.class.getMethod("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class);
            this.o.setAccessible(true);
            if (Build.VERSION.SDK_INT >= 26) {
                return;
            }
            this.s.post(this);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.x) {
                this.s.postDelayed(this, this.v);
            } else if (this.w) {
                this.s.postDelayed(this, this.f25415a);
            }
            c();
            d();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (Build.VERSION.SDK_INT >= 26) {
        } else {
            this.s.removeCallbacks(this);
            if (j > 0) {
                this.f25415a = j;
                this.s.postDelayed(this, this.f25415a);
                this.w = true;
                return;
            }
            this.w = false;
        }
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        this.t.readLock().lock();
        float f = this.q;
        this.t.readLock().unlock();
        return f;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue();
        }
        this.u.readLock().lock();
        float f = this.r;
        this.u.readLock().unlock();
        return f;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public float c() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.akz.c():float");
    }

    public float d() {
        float f;
        float f2;
        if (this.o == null || this.p == null) {
            Log.e("CpuTracker", "readProcFile : " + this.o + ", statFile : " + this.p);
            return 0.0f;
        }
        this.u.writeLock().lock();
        try {
            try {
                if (!(((Boolean) this.o.invoke(null, this.p, b, null, this.m, null)).booleanValue() && ((Boolean) this.o.invoke(null, "/proc/stat", c, null, this.n, null)).booleanValue())) {
                    this.u.writeLock().unlock();
                    return 0.0f;
                }
                int i = (int) (this.m[2] - this.j);
                int i2 = (int) (this.m[3] - this.k);
                long j = this.n[0] + this.n[1];
                long j2 = this.n[2];
                long j3 = this.n[3];
                long j4 = this.n[4];
                long j5 = this.n[5];
                long j6 = this.n[6];
                int i3 = (int) (j - this.d);
                int i4 = (int) (j2 - this.e);
                int i5 = (int) (j4 - this.f);
                int i6 = (int) (j5 - this.g);
                int i7 = (int) (j6 - this.h);
                int i8 = (int) (j3 - this.i);
                if (i8 <= 1) {
                    i8 = this.l;
                }
                int i9 = i3 + i4 + i5 + i6 + i7 + i8;
                if (i9 > 1) {
                    float a2 = ale.a((i + i2) * 100, i9, 2);
                    try {
                        this.r = a2;
                        f2 = a2;
                    } catch (Exception e) {
                        e = e;
                        f = a2;
                        e.printStackTrace();
                        this.u.writeLock().unlock();
                        return f;
                    }
                } else {
                    f2 = 0.0f;
                }
                try {
                    this.j = this.m[2];
                    this.k = this.m[3];
                    this.d = j;
                    this.e = j2;
                    this.i = j3;
                    this.f = j4;
                    this.g = j5;
                    this.h = j6;
                    this.l = i8;
                    return f2;
                } catch (Exception e2) {
                    e = e2;
                    f = f2;
                    e.printStackTrace();
                    this.u.writeLock().unlock();
                    return f;
                }
            } catch (Exception e3) {
                e = e3;
                f = 0.0f;
            }
        } finally {
            this.u.writeLock().unlock();
        }
    }

    private void a(RandomAccessFile randomAccessFile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7734558", new Object[]{this, randomAccessFile});
        } else if (randomAccessFile == null) {
        } else {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
