package com.huawei.hms.opendevice;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes4.dex */
public abstract class g {

    /* loaded from: classes4.dex */
    private enum a {
        GET("GET"),
        POST("POST");
        

        /* renamed from: a  reason: collision with root package name */
        private String f7500a;

        a(String str) {
            this.f7500a = str;
        }

        public String a() {
            return this.f7500a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v10, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r7v17, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.InputStream] */
    public static String a(Context context, String str, String str2, Map<String, String> map) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        String str3;
        InputStream inputStream;
        OutputStream outputStream;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream2;
        OutputStream outputStream2;
        HttpsURLConnection httpsURLConnection2;
        HttpsURLConnection httpsURLConnection3;
        ?? r2 = 0;
        r2 = null;
        String str4 = null;
        r2 = 0;
        r2 = 0;
        if (str2 == 0 || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return null;
        }
        int i = -1;
        try {
            try {
                context = a((Context) context, (String) str, map, a.POST.a());
            } catch (IOException unused) {
                context = null;
            } catch (RuntimeException unused2) {
                context = null;
            } catch (Exception unused3) {
                context = null;
            } catch (Throwable th2) {
                th = th2;
                context = 0;
                str = 0;
            }
            if (context == 0) {
                com.huawei.secure.android.common.util.a.a((OutputStream) null);
                com.huawei.secure.android.common.util.a.a((InputStream) null);
                com.huawei.secure.android.common.util.a.a((InputStream) null);
                httpsURLConnection3 = context;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            }
            try {
                str = new BufferedOutputStream(context.getOutputStream());
                try {
                    str.write(str2.getBytes("UTF-8"));
                    str.flush();
                    i = context.getResponseCode();
                    HMSLog.d("PushHttpsClient", "https post response code: " + i);
                    str2 = i >= 400 ? context.getErrorStream() : context.getInputStream();
                } catch (IOException unused4) {
                    str2 = null;
                } catch (RuntimeException unused5) {
                    str2 = null;
                } catch (Exception unused6) {
                    str2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = 0;
                }
            } catch (IOException unused7) {
                str = null;
                str2 = null;
                bufferedInputStream = null;
                str3 = "https execute encounter IOException - http code:" + i;
                httpsURLConnection = context;
                outputStream = str;
                inputStream = str2;
                HMSLog.w("PushHttpsClient", str3);
                httpsURLConnection2 = httpsURLConnection;
                outputStream2 = outputStream;
                inputStream2 = inputStream;
                com.huawei.secure.android.common.util.a.a(outputStream2);
                com.huawei.secure.android.common.util.a.a(inputStream2);
                com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
                httpsURLConnection3 = httpsURLConnection2;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            } catch (RuntimeException unused8) {
                str = null;
                str2 = null;
                bufferedInputStream = null;
                str3 = "https execute encounter RuntimeException - http code:" + i;
                httpsURLConnection = context;
                outputStream = str;
                inputStream = str2;
                HMSLog.w("PushHttpsClient", str3);
                httpsURLConnection2 = httpsURLConnection;
                outputStream2 = outputStream;
                inputStream2 = inputStream;
                com.huawei.secure.android.common.util.a.a(outputStream2);
                com.huawei.secure.android.common.util.a.a(inputStream2);
                com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
                httpsURLConnection3 = httpsURLConnection2;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            } catch (Exception unused9) {
                str = null;
                str2 = null;
                bufferedInputStream = null;
                str3 = "https execute encounter unknown exception - http code:" + i;
                httpsURLConnection = context;
                outputStream = str;
                inputStream = str2;
                HMSLog.w("PushHttpsClient", str3);
                httpsURLConnection2 = httpsURLConnection;
                outputStream2 = outputStream;
                inputStream2 = inputStream;
                com.huawei.secure.android.common.util.a.a(outputStream2);
                com.huawei.secure.android.common.util.a.a(inputStream2);
                com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
                httpsURLConnection3 = httpsURLConnection2;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            } catch (Throwable th4) {
                th = th4;
                str = 0;
                context = context;
                str2 = str;
                com.huawei.secure.android.common.util.a.a((OutputStream) str);
                com.huawei.secure.android.common.util.a.a((InputStream) str2);
                com.huawei.secure.android.common.util.a.a((InputStream) r2);
                p.a((HttpsURLConnection) context);
                HMSLog.i("PushHttpsClient", "close connection");
                throw th;
            }
            try {
                bufferedInputStream = new BufferedInputStream(str2);
            } catch (IOException unused10) {
                bufferedInputStream = null;
                str3 = "https execute encounter IOException - http code:" + i;
                httpsURLConnection = context;
                outputStream = str;
                inputStream = str2;
                HMSLog.w("PushHttpsClient", str3);
                httpsURLConnection2 = httpsURLConnection;
                outputStream2 = outputStream;
                inputStream2 = inputStream;
                com.huawei.secure.android.common.util.a.a(outputStream2);
                com.huawei.secure.android.common.util.a.a(inputStream2);
                com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
                httpsURLConnection3 = httpsURLConnection2;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            } catch (RuntimeException unused11) {
                bufferedInputStream = null;
                str3 = "https execute encounter RuntimeException - http code:" + i;
                httpsURLConnection = context;
                outputStream = str;
                inputStream = str2;
                HMSLog.w("PushHttpsClient", str3);
                httpsURLConnection2 = httpsURLConnection;
                outputStream2 = outputStream;
                inputStream2 = inputStream;
                com.huawei.secure.android.common.util.a.a(outputStream2);
                com.huawei.secure.android.common.util.a.a(inputStream2);
                com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
                httpsURLConnection3 = httpsURLConnection2;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            } catch (Exception unused12) {
                bufferedInputStream = null;
                str3 = "https execute encounter unknown exception - http code:" + i;
                httpsURLConnection = context;
                outputStream = str;
                inputStream = str2;
                HMSLog.w("PushHttpsClient", str3);
                httpsURLConnection2 = httpsURLConnection;
                outputStream2 = outputStream;
                inputStream2 = inputStream;
                com.huawei.secure.android.common.util.a.a(outputStream2);
                com.huawei.secure.android.common.util.a.a(inputStream2);
                com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
                httpsURLConnection3 = httpsURLConnection2;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            } catch (Throwable th5) {
                th = th5;
                com.huawei.secure.android.common.util.a.a((OutputStream) str);
                com.huawei.secure.android.common.util.a.a((InputStream) str2);
                com.huawei.secure.android.common.util.a.a((InputStream) r2);
                p.a((HttpsURLConnection) context);
                HMSLog.i("PushHttpsClient", "close connection");
                throw th;
            }
            try {
                str4 = p.a((InputStream) bufferedInputStream);
                httpsURLConnection2 = context;
                outputStream2 = str;
                inputStream2 = str2;
            } catch (IOException unused13) {
                str3 = "https execute encounter IOException - http code:" + i;
                httpsURLConnection = context;
                outputStream = str;
                inputStream = str2;
                HMSLog.w("PushHttpsClient", str3);
                httpsURLConnection2 = httpsURLConnection;
                outputStream2 = outputStream;
                inputStream2 = inputStream;
                com.huawei.secure.android.common.util.a.a(outputStream2);
                com.huawei.secure.android.common.util.a.a(inputStream2);
                com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
                httpsURLConnection3 = httpsURLConnection2;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            } catch (RuntimeException unused14) {
                str3 = "https execute encounter RuntimeException - http code:" + i;
                httpsURLConnection = context;
                outputStream = str;
                inputStream = str2;
                HMSLog.w("PushHttpsClient", str3);
                httpsURLConnection2 = httpsURLConnection;
                outputStream2 = outputStream;
                inputStream2 = inputStream;
                com.huawei.secure.android.common.util.a.a(outputStream2);
                com.huawei.secure.android.common.util.a.a(inputStream2);
                com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
                httpsURLConnection3 = httpsURLConnection2;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            } catch (Exception unused15) {
                str3 = "https execute encounter unknown exception - http code:" + i;
                httpsURLConnection = context;
                outputStream = str;
                inputStream = str2;
                HMSLog.w("PushHttpsClient", str3);
                httpsURLConnection2 = httpsURLConnection;
                outputStream2 = outputStream;
                inputStream2 = inputStream;
                com.huawei.secure.android.common.util.a.a(outputStream2);
                com.huawei.secure.android.common.util.a.a(inputStream2);
                com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
                httpsURLConnection3 = httpsURLConnection2;
                p.a(httpsURLConnection3);
                HMSLog.i("PushHttpsClient", "close connection");
                return str4;
            }
            com.huawei.secure.android.common.util.a.a(outputStream2);
            com.huawei.secure.android.common.util.a.a(inputStream2);
            com.huawei.secure.android.common.util.a.a((InputStream) bufferedInputStream);
            httpsURLConnection3 = httpsURLConnection2;
            p.a(httpsURLConnection3);
            HMSLog.i("PushHttpsClient", "close connection");
            return str4;
        } catch (Throwable th6) {
            r2 = map;
            th = th6;
        }
    }

