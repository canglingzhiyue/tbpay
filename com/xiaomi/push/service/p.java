package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.gw;
import com.xiaomi.push.ia;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile p f24715a;

    /* renamed from: a  reason: collision with other field name */
    private long f1005a;

    /* renamed from: a  reason: collision with other field name */
    private final Context f1006a;

    /* renamed from: a  reason: collision with other field name */
    private final SharedPreferences f1007a;

    /* renamed from: b  reason: collision with other field name */
    private final boolean f1013b;

    /* renamed from: c  reason: collision with other field name */
    private final boolean f1014c;

    /* renamed from: a  reason: collision with other field name */
    private final AtomicInteger f1009a = new AtomicInteger(0);

    /* renamed from: a  reason: collision with other field name */
    private String f1008a = null;

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f1010a = false;

    /* renamed from: b  reason: collision with other field name */
    private String f1011b = null;

    /* renamed from: b  reason: collision with other field name */
    private final AtomicInteger f1012b = new AtomicInteger(0);
    private final AtomicInteger c = new AtomicInteger(0);

    /* renamed from: a  reason: collision with other field name */
    private int f1004a = -1;
    private long b = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a {
        public static String a() {
            return "support_wifi_digest";
        }

        public static String a(String str) {
            return String.format("HB_%s", str);
        }

        public static String b() {
            return "record_support_wifi_digest_reported";
        }

        public static String b(String str) {
            return String.format("HB_dead_time_%s", str);
        }

        public static String c() {
            return "record_hb_count_start";
        }

        public static String d() {
            return "record_short_hb_count";
        }

        public static String e() {
            return "record_long_hb_count";
        }

        public static String f() {
            return "record_hb_change";
        }

        public static String g() {
            return "record_mobile_ptc";
        }

        public static String h() {
            return "record_wifi_ptc";
        }

        public static String i() {
            return "record_ptc_start";
        }

        public static String j() {
            return "keep_short_hb_effective_time";
        }
    }

    private p(Context context) {
        this.f1006a = context;
        this.f1014c = com.xiaomi.push.j.m2118a(context);
        this.f1013b = az.a(this.f1006a).a(ih.IntelligentHeartbeatSwitchBoolean.a(), true);
        this.f1007a = this.f1006a.getSharedPreferences("hb_record", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f1007a.getLong(a.c(), -1L) == -1) {
            this.f1007a.edit().putLong(a.c(), currentTimeMillis).apply();
        }
        this.f1005a = this.f1007a.getLong(a.i(), -1L);
        if (this.f1005a == -1) {
            this.f1005a = currentTimeMillis;
            this.f1007a.edit().putLong(a.i(), currentTimeMillis).apply();
        }
    }

    private int a() {
        if (!StringUtils.isEmpty(this.f1008a)) {
            try {
                return this.f1007a.getInt(a.a(this.f1008a), -1);
            } catch (Throwable unused) {
                return -1;
            }
        }
        return -1;
    }

    public static p a(Context context) {
        if (f24715a == null) {
            synchronized (p.class) {
                if (f24715a == null) {
                    f24715a = new p(context);
                }
            }
        }
        return f24715a;
    }

    private void a(String str, String str2, Map<String, String> map) {
        ig igVar = new ig();
        igVar.d(str);
        igVar.c("hb_name");
        igVar.a("hb_channel");
        igVar.a(1L);
        igVar.b(str2);
        igVar.a(false);
        igVar.b(System.currentTimeMillis());
        igVar.g(this.f1006a.getPackageName());
        igVar.e("com.xiaomi.xmsf");
        if (map == null) {
            map = new HashMap<>();
        }
        String str3 = null;
        u m2360a = v.m2360a(this.f1006a);
        if (m2360a != null && !StringUtils.isEmpty(m2360a.f1028a)) {
            String[] split = m2360a.f1028a.split("@");
            if (split.length > 0) {
                str3 = split[0];
            }
        }
        map.put("uuid", str3);
        map.put("model", Build.MODEL);
        Context context = this.f1006a;
        map.put("avc", String.valueOf(com.xiaomi.push.g.a(context, context.getPackageName())));
        map.put("pvc", String.valueOf((int) BuildConfig.VERSION_CODE));
        map.put("cvc", String.valueOf(48));
        igVar.a(map);
        ia a2 = ia.a(this.f1006a);
        if (a2 != null) {
            a2.a(igVar, this.f1006a.getPackageName());
        }
    }

    private void a(boolean z) {
        if (!m2337c()) {
            return;
        }
        int incrementAndGet = (z ? this.f1012b : this.c).incrementAndGet();
        Object[] objArr = new Object[2];
        String str = "short";
        objArr[0] = z ? str : "long";
        objArr[1] = Integer.valueOf(incrementAndGet);
        com.xiaomi.channel.commonutils.logger.b.b(String.format("[HB] %s ping interval count: %s", objArr));
        if (incrementAndGet < 5) {
            return;
        }
        String d = z ? a.d() : a.e();
        int i = this.f1007a.getInt(d, 0) + incrementAndGet;
        this.f1007a.edit().putInt(d, i).apply();
        Object[] objArr2 = new Object[2];
        if (!z) {
            str = "long";
        }
        objArr2[0] = str;
        objArr2[1] = Integer.valueOf(i);
        com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("[HB] accumulate %s hb count(%s) and write to file. ", objArr2));
        if (z) {
            this.f1012b.set(0);
        } else {
            this.c.set(0);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m2336a() {
        return this.f1009a.get() >= Math.max(az.a(this.f1006a).a(ih.IntelligentHeartbeatNATCountInt.a(), 5), 3);
    }

    private boolean a(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "WIFI-ID-UNKNOWN"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L15
            java.lang.String r10 = r9.f1008a
            if (r10 == 0) goto L14
            java.lang.String r0 = "W-"
            boolean r10 = r10.startsWith(r0)
            if (r10 != 0) goto L17
        L14:
            r10 = 0
        L15:
            r9.f1008a = r10
        L17:
            android.content.SharedPreferences r10 = r9.f1007a
            java.lang.String r0 = r9.f1008a
            java.lang.String r0 = com.xiaomi.push.service.p.a.a(r0)
            r1 = -1
            int r10 = r10.getInt(r0, r1)
            android.content.SharedPreferences r0 = r9.f1007a
            java.lang.String r2 = r9.f1008a
            java.lang.String r2 = com.xiaomi.push.service.p.a.b(r2)
            r3 = -1
            long r5 = r0.getLong(r2, r3)
            long r7 = java.lang.System.currentTimeMillis()
            if (r10 == r1) goto L74
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L55
            android.content.SharedPreferences r10 = r9.f1007a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.f1008a
            java.lang.String r0 = com.xiaomi.push.service.p.a.b(r0)
            long r2 = r9.d()
            long r7 = r7 + r2
            android.content.SharedPreferences$Editor r10 = r10.putLong(r0, r7)
        L51:
            r10.apply()
            goto L74
        L55:
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 <= 0) goto L74
            android.content.SharedPreferences r10 = r9.f1007a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.f1008a
            java.lang.String r0 = com.xiaomi.push.service.p.a.a(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            java.lang.String r0 = r9.f1008a
            java.lang.String r0 = com.xiaomi.push.service.p.a.b(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            goto L51
        L74:
            java.util.concurrent.atomic.AtomicInteger r10 = r9.f1009a
            r0 = 0
            r10.getAndSet(r0)
            java.lang.String r10 = r9.f1008a
            boolean r10 = android.text.StringUtils.isEmpty(r10)
            r2 = 1
            if (r10 != 0) goto L8d
            int r10 = r9.a()
            if (r10 == r1) goto L8a
            goto L8d
        L8a:
            r9.f1010a = r2
            goto L8f
        L8d:
            r9.f1010a = r0
        L8f:
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r1 = r9.f1008a
            r10[r0] = r1
            boolean r0 = r9.f1010a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10[r2] = r0
            java.lang.String r0 = "[HB] network changed, netid:%s, %s"
            java.lang.String r10 = java.lang.String.format(r0, r10)
            com.xiaomi.channel.commonutils.logger.b.m1616a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.p.b(java.lang.String):void");
    }

    private boolean b() {
        return !StringUtils.isEmpty(this.f1008a) && this.f1008a.startsWith("M-") && !az.a(this.f1006a).a(ih.IntelligentHeartbeatUseInMobileNetworkBoolean.a(), false);
    }

    private long c() {
        return this.f1007a.getLong(a.j(), -1L);
    }

    private void c(String str) {
        if (!a(str)) {
            return;
        }
        this.f1007a.edit().putInt(a.a(str), 235000).apply();
        this.f1007a.edit().putLong(a.b(this.f1008a), System.currentTimeMillis() + d()).apply();
    }

    /* renamed from: c  reason: collision with other method in class */
    private boolean m2337c() {
        return m2338d() && az.a(this.f1006a).a(ih.IntelligentHeartbeatDataCollectSwitchBoolean.a(), true) && com.xiaomi.push.m.China.name().equals(com.xiaomi.push.service.a.a(this.f1006a).a());
    }

    private long d() {
        return az.a(this.f1006a).a(ih.ShortHeartbeatEffectivePeriodMsLong.a(), 777600000L);
    }

    private void d(String str) {
        String str2;
        String str3;
        if (m2337c() && !StringUtils.isEmpty(str)) {
            if (str.startsWith("W-")) {
                str2 = "W";
            } else if (!str.startsWith("M-")) {
                return;
            } else {
                str2 = "M";
            }
            String valueOf = String.valueOf(235000);
            String valueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":::");
            sb.append(str2);
            sb.append(":::");
            sb.append(valueOf);
            sb.append(":::");
            sb.append(valueOf2);
            String string = this.f1007a.getString(a.f(), null);
            if (StringUtils.isEmpty(string)) {
                str3 = sb.toString();
            } else {
                str3 = string + "###" + sb.toString();
            }
            this.f1007a.edit().putString(a.f(), str3).apply();
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    private boolean m2338d() {
        return this.f1014c && (this.f1013b || ((c() > System.currentTimeMillis() ? 1 : (c() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    private void e() {
        if (!this.f1007a.getBoolean(a.a(), false)) {
            this.f1007a.edit().putBoolean(a.a(), true).apply();
        }
    }

    /* renamed from: e  reason: collision with other method in class */
    private boolean m2339e() {
        long j = this.f1007a.getLong(a.c(), -1L);
        if (j == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return j > currentTimeMillis || currentTimeMillis - j >= 259200000;
    }

    private void f() {
        int i = this.f1004a;
        String h = i != 0 ? i != 1 ? null : a.h() : a.g();
        if (!StringUtils.isEmpty(h)) {
            if (this.f1007a.getLong(a.i(), -1L) == -1) {
                this.f1005a = System.currentTimeMillis();
                this.f1007a.edit().putLong(a.i(), this.f1005a).apply();
            }
            this.f1007a.edit().putInt(h, this.f1007a.getInt(h, 0) + 1).apply();
        }
    }

    /* renamed from: f  reason: collision with other method in class */
    private boolean m2340f() {
        if (this.f1005a == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f1005a;
        return j > currentTimeMillis || currentTimeMillis - j >= 259200000;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private void g() {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.p.g():void");
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m2341a() {
        int a2;
        long b = gw.b();
        boolean z = true;
        if (this.f1014c && !b() && ((az.a(this.f1006a).a(ih.IntelligentHeartbeatSwitchBoolean.a(), true) || c() >= System.currentTimeMillis()) && (a2 = a()) != -1)) {
            b = a2;
        }
        if (!StringUtils.isEmpty(this.f1008a) && !"WIFI-ID-UNKNOWN".equals(this.f1008a) && this.f1004a == 1) {
            if (b >= 300000) {
                z = false;
            }
            a(z);
        }
        this.b = b;
        com.xiaomi.channel.commonutils.logger.b.m1616a("[HB] ping interval:" + b);
        return b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2342a() {
    }

    public void a(int i) {
        this.f1007a.edit().putLong(a.j(), System.currentTimeMillis() + (i * 1000)).apply();
    }

    public synchronized void a(NetworkInfo networkInfo) {
        if (m2338d()) {
            String str = null;
            if (networkInfo != null) {
                if (networkInfo.getType() != 0) {
                    if (networkInfo.getType() != 1 && networkInfo.getType() != 6) {
                        b(null);
                        this.f1004a = -1;
                        return;
                    }
                    b("WIFI-ID-UNKNOWN");
                    this.f1004a = 1;
                    return;
                }
                String subtypeName = networkInfo.getSubtypeName();
                if (!StringUtils.isEmpty(subtypeName) && !"UNKNOWN".equalsIgnoreCase(subtypeName)) {
                    str = "M-" + subtypeName;
                }
                b(str);
                this.f1004a = 0;
                return;
            }
            b(null);
            this.f1004a = -1;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m2343a(String str) {
        if (!StringUtils.isEmpty(str)) {
            e();
        }
        if (m2338d() && !StringUtils.isEmpty(str)) {
            b("W-" + str);
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public long m2344b() {
        return this.b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m2345b() {
        if (m2338d()) {
            f();
            if (!this.f1010a || StringUtils.isEmpty(this.f1008a) || !this.f1008a.equals(this.f1011b)) {
                return;
            }
            this.f1009a.getAndIncrement();
            com.xiaomi.channel.commonutils.logger.b.m1616a("[HB] ping timeout count:" + this.f1009a);
            if (!m2336a()) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a("[HB] change hb interval for net:" + this.f1008a);
            c(this.f1008a);
            this.f1010a = false;
            this.f1009a.getAndSet(0);
            d(this.f1008a);
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m2346c() {
        if (m2338d()) {
            this.f1011b = this.f1008a;
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m2347d() {
        if (m2338d()) {
            g();
            if (!this.f1010a) {
                return;
            }
            this.f1009a.getAndSet(0);
        }
    }
}
