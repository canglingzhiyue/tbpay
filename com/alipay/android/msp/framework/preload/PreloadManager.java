package com.alipay.android.msp.framework.preload;

import android.content.Context;
import android.os.SystemClock;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PreloadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f4841a;
    private static final PreloadCache b = new PreloadCache();
    private static final PreloadConnection c = new PreloadConnection();
    private static boolean d = false;

    public static /* synthetic */ PreloadCache a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreloadCache) ipChange.ipc$dispatch("db34642d", new Object[0]) : b;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ PreloadConnection b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreloadConnection) ipChange.ipc$dispatch("ea271e48", new Object[0]) : c;
    }

    public static PreloadCache getPreloadCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreloadCache) ipChange.ipc$dispatch("89de97bb", new Object[0]) : b;
    }

    public static void startPreLoad(final Context context) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d5e71a", new Object[]{context});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f4841a < 3000) {
            return;
        }
        if (GlobalHelper.getInstance().getContext() == null) {
            GlobalHelper.getInstance().init(context);
        }
        if (a(elapsedRealtime)) {
            j = elapsedRealtime;
        } else {
            long j2 = f4841a;
            j = j2 + (((elapsedRealtime - j2) / 60000) * 60000);
        }
        boolean a2 = a(elapsedRealtime);
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.preload.PreloadManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PreloadManager.a().startCache(60000L, context);
                }
            }
        });
        long j3 = f4841a + 120000;
        for (int i = 1; i <= 2; i++) {
            long j4 = (60000 * i) + j;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (j4 > j3 && j4 > elapsedRealtime2) {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.preload.PreloadManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            PreloadManager.a().startCache(60000L, context);
                        }
                    }
                }, j4 - elapsedRealtime2);
            }
        }
        if (!DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_PRELOAD_NETWORK, false, context) && elapsedRealtime - f4841a > 60000) {
            if (a2 || !d) {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.preload.PreloadManager.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            PreloadManager.a(PreloadManager.b().a());
                        }
                    }
                });
            }
            long j5 = f4841a + 120000;
            for (int i2 = 1; i2 <= 2; i2++) {
                long j6 = (i2 * 60000) + j;
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                if (j6 > j5 && j6 > elapsedRealtime3) {
                    TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.preload.PreloadManager.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                PreloadManager.a(PreloadManager.b().a());
                            }
                        }
                    }, j6 - elapsedRealtime3);
                }
            }
        }
        f4841a = j;
    }

    private static boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{new Long(j)})).booleanValue() : j > f4841a + 120000;
    }
}
