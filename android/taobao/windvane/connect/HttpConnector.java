package android.taobao.windvane.connect;

import android.taobao.windvane.a;
import android.taobao.windvane.util.m;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.HttpURLConnection;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class HttpConnector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_CONTROL = "cache-control";
    public static final String CONTENT_LENGTH = "content-length";
    public static final String CONTENT_TYPE = "content-type";
    public static final String DATE = "date";
    public static final String ETAG = "etag";
    public static final String EXPIRES = "expires";
    public static final String IF_MODIFY_SINCE = "If-Modified-Since";
    public static final String IF_NONE_MATCH = "If-None-Match";
    public static final String LAST_MODIFIED = "last-modified";
    public static final String REDIRECT_LOCATION = "location";
    public static final String RESPONSE_CODE = "response-code";
    public static final String SET_COOKIE = "Set-Cookie";
    public static final String URL = "url";

    /* renamed from: a  reason: collision with root package name */
    private static String f1575a;
    private int b = 0;
    private d<f> c = null;

    /* loaded from: classes2.dex */
    public class HttpOverFlowException extends Exception {
        static {
            kge.a(1711698621);
        }

        public HttpOverFlowException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public class HttpsErrorException extends Exception {
        static {
            kge.a(-1445873910);
        }

        public HttpsErrorException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public class NetWorkErrorException extends Exception {
        static {
            kge.a(1245556013);
        }

        public NetWorkErrorException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public class RedirectException extends Exception {
        static {
            kge.a(-260626453);
        }

        public RedirectException(String str) {
            super(str);
        }
    }

    static {
        kge.a(-1115059492);
        f1575a = "HttpConnector";
        System.setProperty("http.keepAlive", "false");
    }

    public f a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("86580f31", new Object[]{this, eVar}) : b(eVar, null);
    }

    @Deprecated
    public f a(e eVar, d<f> dVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("753f9abd", new Object[]{this, eVar, dVar});
        }
        if (eVar == null) {
            throw new NullPointerException("Http connect error, request is null");
        }
        String str = null;
        this.c = dVar;
        this.b = 0;
        int h = eVar.h();
        while (i < h) {
            try {
                return b(eVar);
            } catch (HttpOverFlowException e) {
                e.printStackTrace();
                str = e.toString();
            } catch (HttpsErrorException e2) {
                e2.printStackTrace();
                str = e2.toString();
            } catch (NetWorkErrorException e3) {
                e3.printStackTrace();
                str = e3.toString();
                i++;
                try {
                    Thread.sleep((i << 1) * 1000);
                } catch (InterruptedException unused) {
                    m.e(f1575a, "HttpConnector retry Sleep has been interrupted, go ahead");
                }
            } catch (RedirectException e4) {
                e4.printStackTrace();
                str = e4.toString();
            }
        }
        f fVar = new f();
        fVar.a(str);
        return fVar;
    }

    public f b(e eVar, d<f> dVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("564bd53e", new Object[]{this, eVar, dVar});
        }
        if (eVar == null) {
            throw new NullPointerException("Http connect error, request is null");
        }
        String str = null;
        this.c = dVar;
        this.b = 0;
        int h = eVar.h();
        while (i < h) {
            try {
                return c(eVar);
            } catch (HttpOverFlowException e) {
                e.printStackTrace();
                str = e.toString();
            } catch (HttpsErrorException e2) {
                e2.printStackTrace();
                str = e2.toString();
            } catch (NetWorkErrorException e3) {
                e3.printStackTrace();
                str = e3.toString();
                i++;
                try {
                    Thread.sleep((i << 1) * 1000);
                } catch (InterruptedException unused) {
                    m.e(f1575a, "HttpConnector retry Sleep has been interrupted, go ahead");
                }
            } catch (RedirectException e4) {
                e4.printStackTrace();
                str = e4.toString();
            }
        }
        f fVar = new f();
        fVar.a(str);
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x034b, code lost:
        if (r7 != null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0390, code lost:
        if (r7 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0392, code lost:
        r7.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0395, code lost:
        r2 = r17.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0397, code lost:
        if (r2 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0399, code lost:
        r2.onFinish(new android.taobao.windvane.connect.f(), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03a7, code lost:
        return new android.taobao.windvane.connect.f();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e7 A[Catch: all -> 0x03cf, TryCatch #21 {all -> 0x03cf, blocks: (B:182:0x02df, B:184:0x02e7, B:185:0x02fe, B:186:0x0309, B:257:0x03c2, B:259:0x03c6, B:260:0x03ce), top: B:312:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0313 A[Catch: all -> 0x03b5, TryCatch #14 {all -> 0x03b5, blocks: (B:189:0x030f, B:191:0x0313, B:192:0x031b, B:216:0x0353, B:218:0x0357, B:219:0x0360, B:247:0x03a8), top: B:305:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0357 A[Catch: all -> 0x03b5, TryCatch #14 {all -> 0x03b5, blocks: (B:189:0x030f, B:191:0x0313, B:192:0x031b, B:216:0x0353, B:218:0x0357, B:219:0x0360, B:247:0x03a8), top: B:305:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a8 A[Catch: Throwable -> 0x03a9, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x03b5, blocks: (B:189:0x030f, B:191:0x0313, B:192:0x031b, B:216:0x0353, B:218:0x0357, B:219:0x0360, B:247:0x03a8), top: B:305:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03c6 A[Catch: all -> 0x03cf, TryCatch #21 {all -> 0x03cf, blocks: (B:182:0x02df, B:184:0x02e7, B:185:0x02fe, B:186:0x0309, B:257:0x03c2, B:259:0x03c6, B:260:0x03ce), top: B:312:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03dd A[Catch: all -> 0x03e4, TryCatch #31 {all -> 0x03e4, blocks: (B:265:0x03d9, B:267:0x03dd, B:268:0x03e3), top: B:319:0x03d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0401 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x032e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0323 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0339 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x03eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.taobao.windvane.connect.f b(android.taobao.windvane.connect.e r18) throws android.taobao.windvane.connect.HttpConnector.NetWorkErrorException, android.taobao.windvane.connect.HttpConnector.HttpOverFlowException, android.taobao.windvane.connect.HttpConnector.RedirectException, android.taobao.windvane.connect.HttpConnector.HttpsErrorException {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.connect.HttpConnector.b(android.taobao.windvane.connect.e):android.taobao.windvane.connect.f");
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x034b, code lost:
        if (r7 != null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0390, code lost:
        if (r7 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0392, code lost:
        r7.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0395, code lost:
        r2 = r17.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0397, code lost:
        if (r2 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0399, code lost:
        r2.onFinish(new android.taobao.windvane.connect.f(), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03a7, code lost:
        return new android.taobao.windvane.connect.f();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e7 A[Catch: all -> 0x03cf, TryCatch #21 {all -> 0x03cf, blocks: (B:182:0x02df, B:184:0x02e7, B:185:0x02fe, B:186:0x0309, B:257:0x03c2, B:259:0x03c6, B:260:0x03ce), top: B:312:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0313 A[Catch: all -> 0x03b5, TryCatch #14 {all -> 0x03b5, blocks: (B:189:0x030f, B:191:0x0313, B:192:0x031b, B:216:0x0353, B:218:0x0357, B:219:0x0360, B:247:0x03a8), top: B:305:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0357 A[Catch: all -> 0x03b5, TryCatch #14 {all -> 0x03b5, blocks: (B:189:0x030f, B:191:0x0313, B:192:0x031b, B:216:0x0353, B:218:0x0357, B:219:0x0360, B:247:0x03a8), top: B:305:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a8 A[Catch: Throwable -> 0x03a9, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x03b5, blocks: (B:189:0x030f, B:191:0x0313, B:192:0x031b, B:216:0x0353, B:218:0x0357, B:219:0x0360, B:247:0x03a8), top: B:305:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03c6 A[Catch: all -> 0x03cf, TryCatch #21 {all -> 0x03cf, blocks: (B:182:0x02df, B:184:0x02e7, B:185:0x02fe, B:186:0x0309, B:257:0x03c2, B:259:0x03c6, B:260:0x03ce), top: B:312:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03dd A[Catch: all -> 0x03e4, TryCatch #31 {all -> 0x03e4, blocks: (B:265:0x03d9, B:267:0x03dd, B:268:0x03e3), top: B:319:0x03d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0401 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x032e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0323 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0339 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x03eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.taobao.windvane.connect.f c(android.taobao.windvane.connect.e r18) throws android.taobao.windvane.connect.HttpConnector.NetWorkErrorException, android.taobao.windvane.connect.HttpConnector.HttpOverFlowException, android.taobao.windvane.connect.HttpConnector.RedirectException, android.taobao.windvane.connect.HttpConnector.HttpsErrorException {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.connect.HttpConnector.c(android.taobao.windvane.connect.e):android.taobao.windvane.connect.f");
    }

    private void a(HttpURLConnection httpURLConnection, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67247214", new Object[]{this, httpURLConnection, eVar});
            return;
        }
        int h = eVar.h() + 1;
        httpURLConnection.setConnectTimeout(eVar.e() * h);
        httpURLConnection.setReadTimeout(eVar.f() * h);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty(HttpConstant.HOST, eVar.a().getHost());
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String a2 = a.a(httpURLConnection.getURL().toString());
        if (a2 != null) {
            httpURLConnection.setRequestProperty("Cookie", a2);
        }
        Map<String, String> d = eVar.d();
        if (d != null) {
            for (Map.Entry<String, String> entry : d.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnection.setUseCaches(false);
    }
}
