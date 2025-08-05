package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.network.domain.Request;
import mtopsdk.network.domain.b;
import mtopsdk.network.domain.c;

/* loaded from: classes9.dex */
public class sck extends rym {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ExecutorService i;

    static {
        kge.a(-103508577);
    }

    @Override // tb.ryo
    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == -1 || i == -2 || i == -3;
    }

    public static /* synthetic */ boolean a(sck sckVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe76f8e1", new Object[]{sckVar})).booleanValue() : sckVar.c;
    }

    public static /* synthetic */ String b(sck sckVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b2edd02", new Object[]{sckVar}) : sckVar.h;
    }

    public static /* synthetic */ String c(sck sckVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4bdb88a1", new Object[]{sckVar}) : sckVar.h;
    }

    public sck(Request request, ExecutorService executorService) {
        super(request, null);
        this.i = executorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba A[LOOP:0: B:40:0x005e->B:39:0x00ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[EDGE_INSN: B:42:0x00ae->B:36:0x00ae ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mtopsdk.network.domain.b c() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sck.c():mtopsdk.network.domain.b");
    }

    @Override // tb.ryn
    public void a(ryp rypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfa6b2f", new Object[]{this, rypVar});
            return;
        }
        ExecutorService executorService = this.i;
        if (executorService != null) {
            try {
                this.d = executorService.submit(new a(a(), rypVar));
                return;
            } catch (Exception e) {
                rypVar.onFailure(this, e);
                return;
            }
        }
        rypVar.onFailure(this, new Exception("miss executorService in CallImpl "));
    }

    public HttpURLConnection a(Request request) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("160987ea", new Object[]{this, request});
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(request.f25005a).openConnection();
        httpURLConnection.setConnectTimeout(request.f);
        httpURLConnection.setReadTimeout(request.g);
        return httpURLConnection;
    }

    public void a(HttpURLConnection httpURLConnection, Request request) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db541b1e", new Object[]{this, httpURLConnection, request});
            return;
        }
        httpURLConnection.setRequestMethod(request.b);
        for (Map.Entry<String, String> entry : request.c.entrySet()) {
            if (!entry.getKey().equalsIgnoreCase("Cookie")) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (!StringUtils.isBlank(sci.a(request.f25005a))) {
            httpURLConnection.addRequestProperty("Cookie", sci.a(request.f25005a));
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            String str = request.e;
            TBSdkLog.i("qmtopsdk.DefaultCallImpl", str, "request url =" + request.f25005a);
            String str2 = request.e;
            TBSdkLog.i("qmtopsdk.DefaultCallImpl", str2, "request headers =" + httpURLConnection.getRequestProperties());
        }
        if ("POST".equalsIgnoreCase(request.b)) {
            httpURLConnection.setDoOutput(true);
        }
        mtopsdk.network.domain.a aVar = request.d;
        if (aVar == null) {
            return;
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.addRequestProperty("Content-Type", aVar.contentType());
        long contentLength = aVar.contentLength();
        if (contentLength != -1) {
            httpURLConnection.setFixedLengthStreamingMode((int) contentLength);
            httpURLConnection.addRequestProperty("Content-Length", String.valueOf(contentLength));
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            aVar.writeTo(outputStream);
        } catch (Exception e) {
            TBSdkLog.e("qmtopsdk.DefaultCallImpl", "write outputstream error.", e);
        } finally {
            rys.a(outputStream);
        }
    }

    public b b(HttpURLConnection httpURLConnection, Request request) throws IOException {
        final InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3503e1d1", new Object[]{this, httpURLConnection, request});
        }
        if (Thread.currentThread().isInterrupted()) {
            TBSdkLog.d("qmtopsdk.DefaultCallImpl", this.h, "[readResponse]call task is canceled.");
            throw new CancellationException("call canceled");
        }
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (responseMessage == null) {
            responseMessage = "";
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        a(request.f25005a, headerFields);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            String str = request.e;
            TBSdkLog.i("qmtopsdk.DefaultCallImpl", str, "response headers:" + headerFields);
        }
        final String contentType = httpURLConnection.getContentType();
        final int contentLength = httpURLConnection.getContentLength();
        boolean a2 = rys.a(headerFields);
        if (responseCode >= 400) {
            inputStream = httpURLConnection.getErrorStream();
        } else if (a2) {
            inputStream = new GZIPInputStream(httpURLConnection.getInputStream());
        } else {
            inputStream = httpURLConnection.getInputStream();
        }
        c cVar = new c() { // from class: tb.sck.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // mtopsdk.network.domain.c
            public long a() throws IOException {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : contentLength;
            }

            @Override // mtopsdk.network.domain.c
            public InputStream b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (InputStream) ipChange2.ipc$dispatch("97efb06c", new Object[]{this}) : inputStream;
            }
        };
        if (Thread.currentThread().isInterrupted()) {
            TBSdkLog.d("qmtopsdk.DefaultCallImpl", this.h, "[readResponse]call task is canceled.");
            throw new CancellationException("call canceled");
        }
        cVar.c();
        return new b.a().a(request).a(responseCode).a(responseMessage).a(HeaderHandlerUtil.cloneHeaderMap(headerFields)).a(cVar).a();
    }

    public void a(String str, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (str != null && map != null) {
            try {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null && (key.equalsIgnoreCase("Set-Cookie") || key.equalsIgnoreCase(HttpConstant.SET_COOKIE2))) {
                        for (String str2 : entry.getValue()) {
                            sci.a(str, str2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Request f33474a;
        public ryp b;

        static {
            kge.a(702762298);
            kge.a(-1390502639);
        }

        public a(Request request, ryp rypVar) {
            this.f33474a = request;
            this.b = rypVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (sck.a(sck.this)) {
                    TBSdkLog.d("qmtopsdk.DefaultCallImpl", sck.b(sck.this), "call task is canceled.");
                    this.b.onCancel(sck.this);
                    return;
                }
                b c = sck.this.c();
                if (c == null) {
                    this.b.onFailure(sck.this, new Exception("response is null"));
                } else {
                    this.b.onResponse(sck.this, c);
                }
            } catch (InterruptedException unused) {
                this.b.onCancel(sck.this);
            } catch (CancellationException unused2) {
                this.b.onCancel(sck.this);
            } catch (Exception e) {
                this.b.onFailure(sck.this, e);
                TBSdkLog.e("qmtopsdk.DefaultCallImpl", sck.c(sck.this), "do call.execute failed.", e);
            }
        }
    }
}
