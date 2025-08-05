package com.taobao.android.riverlogger.inspector;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class o implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14924a = false;
    public String b;
    public String c;
    private final String d;
    private final a e;

    /* loaded from: classes6.dex */
    public interface a {
        void a(boolean z, o oVar);
    }

    static {
        kge.a(1688364499);
        kge.a(-1390502639);
    }

    private o(String str, a aVar) {
        this.d = str;
        this.e = aVar;
    }

    public static void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cae7b3", new Object[]{str, aVar});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new o(str, aVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
        r6.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r9.e.a(r9.f14924a, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.net.HttpURLConnection, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r9 = this;
            java.lang.String r0 = "gzip"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.riverlogger.inspector.o.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L14
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r9
            java.lang.String r2 = "5c510192"
            r1.ipc$dispatch(r2, r0)
            return
        L14:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2)
            r5 = 0
            java.net.URL r6 = new java.net.URL     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.lang.String r7 = r9.d     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.net.URLConnection r6 = r6.openConnection()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L92
            r6.setInstanceFollowRedirects(r4)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            java.lang.String r7 = "GET"
            r6.setRequestMethod(r7)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            java.lang.String r7 = "Accept-Encoding"
            r6.setRequestProperty(r7, r0)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            int r7 = r6.getResponseCode()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 != r8) goto L6e
            java.io.InputStream r5 = r6.getInputStream()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            java.lang.String r7 = "Content-Encoding"
            java.lang.String r7 = r6.getHeaderField(r7)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            boolean r0 = android.text.TextUtils.equals(r0, r7)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            if (r0 == 0) goto L54
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            r0.<init>(r5)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            r5 = r0
        L54:
            byte[] r0 = new byte[r2]     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
        L56:
            int r2 = r0.length     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            int r2 = r5.read(r0, r3, r2)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            r7 = -1
            if (r2 == r7) goto L62
            r1.write(r0, r3, r2)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            goto L56
        L62:
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = r1.toString(r0)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            r9.b = r0     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            r9.f14924a = r4     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            goto L82
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            r0.<init>()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            java.lang.String r2 = "status code "
            r0.append(r2)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            r0.append(r7)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
            r9.c = r0     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> Laf
        L82:
            if (r5 == 0) goto L87
            r5.close()     // Catch: java.lang.Exception -> L87
        L87:
            r1.close()     // Catch: java.io.IOException -> L8a
        L8a:
            if (r6 == 0) goto La7
            goto La4
        L8d:
            r0 = move-exception
            goto L94
        L8f:
            r0 = move-exception
            r6 = r5
            goto Lb0
        L92:
            r0 = move-exception
            r6 = r5
        L94:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Laf
            r9.c = r0     // Catch: java.lang.Throwable -> Laf
            if (r5 == 0) goto L9f
            r5.close()     // Catch: java.lang.Exception -> L9f
        L9f:
            r1.close()     // Catch: java.io.IOException -> La2
        La2:
            if (r6 == 0) goto La7
        La4:
            r6.disconnect()
        La7:
            com.taobao.android.riverlogger.inspector.o$a r0 = r9.e
            boolean r1 = r9.f14924a
            r0.a(r1, r9)
            return
        Laf:
            r0 = move-exception
        Lb0:
            if (r5 == 0) goto Lb5
            r5.close()     // Catch: java.lang.Exception -> Lb5
        Lb5:
            r1.close()     // Catch: java.io.IOException -> Lb8
        Lb8:
            if (r6 == 0) goto Lbd
            r6.disconnect()
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.riverlogger.inspector.o.run():void");
    }
}
