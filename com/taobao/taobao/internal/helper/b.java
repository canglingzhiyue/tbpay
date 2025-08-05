package com.taobao.taobao.internal.helper;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<a> f21212a = new ArrayList();
    private static final ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();
    private static final ExecutorService c = Executors.newSingleThreadExecutor();
    private static final Handler d = new Handler(Looper.getMainLooper());

    public static /* synthetic */ Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]) : d;
    }

    static {
        f21212a.add(new a(ThirdPayManager.ThirdPayTypeVal.VAL_CUP, "com.unionpay", 0L, true));
        f21212a.add(new a("WX", "com.tencent.mm", 0L, true));
        f21212a.add(new a("BESTPAY", "com.chinatelecom.bestpayclient", 101330L, false));
        f21212a.add(new a("CMPAY", "com.cmcc.hebao", 140911500L, false));
        f21212a.add(new a("SPABANK", "com.pingan.paces.ccms", 4290L, false));
        f21212a.add(new a("DCEP", "cn.gov.pbc.dcep", 0L, false));
        f21212a.add(new a("YFZFYXGS", "com.android.yufuec", 308L, false));
    }

    public static void a(final Context context, final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4e5ede", new Object[]{context, runnable});
        } else {
            c.execute(new Runnable() { // from class: com.taobao.taobao.internal.helper.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.b(context);
                    b.a().post(runnable);
                }
            });
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            a(context, (Runnable) null);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        for (a aVar : f21212a) {
            if (a(context, aVar.c(), aVar.b())) {
                b.put(aVar.c(), aVar);
            }
        }
    }

    private static boolean a(Context context, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d51105de", new Object[]{context, str, new Long(j)})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && str.equals(packageInfo.packageName)) {
                if (packageInfo.versionCode >= j) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            CashDeskLog.b("CheckAppInstalledHelper", "Package not found: " + str + ", message: " + e.getMessage());
            return false;
        } catch (Exception e2) {
            CashDeskLog.b("CheckAppInstalledHelper", "Error checking package: " + str + ", message: " + e2.getMessage());
            return false;
        }
    }

    public static String a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6033d0ac", new Object[]{context, new Boolean(z)});
        }
        if (b.isEmpty()) {
            b(context);
        }
        StringBuilder sb = new StringBuilder();
        for (a aVar : b.values()) {
            if (!z || !aVar.d()) {
                if (sb.length() != 0) {
                    sb.append("|");
                }
                sb.append(aVar.a());
            }
        }
        a(context);
        return sb.toString();
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "instanceID")

        /* renamed from: a  reason: collision with root package name */
        private final String f21214a;
        @JSONField(name = "packageName")
        private final String b;
        @JSONField(name = "versionCode")
        private final long c;
        @JSONField(name = "onlyUseInBuy")
        private final boolean d;

        public a(String str, String str2, long j, boolean z) {
            this.f21214a = str;
            this.b = str2;
            this.c = j;
            this.d = z;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f21214a;
        }

        public long b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d;
        }
    }
}
