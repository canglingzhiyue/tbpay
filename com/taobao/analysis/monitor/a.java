package com.taobao.analysis.monitor;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.flow.b;
import com.taobao.analysis.flow.d;
import com.taobao.analysis.stat.AbnormalFlowStatistic;
import com.taobao.orange.OrangeConfig;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.dir;
import tb.mto;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static LinkedHashMap<Long, C0338a> f8580a = new LinkedHashMap<>();
    private static double b = 0.8d;
    private static double c = 0.8d;
    private static volatile a e;
    private long f;
    private boolean g = true;
    private double h = mto.a.GEO_NOT_SUPPORT;
    private double i = mto.a.GEO_NOT_SUPPORT;
    private HashMap<String, com.taobao.analysis.flow.b> j = new HashMap<>();
    private HashMap<String, com.taobao.analysis.flow.b> k = new HashMap<>();
    private int l = 0;
    private ThreadPoolExecutor d = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new ThreadFactory() { // from class: com.taobao.analysis.monitor.a.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "[network_multi_path_flow]");
        }
    });

    /* renamed from: com.taobao.analysis.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0338a {

        /* renamed from: a  reason: collision with root package name */
        public volatile d f8584a;
        public volatile Double b;
        public volatile Double c;
        public volatile String d;
        public volatile int e;

        public C0338a(d dVar, String str, int i) {
            Double valueOf = Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
            this.b = valueOf;
            this.c = valueOf;
            this.f8584a = dVar;
            this.d = str;
            if (dVar.d) {
                this.b = Double.valueOf(((dVar.g + dVar.f) / 1024.0d) / 1024.0d);
            } else {
                this.c = Double.valueOf(((dVar.g + dVar.f) / 1024.0d) / 1024.0d);
            }
            this.e = i;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.d;
        if (threadPoolExecutor == null) {
            return;
        }
        threadPoolExecutor.submit(new Runnable() { // from class: com.taobao.analysis.monitor.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.a().a(GlobalAppRuntimeInfo.getContext());
                }
            }
        });
    }

    public void a(final String str, final String str2, final String str3, final boolean z, final long j, final long j2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa45475", new Object[]{this, str, str2, str3, new Boolean(z), new Long(j), new Long(j2), new Integer(i)});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.d;
        if (threadPoolExecutor == null) {
            return;
        }
        threadPoolExecutor.submit(new Runnable() { // from class: com.taobao.analysis.monitor.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    a.this.a(new C0338a(new d(str, str2, (StringUtils.isEmpty(str3) || str3.length() <= 128) ? str3 : dir.b(str3), z, j, j2), new URI(str3).getHost(), i));
                } catch (Throwable th) {
                    ALog.e("AbnormalFlowMonitor", "run putData failed", null, th, new Object[0]);
                }
            }
        });
    }

    private a() {
        if (Build.VERSION.SDK_INT > 8) {
            this.d.allowCoreThreadTimeOut(true);
        }
    }

    public static a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ed129c6e", new Object[0]);
        }
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[Catch: all -> 0x015d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:11:0x001b, B:13:0x001f, B:14:0x0024, B:16:0x0035, B:17:0x003a, B:19:0x0073, B:20:0x007c, B:22:0x0090, B:26:0x009c, B:28:0x00a2, B:30:0x00bc, B:31:0x00c1, B:33:0x00c7, B:49:0x0121, B:51:0x012e, B:53:0x0139, B:55:0x0143, B:59:0x014c, B:58:0x014a, B:62:0x0150, B:66:0x0159, B:65:0x0157, B:36:0x00d9, B:38:0x00e5, B:40:0x00eb, B:42:0x0101, B:44:0x0109, B:46:0x010f, B:43:0x0107), top: B:72:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139 A[Catch: all -> 0x015d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:11:0x001b, B:13:0x001f, B:14:0x0024, B:16:0x0035, B:17:0x003a, B:19:0x0073, B:20:0x007c, B:22:0x0090, B:26:0x009c, B:28:0x00a2, B:30:0x00bc, B:31:0x00c1, B:33:0x00c7, B:49:0x0121, B:51:0x012e, B:53:0x0139, B:55:0x0143, B:59:0x014c, B:58:0x014a, B:62:0x0150, B:66:0x0159, B:65:0x0157, B:36:0x00d9, B:38:0x00e5, B:40:0x00eb, B:42:0x0101, B:44:0x0109, B:46:0x010f, B:43:0x0107), top: B:72:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(com.taobao.analysis.monitor.a.C0338a r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.monitor.a.a(com.taobao.analysis.monitor.a$a):void");
    }

    private void a(long j, double d, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26254ae1", new Object[]{this, new Long(j), new Double(d), new Integer(i)});
            return;
        }
        for (Map.Entry<Long, C0338a> entry : f8580a.entrySet()) {
            C0338a value = entry.getValue();
            if (value.e == 1) {
                com.taobao.analysis.flow.b bVar = this.j.get(value.f8584a.f8550a);
                if (bVar == null) {
                    bVar = new com.taobao.analysis.flow.b();
                }
                bVar.a(value, bVar.f8543a);
                this.j.put(value.f8584a.f8550a, bVar);
            }
            if (value.e == 2) {
                com.taobao.analysis.flow.b bVar2 = this.k.get(value.f8584a.f8550a);
                if (bVar2 == null) {
                    bVar2 = new com.taobao.analysis.flow.b();
                }
                bVar2.a(value, bVar2.f8543a);
                this.k.put(value.f8584a.f8550a, bVar2);
            }
        }
        a(j, d, 1, this.j);
        a(j, d, 2, this.k);
        f8580a.clear();
    }

    private void a(long j, double d, int i, HashMap<String, com.taobao.analysis.flow.b> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d187132", new Object[]{this, new Long(j), new Double(d), new Integer(i), hashMap});
            return;
        }
        for (Map.Entry<String, com.taobao.analysis.flow.b> entry : hashMap.entrySet()) {
            for (Map.Entry<String, b.a> entry2 : entry.getValue().f8543a.entrySet()) {
                AbnormalFlowStatistic abnormalFlowStatistic = new AbnormalFlowStatistic(entry.getKey(), entry2.getKey(), entry2.getValue(), j, i, d);
                ALog.d("AbnormalFlowMonitor", "handle abnormal flow, refer = [%s] , activityName = [%s]", entry.getKey(), entry2.getKey());
                AppMonitor.getInstance().commitStat(abnormalFlowStatistic);
            }
        }
        hashMap.clear();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f = System.currentTimeMillis();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        b = Double.parseDouble(OrangeConfig.getInstance().getConfig(str, "maxUnitTimeMultiPathBgFlow", "0.5"));
        c = Double.parseDouble(OrangeConfig.getInstance().getConfig(str, "maxUnitTimeMultiPathFgFlow", "0.5"));
    }

    private boolean a(long j, long j2) {
        long time;
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String format = simpleDateFormat.format(Long.valueOf(j2));
        String format2 = simpleDateFormat.format(Long.valueOf(j));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            time = simpleDateFormat2.parse(format).getTime() - simpleDateFormat2.parse(format2).getTime();
            j3 = (time / 86400000) * 24;
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
        return ((time / 60000) - (j3 * 60)) - (((time / 3600000) - j3) * 60) <= 5;
    }
}
