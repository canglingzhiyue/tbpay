package com.loc;

import android.os.SystemClock;
import android.text.TextUtils;
import com.loc.bt;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class bo {

    /* renamed from: a  reason: collision with root package name */
    public static int f7690a = 0;
    public static String b = "";
    public static HashMap<String, String> c;
    public static HashMap<String, String> d;
    public static HashMap<String, String> e;
    private static bo f;

    /* loaded from: classes4.dex */
    public interface a {
        URLConnection a();
    }

    public bo() {
        m.e();
    }

    private static int a(bt btVar, long j) {
        try {
            d(btVar);
            long j2 = 0;
            if (j != 0) {
                j2 = SystemClock.elapsedRealtime() - j;
            }
            int n = btVar.n();
            if (btVar.p() != bt.a.FIX && btVar.p() != bt.a.SINGLE) {
                long j3 = n;
                if (j2 < j3) {
                    long j4 = j3 - j2;
                    if (j4 >= 1000) {
                        return (int) j4;
                    }
                }
                return Math.min(1000, btVar.n());
            }
            return n;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    public static bo a() {
        if (f == null) {
            f = new bo();
        }
        return f;
    }

    public static bu a(bt btVar) throws k {
        return a(btVar, btVar.s());
    }

    private static bu a(bt btVar, bt.b bVar, int i) throws k {
        try {
            d(btVar);
            btVar.a(bVar);
            btVar.c(i);
            return new br().a(btVar);
        } catch (k e2) {
            throw e2;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new k("未知的错误");
        }
    }

    @Deprecated
    private static bu a(bt btVar, boolean z) throws k {
        d(btVar);
        btVar.a(z ? bt.c.HTTPS : bt.c.HTTP);
        bu buVar = null;
        long j = 0;
        boolean z2 = false;
        if (b(btVar)) {
            boolean c2 = c(btVar);
            try {
                j = SystemClock.elapsedRealtime();
                buVar = a(btVar, b(btVar, c2), d(btVar, c2));
            } catch (k e2) {
                if (e2.f() == 21 && btVar.p() == bt.a.INTERRUPT_IO) {
                    throw e2;
                }
                if (!c2) {
                    throw e2;
                }
                z2 = true;
            }
        }
        if (buVar == null || buVar.f7708a == null || buVar.f7708a.length <= 0) {
            try {
                return a(btVar, c(btVar, z2), a(btVar, j));
            } catch (k e3) {
                throw e3;
            }
        }
        return buVar;
    }

    private static bt.b b(bt btVar, boolean z) {
        if (btVar.p() == bt.a.FIX) {
            return bt.b.FIX_NONDEGRADE;
        }
        if (btVar.p() != bt.a.SINGLE && z) {
            return bt.b.FIRST_NONDEGRADE;
        }
        return bt.b.NEVER_GRADE;
    }

    private static boolean b(bt btVar) throws k {
        d(btVar);
        try {
            String c2 = btVar.c();
            if (TextUtils.isEmpty(c2)) {
                return false;
            }
            String host = new URL(c2).getHost();
            if (!TextUtils.isEmpty(btVar.g())) {
                host = btVar.g();
            }
            return m.g(host);
        } catch (Throwable unused) {
            return true;
        }
    }

    private static bt.b c(bt btVar, boolean z) {
        return btVar.p() == bt.a.FIX ? z ? bt.b.FIX_DEGRADE_BYERROR : bt.b.FIX_DEGRADE_ONLY : z ? bt.b.DEGRADE_BYERROR : bt.b.DEGRADE_ONLY;
    }

    private static boolean c(bt btVar) throws k {
        d(btVar);
        if (!b(btVar)) {
            return true;
        }
        if (btVar.b().equals(btVar.c()) || btVar.p() == bt.a.SINGLE) {
            return false;
        }
        return m.h;
    }

    private static int d(bt btVar, boolean z) {
        try {
            d(btVar);
            int n = btVar.n();
            int i = m.e;
            if (btVar.p() != bt.a.FIX) {
                if (btVar.p() != bt.a.SINGLE && n >= i && z) {
                    return i;
                }
            }
            return n;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    private static void d(bt btVar) throws k {
        if (btVar != null) {
            if (btVar.b() != null && !"".equals(btVar.b())) {
                return;
            }
            throw new k("request url is empty");
        }
        throw new k("requeust is null");
    }
}