    private static HttpsURLConnection a(Context context, String str, Map<String, String> map, String str2) throws Exception {
        String str3;
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection == null) {
            str3 = "urlConnection is null";
        } else if (openConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            try {
                com.huawei.secure.android.common.ssl.d a2 = com.huawei.secure.android.common.ssl.d.a(context);
                if (a2 == null) {
                    HMSLog.e("PushHttpsClient", "No ssl socket factory set.");
                    return null;
                }
                httpsURLConnection.setSSLSocketFactory(a2);
                httpsURLConnection.setHostnameVerifier(com.huawei.secure.android.common.ssl.d.STRICT_HOSTNAME_VERIFIER);
                httpsURLConnection.setRequestMethod(str2);
                httpsURLConnection.setConnectTimeout(15000);
                httpsURLConnection.setReadTimeout(15000);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setRequestProperty("Content-type", "application/json; charset=UTF-8");
                httpsURLConnection.setRequestProperty("Connection", "close");
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        if (!StringUtils.isEmpty(key)) {
                            httpsURLConnection.setRequestProperty(key, URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), "UTF-8"));
                        }
                    }
                }
                return httpsURLConnection;
            } catch (IOException | IllegalAccessException | IllegalArgumentException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                HMSLog.e("PushHttpsClient", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            }
        } else {
            str3 = "current request is http not allow connection";
        }
        HMSLog.e("PushHttpsClient", str3);
        return null;
    }
}
