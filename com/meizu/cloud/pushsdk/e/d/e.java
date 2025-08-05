package com.meizu.cloud.pushsdk.e.d;

import android.net.TrafficStats;
import com.meizu.cloud.pushsdk.e.d.k;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes4.dex */
public class e implements com.meizu.cloud.pushsdk.e.d.a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HttpURLConnection f7913a;
        final /* synthetic */ com.meizu.cloud.pushsdk.e.h.d b;

        a(HttpURLConnection httpURLConnection, com.meizu.cloud.pushsdk.e.h.d dVar) {
            this.f7913a = httpURLConnection;
            this.b = dVar;
        }

        @Override // com.meizu.cloud.pushsdk.e.d.l
        public com.meizu.cloud.pushsdk.e.h.d f() {
            return this.b;
        }
    }

    private static l a(HttpURLConnection httpURLConnection) throws IOException {
        if (!httpURLConnection.getDoInput()) {
            return null;
        }
        return new a(httpURLConnection, com.meizu.cloud.pushsdk.e.h.g.a(com.meizu.cloud.pushsdk.e.h.g.a(a(httpURLConnection.getResponseCode()) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream())));
    }

    private static void a(HttpURLConnection httpURLConnection, i iVar) throws IOException {
        j a2 = iVar.a();
        if (a2 != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", a2.b().toString());
            com.meizu.cloud.pushsdk.e.h.c a3 = com.meizu.cloud.pushsdk.e.h.g.a(com.meizu.cloud.pushsdk.e.h.g.a(httpURLConnection.getOutputStream()));
            a2.a(a3);
            a3.close();
        }
    }

    protected static boolean a(int i) {
        return i >= 200 && i < 300;
    }

    private HttpURLConnection b(i iVar) throws IOException {
        URL url = new URL(iVar.e().toString());
        if (MinSdkChecker.isSupportNotificationChannel()) {
            TrafficStats.setThreadStatsTag(2006537699);
        }
        HttpURLConnection a2 = a(url);
        a2.setConnectTimeout(60000);
        a2.setReadTimeout(60000);
        a2.setUseCaches(false);
        a2.setDoInput(true);
        return a2;
    }

    private static void b(HttpURLConnection httpURLConnection, i iVar) throws IOException {
        int b = iVar.b();
        if (b == 0) {
            httpURLConnection.setRequestMethod("GET");
        } else if (b == 1) {
            httpURLConnection.setRequestMethod("POST");
            a(httpURLConnection, iVar);
        } else if (b == 2) {
            httpURLConnection.setRequestMethod("PUT");
            a(httpURLConnection, iVar);
        } else if (b == 3) {
            httpURLConnection.setRequestMethod("DELETE");
        } else if (b == 4) {
            httpURLConnection.setRequestMethod("HEAD");
        } else if (b != 5) {
            throw new IllegalStateException("Unknown method type.");
        } else {
            httpURLConnection.setRequestMethod("PATCH");
            a(httpURLConnection, iVar);
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.d.a
    public k a(i iVar) throws IOException {
        HttpURLConnection b = b(iVar);
        for (String str : iVar.c().a()) {
            String a2 = iVar.a(str);
            com.meizu.cloud.pushsdk.e.b.a.b("current header name " + str + " value " + a2);
            b.addRequestProperty(str, a2);
        }
        b(b, iVar);
        int responseCode = b.getResponseCode();
        return new k.b().a(responseCode).a(iVar.c()).a(b.getResponseMessage()).a(iVar).a(a(b)).a();
    }

    protected HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }
}
