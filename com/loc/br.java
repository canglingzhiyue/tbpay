package com.loc;

import android.os.Build;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.loc.bo;
import com.loc.bt;
import com.loc.m;
import com.taobao.trtc.api.TrtcConstants;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import org.apache.http.conn.ConnectTimeoutException;
import tb.riy;

/* loaded from: classes4.dex */
public final class br {
    private static SoftReference<SSLContext> k;
    private static SoftReference<bs> t;

    /* renamed from: a  reason: collision with root package name */
    private boolean f7696a;
    private SSLContext b;
    private Proxy c;
    private String g;
    private bo.a h;
    private d i;
    private boolean l;
    private String m;
    private String n;
    private volatile boolean d = false;
    private long e = -1;
    private long f = 0;
    private String j = "";
    private boolean o = false;
    private boolean p = false;
    private String q = "";
    private String r = "";
    private String s = "";
    private f u = new f();

    /* loaded from: classes4.dex */
    public static class a implements Cloneable, Comparable {

        /* renamed from: a  reason: collision with root package name */
        public int f7697a;
        public String b;
        public String c;
        public String d;
        public String e;
        public int f;
        public int g;
        public int h;
        public long i;
        public volatile AtomicInteger j = new AtomicInteger(1);

        public a(c cVar) {
            this.b = cVar.c;
            this.c = cVar.e;
            this.e = cVar.d;
            this.f = cVar.m;
            this.g = cVar.n;
            this.h = cVar.b.a();
            this.d = cVar.f7699a;
            this.i = cVar.f;
            if (this.f == 10) {
                this.f7697a = 0;
            }
        }

