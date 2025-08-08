package com.taobao.analysis.flow;

import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;
import tb.dir;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean b = false;
    private static long c;
    private static long d;
    private static long e;
    private static volatile a h;
    private long f;

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f8542a = new ArrayList();
    private boolean g = true;

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("48e9ad5d", new Object[0]);
        }
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    public synchronized void a(String str, String str2, String str3, boolean z, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9081284e", new Object[]{this, str, str2, str3, new Boolean(z), new Long(j), new Long(j2)});
            return;
        }
        if (b && c != 0 && d != 0 && e != 0) {
            if (this.g) {
                b();
                this.g = false;
            }
            String b2 = (StringUtils.isEmpty(str3) || str3.length() <= 128) ? str3 : dir.b(str3);
            if (this.f8542a.size() <= d) {
                boolean z2 = dir.c;
                this.f8542a.add(new d(str, str2, b2, z, dir.f26790a, j, j2));
                return;
            }
            boolean z3 = dir.c;
            a(false);
        }
    }

    public synchronized void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.f != 0 && b && c != 0 && d != 0 && e != 0) {
            long j = 0;
            for (d dVar : this.f8542a) {
                j += dVar.f + dVar.g;
            }
            long currentTimeMillis = (System.currentTimeMillis() - this.f) * c;
            if (dir.c) {
                String str = "tryCommitAbnormalFlow allstream:" + j + " maxflow:" + currentTimeMillis;
            }
            if (j > currentTimeMillis) {
                a(this.f8542a);
                AppMonitor.Counter.commit("networkPrefer", "invalidFlow", null, this.f8542a.size());
            }
            if (z) {
                this.f = 0L;
            } else {
                this.f = System.currentTimeMillis();
            }
            this.f8542a.clear();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: all -> 0x011a, Exception -> 0x0121, TryCatch #5 {Exception -> 0x0121, all -> 0x011a, blocks: (B:9:0x0019, B:11:0x0028, B:13:0x002e, B:15:0x003b, B:16:0x003e, B:18:0x004c, B:20:0x0061, B:21:0x006d, B:23:0x0073, B:31:0x0096, B:35:0x00b3, B:39:0x00c4, B:43:0x00d1, B:45:0x00f0, B:46:0x0105, B:38:0x00c2, B:34:0x00b1, B:28:0x0089, B:30:0x0094, B:47:0x0111, B:19:0x0057), top: B:67:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2 A[Catch: all -> 0x011a, Exception -> 0x0121, TryCatch #5 {Exception -> 0x0121, all -> 0x011a, blocks: (B:9:0x0019, B:11:0x0028, B:13:0x002e, B:15:0x003b, B:16:0x003e, B:18:0x004c, B:20:0x0061, B:21:0x006d, B:23:0x0073, B:31:0x0096, B:35:0x00b3, B:39:0x00c4, B:43:0x00d1, B:45:0x00f0, B:46:0x0105, B:38:0x00c2, B:34:0x00b1, B:28:0x0089, B:30:0x0094, B:47:0x0111, B:19:0x0057), top: B:67:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0 A[Catch: all -> 0x011a, Exception -> 0x0121, TryCatch #5 {Exception -> 0x0121, all -> 0x011a, blocks: (B:9:0x0019, B:11:0x0028, B:13:0x002e, B:15:0x003b, B:16:0x003e, B:18:0x004c, B:20:0x0061, B:21:0x006d, B:23:0x0073, B:31:0x0096, B:35:0x00b3, B:39:0x00c4, B:43:0x00d1, B:45:0x00f0, B:46:0x0105, B:38:0x00c2, B:34:0x00b1, B:28:0x0089, B:30:0x0094, B:47:0x0111, B:19:0x0057), top: B:67:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.List<com.taobao.analysis.flow.d> r12) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.flow.a.a(java.util.List):void");
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        b = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(str, "needMonitor", "false"));
        c = Long.parseLong(OrangeConfig.getInstance().getConfig(str, "maxUnitTimeFlow", "100"));
        d = Long.parseLong(OrangeConfig.getInstance().getConfig(str, "maxMemoryRecord", "50"));
        e = Long.parseLong(OrangeConfig.getInstance().getConfig(str, "maxFileSize", "2000"));
    }
}
