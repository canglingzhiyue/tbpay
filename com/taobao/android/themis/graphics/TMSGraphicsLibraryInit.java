package com.taobao.android.themis.graphics;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.ihq;
import tb.ihw;

/* loaded from: classes6.dex */
public class TMSGraphicsLibraryInit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile FetchStatus f15528a = FetchStatus.NOT_LOAD;
    private static final ReentrantReadWriteLock b;
    private static final ReentrantReadWriteLock.WriteLock c;
    private static final ReentrantReadWriteLock.ReadLock d;
    private static boolean e;

    /* loaded from: classes6.dex */
    public enum FetchStatus {
        NOT_LOAD,
        LOADING,
        LOAD_SUCCESS,
        LOAD_FAILURE
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        b = reentrantReadWriteLock;
        c = reentrantReadWriteLock.writeLock();
        d = b.readLock();
        e = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (c() == FetchStatus.LOAD_SUCCESS) {
            return true;
        }
        try {
            a(FetchStatus.LOADING);
            ihw b2 = ihq.b().b("themis_gfx");
            if (b2.g()) {
                a(FetchStatus.LOAD_SUCCESS);
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, "themis|soInit", "themis_gfxremote sync fetch success, path: " + b2.b());
            } else if (d()) {
                a(FetchStatus.LOAD_SUCCESS);
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, "themis|soInit", "themis_gfx load from system success");
            } else {
                a(FetchStatus.LOAD_FAILURE);
                if (b2.f() != null) {
                    RVLLevel rVLLevel2 = RVLLevel.Error;
                    com.taobao.android.riverlogger.e.a(rVLLevel2, "themis|soInit", "Remote So failed to sync fetch libthemis_gfx.so because of " + b2.f().toString());
                }
            }
        } catch (Throwable th) {
            a(FetchStatus.LOAD_FAILURE);
            RVLLevel rVLLevel3 = RVLLevel.Error;
            com.taobao.android.riverlogger.e.a(rVLLevel3, "themis|soInit", "Remote So failed to sync fetch libthemis_gfx.so because of " + th.getMessage());
        }
        return FetchStatus.LOAD_SUCCESS == c();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.themis.graphics.TMSGraphicsLibraryInit.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L16
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "57a83ed"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L16:
            r0 = 1
            tb.iia r1 = tb.ihq.a()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "themis_gfx"
            tb.ihz r1 = r1.c(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r1.d()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "resolve"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L3c
            com.taobao.android.themis.graphics.TMSGraphicsLibraryInit.e = r3     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L36
            goto L5f
        L36:
            com.taobao.android.themis.graphics.TMSGraphicsLibraryInit$FetchStatus r1 = com.taobao.android.themis.graphics.TMSGraphicsLibraryInit.FetchStatus.LOAD_SUCCESS     // Catch: java.lang.Throwable -> L3c
            a(r1)     // Catch: java.lang.Throwable -> L3c
            goto L60
        L3c:
            r1 = move-exception
            com.taobao.android.riverlogger.RVLLevel r2 = com.taobao.android.riverlogger.RVLLevel.Error
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "failed to remote load libthemis_gfx.so because of "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "themis|soInit"
            com.taobao.android.riverlogger.e.a(r2, r3, r1)
            com.taobao.android.themis.graphics.TMSGraphicsLibraryInit$FetchStatus r1 = com.taobao.android.themis.graphics.TMSGraphicsLibraryInit.FetchStatus.LOAD_FAILURE
            a(r1)
        L5f:
            r2 = 1
        L60:
            if (r2 == 0) goto L66
            boolean r0 = d()
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.themis.graphics.TMSGraphicsLibraryInit.b():boolean");
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        try {
            System.loadLibrary("themis_gfx");
            return true;
        } catch (Throwable th) {
            RVLLevel rVLLevel = RVLLevel.Error;
            com.taobao.android.riverlogger.e.a(rVLLevel, "themis|soInit", "failed to load libthemis_gfx.so because of " + th.getMessage());
            return false;
        }
    }

    public static FetchStatus c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchStatus) ipChange.ipc$dispatch("7123843f", new Object[0]);
        }
        try {
            d.lock();
            return f15528a;
        } finally {
            d.unlock();
        }
    }

    private static void a(FetchStatus fetchStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba9b3d", new Object[]{fetchStatus});
            return;
        }
        try {
            c.lock();
            f15528a = fetchStatus;
        } finally {
            c.unlock();
        }
    }
}
