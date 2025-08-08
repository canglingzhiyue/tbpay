package com.loc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.service.build.Ta;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import java.util.ArrayList;
import org.android.agoo.common.AgooConstants;
import tb.iao;
import tb.orq;

/* loaded from: classes4.dex */
public final class er {
    static int C = -1;
    private static boolean M = false;
    boolean H;
    private Handler P;
    private fd Q;
    private String R;
    private es T;
    public static String[] F = {"android.permission.ACCESS_COARSE_LOCATION", com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION};
    public static String G = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static volatile boolean S = false;

    /* renamed from: a  reason: collision with root package name */
    Context f7766a = null;
    ConnectivityManager b = null;
    ff c = null;
    fb d = null;
    fh e = null;
    fo f = null;
    ArrayList<eg> g = new ArrayList<>();
    a h = null;
    AMapLocationClientOption i = new AMapLocationClientOption();
    ew j = null;
    long k = 0;
    private int K = 0;
    fp l = null;
    boolean m = false;
    private String L = null;
    fm n = null;
    StringBuilder o = new StringBuilder();
    boolean p = true;
    boolean q = true;
    AMapLocationClientOption.GeoLanguage r = AMapLocationClientOption.GeoLanguage.DEFAULT;
    boolean s = true;
    boolean t = false;
    WifiInfo u = null;
    boolean v = true;
    private String N = null;
    StringBuilder w = null;
    boolean x = false;
    public boolean y = false;
    int z = 12;
    private boolean O = true;
    ey A = null;
    boolean B = false;
    ev D = null;
    String E = null;
    IntentFilter I = null;
    LocationManager J = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.loc.er$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7767a = new int[AMapLocationClientOption.GeoLanguage.values().length];