        /* renamed from: a */
        public final a clone() {
            try {
                return (a) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        public final String b() {
            StringBuilder sb;
            StringBuilder sb2;
            StringBuilder sb3;
            StringBuilder sb4;
            try {
                String str = this.f + "#";
                if (!StringUtils.isEmpty(this.e)) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(this.e);
                    sb.append("#");
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("-#");
                }
                String str2 = (sb.toString() + this.h + "#") + this.j + "#";
                if (!StringUtils.isEmpty(this.b)) {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(this.b);
                    sb2.append("#");
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append("-#");
                }
                String sb5 = sb2.toString();
                if (this.f == 1) {
                    sb3 = new StringBuilder();
                    sb3.append(sb5);
                    sb3.append(this.d);
                    sb3.append("#");
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(sb5);
                    sb3.append("-#");
                }
                String sb6 = sb3.toString();
                if (this.f == 1) {
                    sb4 = new StringBuilder();
                    sb4.append(sb6);
                    sb4.append(this.i);
                    sb4.append("#");
                } else {
                    sb4 = new StringBuilder();
                    sb4.append(sb6);
                    sb4.append("-#");
                }
                String str3 = (sb4.toString() + this.c + "#") + this.g;
                String b = p.b(bk.a(str3.getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                StringBuilder sb7 = new StringBuilder("上报异常数据");
                sb7.append(str3);
                sb7.append("加密后：");
                sb7.append(b);
                br.a();
                return b;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f7697a - ((a) obj).f7697a;
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public HttpURLConnection f7698a;
        public int b = this.b;
        public int b = this.b;

        public b(HttpURLConnection httpURLConnection) {
            this.f7698a = httpURLConnection;
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        public String f7699a = "";
        public bt.b b = bt.b.FIRST_NONDEGRADE;
        public String c = "";
        public String d = "";
        public String e = "";
        public long f = 0;
        public long g = 0;
        public long h = 0;
        public long i = 0;
        public long j = 0;
        public String k = "-";
        public String l = "-";
        public int m = 0;
        public int n = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public final c clone() {
            try {
                return (c) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        protected final String b() {
            String str;
            String str2;
            if (!StringUtils.isEmpty(this.c)) {
                str = this.c + "#";
            } else {
                str = "-#";
            }
            if (!StringUtils.isEmpty(this.d)) {
                str2 = str + this.d + "#";
            } else {
                str2 = str + "-#";
            }
            String str3 = (((str2 + this.b.a() + "#") + this.h + "#") + this.j + "#") + this.f;
            String b = p.b(bk.a(str3.getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
            StringBuilder sb = new StringBuilder("上报耗时数据");
            sb.append(str3);
            sb.append("加密后：");
            sb.append(b);
            br.a();
            return b;
        }

        public final String toString() {
            return "RequestInfo{csid='" + this.f7699a + "', degradeType=" + this.b + ", serverIp='" + this.c + "', path='" + this.d + "', hostname='" + this.e + "', totalTime=" + this.f + ", DNSTime=" + this.g + ", connectionTime=" + this.h + ", writeTime=" + this.i + ", readTime=" + this.j + ", serverTime='" + this.k + "', datasize='" + this.l + "', errorcode=" + this.m + ", errorcodeSub=" + this.n + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private Vector<e> f7700a;
        private volatile e b;

        private d() {
            this.f7700a = new Vector<>();
            this.b = new e((byte) 0);
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public final e a(String str) {
            if (StringUtils.isEmpty(str)) {
                return this.b;
            }
            for (int i = 0; i < this.f7700a.size(); i++) {
                e eVar = this.f7700a.get(i);
                if (eVar != null && eVar.a().equals(str)) {
                    return eVar;
                }
            }
            e eVar2 = new e((byte) 0);
            eVar2.b(str);
            this.f7700a.add(eVar2);
            return eVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class e implements HostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        private String f7701a;
        private String b;

        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        public final String a() {
            return this.b;
        }

        public final void a(String str) {
            String[] split;
            if (StringUtils.isEmpty(this.f7701a) || !str.contains(":") || (split = str.split(":")) == null || split.length <= 0) {
                this.f7701a = str;
            } else {
                this.f7701a = split[0];
            }
        }

        public final void b(String str) {
            this.b = str;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            return !StringUtils.isEmpty(this.f7701a) ? this.f7701a.equals(str) : !StringUtils.isEmpty(this.b) ? defaultHostnameVerifier.verify(this.b, sSLSession) : defaultHostnameVerifier.verify(str, sSLSession);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        long f7702a = 0;
        long b = 0;
        c c = new c();
        a d;
        c e;
        String f;
        URL g;

        f() {
        }

        public final void a() {
            this.c.h = SystemClock.elapsedRealtime() - this.b;
        }

        public final void a(int i) {
            "----errorcode-----".concat(String.valueOf(i));
            br.a();
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.f7702a;
                this.c.m = i;
                if (this.c.b.e()) {
                    m.a(false, this.c.e);
                }
                boolean a2 = br.this.a(this.c.e);
                if (a2) {
                    if (br.this.p && !StringUtils.isEmpty(br.this.n) && this.c.b.b()) {
                        m.d();
                    }
                    if (this.c.b.c()) {
                        m.a(this.c.b.c(), this.c.e);
                    }
                    m.c(this.e);
                    m.a(false, this.d);
                    m.b(this.c);
                }
                m.a(this.g.toString(), this.c.b.c(), true, a2);
                new StringBuilder("!!!error-").append(this.c.toString());
                br.a();
            } catch (Throwable unused) {
            }
        }

        public final void a(long j) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            this.c.l = decimalFormat.format(((float) j) / 1024.0f);
        }

        public final void a(bt btVar, URL url) {
            this.g = url;
            this.c.d = url.getPath();
            this.c.e = url.getHost();
            if (!StringUtils.isEmpty(br.this.n) && btVar.u().b()) {
                c cVar = this.c;
                cVar.c = cVar.e.replace(riy.ARRAY_START_STR, "").replace(riy.ARRAY_END_STR, "");
                this.c.e = br.this.n;
            }
            if (btVar.u().b()) {
                btVar.a(this.c.e);
            }
            if (btVar.u().d()) {
                this.f = btVar.x();
            }
        }

        public final void a(bu buVar) {
            c clone;
            try {
                this.c.f = SystemClock.elapsedRealtime() - this.f7702a;
                if (buVar != null) {
                    buVar.f = this.c.b.c();
                }
                if (this.c.b.b() && this.c.f > 10000) {
                    m.a(false, this.c.e);
                }
                if (this.c.b.d()) {
                    m.a(false, this.f);
                }
                boolean a2 = br.this.a(this.c.e);
                if (a2) {
                    m.c(this.c);
                    m.a(true, this.d);
                    if (this.c.f > m.e && (clone = this.c.clone()) != null) {
                        clone.m = 1;
                        m.b(clone);
                        new StringBuilder("!!!finish&error-").append(clone.toString());
                        br.a();
                    }
                }
                m.a(this.g.toString(), this.c.b.c(), false, a2);
                new StringBuilder("!!!finish-").append(this.c.toString());
                br.a();
            } catch (Throwable unused) {
            }
        }

        public final void b() {
            this.c.i = SystemClock.elapsedRealtime() - this.b;
        }

        public final void b(int i) {
            this.c.n = i;
        }

        public final void c() {
            this.c.j = SystemClock.elapsedRealtime() - this.b;
        }

        public final void d() {
            c clone = this.c.clone();
            if (this.c.f > m.e) {
                clone.m = 1;
            }
            m.a(clone);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public br() {
        m.e();
        try {
            this.g = UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
        } catch (Throwable th) {
            as.a(th, "ht", "ic");
        }
    }

    private static int a(Exception exc) {
        if (exc instanceof SSLHandshakeException) {
            return 4101;
        }
        if (exc instanceof SSLKeyException) {
            return 4102;
        }
        if (exc instanceof SSLProtocolException) {
            return 4103;
        }
        if (exc instanceof SSLPeerUnverifiedException) {
            return TrtcConstants.TRTC_ERROR_CODE_CALLEE_SDK_VERSION_IS_LOW;
        }
        if (exc instanceof ConnectException) {
            return 6101;
        }
        if (exc instanceof SocketException) {
            return 6102;
        }
        if (exc instanceof ConnectTimeoutException) {
            return 2101;
        }
        return exc instanceof SocketTimeoutException ? 2102 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016d A[Catch: all -> 0x01bb, IOException -> 0x01c0, SocketTimeoutException -> 0x01ef, ConnectTimeoutException -> 0x01f4, TRY_ENTER, TryCatch #17 {SocketTimeoutException -> 0x01ef, ConnectTimeoutException -> 0x01f4, IOException -> 0x01c0, all -> 0x01bb, blocks: (B:3:0x0007, B:5:0x0019, B:7:0x0023, B:9:0x0029, B:10:0x0030, B:44:0x00a4, B:104:0x016d, B:105:0x01ba), top: B:161:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4 A[Catch: all -> 0x01bb, IOException -> 0x01c0, SocketTimeoutException -> 0x01ef, ConnectTimeoutException -> 0x01f4, TRY_ENTER, TRY_LEAVE, TryCatch #17 {SocketTimeoutException -> 0x01ef, ConnectTimeoutException -> 0x01f4, IOException -> 0x01c0, all -> 0x01bb, blocks: (B:3:0x0007, B:5:0x0019, B:7:0x0023, B:9:0x0029, B:10:0x0030, B:44:0x00a4, B:104:0x016d, B:105:0x01ba), top: B:161:0x0007 }] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.zip.GZIPInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.bu a(com.loc.br.b r15) throws com.loc.k, java.io.IOException {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.br.a(com.loc.br$b):com.loc.bu");
    }

    private static String a(String str, String str2) {
        return String.format("platform=Android&sdkversion=%s&product=%s&manufacture=%s&abitype=%s", str, str2, Build.MANUFACTURER, m.c != null ? x.a(m.c) : "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Map<String, String> map) {
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode(key));
                sb.append("=");
                sb.append(URLEncoder.encode(value));
            }
            return sb.toString();
        }
        return null;
    }

    public static void a() {
    }

    private void a(Map<String, String> map, HttpURLConnection httpURLConnection) {
        c g;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    httpURLConnection.addRequestProperty(str, map.get(str));
                }
            } catch (Throwable th) {
                as.a(th, "ht", "adh");
                return;
            }
        }
        if (bo.d != null) {
            for (String str2 : bo.d.keySet()) {
                httpURLConnection.addRequestProperty(str2, bo.d.get(str2));
            }
        }
        String str3 = "";
        if (!this.m.contains("/v3/iasdkauth") && !StringUtils.isEmpty(this.j) && m.d(this.j)) {
            this.o = true;
            m.g f2 = m.f(this.j);
            httpURLConnection.addRequestProperty("lct", String.valueOf(f2.f7833a));
            httpURLConnection.addRequestProperty("lct-info", f2.b);
            httpURLConnection.addRequestProperty("aks", m.c(m.a(this.j)));
            httpURLConnection.addRequestProperty("lct-args", a(m.b(this.j) != null ? m.b(this.j).b() : str3, this.j));
        }
        httpURLConnection.addRequestProperty("csid", this.g);
        if (a(this.u.c.e)) {
            f fVar = this.u;
            if (!StringUtils.isEmpty(fVar.c.c)) {
                str3 = p.b(bk.a(fVar.c.c.getBytes(), "YXBtX25ldHdvcmtf".getBytes()));
                StringBuilder sb = new StringBuilder("上报本次请求serverIp:");
                sb.append(fVar.c.c);
                sb.append("加密后：");
                sb.append(str3);
            }
            if (!StringUtils.isEmpty(str3)) {
                httpURLConnection.addRequestProperty("sip", str3);
            }
            if (m.j && (g = m.g()) != null) {
                httpURLConnection.addRequestProperty("nls", g.b());
                this.u.e = g;
            }
            a f3 = m.f();
            if (f3 == null) {
                return;
            }
            httpURLConnection.addRequestProperty("nlf", f3.b());
            this.u.d = f3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        if (!this.l) {
            return (!StringUtils.isEmpty(this.n) && (this.n.contains("rest") || this.n.contains("apilocate"))) || b(str);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "#"
            java.lang.String r1 = "lct"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "sc"
            java.lang.Object r4 = r7.get(r4)     // Catch: java.lang.Throwable -> L65
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L3c
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L65
            if (r5 <= 0) goto L3c
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L65
            boolean r5 = android.text.StringUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L3c
            boolean r5 = r4.contains(r0)     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L2a
        L28:
            r0 = 1
            goto L3d
        L2a:
            java.lang.String[] r0 = r4.split(r0)     // Catch: java.lang.Throwable -> L65
            int r4 = r0.length     // Catch: java.lang.Throwable -> L65
            if (r4 <= r2) goto L3c
            java.lang.String r4 = "1"
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L65
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L3c
            goto L28
        L3c:
            r0 = 0
        L3d:
            if (r0 != 0) goto L40
            return r3
        L40:
            if (r8 == 0) goto L66
            boolean r8 = r7.containsKey(r1)     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L61
            java.lang.Object r7 = r7.get(r1)     // Catch: java.lang.Throwable -> L65
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L61
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L65
            if (r8 <= 0) goto L61
            long r7 = com.loc.m.a(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r6.j     // Catch: java.lang.Throwable -> L65
            boolean r7 = com.loc.m.a(r0, r7)     // Catch: java.lang.Throwable -> L65
            goto L62
        L61:
            r7 = 0
        L62:
            if (r7 == 0) goto L65
            goto L66
        L65:
            r2 = 0
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.br.a(java.util.Map, boolean):boolean");
    }

    private bs b() {
        try {
            if (t == null || t.get() == null) {
                t = new SoftReference<>(new bs(m.c, this.b));
            }
            bs bsVar = k != null ? t.get() : null;
            return bsVar == null ? new bs(m.c, this.b) : bsVar;
        } catch (Throwable th) {
            av.b(th, "ht", "gsf");
            return null;
        }
    }

    private static String b(Map<String, List<String>> map) {
        try {
            List<String> list = map.get("sc");
            if (list == null || list.size() <= 0) {
                return "";
            }
            String str = list.get(0);
            if (StringUtils.isEmpty(str)) {
                return "";
            }
            if (str.contains("#")) {
                String[] split = str.split("#");
                if (split.length <= 1) {
                    return "";
                }
                str = split[0];
            }
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    private void b(bt btVar) throws k {
        this.i = new d((byte) 0);
        this.p = btVar.y();
        this.c = btVar.o();
        this.h = btVar.t();
        this.l = btVar.q();
        this.j = btVar.z();
        this.f7696a = q.a().a(btVar.s());
        this.m = btVar.u().b() ? btVar.m() : btVar.l();
        this.m = bq.a(this.m, this.j);
        this.n = btVar.g();
        if (MspEventTypes.ACTION_INVOKE_LOC.equals(this.j)) {
            String l = btVar.l();
            String m = btVar.m();
            if (!StringUtils.isEmpty(l)) {
                try {
                    this.r = new URL(l).getHost();
                } catch (Exception unused) {
                }
            }
            if (StringUtils.isEmpty(m)) {
                return;
            }
            try {
                if (!StringUtils.isEmpty(this.n)) {
                    this.q = this.n;
                } else {
                    this.q = new URL(m).getHost();
                }
            } catch (Exception unused2) {
            }
        }
    }

    private static boolean b(String str) {
        return str.contains("rest") || str.contains("apilocate");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0228 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147 A[Catch: Throwable -> 0x01b6, TryCatch #2 {Throwable -> 0x01b6, blocks: (B:45:0x00d0, B:48:0x00e8, B:50:0x00eb, B:52:0x00ef, B:54:0x00f5, B:58:0x00fe, B:61:0x010a, B:63:0x010d, B:65:0x0113, B:75:0x0141, B:77:0x0147, B:79:0x0151, B:81:0x0163, B:83:0x018b, B:85:0x01ac, B:86:0x01af, B:66:0x0129, B:68:0x012d, B:70:0x0130, B:72:0x0136, B:73:0x013d), top: B:139:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.br.b c(com.loc.bt r15) throws java.io.IOException, com.loc.k {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.br.c(com.loc.bt):com.loc.br$b");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bu a(bt btVar) throws k {
        OutputStream outputStream;
        OutputStream outputStream2;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        r7 = null;
        DataOutputStream dataOutputStream2 = null;
        try {
            try {
                b(btVar);
                bu b2 = bq.b(this.m, this.j);
                if (b2 != null) {
                    this.u.d();
                    return b2;
                }
                b c2 = c(btVar);
                HttpURLConnection httpURLConnection2 = c2.f7698a;
                try {
                    this.u.b = SystemClock.elapsedRealtime();
                    httpURLConnection2.connect();
                    this.u.a();
                    byte[] d2 = btVar.d();
                    if (d2 == null || d2.length == 0) {
                        Map<String, String> e2 = btVar.e();
                        if (bo.e != null) {
                            if (e2 != null) {
                                e2.putAll(bo.e);
                            } else {
                                e2 = bo.e;
                            }
                        }
                        String a2 = a(e2);
                        if (!StringUtils.isEmpty(a2)) {
                            d2 = x.a(a2);
                        }
                    }
                    if (d2 != null && d2.length > 0) {
                        try {
                            this.u.b = SystemClock.elapsedRealtime();
                            outputStream2 = httpURLConnection2.getOutputStream();
                            try {
                                dataOutputStream = new DataOutputStream(outputStream2);
                            } catch (Throwable th) {
                                outputStream = outputStream2;
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = null;
                        }
                        try {
                            dataOutputStream.write(d2);
                            dataOutputStream.close();
                            if (outputStream2 != null) {
                                outputStream2.close();
                            }
                            this.u.b();
                        } catch (Throwable th3) {
                            outputStream = outputStream2;
                            th = th3;
                            dataOutputStream2 = dataOutputStream;
                            if (dataOutputStream2 != null) {
                                dataOutputStream2.close();
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            this.u.b();
                            throw th;
                        }
                    }
                    bu a3 = a(c2);
                    this.u.a(a3);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Throwable th4) {
                            as.a(th4, "ht", "mPt");
                        }
                    }
                    this.u.d();
                    return a3;
                } catch (k e3) {
                    e = e3;
                    if (!e.i() && e.g() != 10) {
                        this.u.a(e.g());
                    }
                    as.a(e, "ht", "mPt");
                    throw e;
                } catch (ConnectException e4) {
                    e = e4;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(6);
                    throw new k("http连接失败 - ConnectionException");
                } catch (MalformedURLException e5) {
                    e = e5;
                    e.printStackTrace();
                    this.u.a(8);
                    throw new k("url异常 - MalformedURLException");
                } catch (SocketTimeoutException e6) {
                    e = e6;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(2);
                    throw new k("socket 连接超时 - SocketTimeoutException");
                } catch (ConnectTimeoutException e7) {
                    e = e7;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(2);
                    throw new k("IO 操作异常 - IOException");
                } catch (InterruptedIOException unused) {
                    this.u.b(7101);
                    this.u.a(7);
                    throw new k("未知的错误");
                } catch (SocketException e8) {
                    e = e8;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(6);
                    throw new k("socket 连接异常 - SocketException");
                } catch (UnknownHostException e9) {
                    e = e9;
                    e.printStackTrace();
                    this.u.a(5);
                    throw new k("未知主机 - UnKnowHostException");
                } catch (SSLException e10) {
                    e = e10;
                    e.printStackTrace();
                    this.u.b(a(e));
                    this.u.a(4);
                    throw new k("IO 操作异常 - IOException");
                } catch (IOException e11) {
                    e = e11;
                    e.printStackTrace();
                    this.u.a(7);
                    throw new k("IO 操作异常 - IOException");
                } catch (Throwable th5) {
                    th = th5;
                    as.a(th, "ht", "mPt");
                    this.u.a(9);
                    throw new k("未知的错误");
                }
            } catch (k e12) {
                e = e12;
            } catch (InterruptedIOException unused2) {
            } catch (ConnectException e13) {
                e = e13;
            } catch (MalformedURLException e14) {
                e = e14;
            } catch (SocketException e15) {
                e = e15;
            } catch (SocketTimeoutException e16) {
                e = e16;
            } catch (UnknownHostException e17) {
                e = e17;
            } catch (SSLException e18) {
                e = e18;
            } catch (ConnectTimeoutException e19) {
                e = e19;
            } catch (IOException e20) {
                e = e20;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