        static {
            try {
                f7767a[AMapLocationClientOption.GeoLanguage.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7767a[AMapLocationClientOption.GeoLanguage.ZH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7767a[AMapLocationClientOption.GeoLanguage.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                return;
            }
            try {
                String action = intent.getAction();
                if (StringUtils.isEmpty(action)) {
                    return;
                }
                if (!action.equals("android.net.wifi.SCAN_RESULTS")) {
                    if (!action.equals("android.net.wifi.WIFI_STATE_CHANGED") || er.this.c == null) {
                        return;
                    }
                    er.this.c.j();
                    return;
                }
                if (er.this.c != null) {
                    er.this.c.i();
                }
                try {
                    if (intent.getExtras() == null || !intent.getExtras().getBoolean("resultsUpdated", true) || er.this.c == null) {
                        return;
                    }
                    er.this.c.h();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                fr.a(th, "Aps", iao.NEXT_TAG_RECEIVER);
            }
        }
    }

    public er(boolean z) {
        this.H = false;
        this.H = z;
    }

    private static ew a(int i, String str) {
        ew ewVar = new ew("");
        ewVar.setErrorCode(i);
        ewVar.setLocationDetail(str);
        if (i == 15) {
            fw.a((String) null, 2151);
        }
        return ewVar;
    }

    private ew a(ew ewVar, bu buVar, eq eqVar) {
        if (buVar != null) {
            try {
                if (buVar.f7708a != null && buVar.f7708a.length != 0) {
                    fo foVar = new fo();
                    String str = new String(buVar.f7708a, "UTF-8");
                    if (str.contains("\"status\":\"0\"")) {
                        ew a2 = foVar.a(str, this.f7766a, buVar, eqVar);
                        a2.h(this.w.toString());
                        return a2;
                    } else if (!str.contains("</body></html>")) {
                        return null;
                    } else {
                        ewVar.setErrorCode(5);
                        if (this.c == null || !this.c.a(this.b)) {
                            eqVar.f("#0502");
                            this.o.append("请求可能被劫持了#0502");
                            fw.a((String) null, 2052);
                        } else {
                            eqVar.f("#0501");
                            this.o.append("您连接的是一个需要登录的网络，请确认已经登入网络#0501");
                            fw.a((String) null, (int) com.taobao.accs.net.f.DEAMON_JOB_ID);
                        }
                        ewVar.setLocationDetail(this.o.toString());
                        return ewVar;
                    }
                }
            } catch (Throwable th) {
                ewVar.setErrorCode(4);
                fr.a(th, "Aps", "checkResponseEntity");
                eqVar.f("#0403");
                StringBuilder sb = this.o;
                sb.append("check response exception ex is" + th.getMessage() + "#0403");
                ewVar.setLocationDetail(this.o.toString());
                return ewVar;
            }
        }
        ewVar.setErrorCode(4);
        this.o.append("网络异常,请求异常#0403");
        eqVar.f("#0403");
        ewVar.h(this.w.toString());
        ewVar.setLocationDetail(this.o.toString());
        if (buVar != null) {
            fw.a(buVar.d, 2041);
        }
        return ewVar;
    }

    private StringBuilder a(StringBuilder sb) {
        if (sb == null) {
            sb = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        sb.append(this.d.m());
        sb.append(this.c.o());
        return sb;
    }

    private boolean a(long j) {
        if (!this.O) {
            this.O = true;
            return false;
        }
        if (fy.b() - j < 800) {
            long j2 = 0;
            if (fy.a(this.j)) {
                j2 = fy.a() - this.j.getTime();
            }
            if (j2 <= 10000) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010a A[Catch: Throwable -> 0x0203, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0203, blocks: (B:10:0x0054, B:12:0x007d, B:16:0x0088, B:18:0x0090, B:21:0x0098, B:22:0x009a, B:24:0x00a0, B:25:0x00aa, B:29:0x00b5, B:31:0x00c8, B:33:0x00cc, B:34:0x00d6, B:37:0x00ec, B:39:0x00f2, B:41:0x00f6, B:44:0x0106, B:46:0x010a, B:42:0x00fd, B:43:0x0103), top: B:102:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.ew b(boolean r12, com.loc.eq r13) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.er.b(boolean, com.loc.eq):com.loc.ew");
    }

    private void b(Context context) {
        try {
            if (context.checkCallingOrSelfPermission(x.c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFQ1VSRV9TRVRUSU5HUw==")) != 0) {
                return;
            }
            this.m = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c6, code lost:
        if (com.loc.fy.f(r14.f7766a) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d7, code lost:
        if (com.loc.fy.f(r14.f7766a) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d9, code lost:
        r14.o.append("或后台运行没有后台定位权限");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e1, code lost:
        r15 = r14.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0263, code lost:
        if (r14.v == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029e, code lost:
        if (r14.v == false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String c(com.loc.eq r15) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.er.c(com.loc.eq):java.lang.String");
    }

    private static void c(ew ewVar) {
        if (ewVar.getErrorCode() == 0 && ewVar.getLocationType() == 0) {
            if ("-5".equals(ewVar.d()) || "1".equals(ewVar.d()) || "2".equals(ewVar.d()) || AgooConstants.ACK_PACK_NOBIND.equals(ewVar.d()) || AgooConstants.REPORT_NOT_ENCRYPT.equals(ewVar.d()) || "-1".equals(ewVar.d())) {
                ewVar.setLocationType(5);
            } else {
                ewVar.setLocationType(6);
            }
        }
    }

    private void d(ew ewVar) {
        if (ewVar != null) {
            this.j = ewVar;
        }
    }

    private void i() {
        if (this.n != null) {
            try {
                if (this.i == null) {
                    this.i = new AMapLocationClientOption();
                }
                this.n.a(this.i.getHttpTimeOut(), this.i.getLocationProtocol().equals(AMapLocationClientOption.AMapLocationProtocol.HTTPS), j());
            } catch (Throwable unused) {
            }
        }
    }

    private int j() {
        int i;
        if (this.i.getGeoLanguage() == null || (i = AnonymousClass1.f7767a[this.i.getGeoLanguage().ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return i != 3 ? 0 : 2;
    }

    private void k() {
        boolean z;
        boolean z2;
        AMapLocationClientOption.GeoLanguage geoLanguage = AMapLocationClientOption.GeoLanguage.DEFAULT;
        boolean z3 = true;
        try {
            geoLanguage = this.i.getGeoLanguage();
            z = this.i.isNeedAddress();
            try {
                z2 = this.i.isOffset();
                try {
                    z3 = this.i.isLocationCacheEnable();
                    this.t = this.i.isOnceLocationLatest();
                    this.B = this.i.isSensorEnable();
                    if (z2 != this.q || z != this.p || z3 != this.s || geoLanguage != this.r) {
                        r();
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z2 = true;
                this.q = z2;
                this.p = z;
                this.s = z3;
                this.r = geoLanguage;
            }
        } catch (Throwable unused3) {
            z = true;
        }
        this.q = z2;
        this.p = z;
        this.s = z3;
        this.r = geoLanguage;
    }

    private void l() {
        try {
            if (this.h == null) {
                this.h = new a();
            }
            if (this.I == null) {
                this.I = new IntentFilter();
                this.I.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                this.I.addAction("android.net.wifi.SCAN_RESULTS");
            }
            this.f7766a.registerReceiver(this.h, this.I);
        } catch (Throwable th) {
            fr.a(th, "Aps", "initBroadcastListener");
        }
    }

    private byte[] m() throws Throwable {
        if (this.l == null) {
            this.l = new fp();
        }
        if (this.i == null) {
            this.i = new AMapLocationClientOption();
        }
        this.l.a(this.f7766a, this.i.isNeedAddress(), this.i.isOffset(), this.d, this.c, this.b, this.E, this.Q);
        return this.l.a();
    }

    private boolean n() {
        return this.k == 0 || fy.b() - this.k > orq.FRAME_CHECK_TIMEOUT;
    }

    private void o() {
        ff ffVar = this.c;
        if (ffVar == null) {
            return;
        }
        ffVar.a(this.m);
    }

    private boolean p() {
        this.g = this.c.e();
        ArrayList<eg> arrayList = this.g;
        return arrayList == null || arrayList.size() <= 0;
    }

    private void q() {
        if (this.N != null) {
            this.N = null;
        }
        StringBuilder sb = this.w;
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    private void r() {
        try {
            if (this.e != null) {
                this.e.a();
            }
            d(null);
            this.O = false;
            if (this.D == null) {
                return;
            }
            this.D.a();
        } catch (Throwable th) {
            fr.a(th, "Aps", "cleanCache");
        }
    }

    public final ew a(double d, double d2) {
        try {
            String a2 = this.n.a(this.f7766a, d, d2);
            if (!a2.contains("\"status\":\"1\"")) {
                return null;
            }
            ew a3 = this.f.a(a2);
            a3.setLatitude(d);
            a3.setLongitude(d2);
            return a3;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:45|(1:47)(2:75|(1:77)(9:78|(1:80)|49|50|(2:53|(1:55)(2:56|(1:58)(2:59|(1:61)(1:62))))|63|(3:65|(1:71)(1:69)|70)|72|73))|48|49|50|(2:53|(0)(0))|63|(0)|72|73) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:20|(2:22|(1:24)(1:25))|26|27|28|(6:33|34|35|36|37|(2:39|40)(2:41|(2:43|44)(10:45|(1:47)(2:75|(1:77)(9:78|(1:80)|49|50|(2:53|(1:55)(2:56|(1:58)(2:59|(1:61)(1:62))))|63|(3:65|(1:71)(1:69)|70)|72|73))|48|49|50|(2:53|(0)(0))|63|(0)|72|73)))|85|34|35|36|37|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
        com.loc.fr.a(r0, "Aps", "getLocation getCgiListParam");
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168 A[Catch: Throwable -> 0x0185, TryCatch #2 {Throwable -> 0x0185, blocks: (B:60:0x0158, B:63:0x015e, B:65:0x0168, B:68:0x0172, B:71:0x017c, B:72:0x0181), top: B:90:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.ew a(com.loc.eq r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.er.a(com.loc.eq):com.loc.ew");
    }

    public final ew a(ew ewVar) {
        this.D.a(this.s);
        return this.D.a(ewVar);
    }

    public final ew a(boolean z) {
        int i;
        String sb;
        if (this.c.n()) {
            i = 15;
            sb = "networkLocation has been mocked!#1502";
        } else if (!StringUtils.isEmpty(this.N)) {
            ew a2 = this.e.a(this.f7766a, this.N, this.w, true, z);
            if (fy.a(a2)) {
                d(a2);
            }
            return a2;
        } else {
            i = this.z;
            sb = this.o.toString();
        }
        return a(i, sb);
    }

    public final ew a(boolean z, eq eqVar) {
        eqVar.e(z ? Ta.c : "first");
        if (this.f7766a == null) {
            eqVar.f("#0101");
            this.o.append("context is null#0101");
            fw.a((String) null, 2011);
            return a(1, this.o.toString());
        } else if (this.c.n()) {
            eqVar.f("#1502");
            return a(15, "networkLocation has been mocked!#1502");
        } else {
            b();
            if (StringUtils.isEmpty(this.N)) {
                return a(this.z, this.o.toString());
            }
            ew b = b(z, eqVar);
            if (fy.a(b) && !S) {
                this.e.a(this.w.toString());
                this.e.a(this.d.e());
                d(b);
            }
            S = true;
            return b;
        }
    }

    public final void a() {
        fb fbVar = this.d;
        if (fbVar != null) {
            fbVar.b();
        }
    }

    public final void a(Context context) {
        try {
            if (this.f7766a != null) {
                return;
            }
            this.D = new ev();
            this.f7766a = context.getApplicationContext();
            fy.b(this.f7766a);
            if (this.c == null) {
                this.c = new ff(this.f7766a, (WifiManager) fy.a(this.f7766a, "wifi"), this.P);
            }
            if (this.d == null) {
                this.d = new fb(this.f7766a, this.P);
            }
            this.Q = new fd(context, this.P);
            if (this.e == null) {
                this.e = new fh();
            }
            if (this.f != null) {
                return;
            }
            this.f = new fo();
        } catch (Throwable th) {
            th.printStackTrace();
            fr.a(th, "Aps", "initBase");
        }
    }

    public final void a(Handler handler) {
        this.P = handler;
    }

    public final void a(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() != 0) {
            return;
        }
        fc fcVar = new fc();
        fcVar.f7786a = aMapLocation.getLocationType();
        fcVar.d = aMapLocation.getTime();
        fcVar.e = (int) aMapLocation.getAccuracy();
        fcVar.b = aMapLocation.getLatitude();
        fcVar.c = aMapLocation.getLongitude();
        if (aMapLocation.getLocationType() != 1) {
            return;
        }
        this.Q.a(fcVar);
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.i = aMapLocationClientOption;
        if (this.i == null) {
            this.i = new AMapLocationClientOption();
        }
        ff ffVar = this.c;
        if (ffVar != null) {
            this.i.isWifiActiveScan();
            ffVar.a(this.i.isWifiScan(), this.i.isMockEnable(), AMapLocationClientOption.isOpenAlwaysScanWifi(), aMapLocationClientOption.getScanWifiInterval());
        }
        i();
        fh fhVar = this.e;
        if (fhVar != null) {
            fhVar.a(this.i);
        }
        fo foVar = this.f;
        if (foVar != null) {
            foVar.a(this.i);
        }
        k();
    }

    public final void a(ew ewVar, int i) {
        if (ewVar != null && ewVar.getErrorCode() == 0) {
            fc fcVar = new fc();
            fcVar.d = ewVar.getTime();
            fcVar.e = (int) ewVar.getAccuracy();
            fcVar.b = ewVar.getLatitude();
            fcVar.c = ewVar.getLongitude();
            fcVar.f7786a = i;
            fcVar.g = Integer.parseInt(ewVar.d());
            fcVar.h = ewVar.l();
            this.Q.b(fcVar);
        }
    }

    public final void b() {
        this.n = fm.a(this.f7766a);
        i();
        if (this.b == null) {
            this.b = (ConnectivityManager) fy.a(this.f7766a, "connectivity");
        }
        if (this.l == null) {
            this.l = new fp();
        }
    }

    public final void b(eq eqVar) {
        try {
        } catch (Throwable th) {
            fr.a(th, "Aps", "initFirstLocateParam");
        }
        if (this.x) {
            return;
        }
        q();
        if (this.t) {
            l();
        }
        this.c.b(this.t);
        this.g = this.c.e();
        this.d.a(true, p());
        this.N = c(eqVar);
        if (!StringUtils.isEmpty(this.N)) {
            this.w = a(this.w);
        }
        this.x = true;
    }

    public final void b(ew ewVar) {
        if (fy.a(ewVar)) {
            this.e.a(this.N, this.w, ewVar, this.f7766a, true);
        }
    }

    public final void c() {
        if (this.A == null) {
            this.A = new ey(this.f7766a);
        }
        l();
        this.c.b(false);
        this.g = this.c.e();
        this.d.a(false, p());
        this.e.a(this.f7766a);
        b(this.f7766a);
        this.y = true;
    }

    public final void d() {
        if (this.o.length() > 0) {
            StringBuilder sb = this.o;
            sb.delete(0, sb.length());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r4 = this;
            r0 = 0
            r4.E = r0
            r1 = 0
            r4.x = r1
            r4.y = r1
            com.loc.fh r1 = r4.e
            if (r1 == 0) goto L11
            android.content.Context r2 = r4.f7766a
            r1.b(r2)
        L11:
            com.loc.ev r1 = r4.D
            if (r1 == 0) goto L18
            r1.a()
        L18:
            com.loc.fo r1 = r4.f
            if (r1 == 0) goto L1e
            r4.f = r0
        L1e:
            com.loc.fd r1 = r4.Q
            if (r1 == 0) goto L27
            boolean r2 = r4.H
            r1.a(r2)
        L27:
            android.content.Context r1 = r4.f7766a     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L36
            com.loc.er$a r1 = r4.h     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L36
            android.content.Context r1 = r4.f7766a     // Catch: java.lang.Throwable -> L3b
            com.loc.er$a r2 = r4.h     // Catch: java.lang.Throwable -> L3b
            r1.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> L3b
        L36:
            r4.h = r0
            goto L44
        L39:
            r1 = move-exception
            goto L6d
        L3b:
            r1 = move-exception
            java.lang.String r2 = "Aps"
            java.lang.String r3 = "destroy"
            com.loc.fr.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L39
            goto L36
        L44:
            com.loc.fb r1 = r4.d
            if (r1 == 0) goto L4d
            boolean r2 = r4.H
            r1.a(r2)
        L4d:
            com.loc.ff r1 = r4.c
            if (r1 == 0) goto L56
            boolean r2 = r4.H
            r1.c(r2)
        L56:
            java.util.ArrayList<com.loc.eg> r1 = r4.g
            if (r1 == 0) goto L5d
            r1.clear()
        L5d:
            com.loc.ey r1 = r4.A
            if (r1 == 0) goto L64
            r1.f()
        L64:
            r4.j = r0
            r4.f7766a = r0
            r4.w = r0
            r4.J = r0
            return
        L6d:
            r4.h = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.er.e():void");
    }

    public final void f() {
        es esVar = this.T;
        if (esVar != null) {
            esVar.d();
        }
    }

    public final void g() {
        try {
            if (this.f7766a == null) {
                return;
            }
            if (this.T == null) {
                this.T = new es(this.f7766a);
            }
            this.T.a(this.d, this.c, this.P);
        } catch (Throwable th) {
            av.b(th, "as", "stc");
        }
    }

    public final void h() {
        es esVar = this.T;
        if (esVar != null) {
            esVar.a();
        }
    }
}
